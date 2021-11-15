package igu;

import java.awt.Color;
import javax.swing.JOptionPane;
import logica.Controladora;

public class Principal extends javax.swing.JFrame {
    
    Controladora control;
    
    public Principal(Controladora control) {
        initComponents();
        this.control = control;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtnumeroC = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        txtNombreM = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        txtRaza = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        cboxAlergico = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cboxAtencion = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtNombreDuenio = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        btnAgregar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(21, 41, 124));
        jLabel1.setText("<html><center> Peluqueria</center> <html/>");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 130, 40));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(40, 152, 238));
        jLabel2.setText("CANINA\n\n");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 150, 50));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(27, 114, 218));
        jLabel3.setText("Numero cliente");
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/perro.jpg"))); // NOI18N
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 170, 150));

        txtnumeroC.setBackground(new java.awt.Color(255, 255, 255));
        txtnumeroC.setForeground(new java.awt.Color(224, 224, 224));
        txtnumeroC.setText("Ingrese el numero de cliente");
        txtnumeroC.setBorder(null);
        txtnumeroC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtnumeroCMousePressed(evt);
            }
        });
        txtnumeroC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumeroCActionPerformed(evt);
            }
        });
        bg.add(txtnumeroC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 210, -1));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 210, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(27, 114, 218));
        jLabel5.setText("Nombre mascota");
        bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        txtNombreM.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreM.setForeground(new java.awt.Color(221, 221, 221));
        txtNombreM.setText("Ingrese el nombre");
        txtNombreM.setBorder(null);
        txtNombreM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreMMousePressed(evt);
            }
        });
        txtNombreM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreMActionPerformed(evt);
            }
        });
        bg.add(txtNombreM, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 210, -1));

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 210, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(27, 114, 218));
        jLabel6.setText("Alergico");
        bg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        txtRaza.setBackground(new java.awt.Color(255, 255, 255));
        txtRaza.setForeground(new java.awt.Color(221, 221, 221));
        txtRaza.setText("Ingrese la raza");
        txtRaza.setBorder(null);
        txtRaza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtRazaMousePressed(evt);
            }
        });
        txtRaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRazaActionPerformed(evt);
            }
        });
        bg.add(txtRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 210, -1));

        jSeparator3.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        bg.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 210, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(27, 114, 218));
        jLabel7.setText("Color");
        bg.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        txtColor.setBackground(new java.awt.Color(255, 255, 255));
        txtColor.setForeground(new java.awt.Color(221, 221, 221));
        txtColor.setText("Ingrese el color");
        txtColor.setBorder(null);
        txtColor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtColorMousePressed(evt);
            }
        });
        txtColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColorActionPerformed(evt);
            }
        });
        bg.add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 210, -1));

        jSeparator4.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator4.setForeground(new java.awt.Color(204, 204, 204));
        bg.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 210, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(27, 114, 218));
        jLabel8.setText("Raza");
        bg.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        cboxAlergico.setBackground(new java.awt.Color(255, 255, 255));
        cboxAlergico.setForeground(new java.awt.Color(153, 153, 153));
        cboxAlergico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NO", "SI" }));
        cboxAlergico.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bg.add(cboxAlergico, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(27, 114, 218));
        jLabel9.setText("<html> Atencion <br>especial<html/>");
        bg.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));

        cboxAtencion.setBackground(new java.awt.Color(255, 255, 255));
        cboxAtencion.setForeground(new java.awt.Color(153, 153, 153));
        cboxAtencion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NO", "SI" }));
        cboxAtencion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bg.add(cboxAtencion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, -1, -1));

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(27, 114, 218));
        jLabel10.setText("Nombre dueño");
        bg.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        txtNombreDuenio.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreDuenio.setForeground(new java.awt.Color(221, 221, 221));
        txtNombreDuenio.setText("Ingrese nombre dueño");
        txtNombreDuenio.setBorder(null);
        txtNombreDuenio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreDuenioMousePressed(evt);
            }
        });
        txtNombreDuenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreDuenioActionPerformed(evt);
            }
        });
        bg.add(txtNombreDuenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 210, -1));

        jSeparator5.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator5.setForeground(new java.awt.Color(204, 204, 204));
        bg.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 210, -1));

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(27, 114, 218));
        jLabel11.setText("Celular dueño");
        bg.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        txtCelular.setBackground(new java.awt.Color(255, 255, 255));
        txtCelular.setForeground(new java.awt.Color(221, 221, 221));
        txtCelular.setText("Ingrese numero");
        txtCelular.setBorder(null);
        txtCelular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCelularMousePressed(evt);
            }
        });
        txtCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCelularActionPerformed(evt);
            }
        });
        bg.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 210, -1));

        jSeparator6.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator6.setForeground(new java.awt.Color(204, 204, 204));
        bg.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 210, -1));

        jLabel12.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(27, 114, 218));
        jLabel12.setText("Observaciones");
        bg.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, -1));

        jSeparator7.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        bg.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 462, 490, 10));

        txtObservaciones.setBackground(new java.awt.Color(255, 255, 255));
        txtObservaciones.setColumns(20);
        txtObservaciones.setForeground(new java.awt.Color(221, 221, 221));
        txtObservaciones.setRows(5);
        txtObservaciones.setText("Ingrese las observaciones");
        txtObservaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtObservacionesMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(txtObservaciones);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, -1, 160));

        btnAgregar.setText("Agregar");
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarMouseEntered(evt);
            }
        });
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        bg.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, -1, -1));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        bg.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 490, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 499, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnumeroCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumeroCActionPerformed
        

    }//GEN-LAST:event_txtnumeroCActionPerformed

    private void txtNombreMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreMActionPerformed

    private void txtRazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRazaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRazaActionPerformed

    private void txtColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColorActionPerformed

    private void txtNombreDuenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreDuenioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreDuenioActionPerformed

    private void txtCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelularActionPerformed

    private void txtnumeroCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnumeroCMousePressed
        /**
         * Estos elementos condicionales iran en todos los texfield en su evento
         * de mouse, para dar una respuesta agradable al usuario de eliminar el
         * texto que se encuentra predefinido caundo se de click
         */
        if (txtnumeroC.getText().equals("Ingrese el numero de cliente")) {
            txtnumeroC.setText("");
            txtnumeroC.setForeground(Color.black);
        }
        if (txtNombreM.getText().isEmpty()) {
            txtNombreM.setText("Ingrese el nombre");
            txtNombreM.setForeground(new Color(224, 224, 224, 255));
        }
        if (txtRaza.getText().isEmpty()) {
            txtRaza.setText("Ingrese la raza");
            txtRaza.setForeground(new Color(224, 224, 224, 255));
        }
        if (txtColor.getText().isEmpty()) {
            txtColor.setText("Ingrese el color");
            txtColor.setForeground(new Color(224, 224, 224, 255));
        }
        if (txtNombreDuenio.getText().isEmpty()) {
            txtNombreDuenio.setText("Ingrese nombre dueño");
            txtNombreDuenio.setForeground(new Color(224, 224, 224, 255));
        }
        if (txtCelular.getText().isEmpty()) {
            txtCelular.setText("Ingrese numero");
            txtCelular.setForeground(new Color(224, 224, 224, 255));
        }
        if (txtObservaciones.getText().isEmpty()) {
            txtObservaciones.setText("Ingrese las observaciones");
            txtObservaciones.setForeground(new Color(224, 224, 224, 255));
        }
    }//GEN-LAST:event_txtnumeroCMousePressed

    private void txtNombreMMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMMousePressed
        if (txtNombreM.getText().equals("Ingrese el nombre")) {
            txtNombreM.setText("");
            txtNombreM.setForeground(Color.black);
        }
        
        if (txtnumeroC.getText().isEmpty()) {
            txtnumeroC.setText("Ingrese el numero de cliente");
            txtnumeroC.setForeground(new Color(224, 224, 224, 255));
        }
        if (txtRaza.getText().isEmpty()) {
            txtRaza.setText("Ingrese la raza");
            txtRaza.setForeground(new Color(224, 224, 224, 255));
        }
        if (txtColor.getText().isEmpty()) {
            txtColor.setText("Ingrese el color");
            txtColor.setForeground(new Color(224, 224, 224, 255));
        }
        if (txtNombreDuenio.getText().isEmpty()) {
            txtNombreDuenio.setText("Ingrese nombre dueño");
            txtNombreDuenio.setForeground(new Color(224, 224, 224, 255));
        }
        if (txtCelular.getText().isEmpty()) {
            txtCelular.setText("Ingrese numero");
            txtCelular.setForeground(new Color(224, 224, 224, 255));
        }
        if (txtObservaciones.getText().isEmpty()) {
            txtObservaciones.setText("Ingrese las observaciones");
            txtObservaciones.setForeground(new Color(224, 224, 224, 255));
        }
    }//GEN-LAST:event_txtNombreMMousePressed

    private void txtRazaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRazaMousePressed
        if (txtRaza.getText().equals("Ingrese la raza")) {
            txtRaza.setText("");
            txtRaza.setForeground(Color.black);
        }
        if (txtnumeroC.getText().isEmpty()) {
            txtnumeroC.setText("Ingrese el numero de cliente");
            txtnumeroC.setForeground(new Color(224, 224, 224, 255));
        }
        if (txtNombreM.getText().isEmpty()) {
            txtNombreM.setText("Ingrese el nombre");
            txtNombreM.setForeground(new Color(224, 224, 224, 255));
        }
        if (txtColor.getText().isEmpty()) {
            txtColor.setText("Ingrese el color");
            txtColor.setForeground(new Color(224, 224, 224, 255));
        }
        if (txtNombreDuenio.getText().isEmpty()) {
            txtNombreDuenio.setText("Ingrese nombre dueño");
            txtNombreDuenio.setForeground(new Color(224, 224, 224, 255));
        }
        if (txtCelular.getText().isEmpty()) {
            txtCelular.setText("Ingrese numero");
            txtCelular.setForeground(new Color(224, 224, 224, 255));
        }
        if (txtObservaciones.getText().isEmpty()) {
            txtObservaciones.setText("Ingrese las observaciones");
            txtObservaciones.setForeground(new Color(224, 224, 224, 255));
        }
    }//GEN-LAST:event_txtRazaMousePressed

    private void txtColorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtColorMousePressed
        if (txtColor.getText().equals("Ingrese el color")) {
            txtColor.setText("");
            txtColor.setForeground(Color.black);
        }
        if (txtnumeroC.getText().isEmpty()) {
            txtnumeroC.setText("Ingrese el numero de cliente");
            txtnumeroC.setForeground(new Color(224, 224, 224, 255));
        }
        if (txtNombreM.getText().isEmpty()) {
            txtNombreM.setText("Ingrese el nombre");
            txtNombreM.setForeground(new Color(224, 224, 224, 255));
        }
        if (txtRaza.getText().isEmpty()) {
            txtRaza.setText("Ingrese la raza");
            txtRaza.setForeground(new Color(224, 224, 224, 255));
        }
        if (txtNombreDuenio.getText().isEmpty()) {
            txtNombreDuenio.setText("Ingrese nombre dueño");
            txtNombreDuenio.setForeground(new Color(224, 224, 224, 255));
        }
        if (txtCelular.getText().isEmpty()) {
            txtCelular.setText("Ingrese numero");
            txtCelular.setForeground(new Color(224, 224, 224, 255));
        }
        if (txtObservaciones.getText().isEmpty()) {
            txtObservaciones.setText("Ingrese las observaciones");
            txtObservaciones.setForeground(new Color(224, 224, 224, 255));
        }
    }//GEN-LAST:event_txtColorMousePressed

    private void txtNombreDuenioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreDuenioMousePressed
        if (txtNombreDuenio.getText().equals("Ingrese nombre dueño")) {
            txtNombreDuenio.setText("");
            txtNombreDuenio.setForeground(Color.black);
        }
        if (txtnumeroC.getText().isEmpty()) {
            txtnumeroC.setText("Ingrese el numero de cliente");
            txtnumeroC.setForeground(new Color(224, 224, 224, 255));
        }
        if (txtNombreM.getText().isEmpty()) {
            txtNombreM.setText("Ingrese el nombre");
            txtNombreM.setForeground(new Color(224, 224, 224, 255));
        }
        if (txtRaza.getText().isEmpty()) {
            txtRaza.setText("Ingrese la raza");
            txtRaza.setForeground(new Color(224, 224, 224, 255));
        }
        if (txtColor.getText().isEmpty()) {
            txtColor.setText("Ingrese el color");
            txtColor.setForeground(new Color(224, 224, 224, 255));
        }
        if (txtCelular.getText().isEmpty()) {
            txtCelular.setText("Ingrese numero");
            txtCelular.setForeground(new Color(224, 224, 224, 255));
        }
        if (txtObservaciones.getText().isEmpty()) {
            txtObservaciones.setText("Ingrese las observaciones");
            txtObservaciones.setForeground(new Color(224, 224, 224, 255));
        }
    }//GEN-LAST:event_txtNombreDuenioMousePressed

    private void txtCelularMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCelularMousePressed
        if (txtCelular.getText().equals("Ingrese numero")) {
            txtCelular.setText("");
            txtCelular.setForeground(Color.black);
        }
        if (txtnumeroC.getText().isEmpty()) {
            txtnumeroC.setText("Ingrese el numero de cliente");
            txtnumeroC.setForeground(new Color(224, 224, 224, 255));
        }
        if (txtNombreM.getText().isEmpty()) {
            txtNombreM.setText("Ingrese el nombre");
            txtNombreM.setForeground(new Color(224, 224, 224, 255));
        }
        if (txtRaza.getText().isEmpty()) {
            txtRaza.setText("Ingrese la raza");
            txtRaza.setForeground(new Color(224, 224, 224, 255));
        }
        if (txtColor.getText().isEmpty()) {
            txtColor.setText("Ingrese el color");
            txtColor.setForeground(new Color(224, 224, 224, 255));
        }
        if (txtNombreDuenio.getText().isEmpty()) {
            txtNombreDuenio.setText("Ingrese nombre dueño");
            txtNombreDuenio.setForeground(new Color(224, 224, 224, 255));
        }
        if (txtObservaciones.getText().isEmpty()) {
            txtObservaciones.setText("Ingrese las observaciones");
            txtObservaciones.setForeground(new Color(224, 224, 224, 255));
        }
    }//GEN-LAST:event_txtCelularMousePressed

    private void txtObservacionesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtObservacionesMousePressed
        if (txtObservaciones.getText().equals("Ingrese las observaciones")) {
            txtObservaciones.setText("");
            txtObservaciones.setForeground(Color.black);
        }
        if (txtnumeroC.getText().isEmpty()) {
            txtnumeroC.setText("Ingrese el numero de cliente");
            txtnumeroC.setForeground(new Color(224, 224, 224, 255));
        }
        if (txtNombreM.getText().isEmpty()) {
            txtNombreM.setText("Ingrese el nombre");
            txtNombreM.setForeground(new Color(224, 224, 224, 255));
        }
        if (txtRaza.getText().isEmpty()) {
            txtRaza.setText("Ingrese la raza");
            txtRaza.setForeground(new Color(224, 224, 224, 255));
        }
        if (txtColor.getText().isEmpty()) {
            txtColor.setText("Ingrese el color");
            txtColor.setForeground(new Color(224, 224, 224, 255));
        }
        if (txtNombreDuenio.getText().isEmpty()) {
            txtNombreDuenio.setText("Ingrese nombre dueño");
            txtNombreDuenio.setForeground(new Color(224, 224, 224, 255));
        }
        if (txtCelular.getText().isEmpty()) {
            txtCelular.setText("Ingrese numero");
            txtCelular.setForeground(new Color(224, 224, 224, 255));
        }
    }//GEN-LAST:event_txtObservacionesMousePressed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
       //Se asignan variables que reciben los textos para enviarlos al creador de objetos
        String numCliente = txtnumeroC.getText();
        String nombrePerro = txtNombreM.getText();
        String raza = txtRaza.getText();
        String color = txtColor.getText();
        String nombreDuenio = txtNombreDuenio.getText();
        String celularDuenio = txtCelular.getText();
        String observaciones = txtObservaciones.getText();
        
        //Se inicia la logica para mover los valores String a valores logicos 
        boolean alergico = false;
        boolean atenEspecial = false;
        String al = String.valueOf(cboxAlergico.getSelectedItem());
        String at = String.valueOf(cboxAtencion.getSelectedItem());
        if (al.equals("SI")) {
            alergico = true;
        }
        if (at.equals("SI")) {
            atenEspecial = true;
        }
        
        //Mensajes de joptionpane para informar problemas o correcto funcionamietno
        if((txtnumeroC.getText().equals("Ingrese el numero de cliente"))||(txtNombreM.getText().equals("Ingrese el nombre"))
                || (txtRaza.getText().equals("Ingrese la raza"))||(txtColor.getText().equals("Ingrese el color"))
                || (txtNombreDuenio.getText().equals("Ingrese nombre dueño"))||(txtCelular.getText().equals("Ingrese numero"))||
                (txtObservaciones.getText().equals("Ingrese las observaciones")))
        {
            JOptionPane.showConfirmDialog(rootPane, "Por favor complete todos los datos", "Falta de datos", JOptionPane.WARNING_MESSAGE);
        }
        else{
        control.crearPerro(numCliente, nombrePerro, raza, color, alergico, atenEspecial, nombreDuenio, celularDuenio, observaciones);
        JOptionPane.showMessageDialog(rootPane, "Los datos han sigo agregados exitosamente", "Inscripcion exitosa", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtCelular.setText("Ingrese numero");
        txtCelular.setForeground(new Color(224, 224, 224, 255));
        txtColor.setText("Ingrese el color");
        txtColor.setForeground(new Color(224, 224, 224, 255));
        txtNombreDuenio.setText("Ingrese nombre dueño");
        txtNombreDuenio.setForeground(new Color(224, 224, 224, 255));
        txtNombreM.setText("Ingrese el nombre");
        txtNombreM.setForeground(new Color(224, 224, 224, 255));
        txtObservaciones.setText("Ingrese las observaciones");
        txtObservaciones.setForeground(new Color(224, 224, 224, 255));
        txtRaza.setText("Ingrese la raza");
        txtRaza.setForeground(new Color(224, 224, 224, 255));
        txtnumeroC.setText("Ingrese el numero de cliente");
        txtnumeroC.setForeground(new Color(224, 224, 224, 255));
        cboxAlergico.setSelectedIndex(0);
        cboxAtencion.setSelectedIndex(0);

    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseEntered
        
    }//GEN-LAST:event_btnAgregarMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cboxAlergico;
    private javax.swing.JComboBox<String> cboxAtencion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtNombreDuenio;
    private javax.swing.JTextField txtNombreM;
    private javax.swing.JTextArea txtObservaciones;
    private javax.swing.JTextField txtRaza;
    private javax.swing.JTextField txtnumeroC;
    // End of variables declaration//GEN-END:variables
}
