package com.CapybaraDev.BuenRaviol.Domain.Dto.Producto;

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
