package com.entidades.buenSabor.business.service;

import com.entidades.buenSabor.business.service.Base.BaseService;
import com.entidades.buenSabor.domain.entities.Pedido;
import com.entidades.buenSabor.domain.enums.Estado;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PedidoService extends BaseService<Pedido,Long> {
    Page<Pedido> findPreparacionAndSucursalId(Long sucursalId, Pageable pageable);
    Page<Pedido> findPendienteAndSucursalId(Long sucursalId, Pageable pageable);
    void cambioEstado(Estado estado, Long pedidoId);
}
