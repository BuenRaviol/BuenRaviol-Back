package com.CapybaraDev.BuenRaviol.Business.Mapper;

import com.CapybaraDev.BuenRaviol.Domain.Dto.Categoria.CategoriaCreate;
import com.CapybaraDev.BuenRaviol.Domain.Dto.Categoria.CategoriaEdit;
import com.CapybaraDev.BuenRaviol.Domain.Dto.Categoria.CategoriaGet;
import com.CapybaraDev.BuenRaviol.Domain.entities.Categoria;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoriaMapper extends BaseMapper<Categoria, CategoriaGet, CategoriaCreate, CategoriaEdit>{
}
