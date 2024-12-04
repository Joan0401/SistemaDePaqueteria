
package PreProyecto1.Vista;

// Importaciones

import PreProyecto1.Modelo.Cliente;
import PreProyecto1.Modelo.Counter;
import PreProyecto1.Modelo.Herramientas;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.table.DefaultTableModel;

// Ventana Ventana_Cliente

public class Ventana_Cliente extends javax.swing.JFrame {
    
    // Atributo
    
    private Counter counter;

    // Constructores
    
    public Ventana_Cliente() {
        initComponents();
    }
    
    public Ventana_Cliente(Counter counter) {
        
        initComponents();
        
        this.counter = counter;
        
        jTable1.addAncestorListener(new AncestorListener() {
            
            @Override
            public void ancestorAdded(AncestorEvent event) {
                
                cargarDatosEnTabla();
            }

            @Override
            public void ancestorRemoved(AncestorEvent event) {
                
            }

            @Override
            public void ancestorMoved(AncestorEvent event) {
                
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton2.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jButton2.setText("MODIFICAR CLIENTE");
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jButton8.setText("CREAR CLIENTE");
        jButton8.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jButton4.setText("ELIMINAR CLIENTE");
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
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
        jLabel4.setText("Clientes registrados");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel3.setText("Administración de Clientes");

        jTable1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "CASILLERO", "NOMBRE", "CORREO", "TELÉFONO", "DIRECCIÓN", "NACIMIENTO", "SEXO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Teléfono:");

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Dirección:");

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Fecha de nacimiento:");

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Sexo:");

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("ID:");

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText(" Nombre:");

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Correo:");

        jTextField1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jTextField3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jTextField4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jTextField5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jTextField6.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jTextField7.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jTextField8.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Búsqueda por cédula");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 128, Short.MAX_VALUE)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 27, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabel1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)))
                                .addGap(54, 54, 54))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
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

    /**
     * 
     * Método que carga los datos de los clientes en la tabla
     * 
     * El método obtiene el modelo de la tabla, limpia cualquier fila existente
     * y luego agrega una nueva fila para cada cliente registrado. Los datos que se muestran
     * para cada cliente incluyen la cédula, número de casillero, nombre, correo, teléfono,
     * dirección, fecha de registro y el sexo
     * 
     */
   
    private void cargarDatosEnTabla() {
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        model.setRowCount(0);

        for (Cliente cliente : counter.getClientes()) {
           
            double numCasillero = cliente.getNumeroCasillero();  
            model.addRow(new Object[]{cliente.getCedula(), numCasillero, cliente.getNombre(), cliente.getCorreo(), cliente.getTelefono(), cliente.getDireccion(), cliente.getFechaFormateada(), cliente.getSexoFormateado()});
        }
    }
    
    /**
     * Este método valida la cédula ingresada, elimina al cliente existente si se encuentra,
     * y permite la actualización de su información. Los datos se cargan en los campos de
     * texto para que el usuario pueda modificarlos. También valida la nueva información 
     * ingresada antes de crear un nuevo cliente con los datos actualizados
     * 
     * Validaciones incluidas:
     * - Cédula válida
     * - Campos no vacíos
     * - Formato de fecha correcto
     * - Sexo indicado correctamente
     * - Verificación de disponibilidad de casilleros
     * 
     * @param evt Evento de acción que dispara este método
     */
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        // Validar si la cédula ingresada es válida
        if (!Herramientas.ValidarCedula(jTextField8.getText())) {
            // Mostrar un mensaje si la cédula es inválida
            JOptionPane.showMessageDialog(this, "Cédula inválida.");
            return;
        }

        // Verificar si el counter está creado
        if (counter == null) {
            JOptionPane.showMessageDialog(this, "Para modificar clientes primero debe crear un counter.");
            return;
        }

        // Buscar el cliente por cédula en el counter
        Cliente cliente = counter.BuscarClientePorCedula(jTextField8.getText());

        if (cliente == null) {
            // Mostrar un mensaje si no se encuentra el cliente
            JOptionPane.showMessageDialog(this, "No se encontró al cliente asociado.");
            return;
        }

        // Obtener los datos ingresados por el usuario
        String ID = jTextField1.getText();
        String nombre = jTextField2.getText();
        String correo = jTextField3.getText();
        String telefono = jTextField4.getText();
        String direccion = jTextField5.getText();
        String fechaNacimiento = jTextField6.getText();
        String sexoStr = jTextField7.getText();
        boolean sexo;

        // Verificar que no haya campos vacíos
        if (ID.isEmpty() || nombre.isEmpty() || correo.isEmpty() || telefono.isEmpty() || direccion.isEmpty() || fechaNacimiento.isEmpty() || sexoStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Uno o más subcampos están vacíos, digite cada uno de los datos solicitados.");
            return;
        }

        // Validar el formato de la fecha ingresada
        if (!Herramientas.validarFormatoFecha(fechaNacimiento)) {
            JOptionPane.showMessageDialog(this, "Formato de fecha inválida.");
            return;
        }

        // Validar si el sexo es masculino o femenino
        if (!sexoStr.equalsIgnoreCase("Masculino") && !sexoStr.equalsIgnoreCase("Femenino")) {
            JOptionPane.showMessageDialog(this, "Indique correctamente su sexo (masculino o femenino).");
            return;
        }

        // Convertir el valor de sexo a un booleano
        sexo = sexoStr.equalsIgnoreCase("Masculino");

        // Obtener el día, mes y año de la fecha de nacimiento
        int dia = Integer.parseInt(Herramientas.obtenerDia(fechaNacimiento));
        int mes = Integer.parseInt(Herramientas.obtenerMes(fechaNacimiento));
        int año = Integer.parseInt(Herramientas.obtenerAnio(fechaNacimiento));

        // Validar si la fecha de nacimiento es correcta
        if (!Herramientas.ValidarFechas(dia, mes, año)) {
            JOptionPane.showMessageDialog(this, "La fecha de nacimiento es inválida.");
            return;
        }

        // Verificar si hay casilleros disponibles
        if (counter.getNumeroCasilleros() == counter.getClientes().size()) {
            JOptionPane.showMessageDialog(this, "No se pueden añadir más clientes, no hay casilleros disponibles.");
            return;
        }

        // Actualizar los datos del cliente en lugar de eliminarlo y volver a crearlo
        cliente.setCedula(ID);
        cliente.setNombre(nombre);
        cliente.setCorreo(correo);
        cliente.setTelefono(telefono);
        cliente.setDireccion(direccion);

        Calendar fecha = Calendar.getInstance();
        fecha.set(año, mes, dia);
        cliente.setFechaNacimiento(fecha);
        cliente.setSexo(sexo);

        JOptionPane.showMessageDialog(this, "Los datos del cliente han sido actualizados exitosamente.");

        // Actualizar la tabla de clientes en la interfaz gráfica
        cargarDatosEnTabla();

    }//GEN-LAST:event_jButton2ActionPerformed
 
    /**
     * 
     * Verifica que se haya creado un counter, que los datos ingresados en los campos de texto no estén vacíos 
     * y que tengan el formato correcto. Posteriormente, intenta añadir el nuevo cliente al counter, 
     * validando la cédula, correo electrónico, teléfono, sexo, y la fecha de nacimiento.
     * 
     * Validaciones incluidas:
     * 
     * - Cédula, nombre, correo, teléfono, dirección, fecha de nacimiento, y sexo no deben estar vacíos
     * - La fecha de nacimiento debe tener un formato válido
     * - El sexo debe ser "Masculino" o "Femenino"
     * - La fecha de nacimiento debe ser válida
     * - Debe haber casilleros disponibles para asignar al cliente
     * 
     * Si todas las validaciones son exitosas, se añade un nuevo cliente y se muestra un mensaje con los detalles 
     * del cliente añadido. En caso contrario, se muestra un mensaje de error
     * 
     * @param evt Evento de acción que dispara este método
     * 
     */
    
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

         // Verificar si el counter ha sido creado
         
        if (counter == null) {
            JOptionPane.showMessageDialog(this, "Para agregar clientes primero debe crear un counter.");
        } 
        else {
            
            // Obtener los datos ingresados por el usuario
            
            String ID = jTextField1.getText(); 
            String nombre = jTextField2.getText(); 
            String correo = jTextField3.getText();
            String telefono = jTextField4.getText(); 
            String direccion = jTextField5.getText(); 
            String fechaNacimiento = jTextField6.getText(); 
            String sexoStr = jTextField7.getText(); 
            boolean sexo;

            // Verificar si algún campo está vacío
            
            if (ID.isEmpty() || nombre.isEmpty() || correo.isEmpty() || telefono.isEmpty() || direccion.isEmpty() || fechaNacimiento.isEmpty() || sexoStr.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Uno o más subcampos están vacíos, digite cada uno de los datos solicitados.");
            } 
            // Validar el formato de la fecha ingresada
            
            else if (!Herramientas.validarFormatoFecha(fechaNacimiento)) {
                JOptionPane.showMessageDialog(this, "Formato de fecha inválida.");
            } 
            else {
                // Validar si el sexo es masculino o femenino
                
                if (!sexoStr.equalsIgnoreCase("Masculino") && !sexoStr.equalsIgnoreCase("Femenino")) {
                JOptionPane.showMessageDialog(this, "Indique correctamente su sexo (masculino o femenino).");
                }    
                else {
                    // Convertir el valor de sexo a un booleano
                    
                    sexo = sexoStr.equalsIgnoreCase("Masculino");
                    
                    // Obtener el día, mes y año de la fecha de nacimiento
                    
                    int dia = Integer.parseInt(Herramientas.obtenerDia(fechaNacimiento));
                    int mes = Integer.parseInt(Herramientas.obtenerMes(fechaNacimiento));
                    int año = Integer.parseInt(Herramientas.obtenerAnio(fechaNacimiento));

                    // Validar si la fecha de nacimiento es correcta
                    
                    if (!Herramientas.ValidarFechas(dia, mes, año)) {
                        JOptionPane.showMessageDialog(this, "La fecha de nacimiento es inválida.");
                    } 
                    else {
                        
                        // Verificar si hay casilleros disponibles
                        
                        if (counter.getNumeroCasilleros() == counter.getClientes().size()) {
                            JOptionPane.showMessageDialog(this, "No se pueden añadir más clientes, no hay casilleros disponibles.");
                        } 
                        else {
                            
                            // Intentar añadir el nuevo cliente
                            
                            boolean resultado = counter.NuevoCliente(ID, nombre, correo, telefono, dia, mes, año, direccion, sexo);
                    
                            // Si el cliente fue añadido correctamente
                            
                            if (resultado) {
                                JOptionPane.showMessageDialog(this, "Se ha añadido un nuevo cliente al counter. Sus detalles son:\n" + 
                                    "\n* NOMBRE: " + nombre + 
                                    "\n* CEDULA: " + ID + 
                                    "\n* CORREO: " + correo + 
                                    "\n* TELEFONO: " + telefono + 
                                    "\n* DIRECCION: " + direccion + 
                                    "\n* FECHA DE NACIMIENTO: " + fechaNacimiento + 
                                    "\n* SEXO: " + sexoStr);
                                cargarDatosEnTabla(); // Actualizar la tabla de clientes

                                // Limpiar los campos de texto después de agregar al cliente
                                
                                jTextField1.setText(""); 
                                jTextField2.setText(""); 
                                jTextField3.setText("");
                                jTextField4.setText(""); 
                                jTextField5.setText(""); 
                                jTextField6.setText(""); 
                                jTextField7.setText(""); 
                            } 
                            else {
                                JOptionPane.showMessageDialog(this, "Aún hay datos inválidos, verifique el correo, el teléfono y la cédula.");
                            }
                        }
                    }
                }
            }
        }
        
    }//GEN-LAST:event_jButton8ActionPerformed

    /**
     * 
     * Verifica que la cédula ingresada tenga un formato válido y luego busca al cliente correspondiente 
     * en el counter. Si se encuentra, el cliente es eliminado. Si no se encuentra o si la cédula es inválida, 
     * se muestra un mensaje de error
     * 
     * Proceso:
     * - Valida que la cédula tenga un formato correcto
     * - Si la cédula es válida, busca al cliente en el counter
     * - Si se encuentra al cliente, lo elimina y actualiza la tabla de datos
     * - Si no se encuentra al cliente o la cédula es incorrecta, muestra mensajes de error
     * 
     * @param evt Evento de acción que dispara este método
     * 
     */
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
  
        // Validar que la cédula ingresada sea correcta
        
        if (!Herramientas.ValidarCedula(jTextField8.getText())) {
            JOptionPane.showMessageDialog(this, "Cédula inválida.");
        } 
        
        else {
            
            // Buscar cliente por su cédula
            
            Cliente cliente = counter.BuscarClientePorCedula(jTextField8.getText());
     
            // Si el cliente no existe, mostrar mensaje de error
            
            if (cliente == null) {
                JOptionPane.showMessageDialog(this, "No se encontró al cliente asociado.");
            } 
            // Si el cliente existe, eliminarlo
            
            else {
                
                counter.EliminarClientePorCedula(jTextField8.getText());
                JOptionPane.showMessageDialog(this, "Cliente eliminado exitosamente.");
            
                // Actualizar la tabla de clientes
                
                cargarDatosEnTabla();
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        Menu nuevaVentana = new Menu(counter);
        nuevaVentana.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTable1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorAdded
       
    }//GEN-LAST:event_jTable1AncestorAdded

    /**
     * 
     * Método que mediante un botón busca y muesta en la jTable1 la información del cliente asociado
     * 
     */
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String cedula = jTextField8.getText();
        
        if (!Herramientas.ValidarCedula(cedula)){
             JOptionPane.showMessageDialog(this, "La cédula no es válida, intente de nuevo.");
        }
        else{
            
            Cliente cliente = counter.BuscarClientePorCedula(cedula);
            
            if (cliente == null){
            
                 JOptionPane.showMessageDialog(this, "La cédula digitada no pertenece a ningún cliente, intente de nuevo.");
            }
            else{
                  
                JOptionPane.showMessageDialog(this, "Se encontró al cliente.");
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setRowCount(0);
                model.addRow(new Object[]{cliente.getCedula(), cliente.getNumeroCasillero(), cliente.getNombre(), cliente.getCorreo(), cliente.getTelefono(), cliente.getDireccion(), cliente.getFechaFormateada(), cliente.getSexoFormateado()});  
            }
        }  
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
