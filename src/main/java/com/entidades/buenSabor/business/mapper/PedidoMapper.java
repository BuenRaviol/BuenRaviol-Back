package com.entidades.buenSabor.business.mapper;

import com.entidades.buenSabor.domain.dto.Pedido.PedidoCreate;
import com.entidades.buenSabor.domain.dto.Pedido.PedidoEdit;
import com.entidades.buenSabor.domain.dto.Pedido.PedidoGet;
import com.entidades.buenSabor.domain.entities.Pedido;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {DetallePedidoMapper.class})
public interface PedidoMapper extends BaseMapper<Pedido, PedidoGet, PedidoCreate, PedidoEdit> {
    @Mapping(target = "estado", constant = "PENDIENTE") // Asigna "PENDIENTE" a estado
    @Mapping(target = "fecha", expression = "java(java.time.LocalDateTime.now())") // Asigna la fecha actual
    public Pedido toEntityCreate(PedidoCreate pedidoDTO);

}
