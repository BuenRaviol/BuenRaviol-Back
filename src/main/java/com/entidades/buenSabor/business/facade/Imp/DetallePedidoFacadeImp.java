package com.entidades.buenSabor.business.facade.Imp;

import com.entidades.buenSabor.business.facade.Base.BaseFacadeImp;
import com.entidades.buenSabor.business.facade.DetallePedidoFacade;
import com.entidades.buenSabor.business.mapper.BaseMapper;
import com.entidades.buenSabor.business.service.Base.BaseService;
import com.entidades.buenSabor.domain.dto.DetallePedido.DetallePedidoCreate;
import com.entidades.buenSabor.domain.dto.DetallePedido.DetallePedidoEdit;
import com.entidades.buenSabor.domain.dto.DetallePedido.DetallePedidoGet;
import com.entidades.buenSabor.domain.entities.DetallePedido;
import org.springframework.stereotype.Service;

@Service
public class DetallePedidoFacadeImp extends BaseFacadeImp<DetallePedido,DetallePedidoGet,DetallePedidoCreate, DetallePedidoEdit,Long> implements DetallePedidoFacade {


    public DetallePedidoFacadeImp(BaseService<DetallePedido, Long> baseService, BaseMapper<DetallePedido, DetallePedidoGet, DetallePedidoCreate, DetallePedidoEdit> baseMapper) {
        super(baseService, baseMapper);
    }

    @Override
    public DetallePedidoGet update(DetallePedidoGet request, Long id) {
        return null;
    }
}
