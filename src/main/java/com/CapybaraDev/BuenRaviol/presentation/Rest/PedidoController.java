package com.CapybaraDev.BuenRaviol.presentation.Rest;

import com.CapybaraDev.BuenRaviol.Business.Service.PedidoService;
import com.CapybaraDev.BuenRaviol.Business.facade.Imp.CategoriaFacadeImp;
import com.CapybaraDev.BuenRaviol.Business.facade.Imp.PedidoFacadeImp;
import com.CapybaraDev.BuenRaviol.Domain.Dto.Categoria.CategoriaCreate;
import com.CapybaraDev.BuenRaviol.Domain.Dto.Categoria.CategoriaEdit;
import com.CapybaraDev.BuenRaviol.Domain.Dto.Categoria.CategoriaGet;
import com.CapybaraDev.BuenRaviol.Domain.Dto.Pedido.PedidoCreate;
import com.CapybaraDev.BuenRaviol.Domain.Dto.Pedido.PedidoEdit;
import com.CapybaraDev.BuenRaviol.Domain.Dto.Pedido.PedidoGet;
import com.CapybaraDev.BuenRaviol.Domain.entities.Categoria;
import com.CapybaraDev.BuenRaviol.Domain.entities.Pedido;
import com.CapybaraDev.BuenRaviol.presentation.Rest.Base.BaseControllerImp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedido")
@CrossOrigin("*")
public class PedidoController extends BaseControllerImp<Pedido, PedidoGet, PedidoCreate, PedidoEdit, Long, PedidoFacadeImp> {

    public PedidoController(PedidoFacadeImp facade) {
        super(facade);
    }
}
