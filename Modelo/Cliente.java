
package PreProyecto1.Modelo;

// Importaciones

import java.util.Calendar;
import java.util.Objects;
import java.text.SimpleDateFormat;

// Clase cliente

public class Cliente {
    
    // Atributos
    
    private String cedula;
    private String nombre;
    private String correo;
    private String telefono;
    private String direccion;
    private Calendar fechaNacimiento;
    private TipoCliente tipoCliente;
    private double numeroCasillero;
    private boolean Sexo;
    private Casillero casillero;
    
    // Constructores
    
    public Cliente(){
        
    }

    public Cliente(String cedula, String nombre, String correo, String telefono, String direccion, Calendar fechaNacimiento, TipoCliente tipoCliente, boolean Sexo, Casillero casillero, double numeroCasillero) {
        
        this.cedula = cedula;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoCliente = tipoCliente;
        this.casillero = casillero;
        this.numeroCasillero = numeroCasillero;   
    }
   
    // Getters y setters

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
   
    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public double getNumeroCasillero() {
        return numeroCasillero;
    }

    public void setNumeroCasillero(double numeroCasillero) {
        this.numeroCasillero = numeroCasillero;
    }

    public boolean isSexo() {
        return Sexo;
    }

    public void setSexo(boolean Sexo) {
        this.Sexo = Sexo;
    }

    public Casillero getCasillero() {
        return casillero;
    }

    public void setCasillero(Casillero casillero) {
        this.casillero = casillero;
    }

    // Métodos
    
    /**
     * 
     * Método que convierte una fecha de forma Calendar a un formato legible
     * 
     * @return la fecha de nacimiento formateada como uns string en el formato (dd/MM/yyyy)
     * 
     */
    
    public String getFechaFormateada(){
    
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(this.fechaNacimiento.getTime());
    }
    
    /**
     * 
     * Método que dependiendo del atributo booleano "Sexo", retorna "Masculino" si es true
     * y "Femenino" si es false
     * 
     * @return una cadena que representa el sexo del cliente
     * 
     */
    
    public String getSexoFormateado(){
    
        if (this.Sexo == true) {
        
            return "Maculino";
        }
        else{
        
            return "Femenino";
        }
    }
    
    /**
     * 
     * Método que compara la cédula del cliente con una cédula proporcionada
     * 
     * @param cedula La cédula a comparar
     * 
     * @return true si la cédula del cliente es igual a la cédula proporcionada
     * 
     */
    
    public boolean equals(String cedula) {
        
        return this.cedula.equals(cedula);
    }
    
    /**
     * 
     * Método que compara el número de casillero del cliente con uno proporcionado
     * 
     * @param numeroCasillero el número de casillero a comparar con el número de casillero del cliente
     * 
     * @return true si el número de casillero del cliente es igual al número de casillero proporcionado
     * 
     */
    
    public boolean equals(double numeroCasillero) {
        
        return this.numeroCasillero == numeroCasillero;
    }  
    
    // Método equals 
    
    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }
    
   @Override
    public boolean equals(Object obj) {
        
        if (this == obj) {
            
            return true;
        }
        
        if (obj == null || getClass() != obj.getClass()) {
            
            return false;
        }
        
        Cliente other = (Cliente) obj;

        return Objects.equals(this.cedula, other.cedula);
    } 
    
     // toString
    
    @Override
    
    public String toString() {
        
        return "Cliente{" 
                
                + "cedula=" + cedula + ", nombre=" + nombre 
                + ", correo=" + correo + ", telefono=" + telefono 
                + ", direccion=" + direccion + ", fechaNacimiento=" + getFechaFormateada() 
                + ", tipoCliente=" + tipoCliente + ", numeroCasillero=" + numeroCasillero 
                + ", Sexo=" + getSexoFormateado() + '}';
    }

    public boolean getSexo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
