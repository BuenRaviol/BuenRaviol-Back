package com.entidades.buenSabor.business.facade.Imp;

import com.entidades.buenSabor.business.facade.Base.BaseFacadeImp;
import com.entidades.buenSabor.business.facade.ImagenProductoFacade;
import com.entidades.buenSabor.business.mapper.BaseMapper;
import com.entidades.buenSabor.business.service.Base.BaseService;
import com.entidades.buenSabor.domain.dto.ImagenProducto.ImagenProductoCreate;
import com.entidades.buenSabor.domain.dto.ImagenProducto.ImagenProductoEdit;
import com.entidades.buenSabor.domain.dto.ImagenProducto.ImagenProductoGet;
import com.entidades.buenSabor.domain.entities.ImagenProducto;
import org.springframework.stereotype.Service;

@Service
public class ImagenProductoFacadeImp extends BaseFacadeImp<ImagenProducto, ImagenProductoGet, ImagenProductoCreate, ImagenProductoEdit,Long> implements ImagenProductoFacade {
    public ImagenProductoFacadeImp(BaseService<ImagenProducto, Long> baseService, BaseMapper<ImagenProducto, ImagenProductoGet, ImagenProductoCreate, ImagenProductoEdit> baseMapper) {
        super(baseService, baseMapper);
    }
}
