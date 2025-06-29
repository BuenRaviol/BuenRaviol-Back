package com.entidades.buenSabor.business.facade;

import com.entidades.buenSabor.business.facade.Base.BaseFacade;
import com.entidades.buenSabor.domain.dto.Categoria.CategoriaCreate;
import com.entidades.buenSabor.domain.dto.Categoria.CategoriaEdit;
import com.entidades.buenSabor.domain.dto.Categoria.CategoriaGet;

public interface CategoriaFacade extends BaseFacade<CategoriaGet, CategoriaCreate, CategoriaEdit, Long> {
}
