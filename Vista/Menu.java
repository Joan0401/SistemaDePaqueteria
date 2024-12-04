
package PreProyecto1.Vista;

// Importaciones

import PreProyecto1.Modelo.Casillero;
import PreProyecto1.Modelo.Cliente;
import PreProyecto1.Modelo.Counter;
import PreProyecto1.Modelo.Entregable;
import PreProyecto1.Modelo.EstadoEntregable;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

// Ventana Menu

public class Menu extends javax.swing.JFrame {
    
    // Atributo
    
    private Counter counter = new Counter();
   
    // Constructores
    
    public Menu() {
        
        initComponents(); 
    }
    
    public Menu(Counter counter) {
         
        this.counter = counter;
        initComponents();
        
         // Se añade un AncestorListener para cargar datos en jTable1 cuando la ventana se muestra
         
        jTable1.addAncestorListener(new javax.swing.event.AncestorListener() {
            
            @Override
            
            public void ancestorAdded(javax.swing.event.AncestorEvent event) {
                
                // Llamar al método que rellena la tabla con los clientes que tienen paquetes pendientes
                
                cargarDatosEnTabla();
            }

            @Override
            public void ancestorRemoved(javax.swing.event.AncestorEvent event) {
                
                // No se necesita implementar nada aquí
            }

            @Override
            public void ancestorMoved(javax.swing.event.AncestorEvent event) {
                
                // No se necesita implementar nada aquí
            }
        });   
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Reportes = new javax.swing.JButton();
        Consultas = new javax.swing.JButton();
        Cliente = new javax.swing.JButton();
        Counter = new javax.swing.JButton();
        Recepcion = new javax.swing.JButton();
        Retiro = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Reportes.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        Reportes.setText("REPORTES");
        Reportes.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        Reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportesActionPerformed(evt);
            }
        });

        Consultas.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        Consultas.setText("CONSULTAS");
        Consultas.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        Consultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultasActionPerformed(evt);
            }
        });

        Cliente.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        Cliente.setText("ADMINISTRACIÓN DE CLIENTES");
        Cliente.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteActionPerformed(evt);
            }
        });

        Counter.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        Counter.setText("CREAR COUNTER");
        Counter.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        Counter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CounterActionPerformed(evt);
            }
        });

        Recepcion.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        Recepcion.setText("RECEPCIÓN DE ARTÍCULOS");
        Recepcion.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        Recepcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecepcionActionPerformed(evt);
            }
        });

        Retiro.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        Retiro.setText("RETIRO DE ARTÍCULOS");
        Retiro.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        Retiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetiroActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setText("Clientes con paquetes pendientes");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel3.setText("Bienvenidos al Sistema de Paquetería");

        jTable1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "TELÉFONO", "CORREO", "# PENDIENTES"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                            .addComponent(Recepcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Retiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Consultas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Reportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Counter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Counter, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(Recepcion, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(Retiro, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Consultas, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(Reportes, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportesActionPerformed
        
        Ventana_Reportes nuevaVentana = new Ventana_Reportes(counter);
        nuevaVentana.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_ReportesActionPerformed

    private void ConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultasActionPerformed
        
        Ventana_Consultas nuevaVentana = new Ventana_Consultas(counter);
        nuevaVentana.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_ConsultasActionPerformed

    private void ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteActionPerformed
        
        Ventana_Cliente nuevaVentana = new Ventana_Cliente(counter);
        nuevaVentana.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_ClienteActionPerformed

    private void CounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CounterActionPerformed

        Ventana_Counter nuevaVentana = new Ventana_Counter(counter);
        nuevaVentana.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_CounterActionPerformed

    private void RecepcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecepcionActionPerformed

        Menu_Retiro nuevaVentana = new Menu_Retiro(counter);
        nuevaVentana.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_RecepcionActionPerformed

    private void RetiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetiroActionPerformed
        
        Ventana_RetirarEntregable nuevaVentana = new Ventana_RetirarEntregable(counter);
        nuevaVentana.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_RetiroActionPerformed

    /**
     * 
     * Método que rellena una JTable con los datos de clientes que tienen paquetes pendientes
     * 
     * @param table La JTable a rellenar
     * @param counter El objeto que contiene la lista de clientes y la lógica para obtener los casilleros
     * 
     */
    
    private void cargarDatosEnTabla() {

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); // Limpiar la tabla antes de añadir nuevos datos

        for (Cliente cliente : counter.getClientes()) {

            if (cliente != null) {

                Casillero casillero = counter.BuscarCasilleroPorCliente(cliente.getCedula());

                if (casillero != null) {
                    ArrayList<Entregable> entregables = casillero.getEntregables();

                    // Revisar si hay entregables sin entregar
                    for (Entregable entregable : entregables) {
                        if (entregable.getEstado() == EstadoEntregable.NO_ENTREGADO) {
                            Object[] fila = new Object[5];
                            fila[0] = cliente.getCedula();
                            fila[1] = cliente.getNombre();
                            fila[2] = cliente.getTelefono();
                            fila[3] = cliente.getCorreo();
                            fila[4] = casillero.SinEntregar(); // O el método que tengas para contar los no entregados
                            model.addRow(fila);
                            break;  // Si ya encontramos un entregable no entregado, no necesitamos buscar más para este cliente
                        }
                    }
                }
            }
        }
    }
    
    private void jTable1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorAdded

    }//GEN-LAST:event_jTable1AncestorAdded

    public static void main(String args[]) {
        
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       
        java.awt.EventQueue.invokeLater(() -> {
            new Menu().setVisible(true);
        });    
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cliente;
    private javax.swing.JButton Consultas;
    private javax.swing.JButton Counter;
    private javax.swing.JButton Recepcion;
    private javax.swing.JButton Reportes;
    private javax.swing.JButton Retiro;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
