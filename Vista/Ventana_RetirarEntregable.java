
package PreProyecto1.Vista;

// Importaciones

import PreProyecto1.Modelo.Casillero;
import PreProyecto1.Modelo.Cliente;
import PreProyecto1.Modelo.Counter;
import PreProyecto1.Modelo.TipoCliente;
import PreProyecto1.Modelo.Entregable;
import PreProyecto1.Modelo.EstadoEntregable;
import PreProyecto1.Modelo.ExchangeRateService;
import PreProyecto1.Modelo.Herramientas;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

// Ventana Ventana_RetirarEntregable

public class Ventana_RetirarEntregable extends javax.swing.JFrame {

    // Atributos
    
    private Counter counter;
    private Double impuestos;
    
    // Constructores
   
    public Ventana_RetirarEntregable() {
        
        initComponents();
        CompraVenta();
    }
    
    public Ventana_RetirarEntregable(Counter counter){ 
    
        initComponents(); 
        CompraVenta();
        this.counter = counter;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea8 = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextArea9 = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextArea10 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTextArea11 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton2.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jButton2.setText("RETIRAR");
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jButton5.setText("SALIR");
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setText("ID del cliente:");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel3.setText("Retirar Entregable");

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
                "Seleccionar", "NÚMERO DE REFERENCIA", "DESCRIPCIÓN", "REMITENTE", "ESTADO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Cálculo de impuestos:");

        jTextArea8.setEditable(false);
        jTextArea8.setColumns(14);
        jTextArea8.setRows(2);
        jScrollPane9.setViewportView(jTextArea8);

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("En dólares:");

        jTextArea9.setColumns(10);
        jTextArea9.setRows(2);
        jScrollPane10.setViewportView(jTextArea9);

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("En colones:");

        jTextArea10.setColumns(10);
        jTextArea10.setRows(2);
        jScrollPane11.setViewportView(jTextArea10);

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Monto total:");

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel6.setText("Tipo de cliente");

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Método de pago:");

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Tipo de cambio");

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Venta");

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(14);
        jTextArea2.setRows(2);
        jScrollPane3.setViewportView(jTextArea2);

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Compra");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(14);
        jTextArea1.setRows(2);
        jScrollPane2.setViewportView(jTextArea1);

        jButton3.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jButton3.setText("CALCULAR");
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jButton4.setText("TOTAL");
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TARJETA", "CONTADO" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VISA", "MASTER CARD", "AMERICAN EXPRESS" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextArea11.setColumns(10);
        jTextArea11.setRows(2);
        jScrollPane12.setViewportView(jTextArea11);

        jButton1.setText("BUSCAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton6.setText("Limpiar búsquedas");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(79, 79, 79)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(37, 37, 37))))
                .addGap(55, 55, 55))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(48, 48, 48)))
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4)
                                .addGap(38, 38, 38)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(49, 49, 49))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 977, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     *
     * Este método recopila la cédula ingresada por el usuario, valida su
     * formato y busca al cliente en el sistema. Si se encuentra el cliente,
     * se muestran sus datos y entregables en la interfaz. En caso de errores,
     * se informan al usuario a través de mensajes de diálogo
     *
     * @param evt El evento generado por la interacción del usuario con el botón
     * 
     */
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // Obtener la cédula ingresada por el usuario desde el JTextField
        
        String cedula = jTextField2.getText();

        // Validar el formato de la cédula
        
        if (!Herramientas.ValidarCedula(cedula)) {
            JOptionPane.showMessageDialog(this, "La cédula no es válida, intente de nuevo.");
            return; // Salir del método si la cédula no es válida
        }

        // Buscar el cliente utilizando la cédula proporcionada
        
        Cliente cliente = counter.BuscarClientePorCedula(cedula);

        // Verificar si se encontró un cliente
        if (cliente == null) {
            JOptionPane.showMessageDialog(this, "La cédula digitada no pertenece a ningún cliente, intente de nuevo.");
            return; // Salir del método si no se encuentra el cliente
        }

        // Informar al usuario que se encontró al cliente
        
        JOptionPane.showMessageDialog(this, "Se encontró al cliente.");

        // Obtener el tipo de cliente y mostrarlo en el área de texto
        
        TipoCliente tipoCliente = cliente.getTipoCliente();
        String tCliente = tipoCliente.name();
        jTextArea8.setText(tCliente);

        // Obtener el modelo de la tabla y buscar el casillero asociado al cliente
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Casillero casillero = counter.BuscarCasilleroPorCliente(cedula);

        // Verificar si el casillero tiene entregables
        
        if (casillero.getEntregables().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El cliente no ha recibido entregables aún.");
        } else {
            // Limpiar el modelo de la tabla antes de agregar nuevos datos
            model.setRowCount(0);

            // Agregar los entregables del casillero a la tabla
            
            for (Entregable entregable : casillero.getEntregables()) {
                int numReferencia = entregable.getNumeroReferencia();
                String descripcion = entregable.getDescripcion();
                String remitente = entregable.getRemitente();
                EstadoEntregable estado = entregable.getEstado();

                // Agregar una nueva fila con los datos del entregable
                
                model.addRow(new Object[]{false, numReferencia, descripcion, remitente, estado});
            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     *
     * Este método valida la cédula del cliente, busca el cliente y su casillero asociado, 
     * y recorre la tabla de entregables para sumar los impuestos de aquellos que están seleccionados.
     * Si se encuentra un entregable que ya ha sido entregado, se retorna 0.0 como indicativo de problema
     * 
     * @return El total de impuestos de los entregables seleccionados, o 0.0 si hay algún problema 
     *       
     */
    
    public double calcularSoloImpuestosSeleccionados() {
    
        double totalImpuestos = 0.0;
        
        String cedula = jTextField2.getText();

        // Validar la cédula ingresada
        
        if (!Herramientas.ValidarCedula(cedula)) {
            return 0.0;  // Retornar 0 si la cédula no es válida
        }

        Cliente cliente = counter.BuscarClientePorCedula(cedula);

        if (cliente == null) {
            return 0.0;  // Retornar 0 si no se encuentra el cliente
        }

        Casillero casillero = counter.BuscarCasilleroPorCliente(cedula);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        // Recorrer las filas de la tabla
        
        for (int row = 0; row < model.getRowCount(); row++) {
            
            // Verificar si la fila está seleccionada
            
            Boolean isSelected = (Boolean) model.getValueAt(row, 0);  // Suponiendo que la columna 0 es para selección
        
            if (isSelected != null && isSelected) {
                
                // Obtener el número de referencia del entregable
                
                Integer numReferencia = (Integer) model.getValueAt(row, 1);  // Suponiendo que la columna 1 es el número de referencia

                // Validar si la fila tiene un número de referencia
                
                if (numReferencia == null) {
                    return 0.0;  // Retornar 0 inmediatamente si hay filas vacías
                }

                // Buscar el entregable en el casillero
                
                Entregable entregable = casillero.getEntregablePorNumero(numReferencia); // Método que debes implementar

                if (entregable != null) {
                    
                    // Verificar si el entregable ya fue entregado
                    
                    if (entregable.getEstado() == EstadoEntregable.ENTREGADO) {
                        
                        return 0.0;  // Retornar 0 si hay paquetes entregados
                        
                    } else {
                        
                        // Calcular el impuesto del entregable y sumarlo al total
                        
                        totalImpuestos += entregable.calcularImpuesto();
                    }
                }
            }
        }

        // Retornar el total de impuestos calculados (sin descuentos)
        
        impuestos = totalImpuestos;
        return totalImpuestos;
    }

    /**
     * 
     * Método que calcula el total de impuestos con un descuento aplicado, basado en el tipo de cliente
     *
     * Este método primero calcula el total de impuestos de los entregables seleccionados. 
     * Si el total de impuestos es 0 o si no se encuentra el cliente, retorna 0.0. 
     * Si el cliente existe, se aplica un descuento basado en el tipo de cliente
     * 
     * @return El total de impuestos con descuento aplicado, o 0.0 si el total de impuestos es 0 
     *         
     */
    
    public double calcularTotalConDescuento() {

        // Llamar a la función que calcula los impuestos seleccionados (sin descuentos)
        
        double totalImpuestos = calcularSoloImpuestosSeleccionados();

        // Si totalImpuestos es 0, retornar 0 (por validaciones previas)
        
        if (totalImpuestos == 0) {
            return 0.0;
        }

        String cedula = jTextField2.getText();
        Cliente cliente = counter.BuscarClientePorCedula(cedula);

        // Validar si el cliente existe
        
        if (cliente == null) {
            return 0.0;
        }   

        // Obtener el tipo de cliente para aplicar descuento
        
        TipoCliente tipoCliente = cliente.getTipoCliente();
        double descuento = 0.0;
    
        if (tipoCliente == TipoCliente.PLATA) {
            
            descuento = 0.05;  // 5% de descuento
            
        } else if (tipoCliente == TipoCliente.ORO) {
            
            descuento = 0.10;  // 10% de descuento
        }
        
        // Aplicar el descuento
        
        double totalConDescuento = totalImpuestos - (totalImpuestos * descuento);

        return totalConDescuento;
    }

    /**
     * 
     * Método que obtiene y muestra las tasas de cambio de compra y venta 
     * en colones utilizando el servicio externo BCR
     * 
     * Este método captura las tasas de cambio para el día actual y las 
     * muestra en dos componentes de texto. Si ocurre un error durante la 
     * obtención de las tasas de cambio, se captura la excepción y se muestra 
     * un mensaje de error correspondiente en los componentes de texto
     * 
     */
    
    public void CompraVenta(){
    
        try {
            String fecha = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
            String compra = ExchangeRateService.obtenerTipoCambio(317, fecha, fecha, "Joan Castrillo", "joancastrillo7463@gmail.com", "1ALSA5AMOA");
            String venta = ExchangeRateService.obtenerTipoCambio(318, fecha, fecha, "Joan Castrillo", "joancastrillo7463@gmail.com", "1ALSA5AMOA");

            jTextArea1.setText("₡" + compra);
            jTextArea2.setText("₡" + venta);

        } catch (Exception e) {
            e.printStackTrace();
            jTextArea1.setText("Error obteniendo tipo de cambio de compra.");
            jTextArea2.setText("Error obteniendo tipo de cambio de venta.");
        }
    }
    
    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
       
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    /**
     *
     * Este método intenta obtener las tasas de cambio para la compra y venta 
     * en colones, luego calcula el total de impuestos con descuento. 
     * Si ocurre un error durante la obtención de las tasas de cambio o 
     * la conversión, se captura la excepción y se muestra un mensaje 
     * de error en el componente de texto correspondiente
     *
     * @param evt El evento de acción que desencadena este método
     * 
    */
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
                                  
            try {
           // Obtener la fecha actual en formato dd/MM/yyyy
           String fecha = new SimpleDateFormat("dd/MM/yyyy").format(new Date());

           // Llamar a la función para obtener las tasas de cambio de compra y venta
           String compra = ExchangeRateService.obtenerTipoCambio(317, fecha, fecha, 
                   "Joan Castrillo", "joancastrillo7463@gmail.com", "1ALSA5AMOA");
           String venta = ExchangeRateService.obtenerTipoCambio(318, fecha, fecha, 
                   "Joan Castrillo", "joancastrillo7463@gmail.com", "1ALSA5AMOA");

           // Convertir las tasas de cambio a tipo double
           double tipoCambioCompra = Double.parseDouble(compra); // Tipo de cambio de compra en colones
           double tipoCambioVenta = Double.parseDouble(venta);   // Tipo de cambio de venta en colones

           // Calcular el total con descuento
           double totalConDescuento = calcularTotalConDescuento();

           // Validar si el total es 0 o negativo; si es así, no proceder con las conversiones
           if (totalConDescuento <= 0) { // Usar <= para cubrir el caso de impuestos negativos o cero
               jTextArea9.setText("El total es 0 o negativo, no se puede realizar la conversión.");
               jTextArea10.setText("");
               return;
           }

           // Convertir el total a colones (impuestos ya en dólares)
           double totalColones = totalConDescuento * tipoCambioVenta; // Total en colones

           // Setear los resultados en los jTextArea correspondientes
           jTextArea9.setText("$" + String.format("%.2f", totalConDescuento)); // Total en dólares formateado
           jTextArea10.setText("₡" + String.format("%.2f", totalColones)); // Total en colones formateado

       } catch (Exception e) {
           // Capturar cualquier excepción que pueda ocurrir durante el proceso
           e.printStackTrace();
           jTextArea9.setText("Error obteniendo tipo de cambio."); // Mensaje de error para el usuario
           jTextArea10.setText("");
       }  
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        double impuestos = calcularSoloImpuestosSeleccionados();
        String setear = String.valueOf(impuestos) + " $USD";
        jTextArea11.setText(setear);
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed

    }//GEN-LAST:event_jTable1KeyPressed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        Menu nuevaVentana = new Menu(counter);
        nuevaVentana.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * 
     * Valida la cédula del cliente, verifica si existen 
     * entregables seleccionados y calcula el total a retirar, 
     * incluyendo descuentos según el tipo de cliente
     * 
     * Se muestran mensajes de error si la cédula no es válida o si el 
     * cliente no se encuentra. Al final, se muestra un resumen del 
     * retiro realizado
     *
     * @param evt El evento de acción que desencadena este método
     * 
    */
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        // Obtener el modelo de la tabla y la suma total de impuestos
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        double totalRetirado = 0.0;

        // Obtener la cédula ingresada por el usuario
        
        String cedula = jTextField2.getText();

        // Validar la cédula del cliente
        
        if (!Herramientas.ValidarCedula(cedula)) {
            JOptionPane.showMessageDialog(this, "La cédula no es válida, intente de nuevo.");
            return;
        }

        // Buscar el cliente por cédula
        
        Cliente cliente = counter.BuscarClientePorCedula(cedula);

        // Verificar si el cliente existe
        
        if (cliente == null) {
            JOptionPane.showMessageDialog(this, "No se encontró el cliente.");
            return;
        }   

        // Buscar el casillero del cliente
        
        Casillero casillero = counter.BuscarCasilleroPorCliente(cedula);

        // Obtener el método de pago y tipo de tarjeta seleccionados
        
        String metodoPago = (String) jComboBox1.getSelectedItem();  // Método de pago
        String tipoTarjeta = (String) jComboBox2.getSelectedItem(); // Tipo de tarjeta

        // Iterar sobre las filas de la tabla para procesar los entregables seleccionados
        
        for (int row = 0; row < model.getRowCount(); row++) {

            Boolean isSelected = (Boolean) model.getValueAt(row, 0); // Columna de selección

            if (isSelected != null && isSelected) {
                Integer numReferencia = (Integer) model.getValueAt(row, 1); // Número de referencia
                Entregable entregable = casillero.getEntregablePorNumero(numReferencia);

                // Verificar el estado del entregable
                if (entregable != null && entregable.getEstado() != EstadoEntregable.ENTREGADO) {
                    entregable.setEstado(EstadoEntregable.ENTREGADO);

                    // Establecer la fecha de retiro
                    Calendar calendar = Calendar.getInstance();
                    entregable.setFechaRetiro(calendar);

                    // Calcular el impuesto total
                    totalRetirado += entregable.calcularImpuesto();
                } else if (entregable.getEstado() == EstadoEntregable.ENTREGADO) {
                    JOptionPane.showMessageDialog(this, "Algunos entregables ya fueron retirados.");
                    return;
                }
            }
        }

        // Preparar el mensaje de resumen del retiro
        
        StringBuilder mensaje = new StringBuilder();
        mensaje.append("El total a retirar es: $").append(String.format("%.2f", totalRetirado)).append(" USD\n");
        mensaje.append("Método de pago: ").append(metodoPago).append("\n");

        // Si se utiliza tarjeta, incluir el tipo de tarjeta en el mensaje
        
        if ("Tarjeta".equalsIgnoreCase(metodoPago)) {
            mensaje.append("Tipo de tarjeta: ").append(tipoTarjeta);
        }

        // Mostrar el mensaje al usuario
        
        JOptionPane.showMessageDialog(this, mensaje.toString());

        // Obtener el tipo de cliente para aplicar descuento
        
        TipoCliente tipoCliente = cliente.getTipoCliente();

        double descuento = 0.0;

        // Calcular el descuento basado en el tipo de cliente
        
        switch (tipoCliente) {
            case PLATA -> descuento = 0.05 * totalRetirado;  // 5% de descuento
            case ORO -> descuento = 0.10 * totalRetirado;    // 10% de descuento
            default -> descuento = 0;
        }
        totalRetirado -= descuento;

        // Registrar el retiro en los fondos del cliente
        
        counter.setFondosRetiro(impuestos, impuestos, descuento, totalRetirado, cliente);

        // Reiniciar el monto de impuestos
        
        impuestos = 0.0;
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * 
     * Este método se invoca cuando  el usuario presiona el botón para restablecer 
     * la interfaz a su estado inicial, limpiando todos los campos y la tabla
     *
     * @param evt El evento de acción que desencadena este método
     * 
     */
    
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         
        // Limpiar los campos de texto
        
        jTextField2.setText("");     // Campo de cédula
        jTextArea9.setText("");      // Área de texto 9
        jTextArea10.setText("");     // Área de texto 10
        jTextArea11.setText("");     // Área de texto 11

        // Reiniciar JTable
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); // Eliminar todas las filas de la tabla

        // Reiniciar JComboBox
        
        jComboBox1.setSelectedIndex(0); // Seleccionar el primer elemento en el JComboBox 1
        jComboBox2.setSelectedIndex(0); // Seleccionar el primer elemento en el JComboBox 2

        // Volver el foco al primer campo
        
        jTextField2.requestFocus(); // Establecer el foco en el campo de cédula para facilitar la entrada del usuario
        
    }//GEN-LAST:event_jButton6ActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana_RetirarEntregable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_RetirarEntregable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_RetirarEntregable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_RetirarEntregable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_RetirarEntregable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea10;
    private javax.swing.JTextArea jTextArea11;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea8;
    private javax.swing.JTextArea jTextArea9;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
