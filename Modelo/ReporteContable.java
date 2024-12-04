
package PreProyecto1.Modelo;

// Importaciones

import java.util.Calendar;

// Clase ReporteContable

public class ReporteContable {
    
    // Atributos
    
    private Calendar fechaReporte;
    private Double ingresos;
    private Double impuestos;
    private Double descuentos;
    private Double total;
    private Cliente cliente;
    
    // Constructores

    public ReporteContable(){
    
    }

    public ReporteContable(Calendar fechaReporte, Double ingresos, Double impuestos, Double descuentos, Double total, Cliente cliente) {
        
        this.fechaReporte = fechaReporte;
        this.ingresos = ingresos;
        this.impuestos = impuestos;
        this.descuentos = descuentos;
        this.total = total;
        this.cliente = cliente;
    }

    public Calendar getFechaReporte() {
        return fechaReporte;
    }

    public void setFechaReporte(Calendar fechaReporte) {
        this.fechaReporte = fechaReporte;
    }

    public Double getIngresos() {
        return ingresos;
    }

    public void setIngresos(Double ingresos) {
        this.ingresos = ingresos;
    }

    public Double getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(Double impuestos) {
        this.impuestos = impuestos;
    }

    public Double getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(Double descuentos) {
        this.descuentos = descuentos;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
   
    }
}

