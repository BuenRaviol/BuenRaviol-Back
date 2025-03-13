package com.CapybaraDev.BuenRaviol.Domain.Dto.Categoria;

import com.CapybaraDev.BuenRaviol.Domain.Dto.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CategoriaGet extends BaseDto {
    private String nombre;
    private String descripcion;
}
