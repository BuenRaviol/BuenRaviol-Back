package com.CapybaraDev.BuenRaviol.Business.Service.Imp;

import com.CapybaraDev.BuenRaviol.Business.Service.Base.BaseServiceImp;
import com.CapybaraDev.BuenRaviol.Business.Service.DetallePedidoService;
import com.CapybaraDev.BuenRaviol.Domain.entities.DetallePedido;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DetallePedidoServiceImp extends BaseServiceImp<DetallePedido, Long> implements DetallePedidoService {

    private static final Logger logger = LoggerFactory.getLogger(DetallePedidoServiceImp.class);

    @Override
    public DetallePedido create(DetallePedido request){
        request.calculaSubtotal();
        var newEntity = baseRepository.save(request);
        logger.info("Creada entidad {}",newEntity);
        return newEntity;
    }
}
