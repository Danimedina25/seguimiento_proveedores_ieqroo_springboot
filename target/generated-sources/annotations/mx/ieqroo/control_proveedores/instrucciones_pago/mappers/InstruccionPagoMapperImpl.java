package mx.ieqroo.control_proveedores.instrucciones_pago.mappers;

import javax.annotation.processing.Generated;
import mx.ieqroo.control_proveedores.instrucciones_pago.dto.InstruccionPagoRequest;
import mx.ieqroo.control_proveedores.instrucciones_pago.model.InstruccionPago;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-09-26T12:26:10-0600",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.16 (Homebrew)"
)
@Component
public class InstruccionPagoMapperImpl implements InstruccionPagoMapper {

    @Override
    public InstruccionPago toEntity(InstruccionPagoRequest dto) {
        if ( dto == null ) {
            return null;
        }

        InstruccionPago instruccionPago = new InstruccionPago();

        instruccionPago.setFechaFactura( dto.getFechaFactura() );
        instruccionPago.setFolioFiscal( dto.getFolioFiscal() );
        instruccionPago.setProveedor( dto.getProveedor() );
        instruccionPago.setConceptoPago( dto.getConceptoPago() );
        instruccionPago.setImporteBruto( dto.getImporteBruto() );
        instruccionPago.setRetencionIsr( dto.getRetencionIsr() );
        instruccionPago.setRetencionIva( dto.getRetencionIva() );
        instruccionPago.setImporteNeto( dto.getImporteNeto() );
        instruccionPago.setFechaPago( dto.getFechaPago() );
        instruccionPago.setImporteBrutoPagado( dto.getImporteBrutoPagado() );
        instruccionPago.setRetencionIsrPagado( dto.getRetencionIsrPagado() );
        instruccionPago.setRetencionIvaPagado( dto.getRetencionIvaPagado() );
        instruccionPago.setImporteNetoPagado( dto.getImporteNetoPagado() );
        instruccionPago.setFechaRecepcion( dto.getFechaRecepcion() );
        instruccionPago.setNumeroOficio( dto.getNumeroOficio() );
        instruccionPago.setIdentificadorUr( dto.getIdentificadorUr() );
        instruccionPago.setIdComponente( dto.getIdComponente() );
        instruccionPago.setContrato( dto.getContrato() );
        instruccionPago.setEstatus( dto.getEstatus() );

        return instruccionPago;
    }

    @Override
    public InstruccionPagoRequest toDto(InstruccionPago entity) {
        if ( entity == null ) {
            return null;
        }

        InstruccionPagoRequest instruccionPagoRequest = new InstruccionPagoRequest();

        instruccionPagoRequest.setFechaFactura( entity.getFechaFactura() );
        instruccionPagoRequest.setFolioFiscal( entity.getFolioFiscal() );
        instruccionPagoRequest.setProveedor( entity.getProveedor() );
        instruccionPagoRequest.setConceptoPago( entity.getConceptoPago() );
        instruccionPagoRequest.setImporteBruto( entity.getImporteBruto() );
        instruccionPagoRequest.setRetencionIsr( entity.getRetencionIsr() );
        instruccionPagoRequest.setRetencionIva( entity.getRetencionIva() );
        instruccionPagoRequest.setImporteNeto( entity.getImporteNeto() );
        instruccionPagoRequest.setFechaPago( entity.getFechaPago() );
        instruccionPagoRequest.setImporteBrutoPagado( entity.getImporteBrutoPagado() );
        instruccionPagoRequest.setRetencionIsrPagado( entity.getRetencionIsrPagado() );
        instruccionPagoRequest.setRetencionIvaPagado( entity.getRetencionIvaPagado() );
        instruccionPagoRequest.setImporteNetoPagado( entity.getImporteNetoPagado() );
        instruccionPagoRequest.setFechaRecepcion( entity.getFechaRecepcion() );
        instruccionPagoRequest.setNumeroOficio( entity.getNumeroOficio() );
        instruccionPagoRequest.setIdentificadorUr( entity.getIdentificadorUr() );
        instruccionPagoRequest.setIdComponente( entity.getIdComponente() );
        instruccionPagoRequest.setContrato( entity.getContrato() );
        instruccionPagoRequest.setEstatus( entity.getEstatus() );

        return instruccionPagoRequest;
    }
}
