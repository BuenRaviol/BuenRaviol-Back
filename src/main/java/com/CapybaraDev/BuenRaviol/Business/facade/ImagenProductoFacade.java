package com.CapybaraDev.BuenRaviol.Business.facade;

import com.CapybaraDev.BuenRaviol.Business.facade.Base.BaseFacade;
import com.CapybaraDev.BuenRaviol.Domain.Dto.ImagenProducto.ImagenProductoCreate;
import com.CapybaraDev.BuenRaviol.Domain.Dto.ImagenProducto.ImagenProductoEdit;
import com.CapybaraDev.BuenRaviol.Domain.Dto.ImagenProducto.ImagenProductoGet;
import org.springframework.stereotype.Service;

@Service
public interface ImagenProductoFacade extends BaseFacade<ImagenProductoGet, ImagenProductoCreate, ImagenProductoEdit, Long> {
}
