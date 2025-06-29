package com.entidades.buenSabor.business.mapper;

import com.entidades.buenSabor.business.service.ProductoService;
import com.entidades.buenSabor.domain.dto.DetallePedido.DetallePedidoCreate;
import com.entidades.buenSabor.domain.dto.DetallePedido.DetallePedidoEdit;
import com.entidades.buenSabor.domain.dto.DetallePedido.DetallePedidoGet;
import com.entidades.buenSabor.domain.entities.DetallePedido;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-06-29T01:00:20-0300",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.7.jar, environment: Java 17.0.8 (Oracle Corporation)"
)
@Component
public class DetallePedidoMapperImpl implements DetallePedidoMapper {

    @Autowired
    private ProductoService productoService;
    @Autowired
    private ProductoMapper productoMapper;

    @Override
    public DetallePedido toUpdate(DetallePedido entity, DetallePedidoEdit source) {
        if ( source == null ) {
            return entity;
        }

        entity.setCantidad( source.getCantidad() );
        entity.setSubtotal( source.getSubtotal() );

        return entity;
    }

    @Override
    public List<DetallePedidoGet> toDTOsList(List<DetallePedido> source) {
        if ( source == null ) {
            return null;
        }

        List<DetallePedidoGet> list = new ArrayList<DetallePedidoGet>( source.size() );
        for ( DetallePedido detallePedido : source ) {
            list.add( toDTO( detallePedido ) );
        }

        return list;
    }

    @Override
    public DetallePedido toEntityCreate(DetallePedidoCreate source) {
        if ( source == null ) {
            return null;
        }

        DetallePedido.DetallePedidoBuilder<?, ?> detallePedido = DetallePedido.builder();

        detallePedido.producto( productoService.getById( source.getProductoId() ) );
        detallePedido.cantidad( source.getCantidad() );

        return detallePedido.build();
    }

    @Override
    public DetallePedidoGet toDTO(DetallePedido source) {
        if ( source == null ) {
            return null;
        }

        DetallePedidoGet detallePedidoGet = new DetallePedidoGet();

        detallePedidoGet.setProduto( productoMapper.toDTOPedido( source.getProducto() ) );
        detallePedidoGet.setId( source.getId() );
        detallePedidoGet.setCantidad( source.getCantidad() );
        detallePedidoGet.setSubtotal( source.getSubtotal() );

        return detallePedidoGet;
    }
}
