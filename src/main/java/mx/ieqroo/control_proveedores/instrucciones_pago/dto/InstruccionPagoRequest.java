package mx.ieqroo.control_proveedores.instrucciones_pago.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class InstruccionPagoRequest {

    private LocalDate fechaFactura;
    private String folioFiscal;
    private String proveedor;
    private String conceptoPago;
    private BigDecimal importeBruto;
    private BigDecimal retencionIsr;
    private BigDecimal retencionIva;
    private BigDecimal importeNeto;
    private LocalDate fechaPago;
    private BigDecimal importeBrutoPagado;
    private BigDecimal retencionIsrPagado;
    private BigDecimal retencionIvaPagado;
    private BigDecimal importeNetoPagado;
    private LocalDate fechaRecepcion;
    private String numeroOficio;
    private String identificadorUr;
    private Integer idComponente;
    private String contrato;
    private String estatus;

    // ======= Getters y Setters ======= //

    public LocalDate getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(LocalDate fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public String getFolioFiscal() {
        return folioFiscal;
    }

    public void setFolioFiscal(String folioFiscal) {
        this.folioFiscal = folioFiscal;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getConceptoPago() {
        return conceptoPago;
    }

    public void setConceptoPago(String conceptoPago) {
        this.conceptoPago = conceptoPago;
    }

    public BigDecimal getImporteBruto() {
        return importeBruto;
    }

    public void setImporteBruto(BigDecimal importeBruto) {
        this.importeBruto = importeBruto;
    }

    public BigDecimal getRetencionIsr() {
        return retencionIsr;
    }

    public void setRetencionIsr(BigDecimal retencionIsr) {
        this.retencionIsr = retencionIsr;
    }

    public BigDecimal getRetencionIva() {
        return retencionIva;
    }

    public void setRetencionIva(BigDecimal retencionIva) {
        this.retencionIva = retencionIva;
    }

    public BigDecimal getImporteNeto() {
        return importeNeto;
    }

    public void setImporteNeto(BigDecimal importeNeto) {
        this.importeNeto = importeNeto;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }

    public BigDecimal getImporteBrutoPagado() {
        return importeBrutoPagado;
    }

    public void setImporteBrutoPagado(BigDecimal importeBrutoPagado) {
        this.importeBrutoPagado = importeBrutoPagado;
    }

    public BigDecimal getRetencionIsrPagado() {
        return retencionIsrPagado;
    }

    public void setRetencionIsrPagado(BigDecimal retencionIsrPagado) {
        this.retencionIsrPagado = retencionIsrPagado;
    }

    public BigDecimal getRetencionIvaPagado() {
        return retencionIvaPagado;
    }

    public void setRetencionIvaPagado(BigDecimal retencionIvaPagado) {
        this.retencionIvaPagado = retencionIvaPagado;
    }

    public BigDecimal getImporteNetoPagado() {
        return importeNetoPagado;
    }

    public void setImporteNetoPagado(BigDecimal importeNetoPagado) {
        this.importeNetoPagado = importeNetoPagado;
    }

    public LocalDate getFechaRecepcion() {
        return fechaRecepcion;
    }

    public void setFechaRecepcion(LocalDate fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

    public String getNumeroOficio() {
        return numeroOficio;
    }

    public void setNumeroOficio(String numeroOficio) {
        this.numeroOficio = numeroOficio;
    }

    public String getIdentificadorUr() {
        return identificadorUr;
    }

    public void setIdentificadorUr(String identificadorUr) {
        this.identificadorUr = identificadorUr;
    }

    public Integer getIdComponente() {
        return idComponente;
    }

    public void setIdComponente(Integer idComponente) {
        this.idComponente = idComponente;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
}
