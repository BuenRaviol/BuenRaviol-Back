package com.entidades.buenSabor.business.facade;

import com.entidades.buenSabor.business.facade.Base.BaseFacade;
import com.entidades.buenSabor.domain.dto.Producto.ProductoCreate;
import com.entidades.buenSabor.domain.dto.Producto.ProductoEdit;
import com.entidades.buenSabor.domain.dto.Producto.ProductoGet;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductoFacade extends BaseFacade<ProductoGet, ProductoCreate, ProductoEdit, Long> {
    public void changeDeshabilitado(Long id);
    public Page<ProductoGet> getAllPage(Pageable pageable);
}
