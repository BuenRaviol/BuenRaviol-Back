package com.CapybaraDev.BuenRaviol.Business.facade.Imp;

import com.CapybaraDev.BuenRaviol.Business.Mapper.BaseMapper;
import com.CapybaraDev.BuenRaviol.Business.Service.Base.BaseService;
import com.CapybaraDev.BuenRaviol.Business.facade.Base.BaseFacadeImp;
import com.CapybaraDev.BuenRaviol.Business.facade.PedidoFacade;
import com.CapybaraDev.BuenRaviol.Domain.Dto.Pedido.PedidoCreate;
import com.CapybaraDev.BuenRaviol.Domain.Dto.Pedido.PedidoEdit;
import com.CapybaraDev.BuenRaviol.Domain.Dto.Pedido.PedidoGet;
import com.CapybaraDev.BuenRaviol.Domain.entities.Pedido;
import org.springframework.stereotype.Service;

@Service
public class PedidoFacadeImp extends BaseFacadeImp<Pedido, PedidoGet, PedidoCreate, PedidoEdit, Long> implements PedidoFacade {
    public PedidoFacadeImp(BaseService<Pedido, Long> baseService, BaseMapper<Pedido, PedidoGet, PedidoCreate, PedidoEdit> baseMapper) {
        super(baseService, baseMapper);
    }
}
