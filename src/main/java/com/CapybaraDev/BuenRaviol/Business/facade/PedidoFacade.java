package com.CapybaraDev.BuenRaviol.Business.facade;

import com.CapybaraDev.BuenRaviol.Business.facade.Base.BaseFacade;
import com.CapybaraDev.BuenRaviol.Domain.Dto.Pedido.PedidoCreate;
import com.CapybaraDev.BuenRaviol.Domain.Dto.Pedido.PedidoEdit;
import com.CapybaraDev.BuenRaviol.Domain.Dto.Pedido.PedidoGet;
import org.springframework.stereotype.Service;

@Service
public interface PedidoFacade extends BaseFacade<PedidoGet, PedidoCreate, PedidoEdit, Long> {
}
