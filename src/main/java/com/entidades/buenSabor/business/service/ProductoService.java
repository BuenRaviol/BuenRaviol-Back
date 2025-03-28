package com.entidades.buenSabor.business.service;

import com.entidades.buenSabor.business.service.Base.BaseService;
import com.entidades.buenSabor.domain.entities.Producto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductoService extends BaseService<Producto, Long> {
    public void changeDeshabilitado(Long id);
    public Page<Producto> getAllPageable(Pageable pageable);
}
