
package PreProyecto1.Modelo; 

// Importaciones

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

// Clase ExchangeRateService (compra y venta del dólar)

public class ExchangeRateService {

    /**
     * Obtiene el tipo de cambio económico a partir de un servicio web externo.
     *
     * Este método realiza una solicitud HTTP GET a un servicio web para obtener 
     * indicadores económicos, parsea la respuesta en formato XML y extrae el valor
     * del indicador solicitado entre las fechas especificadas.
     *
     * @param indicador El indicador económico que se desea obtener.
     * @param fechaInicio La fecha de inicio del rango para el cual se solicita el tipo de cambio, en formato "YYYY-MM-DD".
     * @param fechaFinal La fecha de finalización del rango para el cual se solicita el tipo de cambio, en formato "YYYY-MM-DD".
     * @param nombre El nombre del solicitante que se enviará en la solicitud.
     * @param correoElectronico El correo electrónico del solicitante que se enviará en la solicitud.
     * @param token El token de autenticación necesario para acceder al servicio web.
     * @return El valor del indicador económico solicitado, o null si no se encuentra el valor.
     * @throws Exception Si ocurre un error durante la conexión o el parseo del XML.
     */
    
    public static String obtenerTipoCambio(int indicador, String fechaInicio, String fechaFinal, String nombre, String correoElectronico, String token) throws Exception {
        
        String urlStr = "https://gee.bccr.fi.cr/Indicadores/Suscripciones/WS/wsindicadoreseconomicos.asmx/ObtenerIndicadoresEconomicosXML" +
                "?Indicador=" + indicador +
                "&FechaInicio=" + URLEncoder.encode(fechaInicio, "UTF-8") +
                "&FechaFinal=" + URLEncoder.encode(fechaFinal, "UTF-8") +
                "&Nombre=" + URLEncoder.encode(nombre, "UTF-8") +
                "&SubNiveles=N" +
                "&CorreoElectronico=" + URLEncoder.encode(correoElectronico, "UTF-8") +
                "&Token=" + URLEncoder.encode(token, "UTF-8");

        URL url = new URL(urlStr);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        // Leer la respuesta
        
        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
        String inputLine;
        StringBuilder responseStrBuilder = new StringBuilder();
        
        while ((inputLine = in.readLine()) != null) {
            
            responseStrBuilder.append(inputLine);
        }
        in.close();
        
        // Parsear el XML externo para obtener el contenido del elemento <string>
        
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder()
                .parse(new java.io.ByteArrayInputStream(responseStrBuilder.toString().getBytes("UTF-8")));
        NodeList stringNodes = doc.getElementsByTagName("string");
        
        if (stringNodes.getLength() > 0) {
            
            String innerXml = stringNodes.item(0).getTextContent();
            innerXml = innerXml.replace("&lt;", "<").replace("&gt;", ">");
            Document innerDoc = DocumentBuilderFactory.newInstance().newDocumentBuilder()
                    .parse(new java.io.ByteArrayInputStream(innerXml.getBytes("UTF-8")));
            NodeList valorNodes = innerDoc.getElementsByTagName("NUM_VALOR");
            if (valorNodes.getLength() > 0) {
                String valor = valorNodes.item(0).getTextContent();
                return valor;
            } 
            else {
                
                return null;
              }
        } 
        else {
            
            return null;
          }
    }
}
