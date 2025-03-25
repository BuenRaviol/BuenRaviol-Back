package com.entidades.buenSabor.domain.dto.Pedido;



import com.entidades.buenSabor.domain.dto.BaseDto;
import com.entidades.buenSabor.domain.enums.Entrega;
import com.entidades.buenSabor.domain.enums.Estado;
import com.entidades.buenSabor.domain.enums.FormaPago;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PedidoGet extends BaseDto {
    private Double total;
    private Estado estado;
    private Entrega entrega;
    private FormaPago formaPago;
    private LocalDate fecha;
}
