package mx.ieqroo.control_proveedores.instrucciones_pago.controller;

import mx.ieqroo.control_proveedores.instrucciones_pago.model.InstruccionPago;
import mx.ieqroo.control_proveedores.instrucciones_pago.service.InstruccionPagoService;
import mx.ieqroo.control_proveedores.shared.dto.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/control-proveedores/instrucciones-pago")
public class InstruccionPagoController {

    @Autowired
    private InstruccionPagoService instruccionPagoService;

    // Crear o actualizar una instrucción
    @PostMapping
    public ResponseEntity<ApiResponse<InstruccionPago>> guardar(@RequestBody InstruccionPago instruccionPago) {
        InstruccionPago guardada = instruccionPagoService.guardarInstruccion(instruccionPago);
        return ResponseEntity.ok(
                new ApiResponse<>(true, "Instrucción de pago guardada exitosamente", guardada, null)
        );
    }

    // Obtener todas
    @GetMapping
    public ResponseEntity<ApiResponse<List<InstruccionPago>>> obtenerTodas() {
        List<InstruccionPago> lista = instruccionPagoService.obtenerTodas();
        return ResponseEntity.ok(
                new ApiResponse<>(true, "Listado de instrucciones de pago", lista, null)
        );
    }

    // Obtener por ID
    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<InstruccionPago>> obtenerPorId(@PathVariable Integer id) {
        Optional<InstruccionPago> instruccion = instruccionPagoService.obtenerPorId(id);
        return instruccion.map(value -> ResponseEntity.ok(
                        new ApiResponse<>(true, "Instrucción encontrada", value, null)
                ))
                .orElseGet(() -> ResponseEntity.status(404).body(
                        new ApiResponse<>(false, "Instrucción no encontrada", null, null)
                ));
    }

    // Eliminar por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<Void>> eliminar(@PathVariable Integer id) {
        instruccionPagoService.eliminarPorId(id);
        return ResponseEntity.ok(
                new ApiResponse<>(true, "Instrucción eliminada exitosamente", null, null)
        );
    }

    // Buscar por proveedor
    @GetMapping("/proveedor/{proveedor}")
    public ResponseEntity<ApiResponse<List<InstruccionPago>>> obtenerPorProveedor(@PathVariable String proveedor) {
        List<InstruccionPago> lista = instruccionPagoService.obtenerPorProveedor(proveedor);
        return ResponseEntity.ok(
                new ApiResponse<>(true, "Instrucciones del proveedor: " + proveedor, lista, null)
        );
    }

    // Buscar por estatus
    @GetMapping("/estatus/{estatus}")
    public ResponseEntity<ApiResponse<List<InstruccionPago>>> obtenerPorEstatus(@PathVariable String estatus) {
        List<InstruccionPago> lista = instruccionPagoService.obtenerPorEstatus(estatus);
        return ResponseEntity.ok(
                new ApiResponse<>(true, "Instrucciones con estatus: " + estatus, lista, null)
        );
    }

    // Buscar entre fechas
    @GetMapping("/fecha")
    public ResponseEntity<ApiResponse<List<InstruccionPago>>> obtenerPorRangoFechas(
            @RequestParam Date inicio,
            @RequestParam Date fin
    ) {
        List<InstruccionPago> lista = instruccionPagoService.obtenerPorRangoFechas(inicio, fin);
        return ResponseEntity.ok(
                new ApiResponse<>(true, "Instrucciones entre " + inicio + " y " + fin, lista, null)
        );
    }
}
