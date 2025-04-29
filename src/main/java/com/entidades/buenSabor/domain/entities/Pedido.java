package com.entidades.buenSabor.domain.entities;


import com.entidades.buenSabor.domain.enums.Entrega;
import com.entidades.buenSabor.domain.enums.Estado;
import com.entidades.buenSabor.domain.enums.FormaPago;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.Cascade;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@SuperBuilder
public class Pedido extends Base {
    private Double total;
    private Estado estado ;
    private Entrega entrega;
    private FormaPago formaPago;
    private String nombreCliente;
    private String celular;
    private String dni;
    @OneToOne(cascade = CascadeType.ALL)
    private Direccion direccion;

    @Schema(description = "Fecha y hora de creación del pedido")
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")  // Define el formato
    private LocalDateTime fecha ;
    @OneToMany(cascade = CascadeType.ALL)
    //SE AGREGA EL JOIN COLUMN PARA QUE JPA NO CREE LA TABLA INTERMEDIA EN UNA RELACION ONE TO MANY
    //DE ESTA MANERA PONE EL FOREIGN KEY 'pedido_id' EN LA TABLA DE LOS MANY
    @JoinColumn(name = "pedido_id")
    //SE AGREGA EL BUILDER.DEFAULT PARA QUE BUILDER NO SOBREESCRIBA LA INICIALIZACION DE LA LISTA
    @Builder.Default
    private Set<DetallePedido> detallesPedidos = new HashSet<>();

    public Double calculaTotal() {
        return detallesPedidos.stream()
                .mapToDouble(DetallePedido::getSubtotal)
                .sum();
    }
    @ManyToOne
    private Sucursal sucursal;
}
