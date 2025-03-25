package com.entidades.buenSabor.domain.dto.Producto;

import com.entidades.buenSabor.domain.dto.BaseDto;
import com.entidades.buenSabor.domain.dto.Categoria.CategoriaGet;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductoGet extends BaseDto {
    private String nombre;
    private Double precio;
    private String descripcion;
    private CategoriaGet categoriaGet;
}
