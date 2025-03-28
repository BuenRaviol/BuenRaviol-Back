package com.entidades.buenSabor.business.service.Imp;

import com.entidades.buenSabor.business.service.Base.BaseServiceImp;
import com.entidades.buenSabor.business.service.ProductoService;
import com.entidades.buenSabor.domain.entities.Producto;
import com.entidades.buenSabor.repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImp extends BaseServiceImp<Producto,Long> implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public void changeDeshabilitado(Long id) {
        var producto = productoRepository.getById(id);
        producto.setDeshabilitado(!producto.getDeshabilitado());
        productoRepository.save(producto);
    }

    @Override
    public Page<Producto> getAllPageable(Pageable pageable) {
        return productoRepository.getAllPageable(pageable);
    }
}
