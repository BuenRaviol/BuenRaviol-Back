package com.entidades.buenSabor.business.mapper;

import com.entidades.buenSabor.domain.dto.ImagenProducto.ImagenProductoCreate;
import com.entidades.buenSabor.domain.dto.ImagenProducto.ImagenProductoEdit;
import com.entidades.buenSabor.domain.dto.ImagenProducto.ImagenProductoGet;
import com.entidades.buenSabor.domain.entities.ImagenProducto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-06-28T22:31:30-0300",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.3.jar, environment: Java 17.0.8 (Oracle Corporation)"
)
@Component
public class ImagenProductoMapperImpl implements ImagenProductoMapper {

    @Override
    public ImagenProductoGet toDTO(ImagenProducto source) {
        if ( source == null ) {
            return null;
        }

        ImagenProductoGet imagenProductoGet = new ImagenProductoGet();

        imagenProductoGet.setId( source.getId() );
        imagenProductoGet.setNombre( source.getNombre() );
        imagenProductoGet.setUrl( source.getUrl() );

        return imagenProductoGet;
    }

    @Override
    public ImagenProducto toEntityCreate(ImagenProductoCreate source) {
        if ( source == null ) {
            return null;
        }

        ImagenProducto.ImagenProductoBuilder<?, ?> imagenProducto = ImagenProducto.builder();

        imagenProducto.nombre( source.getNombre() );
        imagenProducto.url( source.getUrl() );
        imagenProducto.publicId( source.getPublicId() );

        return imagenProducto.build();
    }

    @Override
    public ImagenProducto toUpdate(ImagenProducto entity, ImagenProductoEdit source) {
        if ( source == null ) {
            return entity;
        }

        entity.setUrl( source.getUrl() );

        return entity;
    }

    @Override
    public List<ImagenProductoGet> toDTOsList(List<ImagenProducto> source) {
        if ( source == null ) {
            return null;
        }

        List<ImagenProductoGet> list = new ArrayList<ImagenProductoGet>( source.size() );
        for ( ImagenProducto imagenProducto : source ) {
            list.add( toDTO( imagenProducto ) );
        }

        return list;
    }
}
