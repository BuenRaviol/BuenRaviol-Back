package com.CapybaraDev.BuenRaviol.Business.facade.Imp;

import com.CapybaraDev.BuenRaviol.Business.Mapper.BaseMapper;
import com.CapybaraDev.BuenRaviol.Business.Service.Base.BaseService;
import com.CapybaraDev.BuenRaviol.Business.facade.Base.BaseFacadeImp;
import com.CapybaraDev.BuenRaviol.Business.facade.CategoriaFacade;
import com.CapybaraDev.BuenRaviol.Domain.Dto.Categoria.CategoriaCreate;
import com.CapybaraDev.BuenRaviol.Domain.Dto.Categoria.CategoriaEdit;
import com.CapybaraDev.BuenRaviol.Domain.Dto.Categoria.CategoriaGet;
import com.CapybaraDev.BuenRaviol.Domain.entities.Categoria;
import org.springframework.stereotype.Service;



@Service
public class CategoriaFacadeImp extends BaseFacadeImp<Categoria, CategoriaGet, CategoriaCreate, CategoriaEdit, Long> implements CategoriaFacade {

    public CategoriaFacadeImp(BaseService<Categoria, Long> baseService, BaseMapper<Categoria, CategoriaGet, CategoriaCreate, CategoriaEdit> baseMapper) {
        super(baseService, baseMapper);
    }
}
