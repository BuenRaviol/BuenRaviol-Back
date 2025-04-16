package com.entidades.buenSabor.business.mapper;

import com.entidades.buenSabor.domain.entities.Sucursal;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SucursalMapper extends BaseMapper<Sucursal, Sucursal {
}
