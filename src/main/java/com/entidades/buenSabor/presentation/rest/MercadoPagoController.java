package com.entidades.buenSabor.presentation.rest;

import com.entidades.buenSabor.business.service.PedidoService;
import com.entidades.buenSabor.domain.entities.Pedido;
import com.mercadopago.MercadoPagoConfig;
import com.mercadopago.client.preference.*;
import com.mercadopago.exceptions.MPApiException;
import com.mercadopago.exceptions.MPException;
import com.mercadopago.resources.preference.Preference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/apiMp")
@CrossOrigin("*")
public class MercadoPagoController {

    @Autowired
    PedidoService pedidoService;
    @Value("${mercado.pago.acces.token}") // Inyección de valor desde el archivo de application.properties
    private String ACCES_TOKEN;

    @PostMapping("/{idPedido}")
    public String getList(@PathVariable Long idPedido) {


        Pedido pedido = pedidoService.getById(idPedido);


        try {
            MercadoPagoConfig.setAccessToken(ACCES_TOKEN);

            //Creamos la preferencia
            //PREFERENCIA DE VENTA
            PreferenceItemRequest itemRequest = PreferenceItemRequest.builder()
                    .id(String.valueOf(pedido.getId()))
                    .title("pedido realizado")
                    .description("Pedido realizado desde la web de el Buen Ravion")
                    .pictureUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQR4KIis1hedDlnstu4qTJWMu3cLHcCUwJULw&s")
                    .quantity(1)
                    .currencyId("ARG")
                    .unitPrice(new BigDecimal((pedido.getEnvio() == null) ? pedido.getTotal() + 0 : pedido.getTotal() + pedido.getEnvio()))
                    .build();
            List<PreferenceItemRequest> items = new ArrayList<>();
            items.add(itemRequest);

            //preferencia de control de sucesos en el caso que toque lo redirecciona a otra pagna
            //aca no pueden ir url localesm, pero hacemos una excepcion
            PreferenceBackUrlsRequest backUrls = PreferenceBackUrlsRequest.builder()
                    .success("https://buenraviol-mendoza.vercel.app/pedido/" +idPedido)
                    .pending("https://buenraviol-mendoza.vercel.app/pedido/" + idPedido + "/error")
                    .failure("https://buenraviol-mendoza.vercel.app/pedido/" + idPedido + "/pending")
                    .build();


            // Excluir tipo de pago en efectivo (como Pago Fácil o Rapipago)
            List<PreferencePaymentTypeRequest> excludedPaymentTypes = new ArrayList<>();
            excludedPaymentTypes.add(PreferencePaymentTypeRequest.builder().id("ticket").build());

            // Configurar opciones de pago
            PreferencePaymentMethodsRequest paymentMethods = PreferencePaymentMethodsRequest.builder()
                    .excludedPaymentTypes(excludedPaymentTypes)
                    .installments(3) // máximo de cuotas
                    .build();


            // Crear preferencia
            PreferenceRequest preferenceRequest = PreferenceRequest.builder()
                    .items(items)
                    .backUrls(backUrls)
                    .paymentMethods(paymentMethods)
                    .build();

            // creo un cliente para comunicarme con mp
            PreferenceClient client = new PreferenceClient();
            //se crea una nueeva prefertencia que es igual a lla respuesta
            Preference preference = client.create(preferenceRequest);


            return preference.getInitPoint();


        } catch (MPException e) {
            throw new RuntimeException(e.getMessage());

        } catch (MPApiException e) {
            throw new RuntimeException(e);
        }
    }
}
