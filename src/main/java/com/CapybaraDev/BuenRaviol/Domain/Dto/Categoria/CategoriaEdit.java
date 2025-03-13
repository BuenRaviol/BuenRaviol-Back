package com.CapybaraDev.BuenRaviol.Domain.Dto.Categoria;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CategoriaEdit {
    private String nombre;
    private String descripcion;
}
