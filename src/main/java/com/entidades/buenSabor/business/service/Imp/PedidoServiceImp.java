package com.entidades.buenSabor.business.service.Imp;

import com.entidades.buenSabor.business.service.Base.BaseServiceImp;
import com.entidades.buenSabor.business.service.DetallePedidoService;
import com.entidades.buenSabor.business.service.PedidoService;
import com.entidades.buenSabor.domain.entities.Pedido;
import com.entidades.buenSabor.domain.enums.Estado;
import com.entidades.buenSabor.repositories.PedidoRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PedidoServiceImp extends BaseServiceImp<Pedido,Long> implements PedidoService {

    @Autowired
    private DetallePedidoService detallePedidoService;

    @Value("${open.route.service.key}") // Inyección de valor desde el archivo de application.properties
    private String routeServiceKey;

    @Autowired
    private PedidoRepository pedidoRepository;
    @Override
    public Pedido create(Pedido pedido) {
        // Calcular y setear el subtotal de cada DetallePedido antes de guardar
        pedido.getDetallesPedidos().forEach(detalle -> {
            detalle.setSubtotal(detalle.calculaSubtotal());
            detallePedidoService.create(detalle);  // Llamar al método create de DetallePedidoService
        });
        pedido.setTotal(pedido.calculaTotal());

        return baseRepository.save(pedido);  // Ahora guardamos el Pedido, lo que propaga la operación a los DetallePedido si la cascada está habilitada
    }

    @Override
    public Page<Pedido> findEstadoAndSucursalId(Estado estado, Long sucursalId, Pageable pageable) {
        return pedidoRepository.findByEstadoAndSucursalId(estado, sucursalId, pageable);
    }

    @Override
    public void cambioEstado(Estado estado, Long pedidoId) {
        Pedido pedido =  pedidoRepository.getById(pedidoId);
        pedido.setEstado(estado);
        pedidoRepository.save(pedido);
    }

    @Override
    public Page<Pedido> findBySucursalId(Long id, Pageable pageable) {
        return pedidoRepository.findBySucursalId(id, pageable);
    }

    @Override
    public Long calculaEnvio(String coordenadas) throws JsonProcessingException {
        String start = "-68.80216419696809,-32.907541474002514";
        String end = coordenadas;

        String url = String.format("https://api.openrouteservice.org/v2/directions/driving-car?api_key=%s&start=%s&end=%s",
                routeServiceKey, start, end);

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);

        String jsonResponse = response.getBody();

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode rootNode = objectMapper.readTree(jsonResponse);
        Double distancia = rootNode.path("features")
                .get(0)
                .path("properties")
                .path("summary")
                .path("distance").asDouble();

        Long roundedDistance = (long) Math.floor(distancia / 100) * 100;
        return roundedDistance;
    }
}
