package com.CapybaraDev.BuenRaviol.presentation.Rest;

import com.CapybaraDev.BuenRaviol.Business.Service.ProductoService;
import com.CapybaraDev.BuenRaviol.Business.facade.Imp.ProductoFacadeImp;
import com.CapybaraDev.BuenRaviol.Domain.Dto.Producto.ProductoCreate;
import com.CapybaraDev.BuenRaviol.Domain.Dto.Producto.ProductoEdit;
import com.CapybaraDev.BuenRaviol.Domain.Dto.Producto.ProductoGet;
import com.CapybaraDev.BuenRaviol.Domain.entities.Producto;
import com.CapybaraDev.BuenRaviol.presentation.Rest.Base.BaseControllerImp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/producto")
public class ProductoController extends BaseControllerImp<Producto, ProductoGet, ProductoCreate, ProductoEdit, Long, ProductoFacadeImp> {

    public ProductoController(ProductoFacadeImp facade) {
        super(facade);
    }
}
