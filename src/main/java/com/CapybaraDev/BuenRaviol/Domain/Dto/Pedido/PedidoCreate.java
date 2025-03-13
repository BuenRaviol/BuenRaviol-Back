package com.CapybaraDev.BuenRaviol.Domain.Dto.Pedido;

import com.CapybaraDev.BuenRaviol.Domain.Dto.DetallePedido.DetallePedidoCreate;
import com.CapybaraDev.BuenRaviol.Domain.enums.Entrega;
import com.CapybaraDev.BuenRaviol.Domain.enums.Estado;
import com.CapybaraDev.BuenRaviol.Domain.enums.FormaPago;
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
}
