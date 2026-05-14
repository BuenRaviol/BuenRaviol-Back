package com.entidades.buenSabor.business.mapper;

import com.entidades.buenSabor.domain.dto.Direccion.DireccionCreate;
import com.entidades.buenSabor.domain.dto.Sucursal.SucursalCreate;
import com.entidades.buenSabor.domain.dto.Sucursal.SucursalEdit;
import com.entidades.buenSabor.domain.dto.Sucursal.SucursalGet;
import com.entidades.buenSabor.domain.entities.Direccion;
import com.entidades.buenSabor.domain.entities.Sucursal;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-04-29T00:01:17-0300",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.14.4.jar, environment: Java 21.0.10 (Ubuntu)"
)
@Component
public class SucursalMapperImpl implements SucursalMapper {

    @Override
    public SucursalGet toDTO(Sucursal source) {
        if ( source == null ) {
            return null;
        }

        SucursalGet sucursalGet = new SucursalGet();

        sucursalGet.setId( source.getId() );
        sucursalGet.setNombre( source.getNombre() );

        return sucursalGet;
    }

    @Override
    public Sucursal toEntityCreate(SucursalCreate source) {
        if ( source == null ) {
            return null;
        }

        Sucursal sucursal = new Sucursal();

        sucursal.setNombre( source.getNombre() );
        sucursal.setDireccion( direccionCreateToDireccion( source.getDireccion() ) );

        return sucursal;
    }

    @Override
    public Sucursal toUpdate(Sucursal entity, SucursalEdit source) {
        if ( source == null ) {
            return entity;
        }

        entity.setNombre( source.getNombre() );

        return entity;
    }

    @Override
    public List<SucursalGet> toDTOsList(List<Sucursal> source) {
        if ( source == null ) {
            return null;
        }

        List<SucursalGet> list = new ArrayList<SucursalGet>( source.size() );
        for ( Sucursal sucursal : source ) {
            list.add( toDTO( sucursal ) );
        }

        return list;
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
}
