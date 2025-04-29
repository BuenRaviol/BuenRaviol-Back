package com.entidades.buenSabor.domain.dto.Sucursal;

import com.entidades.buenSabor.domain.dto.Direccion.DireccionCreate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SucursalCreate {
    private String nombre;
    private DireccionCreate direccion;
}
