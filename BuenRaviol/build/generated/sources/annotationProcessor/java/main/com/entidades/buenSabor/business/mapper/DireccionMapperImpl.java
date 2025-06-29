package com.entidades.buenSabor.business.mapper;

import com.entidades.buenSabor.domain.dto.Direccion.DireccionCreate;
import com.entidades.buenSabor.domain.dto.Direccion.DireccionGet;
import com.entidades.buenSabor.domain.entities.Direccion;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-06-29T01:00:20-0300",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.7.jar, environment: Java 17.0.8 (Oracle Corporation)"
)
@Component
public class DireccionMapperImpl implements DireccionMapper {

    @Override
    public DireccionGet toDTO(Direccion source) {
        if ( source == null ) {
            return null;
        }

        DireccionGet direccionGet = new DireccionGet();

        direccionGet.setId( source.getId() );
        direccionGet.setCalle( source.getCalle() );
        direccionGet.setNumero( source.getNumero() );
        direccionGet.setPiso( source.getPiso() );
        direccionGet.setDpt( source.getDpt() );
        direccionGet.setDepartamento( source.getDepartamento() );

        return direccionGet;
    }

    @Override
    public Direccion toEntityCreate(DireccionCreate source) {
        if ( source == null ) {
            return null;
        }

        Direccion direccion = new Direccion();

        direccion.setCalle( source.getCalle() );
        direccion.setNumero( source.getNumero() );
        direccion.setPiso( source.getPiso() );
        direccion.setDpt( source.getDpt() );
        direccion.setDepartamento( source.getDepartamento() );

        return direccion;
    }

    @Override
    public Direccion toUpdate(Direccion entity, DireccionGet source) {
        if ( source == null ) {
            return entity;
        }

        entity.setId( source.getId() );
        entity.setCalle( source.getCalle() );
        entity.setNumero( source.getNumero() );
        entity.setPiso( source.getPiso() );
        entity.setDpt( source.getDpt() );
        entity.setDepartamento( source.getDepartamento() );

        return entity;
    }

    @Override
    public List<DireccionGet> toDTOsList(List<Direccion> source) {
        if ( source == null ) {
            return null;
        }

        List<DireccionGet> list = new ArrayList<DireccionGet>( source.size() );
        for ( Direccion direccion : source ) {
            list.add( toDTO( direccion ) );
        }

        return list;
    }
}
