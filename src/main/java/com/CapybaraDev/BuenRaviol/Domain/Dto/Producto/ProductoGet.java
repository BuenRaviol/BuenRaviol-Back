package com.CapybaraDev.BuenRaviol.Domain.Dto.Producto;

import com.CapybaraDev.BuenRaviol.Domain.Dto.BaseDto;
import com.CapybaraDev.BuenRaviol.Domain.Dto.Categoria.CategoriaGet;
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
