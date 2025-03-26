package com.entidades.buenSabor.business.mapper;

import com.entidades.buenSabor.domain.dto.Producto.ProductoCreate;
import com.entidades.buenSabor.domain.dto.Producto.ProductoEdit;
import com.entidades.buenSabor.domain.dto.Producto.ProductoGet;
import com.entidades.buenSabor.domain.entities.Producto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductoMapper extends BaseMapper<Producto, ProductoGet, ProductoCreate, ProductoEdit> {
}
