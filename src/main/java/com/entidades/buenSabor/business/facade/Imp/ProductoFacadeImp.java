package com.entidades.buenSabor.business.facade.Imp;

import com.entidades.buenSabor.business.facade.Base.BaseFacadeImp;
import com.entidades.buenSabor.business.facade.ProductoFacade;
import com.entidades.buenSabor.business.mapper.BaseMapper;
import com.entidades.buenSabor.business.service.Base.BaseService;
import com.entidades.buenSabor.business.service.ProductoService;
import com.entidades.buenSabor.domain.dto.Producto.ProductoCreate;
import com.entidades.buenSabor.domain.dto.Producto.ProductoEdit;
import com.entidades.buenSabor.domain.dto.Producto.ProductoGet;
import com.entidades.buenSabor.domain.entities.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductoFacadeImp extends BaseFacadeImp<Producto, ProductoGet, ProductoCreate, ProductoEdit,Long> implements ProductoFacade {
    public ProductoFacadeImp(BaseService<Producto, Long> baseService, BaseMapper<Producto, ProductoGet, ProductoCreate, ProductoEdit> baseMapper) {
        super(baseService, baseMapper);
    }

    @Autowired
    private ProductoService productoService;

    @Override
    public void changeDeshabilitado(Long id) {
        productoService.changeDeshabilitado(id);
    }

    @Override
    public Page<ProductoGet> getAllPage(Pageable pageable) {
        return baseMapper.toDTOsPage(productoService.getAllPageable(pageable));
    }
}
