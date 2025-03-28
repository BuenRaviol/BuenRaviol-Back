package com.entidades.buenSabor.domain.dto.Pedido;



import com.entidades.buenSabor.domain.dto.BaseDto;
import com.entidades.buenSabor.domain.dto.DetallePedido.DetallePedidoGet;
import com.entidades.buenSabor.domain.enums.Entrega;
import com.entidades.buenSabor.domain.enums.Estado;
import com.entidades.buenSabor.domain.enums.FormaPago;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PedidoGet extends BaseDto {
    private Double total;
    private Estado estado;
    private Entrega entrega;
    private FormaPago formaPago;
    @Schema(description = "Fecha y hora de creación del pedido")
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")  // Define el formato
    private LocalDateTime fecha;
    private Set<DetallePedidoGet> detallesPedidos;
}
