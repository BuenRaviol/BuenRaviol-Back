package com.CapybaraDev.BuenRaviol.Business.Mapper;

import com.CapybaraDev.BuenRaviol.Domain.Dto.ImagenProducto.ImagenProductoCreate;
import com.CapybaraDev.BuenRaviol.Domain.Dto.ImagenProducto.ImagenProductoEdit;
import com.CapybaraDev.BuenRaviol.Domain.Dto.ImagenProducto.ImagenProductoGet;
import com.CapybaraDev.BuenRaviol.Domain.entities.ImagenProducto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ImagenProductoMapper extends BaseMapper<ImagenProducto, ImagenProductoGet, ImagenProductoCreate, ImagenProductoEdit >{
}
