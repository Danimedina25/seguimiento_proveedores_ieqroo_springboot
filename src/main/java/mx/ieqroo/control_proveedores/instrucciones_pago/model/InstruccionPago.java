package mx.ieqroo.control_proveedores.instrucciones_pago.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "instrucciones_pago")
public class InstruccionPago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "fecha_factura")
    private LocalDate fechaFactura;

    @Column(name = "folio_fiscal", length = 100)
    private String folioFiscal;

    @Column(name = "proveedor", length = 100)
    private String proveedor;

    @Column(name = "concepto_pago", length = 300)
    private String conceptoPago;

    @Column(name = "importe_bruto", precision = 12, scale = 2)
    private BigDecimal importeBruto;

    @Column(name = "retencion_isr", precision = 12, scale = 2)
    private BigDecimal retencionIsr;

    @Column(name = "retencion_iva", precision = 12, scale = 2)
    private BigDecimal retencionIva;

    @Column(name = "importe_neto", precision = 12, scale = 2)
    private BigDecimal importeNeto;

    @Column(name = "fecha_pago")
    private LocalDate fechaPago;

    @Column(name = "importe_bruto_pagado", precision = 12, scale = 2)
    private BigDecimal importeBrutoPagado;

    @Column(name = "retencion_isr_pagado", precision = 12, scale = 2)
    private BigDecimal retencionIsrPagado;

    @Column(name = "retencion_iva_pagado", precision = 12, scale = 2)
    private BigDecimal retencionIvaPagado;

    @Column(name = "importe_neto_pagado", precision = 12, scale = 2)
    private BigDecimal importeNetoPagado;

    @Column(name = "fecha_recepcion")
    private LocalDate fechaRecepcion;

    @Column(name = "numero_oficio", length = 100)
    private String numeroOficio;

    @Column(name = "identificador_ur", length = 50)
    private String identificadorUr;

    @Column(name = "id_componente")
    private Integer idComponente;

    @Column(name = "contrato", length = 100)
    private String contrato;

    @Column(name = "estatus", length = 50)
    private String estatus;

    // ================= Getters y Setters ================= //

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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
