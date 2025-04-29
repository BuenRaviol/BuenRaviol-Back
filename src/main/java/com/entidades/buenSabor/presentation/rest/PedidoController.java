package com.entidades.buenSabor.presentation.rest;

import com.entidades.buenSabor.business.facade.Imp.PedidoFacadeImp;
import com.entidades.buenSabor.domain.dto.Pedido.PedidoCreate;
import com.entidades.buenSabor.domain.dto.Pedido.PedidoEdit;
import com.entidades.buenSabor.domain.dto.Pedido.PedidoGet;
import com.entidades.buenSabor.domain.entities.Pedido;
import com.entidades.buenSabor.domain.enums.Estado;
import com.entidades.buenSabor.presentation.rest.Base.BaseControllerImp;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("pedido")
public class PedidoController extends BaseControllerImp<Pedido, PedidoGet, PedidoCreate, PedidoEdit,Long, PedidoFacadeImp> {
    public PedidoController(PedidoFacadeImp facade, SimpMessagingTemplate messagingTemplate) {
        super(facade);
        this.messagingTemplate = messagingTemplate;
    }
    private final SimpMessagingTemplate messagingTemplate;

    @PostMapping()
    public ResponseEntity<?> create(@RequestBody PedidoCreate pedido) {
        // Guardar pedido en DB
        facade.createNew(pedido);
        // Enviar notificación a sucursal correspondiente
        String destino = "/topic/sucursal/" +  pedido.getSucursal().toString();
        messagingTemplate.convertAndSend(destino, pedido);

        return ResponseEntity.ok(pedido);
    }

    @GetMapping("/get/all/page/preparacion/{idSucursal}")
    public ResponseEntity<?> getAllPagePreparacion(@PathVariable Long idSucursal,Pageable pageable){
        return ResponseEntity.ok(facade.findPreparacionAndSucursalId(idSucursal,pageable));
    }
    @GetMapping("/get/all/page/pendiente/{idSucursal}")
    public ResponseEntity<?> getAllPage(@PathVariable Long idSucursal, Pageable pageable){
        return ResponseEntity.ok(facade.findPendienteAndSucursalId(idSucursal,pageable));
    }

    @PutMapping("cambio/estado/{idPedido}")
    public ResponseEntity<?> cambioEstado(@RequestBody Estado estado, @PathVariable Long idPedido){
        facade.cambioEstado(estado, idPedido);
        return ResponseEntity.ok("Pedido " + idPedido + " en estado " + estado);
    }
}
