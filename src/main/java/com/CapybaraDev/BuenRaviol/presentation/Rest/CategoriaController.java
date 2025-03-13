package com.CapybaraDev.BuenRaviol.presentation.Rest;

import com.CapybaraDev.BuenRaviol.Business.Service.CategoriaService;
import com.CapybaraDev.BuenRaviol.Business.facade.CategoriaFacade;
import com.CapybaraDev.BuenRaviol.Business.facade.Imp.CategoriaFacadeImp;
import com.CapybaraDev.BuenRaviol.Domain.Dto.Categoria.CategoriaCreate;
import com.CapybaraDev.BuenRaviol.Domain.Dto.Categoria.CategoriaEdit;
import com.CapybaraDev.BuenRaviol.Domain.Dto.Categoria.CategoriaGet;
import com.CapybaraDev.BuenRaviol.Domain.entities.Categoria;
import com.CapybaraDev.BuenRaviol.presentation.Rest.Base.BaseControllerImp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categoria")
@CrossOrigin("*")
public class CategoriaController extends BaseControllerImp<Categoria, CategoriaGet, CategoriaCreate, CategoriaEdit, Long, CategoriaFacadeImp> {
    public CategoriaController(CategoriaFacadeImp facade) {
        super(facade);
    }
}
