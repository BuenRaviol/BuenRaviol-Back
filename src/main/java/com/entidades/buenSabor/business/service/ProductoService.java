package com.entidades.buenSabor.business.service;

import com.entidades.buenSabor.business.service.Base.BaseService;
import com.entidades.buenSabor.domain.entities.Producto;

public interface ProductoService extends BaseService<Producto, Long> {
    public void changeDeshabilitado(Long id);
}
