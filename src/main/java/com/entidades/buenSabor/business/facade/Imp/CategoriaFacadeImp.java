package com.entidades.buenSabor.business.facade.Imp;

import com.entidades.buenSabor.business.facade.Base.BaseFacadeImp;
import com.entidades.buenSabor.business.mapper.BaseMapper;
import com.entidades.buenSabor.business.service.Base.BaseService;
import com.entidades.buenSabor.domain.dto.Categoria.CategoriaCreate;
import com.entidades.buenSabor.domain.dto.Categoria.CategoriaEdit;
import com.entidades.buenSabor.domain.dto.Categoria.CategoriaGet;
import com.entidades.buenSabor.domain.entities.Categoria;
import org.springframework.stereotype.Service;

@Service
public class CategoriaFacadeImp extends BaseFacadeImp<Categoria, CategoriaGet, CategoriaCreate, CategoriaEdit, Long> {
    public CategoriaFacadeImp(BaseService<Categoria, Long> baseService, BaseMapper<Categoria, CategoriaGet, CategoriaCreate, CategoriaEdit> baseMapper) {
        super(baseService, baseMapper);
    }
}
