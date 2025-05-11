package com.entidades.buenSabor.business.service.Imp;

import com.entidades.buenSabor.business.service.Base.BaseServiceImp;
import com.entidades.buenSabor.business.service.DetallePedidoService;
import com.entidades.buenSabor.business.service.PedidoService;
import com.entidades.buenSabor.domain.entities.Pedido;
import com.entidades.buenSabor.domain.enums.Estado;
import com.entidades.buenSabor.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImp extends BaseServiceImp<Pedido,Long> implements PedidoService {

    @Autowired
    private DetallePedidoService detallePedidoService;

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
}
