package com.CapybaraDev.BuenRaviol.Business.facade;

import com.CapybaraDev.BuenRaviol.Business.facade.Base.BaseFacade;
import com.CapybaraDev.BuenRaviol.Domain.Dto.DetallePedido.DetallePedidoCreate;
import com.CapybaraDev.BuenRaviol.Domain.Dto.DetallePedido.DetallePedidoGet;
import org.springframework.stereotype.Service;

@Service
public interface DetallePedidoFacade extends BaseFacade<DetallePedidoGet, DetallePedidoCreate, DetallePedidoCreate, Long> {
}