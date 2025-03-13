package com.CapybaraDev.BuenRaviol.Business.Mapper;


import com.CapybaraDev.BuenRaviol.Domain.Dto.Producto.ProductoCreate;
import com.CapybaraDev.BuenRaviol.Domain.Dto.Producto.ProductoEdit;
import com.CapybaraDev.BuenRaviol.Domain.Dto.Producto.ProductoGet;
import com.CapybaraDev.BuenRaviol.Domain.entities.Producto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductoMapper extends BaseMapper<Producto, ProductoGet, ProductoCreate, ProductoEdit> {
}
