package com.CapybaraDev.BuenRaviol.Business.facade;

import com.CapybaraDev.BuenRaviol.Business.facade.Base.BaseFacade;
import com.CapybaraDev.BuenRaviol.Domain.Dto.Producto.ProductoCreate;
import com.CapybaraDev.BuenRaviol.Domain.Dto.Producto.ProductoEdit;
import com.CapybaraDev.BuenRaviol.Domain.Dto.Producto.ProductoGet;
import org.springframework.stereotype.Service;

@Service
public interface ProductoFacade extends BaseFacade<ProductoGet, ProductoCreate, ProductoEdit, Long> {
}
