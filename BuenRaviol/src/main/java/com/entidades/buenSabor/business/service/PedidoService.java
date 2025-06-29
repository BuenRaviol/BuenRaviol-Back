package com.entidades.buenSabor.business.service;

import com.entidades.buenSabor.business.service.Base.BaseService;
import com.entidades.buenSabor.domain.entities.Pedido;
import com.entidades.buenSabor.domain.enums.Estado;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PedidoService extends BaseService<Pedido,Long> {
    public Page<Pedido> findEstadoAndSucursalId(Estado estado, Long sucursalId, Pageable pageable);
    void cambioEstado(Estado estado, Long pedidoId);
    Page<Pedido> findBySucursalId(Long id, Pageable pageable);
    public Long calculaEnvio(String coordenadas) throws JsonProcessingException;
}
