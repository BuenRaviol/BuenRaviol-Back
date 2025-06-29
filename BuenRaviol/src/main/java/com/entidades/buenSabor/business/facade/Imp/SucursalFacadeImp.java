package com.entidades.buenSabor.business.facade.Imp;

import com.entidades.buenSabor.business.facade.Base.BaseFacadeImp;
import com.entidades.buenSabor.business.facade.SucursalFacade;
import com.entidades.buenSabor.business.mapper.BaseMapper;
import com.entidades.buenSabor.business.service.Base.BaseService;
import com.entidades.buenSabor.domain.dto.Sucursal.SucursalCreate;
import com.entidades.buenSabor.domain.dto.Sucursal.SucursalEdit;
import com.entidades.buenSabor.domain.dto.Sucursal.SucursalGet;
import com.entidades.buenSabor.domain.entities.Sucursal;
import org.springframework.stereotype.Service;

@Service
public class SucursalFacadeImp extends BaseFacadeImp<Sucursal, SucursalGet, SucursalCreate, SucursalEdit, Long> implements SucursalFacade {
    public SucursalFacadeImp(BaseService<Sucursal, Long> baseService, BaseMapper<Sucursal, SucursalGet, SucursalCreate, SucursalEdit> baseMapper) {
        super(baseService, baseMapper);
    }
}
