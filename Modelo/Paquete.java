
package PreProyecto1.Modelo;

// Clase Paquete (hija de entregable)

class Paquete extends Entregable {
    
    // Atributos
    
    private boolean electronico;
    private boolean fragil;
    private double peso;

    // Constructores
    
    public Paquete() {
        
    }

    public Paquete(boolean electronico, boolean fragil, double peso, int numeroReferencia, EstadoEntregable estado, String descripcion, String remitente) {
        
        super(numeroReferencia, estado, descripcion, remitente);
        this.electronico = electronico;
        this.fragil = fragil;
        this.peso = peso;
    }

    // Getters y setters
    
    public boolean isElectronico() {
        return electronico;
    }

    public void setElectronico(boolean electronico) {
        this.electronico = electronico;
    }

    public boolean isFragil() {
        return fragil;
    }

    public void setFragil(boolean fragil) {
        this.fragil = fragil;
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
     * Método que calcula el impuesto de un paquete
     * 
     * @return el valor total del impuesto calculado para el paquete
     * 
     */
    
    @Override
    
    public double calcularImpuesto() {
        
        double impuesto = peso * 0.02;
        
        if (electronico) {
            impuesto += 2;
        }
        if (fragil) {
            impuesto += 2;
        }
        return impuesto;  
    }
    
    
    
    // Método toString

    @Override
    public String toString() {
        return "Paquete{" +
                "electronico=" + electronico +
                ", fragil=" + fragil +
                ", peso=" + peso +
                "} " + super.toString();
    }
}