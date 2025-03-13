package com.CapybaraDev.BuenRaviol.Domain.Dto.ImagenProducto;

import com.CapybaraDev.BuenRaviol.Domain.Dto.BaseDto;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ImagenProductoCreate  {
    private String nombre;
    private String url;
}
