package com.entidades.buenSabor.business.facade;

import com.entidades.buenSabor.business.facade.Base.BaseFacade;
import com.entidades.buenSabor.domain.dto.DetallePedido.DetallePedidoCreate;
import com.entidades.buenSabor.domain.dto.DetallePedido.DetallePedidoEdit;
import com.entidades.buenSabor.domain.dto.DetallePedido.DetallePedidoGet;

public interface DetallePedidoFacade extends BaseFacade<DetallePedidoGet, DetallePedidoCreate, DetallePedidoEdit, Long> {
}
