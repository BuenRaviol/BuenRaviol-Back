package com.entidades.buenSabor.domain.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Sucursal extends Base{
    private String nombre;
    @OneToOne(cascade = CascadeType.ALL)
    private Direccion direccion;

}
