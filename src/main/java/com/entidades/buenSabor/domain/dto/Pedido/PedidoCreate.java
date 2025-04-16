package com.entidades.buenSabor.domain.dto.Pedido;


import com.entidades.buenSabor.domain.dto.DetallePedido.DetallePedidoCreate;
import com.entidades.buenSabor.domain.dto.Direccion.DireccionCreate;
import com.entidades.buenSabor.domain.enums.Entrega;
import com.entidades.buenSabor.domain.enums.FormaPago;
import lombok.*;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class PedidoCreate {
    private Entrega entrega;
    private FormaPago formaPago;
    private Set<DetallePedidoCreate> detallesPedidos;
    private String nombreCliente;
    private String celular;
    private String dni;
    private DireccionCreate direccion;
}
