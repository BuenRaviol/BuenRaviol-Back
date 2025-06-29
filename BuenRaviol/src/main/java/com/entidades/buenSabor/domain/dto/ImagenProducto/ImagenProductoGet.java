package com.entidades.buenSabor.domain.dto.ImagenProducto;


import com.entidades.buenSabor.domain.dto.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ImagenProductoGet extends BaseDto {
    private String nombre;
    private String url;
}
