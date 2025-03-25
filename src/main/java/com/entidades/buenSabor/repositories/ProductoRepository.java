package com.entidades.buenSabor.repositories;

import com.entidades.buenSabor.domain.entities.Producto;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends BaseRepository<Producto, Long> {
}
