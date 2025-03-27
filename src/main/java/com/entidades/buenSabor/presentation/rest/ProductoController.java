package com.entidades.buenSabor.presentation.rest;

import com.entidades.buenSabor.business.facade.Imp.ProductoFacadeImp;
import com.entidades.buenSabor.domain.dto.Producto.ProductoCreate;
import com.entidades.buenSabor.domain.dto.Producto.ProductoEdit;
import com.entidades.buenSabor.domain.dto.Producto.ProductoGet;
import com.entidades.buenSabor.domain.entities.Producto;
import com.entidades.buenSabor.presentation.rest.Base.BaseControllerImp;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/producto")
@CrossOrigin("*")
public class ProductoController extends BaseControllerImp<Producto, ProductoGet, ProductoCreate, ProductoEdit,Long, ProductoFacadeImp> {
    public ProductoController(ProductoFacadeImp facade) {
        super(facade);
    }

    @PutMapping("/change/deshabilitado/{id}")
    public ResponseEntity<?> changeDeshabilitado(@PathVariable Long id){
        facade.changeDeshabilitado(id);
        return ResponseEntity.ok("Producto editado");
    }
}
