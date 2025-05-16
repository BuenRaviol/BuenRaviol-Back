package com.entidades.buenSabor.business.facade;

import com.entidades.buenSabor.business.facade.Base.BaseFacade;
import com.entidades.buenSabor.domain.dto.Pedido.PedidoCreate;
import com.entidades.buenSabor.domain.dto.Pedido.PedidoEdit;
import com.entidades.buenSabor.domain.dto.Pedido.PedidoGet;
import com.entidades.buenSabor.domain.dto.Producto.ProductoGet;
import com.entidades.buenSabor.domain.entities.Pedido;
import com.entidades.buenSabor.domain.enums.Estado;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PedidoFacade extends BaseFacade<PedidoGet,PedidoCreate, PedidoEdit, Long> {
    public Page<PedidoGet> findEstadoAndSucursalId(Estado estado, Long sucursalId, Pageable pageable);
    void cambioEstado(Estado estado, Long idSucursal);
    Page<PedidoGet> findSucursalId(Long id, Pageable pageable);
    public Long calculaEnvio(String coordenadas) throws JsonProcessingException;
}
