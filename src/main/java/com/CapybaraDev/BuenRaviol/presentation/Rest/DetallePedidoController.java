package com.CapybaraDev.BuenRaviol.presentation.Rest;

import com.CapybaraDev.BuenRaviol.Business.Service.DetallePedidoService;
import com.CapybaraDev.BuenRaviol.Business.facade.Imp.CategoriaFacadeImp;
import com.CapybaraDev.BuenRaviol.Business.facade.Imp.DetallePedidoFacadeImp;
import com.CapybaraDev.BuenRaviol.Domain.Dto.Categoria.CategoriaCreate;
import com.CapybaraDev.BuenRaviol.Domain.Dto.Categoria.CategoriaEdit;
import com.CapybaraDev.BuenRaviol.Domain.Dto.Categoria.CategoriaGet;
import com.CapybaraDev.BuenRaviol.Domain.Dto.DetallePedido.DetallePedidoCreate;
import com.CapybaraDev.BuenRaviol.Domain.Dto.DetallePedido.DetallePedidoGet;
import com.CapybaraDev.BuenRaviol.Domain.entities.Categoria;
import com.CapybaraDev.BuenRaviol.Domain.entities.DetallePedido;
import com.CapybaraDev.BuenRaviol.presentation.Rest.Base.BaseControllerImp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/detallePedido")
@CrossOrigin("*")
public class DetallePedidoController extends BaseControllerImp<DetallePedido, DetallePedidoGet, DetallePedidoCreate, DetallePedidoCreate, Long, DetallePedidoFacadeImp> {
    public DetallePedidoController(DetallePedidoFacadeImp facade) {
        super(facade);
    }
}
