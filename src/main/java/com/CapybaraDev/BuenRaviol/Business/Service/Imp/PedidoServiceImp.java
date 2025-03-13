package com.CapybaraDev.BuenRaviol.Business.Service.Imp;

import com.CapybaraDev.BuenRaviol.Business.Service.Base.BaseServiceImp;
import com.CapybaraDev.BuenRaviol.Business.Service.PedidoService;
import com.CapybaraDev.BuenRaviol.Domain.entities.DetallePedido;
import com.CapybaraDev.BuenRaviol.Domain.entities.Pedido;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PedidoServiceImp extends BaseServiceImp<Pedido, Long> implements PedidoService {

    private static final Logger logger = LoggerFactory.getLogger(PedidoServiceImp.class);

    @Override
    public Pedido create(Pedido request){
        request.calculaTotal();
        var newEntity = baseRepository.save(request);
        logger.info("Creada entidad {}",newEntity);
        return newEntity;
    }
}
