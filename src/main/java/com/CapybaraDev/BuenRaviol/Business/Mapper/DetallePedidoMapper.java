package com.CapybaraDev.BuenRaviol.Business.Mapper;

import com.CapybaraDev.BuenRaviol.Domain.Dto.DetallePedido.DetallePedidoCreate;
import com.CapybaraDev.BuenRaviol.Domain.Dto.DetallePedido.DetallePedidoGet;
import com.CapybaraDev.BuenRaviol.Domain.entities.DetallePedido;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DetallePedidoMapper extends BaseMapper<DetallePedido, DetallePedidoGet, DetallePedidoCreate, DetallePedidoCreate> {
}
