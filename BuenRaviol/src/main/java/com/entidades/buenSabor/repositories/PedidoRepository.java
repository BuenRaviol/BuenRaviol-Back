package com.entidades.buenSabor.repositories;

import com.entidades.buenSabor.domain.entities.Pedido;
import com.entidades.buenSabor.domain.enums.Estado;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends BaseRepository<Pedido,Long>{
    Page<Pedido> findByEstadoAndSucursalId(Estado estado, Long sucursalId, Pageable pageable);
    Page<Pedido> findBySucursalId(Long sucursalId, Pageable pageable);
}
