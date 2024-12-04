
package PreProyecto1.Modelo;

// Importaciones

import java.text.SimpleDateFormat;
import java.util.Calendar;

// Clase madre Entregable

public abstract class Entregable{ 
    
    // Atributos
    
    protected int numeroReferencia;
    protected EstadoEntregable estado;
    protected String descripcion;
    protected String remitente;
    protected Calendar fechaRecepcion;
    protected Calendar fechaRetiro;
    
    // Constructores
    
    public Entregable() {
        
    }

    public Entregable(int numeroReferencia, EstadoEntregable estado, String descripcion, String remitente) {
        
        this.numeroReferencia = numeroReferencia;
        this.estado = estado;
        this.descripcion = descripcion;
        this.remitente = remitente;
    }

    // Getters y Setters
    
    public int getNumeroReferencia() {
        return numeroReferencia;
    }

    public void setNumeroReferencia(int numeroReferencia) {
        this.numeroReferencia = numeroReferencia;
    }

    public EstadoEntregable getEstado() {
        return estado;
    }

    public void setEstado(EstadoEntregable estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public Calendar getFechaRecepcion() {
        return fechaRecepcion;
    }

    public void setFechaRecepcion(Calendar fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

    public Calendar getFechaRetiro() {
        return fechaRetiro;
    }

    public void setFechaRetiro(Calendar fechaRetiro) {
        this.fechaRetiro = fechaRetiro;
    }
    
    // Métodos
    
    /**
     * Función que recibe una fecha en formato Calendar y la retorna como una cadena formateada.
     * El formato es: día/mes/año horas:minutos:segundos
     * @param fecha La fecha que se desea formatear
     * @return La fecha formateada
     */
    
    public String formatearFecha(Calendar fecha) {
        
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        // Convertir el objeto Calendar a una cadena en el formato deseado
        
        return sdf.format(fecha.getTime());
    }

    // Método abstracto (las hijas tendrán sus propias versiones)
    
    public abstract double calcularImpuesto();
    
    // Método toString
    
    @Override
    public String toString() {
        
        return 
                "numeroReferencia='" + numeroReferencia + '\'' +
                ", estado=" + estado +
                ", descripcion='" + descripcion + '\'' +
                ", remitente='" + remitente + '\'' +
                '}';
    }
}
