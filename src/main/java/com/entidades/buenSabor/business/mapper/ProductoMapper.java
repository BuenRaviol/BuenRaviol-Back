package com.entidades.buenSabor.business.mapper;

import com.entidades.buenSabor.business.service.CategoriaService;
import com.entidades.buenSabor.business.service.Imp.CategoriaServiceImp;
import com.entidades.buenSabor.domain.dto.Producto.ProductoCreate;
import com.entidades.buenSabor.domain.dto.Producto.ProductoEdit;
import com.entidades.buenSabor.domain.dto.Producto.ProductoGet;
import com.entidades.buenSabor.domain.entities.Producto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = "spring", uses = {CategoriaService.class, CategoriaMapper.class, ImagenProductoMapper.class})
public interface ProductoMapper extends BaseMapper<Producto, ProductoGet, ProductoCreate, ProductoEdit> {

    ProductoMapper INSTANCE = Mappers.getMapper(ProductoMapper.class);

    @Mapping(source = "categoriaId", target = "categoria", qualifiedByName = "getById")
    @Mapping(target = "deshabilitado", constant = "false")
    @Mapping(target = "imagen", source = "imagenProducto")
    public Producto toEntityCreate (ProductoCreate source);

    @Mapping(source = "categoria", target = "categoriaGet")
    @Mapping(source = "imagen.url", target = "imagenUrl")
    public ProductoGet toDTO(Producto source);
}
