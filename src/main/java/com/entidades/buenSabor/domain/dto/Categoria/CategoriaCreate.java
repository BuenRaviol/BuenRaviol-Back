package com.entidades.buenSabor.domain.dto.Categoria;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class CategoriaCreate{
    private String nombre;
    private String descripcion;
}
