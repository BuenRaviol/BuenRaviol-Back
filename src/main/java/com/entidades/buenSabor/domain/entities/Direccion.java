package com.entidades.buenSabor.domain.entities;

import com.entidades.buenSabor.domain.enums.Departamento;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Direccion extends Base {

    private String calle;
    private String numero;
    private int piso;
    private int dpt;
    private Departamento departamento;
}
