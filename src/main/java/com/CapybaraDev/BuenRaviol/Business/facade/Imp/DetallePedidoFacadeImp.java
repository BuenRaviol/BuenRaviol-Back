package com.CapybaraDev.BuenRaviol.Business.facade.Imp;

import com.CapybaraDev.BuenRaviol.Business.Mapper.BaseMapper;
import com.CapybaraDev.BuenRaviol.Business.Service.Base.BaseService;
import com.CapybaraDev.BuenRaviol.Business.facade.Base.BaseFacadeImp;
import com.CapybaraDev.BuenRaviol.Business.facade.DetallePedidoFacade;
import com.CapybaraDev.BuenRaviol.Domain.Dto.DetallePedido.DetallePedidoCreate;
import com.CapybaraDev.BuenRaviol.Domain.Dto.DetallePedido.DetallePedidoGet;
import com.CapybaraDev.BuenRaviol.Domain.entities.DetallePedido;
import org.springframework.stereotype.Service;



@Service
public class DetallePedidoFacadeImp extends BaseFacadeImp<DetallePedido, DetallePedidoGet, DetallePedidoCreate, DetallePedidoCreate, Long> implements DetallePedidoFacade {

    public DetallePedidoFacadeImp(BaseService<DetallePedido, Long> baseService, BaseMapper<DetallePedido, DetallePedidoGet, DetallePedidoCreate, DetallePedidoCreate> baseMapper) {
        super(baseService, baseMapper);
    }
}
