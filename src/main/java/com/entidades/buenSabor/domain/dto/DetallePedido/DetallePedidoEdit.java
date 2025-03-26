package com.entidades.buenSabor.domain.dto.DetallePedido;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DetallePedidoEdit {
    private Integer cantidad;
    private Double subtotal;
    private Long productoId;
}
