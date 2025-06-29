package com.entidades.buenSabor.business.facade;

import com.entidades.buenSabor.business.facade.Base.BaseFacade;
import com.entidades.buenSabor.domain.dto.ImagenProducto.ImagenProductoCreate;
import com.entidades.buenSabor.domain.dto.ImagenProducto.ImagenProductoEdit;
import com.entidades.buenSabor.domain.dto.ImagenProducto.ImagenProductoGet;

public interface ImagenProductoFacade extends BaseFacade<ImagenProductoGet, ImagenProductoCreate, ImagenProductoEdit, Long> {
}
