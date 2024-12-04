
package PreProyecto1.Modelo;

// Clase Revista (hija de Entregable)

class Revista extends Entregable {
    
    // Atributos
    
    private String nombre;
    private boolean catalogo;
    private TipoTemaRevista tema;

    // Constructorres
    
    public Revista() {
        
    }

    public Revista(String nombre, boolean catalogo, TipoTemaRevista tema, int numeroReferencia, EstadoEntregable estado, String descripcion, String remitente) {
        
        super(numeroReferencia, estado, descripcion, remitente);
        this.nombre = nombre;
        this.catalogo = catalogo;
        this.tema = tema;
    }
    
    // Getters y Setters
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isCatalogo() {
        return catalogo;
    }

    public void setCatalogo(boolean catalogo) {
        this.catalogo = catalogo;
    }

    public TipoTemaRevista getTema() {
        return tema;
    }

    public void setTema(TipoTemaRevista tema) {
        this.tema = tema;
    }

    // Métodos
    
    /**
     * 
     * Método que calcula el impuesto de una revista
     * 
     * @return el valor del impuesto, que es 0 si el entregable es en un catálogo, o 1 de lo contrario
     * 
     */
    
    @Override
    
    public double calcularImpuesto() {
        return catalogo ? 0 : 1;
    }

    // Método toString
    
    @Override
    public String toString() {
        
        return "Revista{" +
                "nombre='" + nombre + '\'' +
                ", catalogo=" + catalogo +
                ", tema=" + tema +
                "} " + super.toString();
    }
}
