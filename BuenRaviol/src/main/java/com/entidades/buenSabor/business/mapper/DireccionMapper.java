package com.entidades.buenSabor.business.mapper;

import com.entidades.buenSabor.domain.dto.Direccion.DireccionCreate;
import com.entidades.buenSabor.domain.dto.Direccion.DireccionGet;
import com.entidades.buenSabor.domain.entities.Direccion;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DireccionMapper extends BaseMapper<Direccion, DireccionGet, DireccionCreate, DireccionGet>{
}
