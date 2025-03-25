package com.entidades.buenSabor.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

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

    public void calculaSubtotal(){
        this.subtotal = producto.getPrecio() * cantidad;
    }
}
