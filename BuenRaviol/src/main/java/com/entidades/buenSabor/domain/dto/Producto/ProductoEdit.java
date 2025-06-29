package com.entidades.buenSabor.domain.dto.Producto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ProductoEdit {
    private String nombre;
    private Double precio;
    private String descripcion;
    private Long categoriaId;
}
