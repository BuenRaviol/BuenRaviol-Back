package com.entidades.buenSabor.business.facade;

import com.entidades.buenSabor.business.facade.Base.BaseFacade;
import com.entidades.buenSabor.domain.dto.Sucursal.SucursalCreate;
import com.entidades.buenSabor.domain.dto.Sucursal.SucursalEdit;
import com.entidades.buenSabor.domain.dto.Sucursal.SucursalGet;

public interface SucursalFacade extends BaseFacade<SucursalGet, SucursalCreate, SucursalEdit, Long> {
}
