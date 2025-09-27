package mx.ieqroo.control_proveedores.instrucciones_pago.mappers;

import mx.ieqroo.control_proveedores.instrucciones_pago.dto.InstruccionPagoRequest;
import mx.ieqroo.control_proveedores.instrucciones_pago.model.InstruccionPago;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface InstruccionPagoMapper {
    
    InstruccionPago toEntity(InstruccionPagoRequest dto);

    InstruccionPagoRequest toDto(InstruccionPago entity);
}
