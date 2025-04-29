package com.entidades.buenSabor.business.facade;

import com.entidades.buenSabor.business.facade.Base.BaseFacade;
import com.entidades.buenSabor.domain.dto.Pedido.PedidoCreate;
import com.entidades.buenSabor.domain.dto.Pedido.PedidoEdit;
import com.entidades.buenSabor.domain.dto.Pedido.PedidoGet;
import com.entidades.buenSabor.domain.dto.Producto.ProductoGet;
import com.entidades.buenSabor.domain.entities.Pedido;
import com.entidades.buenSabor.domain.enums.Estado;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PedidoFacade extends BaseFacade<PedidoGet,PedidoCreate, PedidoEdit, Long> {
    Page<PedidoGet> findPreparacionAndSucursalId(Long sucursalId, Pageable pageable);
    Page<PedidoGet> findPendienteAndSucursalId(Long sucursalId, Pageable pageable);
    void cambioEstado(Estado estado, Long idSucursal);
}
