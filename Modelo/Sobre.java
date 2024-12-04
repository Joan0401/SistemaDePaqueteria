
package PreProyecto1.Modelo;

// Clase Sobre (hija de Entregable)

class Sobre extends Entregable {
    
    // Atributos
    
    private TipoSobre tipo;
    private TipoContenido contenido;
    private double peso;

    // Constructor por defecto
    
    public Sobre() {
     
    }

    public Sobre(TipoSobre tipo, TipoContenido contenido, double peso, int numeroReferencia, EstadoEntregable estado, String descripcion, String remitente) {
        
        super(numeroReferencia, estado, descripcion, remitente);
        this.tipo = tipo;
        this.contenido = contenido;
        this.peso = peso;
    }

    // Getters y Setters
    
    public TipoSobre getTipo() {
        return tipo;
    }

    public void setTipo(TipoSobre tipo) {
        this.tipo = tipo;
    }

    public TipoContenido getContenido() {
        return contenido;
    }

    public void setContenido(TipoContenido contenido) {
        this.contenido = contenido;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // Métodos
    
    /**
     * 
     * Método que calcula el impuesto de un sobre
     * 
     * @return el valor del impuesto basado en las condiciones de tipo de contenido y sobre
     * 
     */
    
    @Override 
    
    public double calcularImpuesto() {
        
       if (contenido == TipoContenido.DOCUMENTACION) {
            return tipo == TipoSobre.AEREO ? 0 : 1;
        } else if (contenido == TipoContenido.ARTICULO_PEQUENO) {
            return tipo == TipoSobre.AEREO ? 1 : 2;
        }
        return 0;
    }

    // Método toString
    
    @Override
    public String toString() {
        return "Sobre{" +
                "tipo=" + tipo +
                ", contenido=" + contenido +
                ", peso=" + peso +
                "} " + super.toString();
    }
}
