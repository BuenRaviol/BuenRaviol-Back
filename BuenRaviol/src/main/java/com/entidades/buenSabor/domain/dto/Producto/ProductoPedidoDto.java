package com.entidades.buenSabor.domain.dto.Producto;

import com.entidades.buenSabor.domain.dto.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductoPedidoDto extends BaseDto {
    private String nombre;
    private Double precio;
    private String imagen;
}
