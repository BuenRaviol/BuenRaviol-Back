package com.entidades.buenSabor.domain.dto.DetallePedido;

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
