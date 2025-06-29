package com.entidades.buenSabor.presentation.rest;

import com.entidades.buenSabor.business.facade.Imp.PedidoFacadeImp;
import com.entidades.buenSabor.domain.dto.Pedido.PedidoCreate;
import com.entidades.buenSabor.domain.dto.Pedido.PedidoEdit;
import com.entidades.buenSabor.domain.dto.Pedido.PedidoGet;
import com.entidades.buenSabor.domain.entities.Pedido;
import com.entidades.buenSabor.domain.enums.Estado;
import com.entidades.buenSabor.presentation.rest.Base.BaseControllerImp;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("pedido")
public class PedidoController extends BaseControllerImp<Pedido, PedidoGet, PedidoCreate, PedidoEdit,Long, PedidoFacadeImp> {
    public PedidoController(PedidoFacadeImp facade) {
        super(facade);;
    }
    @PostMapping()
    public ResponseEntity<?> create(@RequestBody PedidoCreate pedido) {
        return ResponseEntity.ok(facade.createNew(pedido));
    }

    @GetMapping("/get/all/page/sucursal/{idSucursal}")
    public ResponseEntity<?> getAllPageSucursal(@PathVariable Long idSucursal,Pageable pageable){
        return ResponseEntity.ok(facade.findSucursalId(idSucursal,pageable));
    }

    @GetMapping("/get/all/page/{estado}/{idSucursal}")
    public ResponseEntity<?> getAllPage(@PathVariable Estado estado,@PathVariable Long idSucursal, Pageable pageable){
        return ResponseEntity.ok(facade.findEstadoAndSucursalId(estado,idSucursal,pageable));
    }

    @PutMapping("cambio/estado/{idPedido}")
    public ResponseEntity<?> cambioEstado(@RequestBody Estado estado, @PathVariable Long idPedido){
        facade.cambioEstado(estado, idPedido);
        return ResponseEntity.ok("Pedido " + idPedido + " en estado " + estado);
    }

    @GetMapping("/calcula/envio")
    public ResponseEntity<?> calculaEnvio(@RequestParam String coordenadas) {
        try {
            return ResponseEntity.ok(facade.calculaEnvio(coordenadas));
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Error al cotizar envio");
        }
    }
}
