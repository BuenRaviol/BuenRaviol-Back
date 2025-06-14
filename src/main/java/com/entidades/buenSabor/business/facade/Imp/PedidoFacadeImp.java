package com.entidades.buenSabor.business.facade.Imp;

import com.entidades.buenSabor.business.facade.Base.BaseFacadeImp;
import com.entidades.buenSabor.business.facade.PedidoFacade;
import com.entidades.buenSabor.business.mapper.BaseMapper;
import com.entidades.buenSabor.business.service.Base.BaseService;
import com.entidades.buenSabor.business.service.PedidoService;
import com.entidades.buenSabor.domain.dto.Pedido.PedidoCreate;
import com.entidades.buenSabor.domain.dto.Pedido.PedidoEdit;
import com.entidades.buenSabor.domain.dto.Pedido.PedidoGet;
import com.entidades.buenSabor.domain.entities.Pedido;
import com.entidades.buenSabor.domain.enums.Estado;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PedidoFacadeImp extends BaseFacadeImp<Pedido, PedidoGet, PedidoCreate, PedidoEdit, Long> implements PedidoFacade {
    public PedidoFacadeImp(BaseService<Pedido, Long> baseService, BaseMapper<Pedido, PedidoGet, PedidoCreate, PedidoEdit> baseMapper) {
        super(baseService, baseMapper);
    }

    @Autowired
    private PedidoService pedidoService;



    @Override
    public Page<PedidoGet> findEstadoAndSucursalId(Estado estado, Long sucursalId, Pageable pageable ){
        return baseMapper.toDTOsPage(pedidoService.findEstadoAndSucursalId(estado,sucursalId,pageable));
    }

    @Override
    public void cambioEstado(Estado estado, Long idPedido) {
        pedidoService.cambioEstado(estado, idPedido);
    }

    @Override
    public Page<PedidoGet> findSucursalId(Long id, Pageable pageable) {
        return baseMapper.toDTOsPage(pedidoService.findBySucursalId(id,pageable));
    }

    @Override
    public Long calculaEnvio(String coordenadas) throws JsonProcessingException {
        return pedidoService.calculaEnvio(coordenadas);
    }
}
