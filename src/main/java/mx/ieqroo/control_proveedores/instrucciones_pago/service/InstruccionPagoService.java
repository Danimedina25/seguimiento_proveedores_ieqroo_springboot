package mx.ieqroo.control_proveedores.instrucciones_pago.service;

import mx.ieqroo.control_proveedores.instrucciones_pago.dto.InstruccionPagoRequest;
import mx.ieqroo.control_proveedores.instrucciones_pago.mappers.InstruccionPagoMapper;
import mx.ieqroo.control_proveedores.instrucciones_pago.model.InstruccionPago;
import mx.ieqroo.control_proveedores.instrucciones_pago.repository.InstruccionPagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class InstruccionPagoService {

    @Autowired
    private InstruccionPagoRepository instruccionPagoRepository;

    @Autowired
    private InstruccionPagoMapper mapper;

    public InstruccionPago guardarInstruccion(InstruccionPagoRequest request) {
        InstruccionPago instruccion = mapper.toEntity(request);
        return instruccionPagoRepository.save(instruccion);
    }
    public Optional<InstruccionPago> actualizarInstruccion(Integer id, InstruccionPagoRequest request) {
        Optional<InstruccionPago> instruccionOpt = instruccionPagoRepository.findById(id);
        if (instruccionOpt.isPresent()) {
            InstruccionPago instruccion = instruccionOpt.get();

            instruccion.setFechaFactura(request.getFechaFactura());
            instruccion.setFolioFiscal(request.getFolioFiscal());
            instruccion.setProveedor(request.getProveedor());
            instruccion.setConceptoPago(request.getConceptoPago());
            instruccion.setImporteBruto(request.getImporteBruto());
            instruccion.setRetencionIsr(request.getRetencionIsr());
            instruccion.setRetencionIva(request.getRetencionIva());
            instruccion.setImporteNeto(request.getImporteNeto());
            instruccion.setFechaPago(request.getFechaPago());
            instruccion.setImporteBrutoPagado(request.getImporteBrutoPagado());
            instruccion.setRetencionIsrPagado(request.getRetencionIsrPagado());
            instruccion.setRetencionIvaPagado(request.getRetencionIvaPagado());
            instruccion.setImporteNetoPagado(request.getImporteNetoPagado());
            instruccion.setFechaRecepcion(request.getFechaRecepcion());
            instruccion.setNumeroOficio(request.getNumeroOficio());
            instruccion.setIdentificadorUr(request.getIdentificadorUr());
            instruccion.setIdComponente(request.getIdComponente());
            instruccion.setContrato(request.getContrato());
            instruccion.setEstatus(request.getEstatus());

            return Optional.of(instruccionPagoRepository.save(instruccion));
        } else {
            return Optional.empty();
        }
    }

    public List<InstruccionPago> obtenerTodas() {
        return instruccionPagoRepository.findAll();
    }

    public Optional<InstruccionPago> obtenerPorId(Integer id) {
        return instruccionPagoRepository.findById(id);
    }

    public void eliminarPorId(Integer id) {
        instruccionPagoRepository.deleteById(id);
    }

    public Optional<InstruccionPago> obtenerPorFolioFiscal(String folioFiscal) {
        return instruccionPagoRepository.findByFolioFiscal(folioFiscal);
    }

    public List<InstruccionPago> obtenerPorProveedor(String proveedor) {
        return instruccionPagoRepository.findByProveedor(proveedor);
    }

    public List<InstruccionPago> obtenerPorEstatus(String estatus) {
        return instruccionPagoRepository.findByEstatus(estatus);
    }

    public Optional<InstruccionPago> obtenerPorNumeroOficio(String numeroOficio) {
        return instruccionPagoRepository.findByNumeroOficio(numeroOficio);
    }

    public List<InstruccionPago> obtenerPorIdentificadorUr(String identificadorUr) {
        return instruccionPagoRepository.findByIdentificadorUr(identificadorUr);
    }

    public List<InstruccionPago> obtenerPorRangoFechas(LocalDate fechaInicio, LocalDate fechaFin) {
        return instruccionPagoRepository.findByFechaFacturaBetween(fechaInicio, fechaFin);
    }
}
