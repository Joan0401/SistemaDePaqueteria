
package PreProyecto1.Modelo;

// Importaciones

import java.util.ArrayList;
import java.util.Calendar;

// Clase Counter

public class Counter {
    
    // Atributos de creación del counter
    
    private String nombre;
    private String cedulaJuridica;
    private String direccion;
    private int numeroCasilleros;
    
    // Atributos para el manejo de información de clientes
    
    private ArrayList <Cliente> Clientes = new ArrayList();
    private ArrayList <Casillero> Casilleros = new ArrayList();
    
    // Atributos para ciertos métodos
    
    private ArrayList<Integer> numerosRandom = new ArrayList<>();
    private ArrayList<ReporteContable> FondosRecaudados = new ArrayList<>();
    
    //  -------------------------------------------------------------------- Constructores -------------------------------------------------------------------- //
    
    public Counter(String nombre, String cedulaJuridica, String direccion, int numeroCasilleros) {
        
        this.nombre = nombre;
        this.cedulaJuridica = cedulaJuridica;
        this.direccion = direccion;
        this.numeroCasilleros = numeroCasilleros;   
    }
    
    public Counter(){}

    //  -------------------------------------------------------------------- Getters y setters -------------------------------------------------------------------- //
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedulaJuridica() {
        return cedulaJuridica;
    }

    public void setCedulaJuridica(String cedulaJuridica) {
        this.cedulaJuridica = cedulaJuridica;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumeroCasilleros() {
        return numeroCasilleros;
    }

    public void setNumeroCasilleros(int numeroCasilleros) {
        this.numeroCasilleros = numeroCasilleros;
    }

    public ArrayList<Cliente> getClientes() {
        return Clientes;
    }

    public void setClientes(ArrayList<Cliente> Clientes) {
        this.Clientes = Clientes;
    }

    public ArrayList<Casillero> getCasilleros() {
        return Casilleros;
    }

    public void setCasilleros(ArrayList<Casillero> Casilleros) {
        this.Casilleros = Casilleros;
    }

    public ArrayList<Integer> getNumerosRandom() {
        return numerosRandom;
    }

    public void setNumerosRandom(ArrayList<Integer> numerosRandom) {
        this.numerosRandom = numerosRandom;
    }

    public ArrayList<ReporteContable> getFondosRecaudados() {
        return FondosRecaudados;
    }

    public void setFondosRecaudados(ArrayList<ReporteContable> FondosRecaudados) {
        this.FondosRecaudados = FondosRecaudados;
    }
    
    //  -------------------------------------------------------------------- Métodos -------------------------------------------------------------------- //
    
    // CASILLEROS //
    
    /**
     * 
     * Método que inicializa los casilleros
     * 
     */
    
    public void InicializarCasilleros(){
        
        for (double i = 1000; i < this.numeroCasilleros + 1000; i++){
            
            ArrayList <Entregable> entregables = new ArrayList<>();
            Casillero casillero = new Casillero(i, true, entregables);
            Casilleros.add(casillero);
        }
    }
        
    /**
     * 
     * Método que retorna el siguiente casillero disponible 
     * 
     * @return una instancia de la clase Casillero
     * 
     */
    
    public Casillero RetornarCasilleroDisponible(){
    
        for (Casillero casillero: Casilleros){
        
            if (casillero.isDisponible() == true){
            
                return casillero;
            }
        }
        return null;
    }
    
    /**
     * 
     * Método que elimina todos los entregables de un casillero y lo setea en disponible
     * 
     * @param numeroCasillero a liberar
     * 
     */
    
    public void LiberarCasillero(double numeroCasillero){
        
        Casillero casillero = BuscarCasilleroPorNumero(numeroCasillero);
        casillero.setDisponible(true);
        casillero.getEntregables().clear();
    }
    
    /**
     * 
     * Método que devuelve la información de los casilleros del counter
     * 
     * @return un string con el detalle de todos los casilleros
     * 
     */
                   
    public String VerDetalleCasilleros(){
    
        return "Casilleros{" + Casilleros + '}';
    }
    
    /**
     * 
     * Método que busca un casillero determinado mediante la cédula del ocupante 
     * 
     * @param cedula del cliente 
     * 
     * @return el casillero buscado o null si no lo encuentra
     * 
     */
    
    public Casillero BuscarCasilleroPorCliente(String cedula){
    
        Cliente tCliente = BuscarClientePorCedula(cedula);
        
        if (tCliente != null){
        
            for (Casillero casillero: Casilleros){
            
                if (casillero.equals(tCliente.getNumeroCasillero())){
                    return casillero;
                }
            }
        }
        return null;
    }
     
    /**
     * 
     * Método que busca un casillero determinado mediante su número de identificación 
     * 
     * @param numeroCasillero del casillero a buscar
     * 
     * @return el casillero buscado o null si no lo encuentra
     * 
     */
    
    public Casillero BuscarCasilleroPorNumero(double numeroCasillero) {
       
        for (Casillero casillero : Casilleros) {
            
            if (casillero.getNumeroCasillero() == numeroCasillero) {
                return casillero; // Retorna el casillero encontrado
            }
        }
    return null; 
    }
    
    // CLIENTES //
    
    /**
     * 
     * Método que asigna un TipoCliente a un cliente, basado en la cantidad 
     * de entregables en su casillero
     * 
     * @param cedula La cédula del cliente a evaluar
     * 
     */
    
    public void TiposDeCliente(String cedula){
    
        Cliente cliente = BuscarClientePorCedula(cedula);
        Casillero casillero = cliente.getCasillero();
        
        if (casillero.getEntregables().size() < 20 && casillero.getEntregables().size() > 9){
            
            cliente.setTipoCliente(TipoCliente.PLATA);
        }
       
        if (casillero.getEntregables().size() > 20){
            
            cliente.setTipoCliente(TipoCliente.ORO);
        } 
    }
    
    /**
     * 
     * Método que valida si un usuario acaba de subir a nivel PLATA
     * 
     * @param cliente La cédula del cliente a evaluar
     * 
     * @return un booleano
     * 
     */
    
    public Boolean UsuarioPlata(Cliente cliente){
        
        Casillero casillero = cliente.getCasillero();
        
        return casillero.getEntregables().size() == 10;       
    }
    
    /**
     * 
     * Método que valida si un usuario acaba de subir a nivel ORO
     * 
     * @param cliente La cédula del cliente a evaluar
     * 
     * @return un booleano
     * 
     */
    
    public Boolean UsuarioOro(Cliente cliente){
        
        Casillero casillero = cliente.getCasillero();
        
        return casillero.getEntregables().size() == 20;     
    }
    
    /**
     * 
     * Método que verifica si un cliente ya existe dentro de la lista de clientes
     * 
     * @param cedula del cliente a buscar
     * 
     * @return un booleano
     * 
     */
    
    public boolean ClienteRepetido(String cedula){
    
        return BuscarClientePorCedula(cedula) != null;
    }
    
    /**
     * 
     * Método que crea y añade un cliente a la lista de clientes
     * 
     * @param nCedula del cliente
     * @param nNombre del cliente
     * @param nCorreo del cliente
     * @param nTelefono del cliente
     * @param day de nacimiento
     * @param month de nacimiento
     * @param year de nacimiento
     * @param nDireccion del cliente
     * @param nSexo del cliente
     * 
     * @return un booleano
     * 
     */
    
    public boolean NuevoCliente(String nCedula, String nNombre, String nCorreo, String nTelefono, int day, int month, int year, String nDireccion, boolean nSexo) {
    
        if (!Herramientas.ValidarCedula(nCedula)) {
            return false;
        }
        if (!Herramientas.ValidarTelefono(nTelefono)) {
            return false;
        }
        if (!Herramientas.ValidarCorreo(nCorreo)) {
            return false;
        }
        if (Clientes.size() >= Casilleros.size()) {
            return false; 
        }
        if (!Herramientas.ValidarFechas(day, month, year)) {
            return false;
        }
        Casillero nCasillero = RetornarCasilleroDisponible();
        
        if (nCasillero == null) {
            return false;
        }
        
        Calendar FNueva = Calendar.getInstance();
        FNueva.set(year, month - 1, day);
        nCasillero.setDisponible(false);
        double numCasillero = nCasillero.getNumeroCasillero();
        Cliente CNuevo = new Cliente(nCedula, nNombre, nCorreo, nTelefono, nDireccion, FNueva, TipoCliente.NORMAL, nSexo, nCasillero, numCasillero); // Se crea la instancia
        CNuevo.setSexo(nSexo);
       
        if (ClienteRepetido(nCedula) == true) {
            
            nCasillero.setDisponible(true);
            return false; 
        }
        return Clientes.add(CNuevo);
    }
    

    /**
     * 
     * Método que elimina determinado cliente por su número de cédula 
     * 
     * @param cedula del cliente a eliminar
     * 
     * @return un booleano
     * 
     */
    
    public boolean EliminarClientePorCedula(String cedula) {
        
        for (Cliente bCliente: Clientes) {
            
            if (bCliente.getCedula().equals(cedula)) {
                
                LiberarCasillero(bCliente.getNumeroCasillero());
                return Clientes.remove(bCliente);
                }
        }
        return false; 
    }
    
    /**
     * 
     * Método que busca mediante la cédula, determinado cliente y lo retorna
     * 
     * @param cedula del cliente 
     * 
     * @return la referencia de un cliente (si lo encuentra)
     * 
     */
  
    public Cliente BuscarClientePorCedula(String cedula) {
        
        for (Cliente bCliente : Clientes) {
           
            if (bCliente.getCedula().equals(cedula)) {
                
                return bCliente;
            }
        }
        return null;
    }

    /**
     * 
     * Método que busca mediante el número de casillero, determinado cliente y lo retorna
     * 
     * @param numCasillero de los casilleros disponibles
     * 
     * @return la referencia de un cliente (si lo encuentra)
     * 
     */
    
    public Cliente BuscarClientePorCasillero(double numCasillero) {
        
        for (Cliente bCliente : Clientes) {
            
            if (bCliente.getNumeroCasillero() == numCasillero) {
                
                return bCliente;
            }
        } 
        return null; 
    }

    // Entregables //
     
    /**
     * 
     * Método que añade mediante la cédula, un nuevo sobre a la lista de entregables 
     * 
     * @param cedula del cliente
     * @param descripcion del entregable
     * @param tSobre del sobre
     * @param tContenido del sobre
     * @param peso del sobre
     * @param remitente del sobre
     * @param numReferencia del sobre
     * 
     * @return un booleano
     * 
     */
     
    public boolean AñadirSobrePorCedula(String cedula, String descripcion, TipoSobre tSobre, TipoContenido tContenido, double peso, String remitente, int numReferencia) {
       
        Cliente cliente = BuscarClientePorCedula(cedula);
        Casillero nCasillero = BuscarCasilleroPorCliente(cedula);
    
        if (numerosRandom.contains(numReferencia + 1000000)) {
       
            return false;  
        }
        
        if (!nCasillero.isDisponible()) {
        
            numReferencia += 1000000;
            numerosRandom.add(numReferencia);
            Sobre nSobre = new Sobre(tSobre, tContenido, peso, numReferencia, EstadoEntregable.NO_ENTREGADO, descripcion, remitente);
            Herramientas.enviarCorreo(cliente.getCorreo(), "Nuevo entregable recibido!", "Un nuevo entregable ha sido recibido en el counter:\n\n" + nSobre.toString() 
                    + "\n\nAsí está su casillero actualmente: " + nCasillero.toString());
            nCasillero.addEntregable(nSobre);
            
            setFechaRegistro(nSobre);
            TiposDeCliente(cedula);
        
            return true;
        }
        return false; 
    }
    
    /**
     * 
     * Método que añade mediante la el número de casillero, un nuevo sobre a la lista de entregables 
     * 
     * @param numeroCasillero del cliente
     * @param descripcion del sobre
     * @param tSobre del sobre
     * @param tContenido del sobre
     * @param peso del sobre
     * @param remitente del sobre
     * @param numReferencia del sobre
     * 
     * @return un booleano
     * 
     */
     
    public boolean AñadirSobrePorNumeroCasillero(double numeroCasillero, String descripcion, TipoSobre tSobre, TipoContenido tContenido, double peso, String remitente, int numReferencia) {
        
        Cliente cliente = BuscarClientePorCasillero(numeroCasillero);
        Casillero nCasillero = BuscarCasilleroPorNumero(numeroCasillero);
    
        if (numerosRandom.contains(numReferencia + 1000000)) {
       
            return false;  // No añadir si ya existe
        }
        
        if (nCasillero != null && !nCasillero.isDisponible()) {
            
            numReferencia += 1000000;
            numerosRandom.add(numReferencia);
            Sobre nSobre = new Sobre(tSobre, tContenido, peso, numReferencia, EstadoEntregable.NO_ENTREGADO, descripcion, remitente);
            nCasillero.addEntregable(nSobre);
            Herramientas.enviarCorreo(cliente.getCorreo(), "Nuevo entregable recibido!", "Un nuevo entregable ha sido recibido en el counter:\n\n" + nSobre.toString() 
                    + "\n\nAsí está su casillero actualmente: " + nCasillero.toString());
            
            TiposDeCliente(cliente.getCedula());
            
            return true; 
        }
        return false; 
    }
    
    /**
     * 
     * Método que añade mediante la cédula, un nuevo paquete a la lista de entregables
     * 
     * @param cedula del cliente
     * @param electronico del paquete
     * @param fragil del paquete
     * @param peso del paquete
     * @param descripcion del paquete
     * @param remitente del paquete
     * @param numReferencia del paquete
     * 
     * @return un booleano
     * 
     */
    
    public boolean AñadirPaquetePorCedula(String cedula, boolean electronico, boolean fragil, double peso, String descripcion, String remitente, int numReferencia) {
        
        Cliente cliente = BuscarClientePorCedula(cedula);
        Casillero nCasillero = BuscarCasilleroPorCliente(cedula);

        if (numerosRandom.contains(numReferencia + 1000000)) {
       
            return false; 
        }
        
        if (nCasillero != null && !nCasillero.isDisponible()) {
            
            numReferencia += 1000000;
            Paquete nPaquete = new Paquete(electronico, fragil, peso, numReferencia, EstadoEntregable.NO_ENTREGADO, descripcion, remitente);
            nCasillero.addEntregable(nPaquete);
            Herramientas.enviarCorreo(cliente.getCorreo(), "Nuevo entregable recibido!", "\n\nUn nuevo entregable ha sido recibido en el counter:\n\n" + nPaquete.toString() 
                    + "\n\nAsí está su casillero actualmente:\n\n" + nCasillero.toString());
            
            setFechaRegistro(nPaquete);
            TiposDeCliente(cedula);
            
            numerosRandom.add(numReferencia);
        
            return true;
            }
        return false;
    }
    
     public boolean AñadirPaquetePorCedulaPrueba(String cedula, boolean electronico, boolean fragil, double peso, String descripcion, String remitente, int numReferencia) {
        
        Cliente cliente = BuscarClientePorCedula(cedula);
        Casillero nCasillero = BuscarCasilleroPorCliente(cedula);

        if (numerosRandom.contains(numReferencia + 1000000)) {
       
            return false; 
        }
        
        if (nCasillero != null && !nCasillero.isDisponible()) {
            
            numReferencia += 1000000;
            Paquete nPaquete = new Paquete(electronico, fragil, peso, numReferencia, EstadoEntregable.NO_ENTREGADO, descripcion, remitente);
            nCasillero.addEntregable(nPaquete); 
            setFechaRegistro(nPaquete);
            TiposDeCliente(cedula);
            
            numerosRandom.add(numReferencia);
        
            return true;
            }
        return false;
    }

    /**
     * 
     * Método que añade mediante el número de casillero, un nuevo paquete a la lista de entregables
     * 
     * @param numeroCasillero
     * @param electronico
     * @param fragil
     * @param peso
     * @param descripcion
     * @param remitente
     * @param numReferencia
     * 
     * @return un booleano
     * 
     */
    
    public boolean AñadirPaquetePorNumeroCasillero(double numeroCasillero, boolean electronico, boolean fragil, double peso, String descripcion, String remitente, int numReferencia) {
        
        Cliente cliente = BuscarClientePorCasillero(numeroCasillero);
        Casillero nCasillero = BuscarCasilleroPorNumero(numeroCasillero);

        if (numerosRandom.contains(numReferencia + 1000000)) {
       
            return false; 
        }
        
        if (nCasillero != null && !nCasillero.isDisponible()) {
            
            numReferencia += 1000000;
            Paquete nPaquete = new Paquete(electronico, fragil, peso, numReferencia, EstadoEntregable.NO_ENTREGADO, descripcion, remitente);
            nCasillero.addEntregable(nPaquete);
            Herramientas.enviarCorreo(cliente.getCorreo(), "Nuevo entregable recibido!", "Un nuevo entregable ha sido recibido en el counter:\n\n" + nPaquete.toString() 
                + "\n\nAsí está su casillero actualmente: " + nCasillero.toString());
            
            numerosRandom.add(numReferencia);
            TiposDeCliente(cliente.getCedula());
            
            return true; 
        }
        return false; // Indica que no se pudo añadir el paquete
    }

    /**
     * 
     * Método que añade mediante una cédula, una nueva revista a la lista de entregables
     * 
     * @param cedula del cliente
     * @param nombre de la revista
     * @param catalogo de la revista
     * @param tema de la revista
     * @param descripcion de la revista
     * @param remitente de la revista
     * @param numReferencia de la revista
     * 
     * @return un booleano
     * 
     */
    
    public boolean AñadirRevistaPorCedula(String cedula, String nombre, boolean catalogo, TipoTemaRevista tema, String descripcion, String remitente, int numReferencia) {
        
        Cliente cliente = BuscarClientePorCedula(cedula);
        Casillero nCasillero = BuscarCasilleroPorCliente(cedula);

        if (numerosRandom.contains(numReferencia + 1000000)) {
       
            return false;
        }
        
        if (nCasillero != null && !nCasillero.isDisponible()) {
            
            numReferencia += 1000000;
            Revista nRevista = new Revista(nombre, catalogo, tema, numReferencia, EstadoEntregable.NO_ENTREGADO, descripcion, remitente);
            nCasillero.addEntregable(nRevista);
            Herramientas.enviarCorreo(cliente.getCorreo(), "Nuevo entregable recibido!", "Un nuevo entregable ha sido recibido en el counter:\n\n" + nRevista.toString() 
                + "\n\nAsí está su casillero actualmente: " + nCasillero.toString());
            numerosRandom.add(numReferencia);
            setFechaRegistro(nRevista);
            TiposDeCliente(cedula);
            
            return true;
            }
        return false; 
    }   

    /**
     * 
     * Método que añade mediante un número de casillero, una nueva revista a la lista de entregables
     * 
     * @param numeroCasillero del cliente
     * @param nombre de la revista
     * @param catalogo de la revista
     * @param tema de la revista
     * @param descripcion de la revista
     * @param remitente de la revista
     * @param numReferencia de la revista
     * 
     * @return un booleano
     * 
     */
    
    public boolean AñadirRevistaPorNumeroCasillero(double numeroCasillero, String nombre, boolean catalogo, TipoTemaRevista tema, String descripcion, String remitente, int numReferencia) {
        
        Cliente cliente = BuscarClientePorCasillero(numeroCasillero);
        Casillero nCasillero = BuscarCasilleroPorNumero(numeroCasillero);

        if (numerosRandom.contains(numReferencia + 1000000)) {
       
            return false;
        }
        
        if (nCasillero != null && !nCasillero.isDisponible()) {
            
            numReferencia += 1000000;
            Revista nRevista = new Revista(nombre, catalogo, tema, numReferencia, EstadoEntregable.NO_ENTREGADO, descripcion, remitente);
            nCasillero.addEntregable(nRevista);
            Herramientas.enviarCorreo(cliente.getCorreo(), "Nuevo entregable recibido!", "Un nuevo entregable ha sido recibido en el counter:\n\n" + nRevista.toString() 
                + "\n\nAsí está su casillero actualmente: " + nCasillero.toString());
            numerosRandom.add(numReferencia); 
            TiposDeCliente(cliente.getCedula());
            
            return true;
            }
        return false;
    }
    
    // REPORTE CONTABLE //
    
    /**
     * 
     * Método que asigna la fecha y hora actuales como la fecha de recepción de un entregable
     * 
     * @param entregable al que se le asignará la fecha de recepción
     * 
     */
    
    public void setFechaRegistro(Entregable entregable){
    
        Calendar calendar = Calendar.getInstance();
        entregable.setFechaRecepcion(calendar);
    }
    
    /**
     * 
     * Método que asigna la fecha y hora actuales como la fecha de retiro de un entregable
     * 
     * @param entregable al que se le asignará la fecha de retiro
     * 
     */
    
    public void setFechaRetiro(Entregable entregable){
    
        Calendar calendar = Calendar.getInstance();
        entregable.setFechaRetiro(calendar);
    }
    
    /**
     * 
     * Método que establece la fecha y monto de determinado retiro y lo añade en un array
     * 
     * @param ingresos
     * @param impuestos
     * @param descuento
     * @param total
     * @param cliente
     * 
     */
    
    public void setFondosRetiro(Double ingresos, Double impuestos, Double descuento, Double total, Cliente cliente){
    
        Calendar fecha = Calendar.getInstance();
        ReporteContable reporte = new ReporteContable(fecha, ingresos, impuestos, descuento, total, cliente);
        FondosRecaudados.add(reporte);
    }
    
    // Método toString //
    
    @Override
    public String toString() {
        
        return "Counter{" 
                + "nombre=" + nombre 
                + "\n, cedulaJuridica=" + cedulaJuridica 
                + "\n, direccion=" + direccion 
                + "\n, numeroCasilleros=" + numeroCasilleros 
                + "\n, Clientes=" + Clientes 
                + "\n, Casilleros=" + Casilleros + '}';
    }
}