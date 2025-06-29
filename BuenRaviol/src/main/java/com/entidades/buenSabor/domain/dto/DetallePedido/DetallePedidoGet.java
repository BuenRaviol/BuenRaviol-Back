package com.entidades.buenSabor.domain.dto.DetallePedido;

import com.entidades.buenSabor.domain.dto.BaseDto;
import com.entidades.buenSabor.domain.dto.Producto.ProductoGet;
import com.entidades.buenSabor.domain.dto.Producto.ProductoPedidoDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DetallePedidoGet extends BaseDto {
    private Integer cantidad;
    private Double subtotal;
    private ProductoPedidoDto produto;
}
