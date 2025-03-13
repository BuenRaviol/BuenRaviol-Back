package com.CapybaraDev.BuenRaviol.Business.facade;

import com.CapybaraDev.BuenRaviol.Business.facade.Base.BaseFacade;
import com.CapybaraDev.BuenRaviol.Domain.Dto.Categoria.CategoriaCreate;
import com.CapybaraDev.BuenRaviol.Domain.Dto.Categoria.CategoriaEdit;
import com.CapybaraDev.BuenRaviol.Domain.Dto.Categoria.CategoriaGet;
import org.springframework.stereotype.Service;

@Service
public interface CategoriaFacade extends BaseFacade<CategoriaGet, CategoriaCreate, CategoriaEdit, Long> {
}