package mx.ieqroo.control_proveedores.instrucciones_pago.service;

import mx.ieqroo.control_proveedores.instrucciones_pago.model.InstruccionPago;
import mx.ieqroo.control_proveedores.instrucciones_pago.repository.InstruccionPagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

@Service
public class InstruccionPagoService {

    @Autowired
    private InstruccionPagoRepository instruccionPagoRepository;

    // Guardar o actualizar una instrucción de pago
    public InstruccionPago guardarInstruccion(InstruccionPago instruccionPago) {
        return instruccionPagoRepository.save(instruccionPago);
    }

    // Obtener todas las instrucciones
    public List<InstruccionPago> obtenerTodas() {
        return instruccionPagoRepository.findAll();
    }

    // Obtener una instrucción por ID
    public Optional<InstruccionPago> obtenerPorId(Integer id) {
        return instruccionPagoRepository.findById(id);
    }

    // Eliminar una instrucción por ID
    public void eliminarPorId(Integer id) {
        instruccionPagoRepository.deleteById(id);
    }

    // Buscar por folio fiscal
    public Optional<InstruccionPago> obtenerPorFolioFiscal(String folioFiscal) {
        return instruccionPagoRepository.findByFolioFiscal(folioFiscal);
    }

    // Buscar por proveedor
    public List<InstruccionPago> obtenerPorProveedor(String proveedor) {
        return instruccionPagoRepository.findByProveedor(proveedor);
    }

    // Buscar por estatus
    public List<InstruccionPago> obtenerPorEstatus(String estatus) {
        return instruccionPagoRepository.findByEstatus(estatus);
    }

    // Buscar por número de oficio
    public Optional<InstruccionPago> obtenerPorNumeroOficio(String numeroOficio) {
        return instruccionPagoRepository.findByNumeroOficio(numeroOficio);
    }

    // Buscar por identificador UR
    public List<InstruccionPago> obtenerPorIdentificadorUr(String identificadorUr) {
        return instruccionPagoRepository.findByIdentificadorUr(identificadorUr);
    }

    // Buscar entre fechas de factura
    public List<InstruccionPago> obtenerPorRangoFechas(Date fechaInicio, Date fechaFin) {
        return instruccionPagoRepository.findByFechaFacturaBetween(fechaInicio, fechaFin);
    }
}
