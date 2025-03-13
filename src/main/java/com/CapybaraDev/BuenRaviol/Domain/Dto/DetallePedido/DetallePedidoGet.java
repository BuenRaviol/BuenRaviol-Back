package com.CapybaraDev.BuenRaviol.Domain.Dto.DetallePedido;

import com.CapybaraDev.BuenRaviol.Domain.Dto.BaseDto;
import com.CapybaraDev.BuenRaviol.Domain.Dto.Producto.ProductoGet;
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
    private ProductoGet produto;
}
