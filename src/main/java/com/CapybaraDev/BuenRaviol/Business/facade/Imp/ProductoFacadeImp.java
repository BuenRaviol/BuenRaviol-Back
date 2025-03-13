package com.CapybaraDev.BuenRaviol.Business.facade.Imp;

import com.CapybaraDev.BuenRaviol.Business.Mapper.BaseMapper;
import com.CapybaraDev.BuenRaviol.Business.Service.Base.BaseService;
import com.CapybaraDev.BuenRaviol.Business.facade.Base.BaseFacadeImp;
import com.CapybaraDev.BuenRaviol.Business.facade.ProductoFacade;
import com.CapybaraDev.BuenRaviol.Domain.Dto.Producto.ProductoCreate;
import com.CapybaraDev.BuenRaviol.Domain.Dto.Producto.ProductoEdit;
import com.CapybaraDev.BuenRaviol.Domain.Dto.Producto.ProductoGet;
import com.CapybaraDev.BuenRaviol.Domain.entities.Producto;
import org.springframework.stereotype.Service;

@Service
public class ProductoFacadeImp extends BaseFacadeImp<Producto, ProductoGet, ProductoCreate, ProductoEdit, Long> implements ProductoFacade {
    public ProductoFacadeImp(BaseService<Producto, Long> baseService, BaseMapper<Producto, ProductoGet, ProductoCreate, ProductoEdit> baseMapper) {
        super(baseService, baseMapper);
    }
}
