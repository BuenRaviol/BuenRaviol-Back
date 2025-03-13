package com.CapybaraDev.BuenRaviol.presentation.Rest;

import com.CapybaraDev.BuenRaviol.Business.Service.ImagenProductoService;
import com.CapybaraDev.BuenRaviol.Business.facade.Imp.CategoriaFacadeImp;
import com.CapybaraDev.BuenRaviol.Business.facade.Imp.ImagenProductoFacadeImp;
import com.CapybaraDev.BuenRaviol.Domain.Dto.Categoria.CategoriaCreate;
import com.CapybaraDev.BuenRaviol.Domain.Dto.Categoria.CategoriaEdit;
import com.CapybaraDev.BuenRaviol.Domain.Dto.Categoria.CategoriaGet;
import com.CapybaraDev.BuenRaviol.Domain.Dto.ImagenProducto.ImagenProductoCreate;
import com.CapybaraDev.BuenRaviol.Domain.Dto.ImagenProducto.ImagenProductoEdit;
import com.CapybaraDev.BuenRaviol.Domain.Dto.ImagenProducto.ImagenProductoGet;
import com.CapybaraDev.BuenRaviol.Domain.entities.Categoria;
import com.CapybaraDev.BuenRaviol.Domain.entities.ImagenProducto;
import com.CapybaraDev.BuenRaviol.presentation.Rest.Base.BaseControllerImp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/imagenProducto")
@CrossOrigin("*")
public class ImagenProductoController extends BaseControllerImp<ImagenProducto, ImagenProductoGet, ImagenProductoCreate, ImagenProductoEdit, Long, ImagenProductoFacadeImp> {
    public ImagenProductoController(ImagenProductoFacadeImp facade) {
        super(facade);
    }
}
