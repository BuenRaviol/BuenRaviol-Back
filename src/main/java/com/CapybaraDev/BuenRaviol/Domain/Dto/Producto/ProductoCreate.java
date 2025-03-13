package com.CapybaraDev.BuenRaviol.Domain.Dto.Producto;

import com.CapybaraDev.BuenRaviol.Domain.Dto.ImagenProducto.ImagenProductoCreate;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductoCreate {
    private String nombre;
    private Double precio;
    private String descripcion;
    private Long categoriaId;
    private ImagenProductoCreate imagenProducto;
}
