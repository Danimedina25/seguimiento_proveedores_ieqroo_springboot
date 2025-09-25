package mx.ieqroo.control_proveedores.instrucciones_pago.repository;

import mx.ieqroo.control_proveedores.instrucciones_pago.model.InstruccionPago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface InstruccionPagoRepository extends JpaRepository<InstruccionPago, Integer> {

    // Buscar por folio fiscal único
    Optional<InstruccionPago> findByFolioFiscal(String folioFiscal);

    // Buscar todas las instrucciones de pago de un proveedor
    List<InstruccionPago> findByProveedor(String proveedor);

    // Buscar por estatus
    List<InstruccionPago> findByEstatus(String estatus);

    // Buscar por número de oficio
    Optional<InstruccionPago> findByNumeroOficio(String numeroOficio);

    // Buscar todas las instrucciones por identificador de UR
    List<InstruccionPago> findByIdentificadorUr(String identificadorUr);

    // Buscar todas las instrucciones entre dos fechas de factura
    List<InstruccionPago> findByFechaFacturaBetween(java.sql.Date fechaInicio, java.sql.Date fechaFin);
}