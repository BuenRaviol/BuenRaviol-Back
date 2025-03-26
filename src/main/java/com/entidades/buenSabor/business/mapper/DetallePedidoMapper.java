package com.entidades.buenSabor.business.mapper;

import com.entidades.buenSabor.domain.dto.DetallePedido.DetallePedidoCreate;
import com.entidades.buenSabor.domain.dto.DetallePedido.DetallePedidoGet;
import com.entidades.buenSabor.domain.entities.DetallePedido;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DetallePedidoMapper extends BaseMapper<DetallePedido, DetallePedidoGet, DetallePedidoCreate, DetallePedidoGet> {
}
