package com.entidades.buenSabor.business.mapper;

import com.entidades.buenSabor.domain.dto.Categoria.CategoriaCreate;
import com.entidades.buenSabor.domain.dto.Categoria.CategoriaEdit;
import com.entidades.buenSabor.domain.dto.Categoria.CategoriaGet;
import com.entidades.buenSabor.domain.entities.Categoria;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoriaMapper extends BaseMapper<Categoria, CategoriaGet, CategoriaCreate, CategoriaEdit>{
}
