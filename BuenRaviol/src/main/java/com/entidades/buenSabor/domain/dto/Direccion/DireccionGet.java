package com.entidades.buenSabor.domain.dto.Direccion;

import com.entidades.buenSabor.domain.dto.BaseDto;
import com.entidades.buenSabor.domain.enums.Departamento;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DireccionGet extends BaseDto {
    private String calle;
    private String numero;
    private int piso;
    private int dpt;
    private Departamento departamento;

}

