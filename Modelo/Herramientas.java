
package PreProyecto1.Modelo;

// Importaciones

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import java.util.Calendar;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Clase que contiene algunos herramientas necesarias

public class Herramientas {
    
    // ---- VALIDACIONES
    
    /**
     * 
     * Método que valida una cédula jurídica de manera superficial 
     * 
     * @param cedulaJuridica a validar
     * 
     * @return un booleano
     * 
     */
    
    public static boolean validarCedulaJuridica(String cedulaJuridica) {
        
        String cedulaLimpiada = cedulaJuridica.replaceAll("[^\\d]", "");

        if (cedulaLimpiada.length() == 10) {
            
            cedulaLimpiada = "0" + cedulaLimpiada;
        }

        if (cedulaLimpiada.length() != 11) {
            return false;
        }

        char primerDigito = cedulaLimpiada.charAt(0);

        return !(primerDigito < '1' || primerDigito > '7');
    }
    
    /**
     * 
     * Método que valida un correo mediante expresiones regulares
     * 
     * @param correo a validar
     * 
     * @return un booleano
     * 
     */
    
    public static boolean ValidarCorreo(String correo){
        
        String Componentes = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";     // Expresión regular para validar correos
        Pattern patrón = Pattern.compile(Componentes);                    // Compilar la expresión regular en un patrón
        Matcher matcher = patrón.matcher(correo);                         // Aplicar el patrón al correo ingresado
        
        return matcher.matches(); 
    }
    
    /**
     * 
     * Método que valida un teléfono mediante expresiones regulares
     * 
     * @param telefono de determinado cliente
     * 
     * @return un booleano
     * 
     */
    
    public static boolean ValidarTelefono(String telefono) {
        
        String Componentes = "^[2687]\\d{3}(-?\\d{4})?$";
    
        return telefono.matches(Componentes);
    }
    
    /**
     * 
     * Método que valida una cédula mediante expresiones regulares
     * 
     * @param cedula de determinado cliente
     * 
     * @return un booleano
     * 
     */
    
    public static boolean ValidarCedula(String cedula) {
        
        String ConGuiones = "^[1-9]-\\d{4}-\\d{4}$";    
        String SinGuiones = "^[1-9]\\d{8}$";           

        // Verificar si la cédula coincide con alguno de los patrones
        
        boolean esValidaConGuiones = cedula.matches(ConGuiones);
        boolean esValidaSinGuiones = cedula.matches(SinGuiones);

    return esValidaConGuiones || esValidaSinGuiones;
    }
    
    /**
     * 
     * Método que que una fecha tenga sentido
     * 
     * @param day día de la fecha
     * @param month mes de la fecha
     * @param year año de la fecha
     * 
     * @return un booleano
     * 
     */
    
    public static boolean ValidarFechas(int day, int month, int year) {
    
        try {
           
            Calendar calendar = Calendar.getInstance();
            
            calendar.setLenient(false);             // Desactiva la corrección automática de fechas
            calendar.set(year, month - 1, day);     // Setea la fecha sin corrección
            calendar.getTime();                     // Aquí lanzaría la excepción
    
            return true; // Si no ocurre excepción, la fecha es válida
        }   
        catch (Exception e) {
            
            return false;
        }
    }
    
    /**
     * 
     * Método que valida el formato de una fecha
     * 
     * @param fecha a validar
     * 
     * @return un booleano
     * 
     */
    
    public static boolean validarFormatoFecha(String fecha) {
        
        String regex = "^(\\d{2})[/-](\\d{2})[/-](\\d{4})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(fecha);

        return matcher.matches();
    }
    
    public static String obtenerDia(String fecha) {
        
        String[] partes = fecha.split("[/-]");
        return partes[0];
    }

    public static String obtenerMes(String fecha) {
        
        String[] partes = fecha.split("[/-]");
        return partes[1];  
    }

    public static String obtenerAnio(String fecha) {
        
        String[] partes = fecha.split("[/-]");
        return partes[2];  
    }
    
    /**
     * 
     * Método que valida si el texto ingresado es un número válido
     * 
     * @param texto El texto que se desea validar
     * @return true si el texto es un número válido, false en caso contrario
     * 
     */
    
    public static boolean validarNumero(String texto){
    
         try {
             
            Double.valueOf(texto); 
            return true;
            
        } catch (NumberFormatException e) {
            
            return false; 
        }
    }
    
    // ---- JAVAMAIL
    
    /**
     * 
     * Método que envía un correo a determinado cliente
     * 
     * @param destinatario
     * @param asunto
     * @param cuerpo
     * 
     */
    
    public static void enviarCorreo(String destinatario, String asunto, String cuerpo) {
        
        // Configuraciones para la conexión SMTP
        
        Properties propiedades = new Properties();
        propiedades.put("mail.smtp.auth", "true");
        propiedades.put("mail.smtp.starttls.enable", "true");
        propiedades.put("mail.smtp.host", "smtp.gmail.com");
        propiedades.put("mail.smtp.port", "587");

        // Autenticación
        
        final String usuario = "abofi2005@gmail.com"; 
        final String contraseña = "kpwz hrlu hxme tlbq"; 

        Session sesion = Session.getInstance(propiedades, new Authenticator() {
                
                @Override
                
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(usuario, contraseña);
                    }
                });

                try {
            
                    // Crear el mensaje
            
                    Message mensaje = new MimeMessage(sesion);
                    mensaje.setFrom(new InternetAddress(usuario));
                    mensaje.setRecipients(Message.RecipientType.TO, InternetAddress.parse(destinatario));
                    mensaje.setSubject(asunto);
                    mensaje.setText(cuerpo);

                    // Enviar el mensaje
            
                    Transport.send(mensaje);
                    System.out.println("Correo enviado exitosamente!");
                } 
                catch (MessagingException e) {
                    
                e.printStackTrace();
                }
    }
    
    
}
