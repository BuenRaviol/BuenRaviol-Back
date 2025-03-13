package com.CapybaraDev.BuenRaviol.Business.Mapper;


import com.CapybaraDev.BuenRaviol.Domain.Dto.Pedido.PedidoCreate;
import com.CapybaraDev.BuenRaviol.Domain.Dto.Pedido.PedidoEdit;
import com.CapybaraDev.BuenRaviol.Domain.Dto.Pedido.PedidoGet;
import com.CapybaraDev.BuenRaviol.Domain.entities.Pedido;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PedidoMapper extends BaseMapper<Pedido, PedidoGet, PedidoCreate, PedidoEdit> {
}
