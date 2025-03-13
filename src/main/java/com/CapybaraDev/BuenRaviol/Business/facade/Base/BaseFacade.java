package com.CapybaraDev.BuenRaviol.Business.facade.Base;

import com.CapybaraDev.BuenRaviol.Domain.Dto.BaseDto;

import java.io.Serializable;
import java.util.List;
//DC dto create
//DE dto Edit
public interface BaseFacade <D extends BaseDto, DC, DE, ID extends Serializable>{
    public D createNew(DC request);
    public D getById(Long id);
    public List<D> getAll();
    public void deleteById(Long id);
    public D update(DE request, Long id);
}
