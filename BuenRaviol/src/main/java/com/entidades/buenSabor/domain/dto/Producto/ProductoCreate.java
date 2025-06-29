package com.entidades.buenSabor.domain.dto.Producto;

import com.entidades.buenSabor.domain.dto.ImagenProducto.ImagenProductoCreate;
import com.entidades.buenSabor.domain.entities.Sucursal;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductoCreate {
    private String nombre;
    private Double precio;
    private String descripcion;
    private Long categoriaId;
    private ImagenProductoCreate imagenProducto;
}
