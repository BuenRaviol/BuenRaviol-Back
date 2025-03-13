package com.CapybaraDev.BuenRaviol.Domain.Dto.DetallePedido;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DetallePedidoCreate{
    private Integer cantidad;
    private Double subtotal;
    private Long productoId;
}
