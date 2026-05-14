package com.entidades.buenSabor.business.mapper;

import com.entidades.buenSabor.domain.dto.Categoria.CategoriaCreate;
import com.entidades.buenSabor.domain.dto.Categoria.CategoriaEdit;
import com.entidades.buenSabor.domain.dto.Categoria.CategoriaGet;
import com.entidades.buenSabor.domain.entities.Categoria;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-04-29T00:01:18-0300",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.14.4.jar, environment: Java 21.0.10 (Ubuntu)"
)
@Component
public class CategoriaMapperImpl implements CategoriaMapper {

    @Override
    public CategoriaGet toDTO(Categoria source) {
        if ( source == null ) {
            return null;
        }

        CategoriaGet categoriaGet = new CategoriaGet();

        categoriaGet.setId( source.getId() );
        categoriaGet.setNombre( source.getNombre() );
        categoriaGet.setDescripcion( source.getDescripcion() );

        return categoriaGet;
    }

    @Override
    public Categoria toEntityCreate(CategoriaCreate source) {
        if ( source == null ) {
            return null;
        }

        Categoria.CategoriaBuilder<?, ?> categoria = Categoria.builder();

        categoria.nombre( source.getNombre() );
        categoria.descripcion( source.getDescripcion() );

        return categoria.build();
    }

    @Override
    public Categoria toUpdate(Categoria entity, CategoriaEdit source) {
        if ( source == null ) {
            return entity;
        }

        entity.setNombre( source.getNombre() );
        entity.setDescripcion( source.getDescripcion() );

        return entity;
    }

    @Override
    public List<CategoriaGet> toDTOsList(List<Categoria> source) {
        if ( source == null ) {
            return null;
        }

        List<CategoriaGet> list = new ArrayList<CategoriaGet>( source.size() );
        for ( Categoria categoria : source ) {
            list.add( toDTO( categoria ) );
        }

        return list;
    }
}
