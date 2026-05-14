package com.entidades.buenSabor.business.mapper;

import com.entidades.buenSabor.business.service.CategoriaService;
import com.entidades.buenSabor.domain.dto.Producto.ProductoCreate;
import com.entidades.buenSabor.domain.dto.Producto.ProductoEdit;
import com.entidades.buenSabor.domain.dto.Producto.ProductoGet;
import com.entidades.buenSabor.domain.dto.Producto.ProductoPedidoDto;
import com.entidades.buenSabor.domain.entities.Categoria;
import com.entidades.buenSabor.domain.entities.ImagenProducto;
import com.entidades.buenSabor.domain.entities.Producto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-04-29T00:01:18-0300",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.14.4.jar, environment: Java 21.0.10 (Ubuntu)"
)
@Component
public class ProductoMapperImpl implements ProductoMapper {

    @Autowired
    private CategoriaService categoriaService;
    @Autowired
    private ImagenProductoMapper imagenProductoMapper;

    @Override
    public List<ProductoGet> toDTOsList(List<Producto> source) {
        if ( source == null ) {
            return null;
        }

        List<ProductoGet> list = new ArrayList<ProductoGet>( source.size() );
        for ( Producto producto : source ) {
            list.add( toDTO( producto ) );
        }

        return list;
    }

    @Override
    public Producto toEntityCreate(ProductoCreate source) {
        if ( source == null ) {
            return null;
        }

        Producto.ProductoBuilder<?, ?> producto = Producto.builder();

        producto.categoria( categoriaService.getById( source.getCategoriaId() ) );
        producto.imagen( imagenProductoMapper.toEntityCreate( source.getImagenProducto() ) );
        producto.nombre( source.getNombre() );
        producto.precio( source.getPrecio() );
        producto.descripcion( source.getDescripcion() );

        producto.deshabilitado( false );

        return producto.build();
    }

    @Override
    public ProductoGet toDTO(Producto source) {
        if ( source == null ) {
            return null;
        }

        ProductoGet productoGet = new ProductoGet();

        productoGet.setImagenUrl( sourceImagenUrl( source ) );
        productoGet.setCategoria( sourceCategoriaNombre( source ) );
        productoGet.setId( source.getId() );
        productoGet.setNombre( source.getNombre() );
        productoGet.setPrecio( source.getPrecio() );
        productoGet.setDescripcion( source.getDescripcion() );
        productoGet.setDeshabilitado( source.getDeshabilitado() );

        return productoGet;
    }

    @Override
    public Producto toUpdate(Producto entity, ProductoEdit source) {
        if ( source == null ) {
            return entity;
        }

        entity.setCategoria( categoriaService.getById( source.getCategoriaId() ) );
        entity.setNombre( source.getNombre() );
        entity.setPrecio( source.getPrecio() );
        entity.setDescripcion( source.getDescripcion() );

        return entity;
    }

    @Override
    public ProductoPedidoDto toDTOPedido(Producto source) {
        if ( source == null ) {
            return null;
        }

        ProductoPedidoDto productoPedidoDto = new ProductoPedidoDto();

        productoPedidoDto.setImagen( sourceImagenUrl( source ) );
        productoPedidoDto.setId( source.getId() );
        productoPedidoDto.setNombre( source.getNombre() );
        productoPedidoDto.setPrecio( source.getPrecio() );

        return productoPedidoDto;
    }

    private String sourceImagenUrl(Producto producto) {
        if ( producto == null ) {
            return null;
        }
        ImagenProducto imagen = producto.getImagen();
        if ( imagen == null ) {
            return null;
        }
        String url = imagen.getUrl();
        if ( url == null ) {
            return null;
        }
        return url;
    }

    private String sourceCategoriaNombre(Producto producto) {
        if ( producto == null ) {
            return null;
        }
        Categoria categoria = producto.getCategoria();
        if ( categoria == null ) {
            return null;
        }
        String nombre = categoria.getNombre();
        if ( nombre == null ) {
            return null;
        }
        return nombre;
    }
}
