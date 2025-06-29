package com.entidades.buenSabor.presentation.rest;

import com.entidades.buenSabor.business.facade.Imp.SucursalFacadeImp;
import com.entidades.buenSabor.domain.dto.Sucursal.SucursalCreate;
import com.entidades.buenSabor.domain.dto.Sucursal.SucursalEdit;
import com.entidades.buenSabor.domain.dto.Sucursal.SucursalGet;
import com.entidades.buenSabor.domain.entities.Sucursal;
import com.entidades.buenSabor.presentation.rest.Base.BaseControllerImp;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sucursal")
@CrossOrigin("*")
public class SucursalController extends BaseControllerImp<Sucursal, SucursalGet, SucursalCreate, SucursalEdit, Long, SucursalFacadeImp> {
    public SucursalController(SucursalFacadeImp facade) {
        super(facade);
    }
}
