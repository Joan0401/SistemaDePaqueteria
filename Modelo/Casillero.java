
package PreProyecto1.Modelo;

// Importaciones

import java.util.ArrayList;

// Clase Casillero

public class Casillero {
    
    // Atributos
    
    private double numeroCasillero;
    private boolean disponible = true;
    private ArrayList <Entregable> entregables;
    
    // Constructores
 
    public Casillero(){
            
    }

    public Casillero(double numeroCasillero, boolean disponible, ArrayList <Entregable> entregables) {
        
        this.numeroCasillero = numeroCasillero;
        this.disponible = disponible;
        this.entregables = entregables;
    }
    
    // Getters y setters

    public double getNumeroCasillero() {
        return numeroCasillero;
    }

    public void setNumeroCasillero(double numeroCasillero) {
        this.numeroCasillero = numeroCasillero;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public ArrayList<Entregable> getEntregables() {
        return entregables;
    }

    public void setEntregables(ArrayList<Entregable> entregables) {
        this.entregables = entregables;
    }
    
    // Métodos
    
    /**
     * 
     * Método que añade un nuevo entregable a la lista de entregables
     * 
     * @param entregable que se va a añadir al casillero
     * 
     */
    
    public void addEntregable(Entregable entregable) {
        
        this.entregables.add(entregable);
    }
    
    /**
     * 
     * Método que compara si el número de casillero de una instancia es igual 
     * al número de casillero proporcionado
     * 
     * @param numeroCasillero El número de casillero a comparar
     * 
     * @return true si el número de casillero coincide, falseen caso contrario
     * 
     */
    
    public boolean equals(double numeroCasillero) {
        return this.numeroCasillero == numeroCasillero;
    }

    /**
     * 
     * Método que btiene un entregable por su número de referencia
     * 
     * @param numReferencia El número de referencia del entregable que se desea buscar
     * 
     * @return un entregable por su número de referencia
     * 
     */
    
    public Entregable getEntregablePorNumero(int numReferencia){
    
        for (Entregable entregable: entregables){
        
            if (entregable.getNumeroReferencia() == numReferencia){
                return entregable;
            }
        }
        return null;
    }
    
    
    
    public int SinEntregar(){
        
        int i = 0;
        
        for(Entregable entregable: entregables){
        
            if (entregable.estado == EstadoEntregable.NO_ENTREGADO){
            
                i++;
            }
        }
        return i;
    }
    
    // Método equals 
    
    @Override
    
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    
    public boolean equals(Object obj) {
        
        if (this == obj) {
            
            return true;
        }
        if (obj == null) {
            
            return false;
        }
        if (getClass() != obj.getClass()) {
            
            return false;
        }
        
        final Casillero other = (Casillero) obj;
        
        return Double.doubleToLongBits(this.numeroCasillero) == Double.doubleToLongBits(other.numeroCasillero);
    }
    
    // Método toString
    
    @Override
    
    public String toString() {
        
        return "Casillero{" + "numeroCasillero=" + numeroCasillero 
                + ", disponible=" + disponible + ", entregables=" + entregables + '}';
    }
}


