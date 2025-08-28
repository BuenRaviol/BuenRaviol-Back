package com.entidades.buenSabor.business.mapper;

import com.entidades.buenSabor.business.service.SucursalService;
import com.entidades.buenSabor.domain.dto.DetallePedido.DetallePedidoCreate;
import com.entidades.buenSabor.domain.dto.DetallePedido.DetallePedidoGet;
import com.entidades.buenSabor.domain.dto.Direccion.DireccionCreate;
import com.entidades.buenSabor.domain.dto.Direccion.DireccionGet;
import com.entidades.buenSabor.domain.dto.Pedido.PedidoCreate;
import com.entidades.buenSabor.domain.dto.Pedido.PedidoEdit;
import com.entidades.buenSabor.domain.dto.Pedido.PedidoGet;
import com.entidades.buenSabor.domain.entities.DetallePedido;
import com.entidades.buenSabor.domain.entities.Direccion;
import com.entidades.buenSabor.domain.entities.Pedido;
import com.entidades.buenSabor.domain.entities.Sucursal;
import com.entidades.buenSabor.domain.enums.Estado;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-08-28T19:57:29-0300",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.7.jar, environment: Java 21.0.8 (Oracle Corporation)"
)
@Component
public class PedidoMapperImpl implements PedidoMapper {

    @Autowired
    private DetallePedidoMapper detallePedidoMapper;
    @Autowired
    private SucursalService sucursalService;

    @Override
    public Pedido toUpdate(Pedido entity, PedidoEdit source) {
        if ( source == null ) {
            return entity;
        }

        entity.setEntrega( source.getEntrega() );
        entity.setFormaPago( source.getFormaPago() );
        if ( entity.getDetallesPedidos() != null ) {
            Set<DetallePedido> set = detallePedidoCreateSetToDetallePedidoSet( source.getDetallesPedidos() );
            if ( set != null ) {
                entity.getDetallesPedidos().clear();
                entity.getDetallesPedidos().addAll( set );
            }
            else {
                entity.setDetallesPedidos( null );
            }
        }
        else {
            Set<DetallePedido> set = detallePedidoCreateSetToDetallePedidoSet( source.getDetallesPedidos() );
            if ( set != null ) {
                entity.setDetallesPedidos( set );
            }
        }

        return entity;
    }

    @Override
    public List<PedidoGet> toDTOsList(List<Pedido> source) {
        if ( source == null ) {
            return null;
        }

        List<PedidoGet> list = new ArrayList<PedidoGet>( source.size() );
        for ( Pedido pedido : source ) {
            list.add( toDTO( pedido ) );
        }

        return list;
    }

    @Override
    public Pedido toEntityCreate(PedidoCreate pedidoDTO) {
        if ( pedidoDTO == null ) {
            return null;
        }

        Pedido.PedidoBuilder<?, ?> pedido = Pedido.builder();

        pedido.sucursal( sucursalService.getById( pedidoDTO.getSucursal() ) );
        pedido.entrega( pedidoDTO.getEntrega() );
        pedido.formaPago( pedidoDTO.getFormaPago() );
        pedido.nombreCliente( pedidoDTO.getNombreCliente() );
        pedido.celular( pedidoDTO.getCelular() );
        pedido.dni( pedidoDTO.getDni() );
        pedido.direccion( direccionCreateToDireccion( pedidoDTO.getDireccion() ) );
        pedido.envio( pedidoDTO.getEnvio() );
        pedido.detallesPedidos( detallePedidoCreateSetToDetallePedidoSet( pedidoDTO.getDetallesPedidos() ) );

        pedido.estado( Estado.PENDIENTE );
        pedido.fecha( java.time.LocalDateTime.now() );

        return pedido.build();
    }

    @Override
    public PedidoGet toDTO(Pedido source) {
        if ( source == null ) {
            return null;
        }

        PedidoGet pedidoGet = new PedidoGet();

        pedidoGet.setIdSucursal( sourceSucursalId( source ) );
        pedidoGet.setId( source.getId() );
        pedidoGet.setTotal( source.getTotal() );
        pedidoGet.setEstado( source.getEstado() );
        pedidoGet.setEntrega( source.getEntrega() );
        pedidoGet.setFormaPago( source.getFormaPago() );
        pedidoGet.setFecha( source.getFecha() );
        pedidoGet.setDetallesPedidos( detallePedidoSetToDetallePedidoGetSet( source.getDetallesPedidos() ) );
        pedidoGet.setNombreCliente( source.getNombreCliente() );
        pedidoGet.setCelular( source.getCelular() );
        pedidoGet.setDni( source.getDni() );
        pedidoGet.setDireccion( direccionToDireccionGet( source.getDireccion() ) );
        pedidoGet.setEnvio( source.getEnvio() );

        return pedidoGet;
    }

    protected Set<DetallePedido> detallePedidoCreateSetToDetallePedidoSet(Set<DetallePedidoCreate> set) {
        if ( set == null ) {
            return null;
        }

        Set<DetallePedido> set1 = new LinkedHashSet<DetallePedido>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( DetallePedidoCreate detallePedidoCreate : set ) {
            set1.add( detallePedidoMapper.toEntityCreate( detallePedidoCreate ) );
        }

        return set1;
    }

    protected Direccion direccionCreateToDireccion(DireccionCreate direccionCreate) {
        if ( direccionCreate == null ) {
            return null;
        }

        Direccion direccion = new Direccion();

        direccion.setCalle( direccionCreate.getCalle() );
        direccion.setNumero( direccionCreate.getNumero() );
        direccion.setPiso( direccionCreate.getPiso() );
        direccion.setDpt( direccionCreate.getDpt() );
        direccion.setDepartamento( direccionCreate.getDepartamento() );

        return direccion;
    }

    private Long sourceSucursalId(Pedido pedido) {
        if ( pedido == null ) {
            return null;
        }
        Sucursal sucursal = pedido.getSucursal();
        if ( sucursal == null ) {
            return null;
        }
        Long id = sucursal.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    protected Set<DetallePedidoGet> detallePedidoSetToDetallePedidoGetSet(Set<DetallePedido> set) {
        if ( set == null ) {
            return null;
        }

        Set<DetallePedidoGet> set1 = new LinkedHashSet<DetallePedidoGet>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( DetallePedido detallePedido : set ) {
            set1.add( detallePedidoMapper.toDTO( detallePedido ) );
        }

        return set1;
    }

    protected DireccionGet direccionToDireccionGet(Direccion direccion) {
        if ( direccion == null ) {
            return null;
        }

        DireccionGet direccionGet = new DireccionGet();

        direccionGet.setId( direccion.getId() );
        direccionGet.setCalle( direccion.getCalle() );
        direccionGet.setNumero( direccion.getNumero() );
        direccionGet.setPiso( direccion.getPiso() );
        direccionGet.setDpt( direccion.getDpt() );
        direccionGet.setDepartamento( direccion.getDepartamento() );

        return direccionGet;
    }
}
