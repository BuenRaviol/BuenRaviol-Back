package com.CapybaraDev.BuenRaviol.Domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@SuperBuilder
public class Producto extends Base{
    private String nombre;
    private Double precio;
    private Boolean deshabilitado;
    private String descripcion;
    @ManyToOne(fetch = FetchType.LAZY)
    private Categoria categoria;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private ImagenProducto imagen;
}
