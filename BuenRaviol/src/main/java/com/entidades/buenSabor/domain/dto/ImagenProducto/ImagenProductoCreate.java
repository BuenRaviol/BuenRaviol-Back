package com.entidades.buenSabor.domain.dto.ImagenProducto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ImagenProductoCreate  {
    private String nombre;
    private String url;
    private String publicId;
}
