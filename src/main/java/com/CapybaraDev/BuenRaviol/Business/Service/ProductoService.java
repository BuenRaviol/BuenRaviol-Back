package com.CapybaraDev.BuenRaviol.Business.Service;

import com.CapybaraDev.BuenRaviol.Business.Service.Base.BaseService;
import com.CapybaraDev.BuenRaviol.Domain.entities.Producto;
import org.springframework.stereotype.Service;

@Service
public interface ProductoService extends BaseService<Producto, Long> {
}
