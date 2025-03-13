package com.CapybaraDev.BuenRaviol.Domain.Dto.Pedido;


import com.CapybaraDev.BuenRaviol.Domain.Dto.BaseDto;
import com.CapybaraDev.BuenRaviol.Domain.enums.Entrega;
import com.CapybaraDev.BuenRaviol.Domain.enums.Estado;
import com.CapybaraDev.BuenRaviol.Domain.enums.FormaPago;
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
