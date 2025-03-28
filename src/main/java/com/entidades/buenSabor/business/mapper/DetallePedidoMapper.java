package com.entidades.buenSabor.business.mapper;

import com.entidades.buenSabor.business.service.DetallePedidoService;
import com.entidades.buenSabor.business.service.ProductoService;
import com.entidades.buenSabor.domain.dto.DetallePedido.DetallePedidoCreate;
import com.entidades.buenSabor.domain.dto.DetallePedido.DetallePedidoEdit;
import com.entidades.buenSabor.domain.dto.DetallePedido.DetallePedidoGet;
import com.entidades.buenSabor.domain.entities.DetallePedido;
import com.entidades.buenSabor.domain.entities.Producto;
import org.mapstruct.*;

@Mapper(componentModel = "spring", uses = {ProductoService.class, ProductoMapper.class})
public interface DetallePedidoMapper extends BaseMapper<DetallePedido, DetallePedidoGet, DetallePedidoCreate, DetallePedidoEdit> {

    @Mapping(source = "productoId", target = "producto", qualifiedByName = "getById")
    public DetallePedido toEntityCreate(DetallePedidoCreate source);

    public DetallePedidoGet toDTO(DetallePedido source);


}
