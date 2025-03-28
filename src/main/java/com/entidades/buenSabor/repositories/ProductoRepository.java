package com.entidades.buenSabor.repositories;

import com.entidades.buenSabor.domain.entities.Producto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Objects;

@Repository
public interface ProductoRepository extends BaseRepository<Producto, Long> {

    @Query("SELECT p FROM Producto p WHERE p.eliminado IS NULL OR p.eliminado = false")
    Page<Producto> getAllPageable(Pageable pageable);
}
