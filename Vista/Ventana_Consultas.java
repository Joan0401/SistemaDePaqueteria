
package PreProyecto1.Vista;

// Importaciones

import PreProyecto1.Modelo.Casillero;
import PreProyecto1.Modelo.Counter;
import PreProyecto1.Modelo.Entregable; 
import PreProyecto1.Modelo.Herramientas;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class Ventana_Consultas extends javax.swing.JFrame {

    // Atributo
    
    private Counter counter;
 
    // Constructores
    
    public Ventana_Consultas() {
        initComponents();
    }
    
    public Ventana_Consultas(Counter counter) {
        
        initComponents();
        this.counter = counter;
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton5.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jButton5.setText("SALIR");
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setText("Resultados de consulta");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel3.setText("Administración de Entregables");

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Buscar por ID de cliente:");

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Buscar por número de casillero:");

        jTextField1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jTextField2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jButton6.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jButton6.setText("CONSULTAR");
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Estado del casillero");

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Artículos");

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Buscar por fecha de entrega:");

        jTextField8.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Buscar por fecha de retiro:");

        jTextField9.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(21, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField1)
                                    .addComponent(jTextField2)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField8)
                                    .addComponent(jTextField9)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(319, 319, 319)))))
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                        .addGap(29, 29, 29)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Menu nuevaVentana = new Menu(counter);
        nuevaVentana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * 
     * Este método busca entregables en el casillero filtrados por cédula, número de casillero y/o 
     * fechas de ingreso y retiro. Se valida que al menos uno de los campos de cédula o número 
     * de casillero esté lleno y que solo se introduzca una fecha. Si las entradas son válidas, 
     * se realiza la búsqueda en el sistema
     * 
     * Proceso:
     * - Se obtienen los valores de los campos de texto para cédula, número de casillero y fechas
     * - Se valida que al menos un campo de búsqueda esté lleno y que se proporcione solo una fecha
     * - Se busca el casillero correspondiente según el tipo de entrada
     * - Se validan las fechas de ingreso y/o retiro, si están presentes
     * - Se filtran los entregables del casillero según las fechas ingresadas
     * - Se muestran los entregables encontrados en un área de texto
     * 
     * @param evt Evento que se dispara al hacer clic en el botón
     */
    
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
                                                
        String text1 = jTextField1.getText(); // Cédula
        String text2 = jTextField2.getText(); // Número de casillero
        String text3 = jTextField8.getText(); // Fecha de ingreso
        String text4 = jTextField9.getText(); // Fecha de retiro

        if ((text1.isEmpty() && text2.isEmpty()) || !(text3.isEmpty() ^ text4.isEmpty())) {
            JOptionPane.showMessageDialog(this, "Debe llenar al menos un campo de cédula o número, y SOLO una fecha (ingreso o retiro).");
            return;
        }

        if (!Herramientas.ValidarCedula(text1) && !Herramientas.validarNumero(text2)) {
            JOptionPane.showMessageDialog(this, "Ninguna de las formas de acceder a los entregables es válida, intente de nuevo.");
            return;
        }

        Casillero casillero;
        if (Herramientas.ValidarCedula(text1)) {
            casillero = counter.BuscarCasilleroPorCliente(text1);
        } else {
            casillero = counter.BuscarCasilleroPorNumero(Double.parseDouble(text2));
        }

        if (casillero == null) {
            JOptionPane.showMessageDialog(this, "No se encontró el casillero.");
            return;
        }

        Calendar fechaConsulta = null;

        if (!text3.isEmpty()) {
            String fechaIngresada = text3;
            if (!Herramientas.validarFormatoFecha(fechaIngresada)) {
                JOptionPane.showMessageDialog(this, "Formato de fecha de ingreso inválido.");
                return;
            }

            int diaIngreso = Integer.parseInt(Herramientas.obtenerDia(fechaIngresada));
            int mesIngreso = Integer.parseInt(Herramientas.obtenerMes(fechaIngresada)); 
            int añoIngreso = Integer.parseInt(Herramientas.obtenerAnio(fechaIngresada));

            fechaConsulta = Calendar.getInstance();
            fechaConsulta.set(añoIngreso, mesIngreso - 1, diaIngreso); // Ajustar mes en Calendar

            if (!Herramientas.ValidarFechas(diaIngreso, mesIngreso, añoIngreso)) {
                JOptionPane.showMessageDialog(this, "La fecha de ingreso digitada es inválida.");
                return;
            }
        }

        if (!text4.isEmpty()) {
            String fechaRetiro = text4;
            if (!Herramientas.validarFormatoFecha(fechaRetiro)) {
                JOptionPane.showMessageDialog(this, "Formato de fecha de retiro inválido.");
                return;
            }

            int diaRetiro = Integer.parseInt(Herramientas.obtenerDia(fechaRetiro));
            int mesRetiro = Integer.parseInt(Herramientas.obtenerMes(fechaRetiro));
            int añoRetiro = Integer.parseInt(Herramientas.obtenerAnio(fechaRetiro));

            fechaConsulta = Calendar.getInstance();
            fechaConsulta.set(añoRetiro, mesRetiro - 1, diaRetiro); // Ajustar mes en Calendar

            if (!Herramientas.ValidarFechas(diaRetiro, mesRetiro, añoRetiro)) {
                JOptionPane.showMessageDialog(this, "La fecha de retiro digitada es inválida.");
                return;
            }
        }

        ArrayList<Entregable> entregablesFiltrados = new ArrayList<>();

        // Filtrar entregables por fecha
        for (Entregable entregable : casillero.getEntregables()) {
            Calendar fechaIngreso = entregable.getFechaRecepcion(); 
            Calendar fechaRetiro = entregable.getFechaRetiro();     

            if (fechaIngreso == null) {
                JOptionPane.showMessageDialog(this, "Una de las fechas de ingreso de los entregables es nula.");
                return;
            }

            // Comparar la fecha de ingreso si se proporcionó text3
            if (!text3.isEmpty()) {
                if (fechaConsulta != null &&
                    fechaIngreso.get(Calendar.YEAR) == fechaConsulta.get(Calendar.YEAR) &&
                    fechaIngreso.get(Calendar.MONTH) == fechaConsulta.get(Calendar.MONTH) &&
                    fechaIngreso.get(Calendar.DAY_OF_MONTH) == fechaConsulta.get(Calendar.DAY_OF_MONTH)) {
                    entregablesFiltrados.add(entregable);
                }
            }

         
            // Comparar la fecha de retiro si se proporcionó text4
            
            if (!text4.isEmpty()) {
                try {
                    if (fechaConsulta != null &&
                        fechaRetiro.get(Calendar.YEAR) == fechaConsulta.get(Calendar.YEAR) &&
                        fechaRetiro.get(Calendar.MONTH) == fechaConsulta.get(Calendar.MONTH) &&
                        fechaRetiro.get(Calendar.DAY_OF_MONTH) == fechaConsulta.get(Calendar.DAY_OF_MONTH)) {
                        entregablesFiltrados.add(entregable);
                    }
                } catch (NullPointerException e) {
                    
                }
            }
        }

        // Mostrar resultados en el JTextArea
        if (entregablesFiltrados.isEmpty()) {
            jTextArea1.setText("No se encontraron entregables que cumplan con las condiciones.");
        } else {
            StringBuilder mensaje = new StringBuilder("Entregables encontrados:\n");
            for (Entregable entregable : entregablesFiltrados) {
                mensaje.append(entregable.toString()).append("\n");
            }
            jTextArea1.setText(mensaje.toString());
        }
        limpiarCampos();
    }//GEN-LAST:event_jButton6ActionPerformed

     /**
      *
      * Método que vacía los subcampos 
      * 
      */
    
    private void limpiarCampos() {

        jTextField1.setText("");
        jTextField2.setText("");
        jTextField8.setText("");
        jTextField9.setText("");
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana_Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Consultas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
