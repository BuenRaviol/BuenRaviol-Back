package com.CapybaraDev.BuenRaviol.repositories;

import com.CapybaraDev.BuenRaviol.Domain.entities.Producto;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends BaseRepository<Producto, Long> {
}
