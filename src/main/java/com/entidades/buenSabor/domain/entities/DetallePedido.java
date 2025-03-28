package com.entidades.buenSabor.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.mapstruct.Named;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@SuperBuilder
public class DetallePedido extends Base {
    private Integer cantidad;
    private Double subtotal;
    @ManyToOne(fetch = FetchType.EAGER)
    private Producto producto;

    public Double calculaSubtotal(){
        return cantidad * producto.getPrecio();
    }
}
