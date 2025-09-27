package mx.ieqroo.control_proveedores.instrucciones_pago.controller;

import mx.ieqroo.control_proveedores.instrucciones_pago.dto.InstruccionPagoRequest;
import mx.ieqroo.control_proveedores.instrucciones_pago.model.InstruccionPago;
import mx.ieqroo.control_proveedores.instrucciones_pago.service.InstruccionPagoService;
import mx.ieqroo.control_proveedores.shared.dto.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/control-proveedores/instrucciones-pago")
public class InstruccionPagoController {

    @Autowired
    private InstruccionPagoService instruccionPagoService;

    // Crear o actualizar una instrucción usando DTO
    @PostMapping("/nueva")
    public ResponseEntity<ApiResponse<InstruccionPago>> guardar(
            @RequestBody InstruccionPagoRequest instruccionPagoRequest
    ) {
        InstruccionPago guardada = instruccionPagoService.guardarInstruccion(instruccionPagoRequest);
        return ResponseEntity.ok(
                new ApiResponse<>(true, "Instrucción de pago guardada exitosamente", guardada, null)
        );
    }

    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse<InstruccionPago>> actualizar(
            @PathVariable Integer id,
            @RequestBody InstruccionPagoRequest instruccionPagoRequest
    ) {
        Optional<InstruccionPago> actualizada = instruccionPagoService.actualizarInstruccion(id, instruccionPagoRequest);
        return actualizada.map(value -> ResponseEntity.ok(
                        new ApiResponse<>(true, "Instrucción actualizada exitosamente", value, null)
                ))
                .orElseGet(() -> ResponseEntity.status(404).body(
                        new ApiResponse<>(false, "No se encontró la instrucción con ID: " + id, null, null)
                ));
    }

    // Obtener todas las instrucciones
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

    // Buscar entre fechas usando LocalDate y formato yyyy-MM-dd
    @GetMapping("/fecha")
    public ResponseEntity<ApiResponse<List<InstruccionPago>>> obtenerPorRangoFechas(
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate inicio,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate fin
    ) {
        List<InstruccionPago> lista = instruccionPagoService.obtenerPorRangoFechas(inicio, fin);
        return ResponseEntity.ok(
                new ApiResponse<>(true, "Instrucciones entre " + inicio + " y " + fin, lista, null)
        );
    }
}
