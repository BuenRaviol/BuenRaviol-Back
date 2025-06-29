package com.entidades.buenSabor.business.mapper;

import com.entidades.buenSabor.domain.dto.ImagenProducto.ImagenProductoCreate;
import com.entidades.buenSabor.domain.dto.ImagenProducto.ImagenProductoEdit;
import com.entidades.buenSabor.domain.dto.ImagenProducto.ImagenProductoGet;
import com.entidades.buenSabor.domain.entities.ImagenProducto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ImagenProductoMapper extends BaseMapper<ImagenProducto, ImagenProductoGet, ImagenProductoCreate, ImagenProductoEdit> {
}
