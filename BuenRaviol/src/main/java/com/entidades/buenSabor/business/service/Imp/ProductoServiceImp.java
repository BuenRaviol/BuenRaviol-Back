package com.entidades.buenSabor.business.service.Imp;

import com.entidades.buenSabor.business.mapper.BaseMapper;
import com.entidades.buenSabor.business.mapper.ImagenProductoMapper;
import com.entidades.buenSabor.business.mapper.ImagenProductoMapperImpl;
import com.entidades.buenSabor.business.service.Base.BaseServiceImp;
import com.entidades.buenSabor.business.service.CloudinaryService;
import com.entidades.buenSabor.business.service.ProductoService;
import com.entidades.buenSabor.domain.dto.ImagenProducto.ImagenProductoGet;
import com.entidades.buenSabor.domain.entities.ImagenProducto;
import com.entidades.buenSabor.domain.entities.Producto;
import com.entidades.buenSabor.repositories.ImagenProductoRepository;
import com.entidades.buenSabor.repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

@Service
public class ProductoServiceImp extends BaseServiceImp<Producto,Long> implements ProductoService {

    @Autowired
    private CloudinaryService cloudinaryService; // Servicio para interactuar con Cloudinary

    @Autowired
    private ProductoRepository productoRepository;

    @Autowired
    private ImagenProductoRepository imagenProductoRepository;

    @Override
    public void changeDeshabilitado(Long id) {
        var producto = productoRepository.getById(id);
        producto.setDeshabilitado(!producto.getDeshabilitado());
        productoRepository.save(producto);
    }

    @Override
    public Page<Producto> getAllPageable(Pageable pageable) {
        return productoRepository.getAllPageable(pageable);
    }

    // Método para obtener todas las imágenes almacenadas
    @Override
    //pedimos el id para retornar solo las imagenes de un articulo
    public ResponseEntity<?> getAllImagesByArticuloId(Long id) {
        try {
            // Consultar todas las imágenes desde la base de datos
            ImagenProducto images = baseRepository.getById(id).getImagen();
            ImagenProductoGet imagenProductoGet = new ImagenProductoGet();
            imagenProductoGet.setUrl(imagenProductoGet.getUrl());
            imagenProductoGet.setNombre(imagenProductoGet.getNombre());
            imagenProductoGet.setId(imagenProductoGet.getId());
            return ResponseEntity.ok(images);
        } catch (Exception e) {
            e.printStackTrace();
            // Devolver un error interno del servidor (500) si ocurre alguna excepción
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @Override
    //Pedimos el id de articulo para saber a que articulo asignar las imagenes
    public ResponseEntity<String> uploadImages(MultipartFile file, Long idArticulo) {
        try {
            if (file.isEmpty()) {
                return ResponseEntity.badRequest().body("{\"status\":\"ERROR\", \"message\":\"Archivo vacío\"}");
            }

            Producto producto = baseRepository.findById(idArticulo)
                    .orElseThrow(() -> new RuntimeException("Insumo no encontrado"));

            // Subida a Cloudinary
            Map<String, String> result = cloudinaryService.uploadFile(file);
            String url = (String) result.get("url");
            String publicId = (String) result.get("public_id");

            if (url == null || publicId == null) {
                return ResponseEntity.badRequest().body("{\"status\":\"ERROR\", \"message\":\"Error al subir a Cloudinary\"}");
            }

            ImagenProducto image = new ImagenProducto();
            image.setNombre(file.getOriginalFilename());
            image.setUrl(url);
            image.setPublicId(publicId);

            producto.setImagen(image);
            imagenProductoRepository.save(image);
            baseRepository.save(producto);

            return new ResponseEntity<>("{\"status\":\"OK\", \"url\":\"" + image.getUrl() + "\"}", HttpStatus.OK);

        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(
                    "{\"status\":\"ERROR\", \"message\":\"" + e.getMessage() + "\"}",
                    HttpStatus.BAD_REQUEST
            );
        }
    }

    // Método para eliminar una imagen por su identificador en la base de datos y en Cloudinary
    @Override
    public ResponseEntity<String> deleteImage(String publicId, Long id) {
        try {
            // Eliminar la imagen de la base de datos usando su identificador
            var image = imagenProductoRepository.getById(id);
            image.setUrl("");
            image.setNombre("");
            imagenProductoRepository.save(image);

            // Llamar al servicio de Cloudinary para eliminar la imagen por su publicId
            return cloudinaryService.deleteImage(publicId, id);

        } catch (Exception e) {
            e.printStackTrace();
            // Devolver un error (400) si ocurre alguna excepción durante la eliminación
            return new ResponseEntity<>("{\"status\":\"ERROR\", \"message\":\"" + e.getMessage() + "\"}", HttpStatus.BAD_REQUEST);
        }
    }
}
