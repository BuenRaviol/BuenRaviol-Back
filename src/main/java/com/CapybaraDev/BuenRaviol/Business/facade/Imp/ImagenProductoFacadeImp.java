package com.CapybaraDev.BuenRaviol.Business.facade.Imp;

import com.CapybaraDev.BuenRaviol.Business.Mapper.BaseMapper;
import com.CapybaraDev.BuenRaviol.Business.Service.Base.BaseService;
import com.CapybaraDev.BuenRaviol.Business.facade.Base.BaseFacadeImp;
import com.CapybaraDev.BuenRaviol.Business.facade.ImagenProductoFacade;
import com.CapybaraDev.BuenRaviol.Domain.Dto.ImagenProducto.ImagenProductoCreate;
import com.CapybaraDev.BuenRaviol.Domain.Dto.ImagenProducto.ImagenProductoEdit;
import com.CapybaraDev.BuenRaviol.Domain.Dto.ImagenProducto.ImagenProductoGet;
import com.CapybaraDev.BuenRaviol.Domain.entities.ImagenProducto;
import org.springframework.stereotype.Service;

@Service
public class ImagenProductoFacadeImp  extends BaseFacadeImp<ImagenProducto, ImagenProductoGet, ImagenProductoCreate, ImagenProductoEdit, Long> implements ImagenProductoFacade {
    public ImagenProductoFacadeImp(BaseService<ImagenProducto, Long> baseService, BaseMapper<ImagenProducto, ImagenProductoGet, ImagenProductoCreate, ImagenProductoEdit> baseMapper) {
        super(baseService, baseMapper);
    }
}
