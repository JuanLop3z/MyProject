
package com.Frame;

import java.awt.Color;



public class registroUsuario extends javax.swing.JFrame {
    int xMouse, yMouse;
    public registroUsuario() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        cerrarBtn = new javax.swing.JPanel();
        cerrarTxt = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        usuarioCrearNombretxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        aceptarBtn = new javax.swing.JPanel();
        aceptarTxt = new javax.swing.JLabel();
        cancelarBtn = new javax.swing.JPanel();
        cancelarTxt = new javax.swing.JLabel();
        usuarioCrearContraseñaTxt = new javax.swing.JPasswordField();
        contraseñaConfirmarTxt = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();

        setUndecorated(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel2.setForeground(new java.awt.Color(204, 204, 204));
        jPanel2.setPreferredSize(new java.awt.Dimension(370, 434));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cerrarBtn.setBackground(new java.awt.Color(255, 255, 255));

        cerrarTxt.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cerrarTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cerrarTxt.setText("x");
        cerrarTxt.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                cerrarTxtMouseDragged(evt);
            }
        });
        cerrarTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cerrarTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cerrarTxtMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cerrarTxtMousePressed(evt);
            }
        });

        javax.swing.GroupLayout cerrarBtnLayout = new javax.swing.GroupLayout(cerrarBtn);
        cerrarBtn.setLayout(cerrarBtnLayout);
        cerrarBtnLayout.setHorizontalGroup(
            cerrarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cerrarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );
        cerrarBtnLayout.setVerticalGroup(
            cerrarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cerrarBtnLayout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(cerrarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(cerrarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Contraseña");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel3.setText("Registro de usuario");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Nombre de usuario");
        jLabel4.setInheritsPopupMenu(false);
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Confirmar contraseña");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\JuanSebastianLopezGa\\Documents\\NetBeansProjects\\ProyectoInventario\\src\\main\\java\\com\\Imagenes\\whatsappIconoPequeño.png")); // NOI18N
        jLabel6.setText("Nombre de la empresa");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        usuarioCrearNombretxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        usuarioCrearNombretxt.setForeground(new java.awt.Color(153, 153, 153));
        usuarioCrearNombretxt.setText("Digite su nombre de usuario");
        usuarioCrearNombretxt.setBorder(null);
        usuarioCrearNombretxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usuarioCrearNombretxtMousePressed(evt);
            }
        });
        usuarioCrearNombretxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioCrearNombretxtActionPerformed(evt);
            }
        });
        jPanel2.add(usuarioCrearNombretxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 220, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\JuanSebastianLopezGa\\Documents\\NetBeansProjects\\ProyectoInventario\\src\\main\\java\\com\\Imagenes\\fondoLogin.jpg")); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 370, 60));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 220, 10));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 220, 10));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 220, 10));

        aceptarBtn.setBackground(new java.awt.Color(27, 17, 88));
        aceptarBtn.setMaximumSize(new java.awt.Dimension(39, 20));
        aceptarBtn.setMinimumSize(new java.awt.Dimension(39, 20));
        aceptarBtn.setPreferredSize(new java.awt.Dimension(90, 30));

        aceptarTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        aceptarTxt.setForeground(new java.awt.Color(255, 255, 255));
        aceptarTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aceptarTxt.setText("Aceptar");
        aceptarTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aceptarTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aceptarTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout aceptarBtnLayout = new javax.swing.GroupLayout(aceptarBtn);
        aceptarBtn.setLayout(aceptarBtnLayout);
        aceptarBtnLayout.setHorizontalGroup(
            aceptarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, aceptarBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(aceptarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        aceptarBtnLayout.setVerticalGroup(
            aceptarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, aceptarBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(aceptarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(aceptarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, 30));

        cancelarBtn.setBackground(new java.awt.Color(27, 17, 88));
        cancelarBtn.setMaximumSize(new java.awt.Dimension(90, 30));
        cancelarBtn.setMinimumSize(new java.awt.Dimension(90, 30));
        cancelarBtn.setPreferredSize(new java.awt.Dimension(90, 30));

        cancelarTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancelarTxt.setForeground(new java.awt.Color(255, 255, 255));
        cancelarTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancelarTxt.setText("Cancelar");
        cancelarTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelarTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelarTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout cancelarBtnLayout = new javax.swing.GroupLayout(cancelarBtn);
        cancelarBtn.setLayout(cancelarBtnLayout);
        cancelarBtnLayout.setHorizontalGroup(
            cancelarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cancelarBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cancelarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        cancelarBtnLayout.setVerticalGroup(
            cancelarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cancelarBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cancelarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(cancelarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, -1, 30));

        usuarioCrearContraseñaTxt.setForeground(new java.awt.Color(153, 153, 153));
        usuarioCrearContraseñaTxt.setText("*************");
        usuarioCrearContraseñaTxt.setBorder(null);
        usuarioCrearContraseñaTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usuarioCrearContraseñaTxtMousePressed(evt);
            }
        });
        jPanel2.add(usuarioCrearContraseñaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 220, -1));

        contraseñaConfirmarTxt.setForeground(new java.awt.Color(153, 153, 153));
        contraseñaConfirmarTxt.setText("*************");
        contraseñaConfirmarTxt.setBorder(null);
        contraseñaConfirmarTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                contraseñaConfirmarTxtMousePressed(evt);
            }
        });
        jPanel2.add(contraseñaConfirmarTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 220, -1));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\JuanSebastianLopezGa\\Documents\\NetBeansProjects\\ProyectoInventario\\src\\main\\java\\com\\Imagenes\\IconoBarra.png")); // NOI18N
        jLabel7.setText("Registro de Usuario-Inventario");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 330, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioCrearNombretxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioCrearNombretxtActionPerformed
        String nombreUsuario, contraseñaUsuario;
        nombreUsuario = usuarioCrearNombretxt.getText();
        contraseñaUsuario = usuarioCrearContraseñaTxt.getText();
    }//GEN-LAST:event_usuarioCrearNombretxtActionPerformed

    private void cerrarTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarTxtMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_cerrarTxtMousePressed

    private void cerrarTxtMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarTxtMouseDragged
        int x = evt.getXOnScreen();
        int y = evt .getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_cerrarTxtMouseDragged

    private void cerrarTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarTxtMouseClicked
        this.dispose();
    }//GEN-LAST:event_cerrarTxtMouseClicked

    private void cerrarTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarTxtMouseEntered
        cerrarBtn.setBackground(Color.red);
        cerrarTxt.setForeground(Color.white);
    }//GEN-LAST:event_cerrarTxtMouseEntered

    private void cerrarTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarTxtMouseExited
        cerrarBtn.setBackground(Color.white);
        cerrarTxt.setForeground(Color.black);
    }//GEN-LAST:event_cerrarTxtMouseExited

    private void aceptarTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aceptarTxtMouseEntered
        aceptarBtn.setBackground(new Color(52,29,182));
    }//GEN-LAST:event_aceptarTxtMouseEntered

    private void aceptarTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aceptarTxtMouseExited
        aceptarBtn.setBackground(new Color(27,17,88));
    }//GEN-LAST:event_aceptarTxtMouseExited

    private void cancelarTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarTxtMouseEntered
        cancelarBtn.setBackground(new Color(52,29,182));
    }//GEN-LAST:event_cancelarTxtMouseEntered

    private void cancelarTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarTxtMouseExited
        cancelarBtn.setBackground(new Color(27,17,88));
    }//GEN-LAST:event_cancelarTxtMouseExited

    private void usuarioCrearNombretxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioCrearNombretxtMousePressed
        if (usuarioCrearNombretxt.getText().equals("Digite su nombre de usuario")){
            usuarioCrearNombretxt.setText("");
            usuarioCrearNombretxt.setForeground(Color.black);
        }
        if (String.valueOf(usuarioCrearContraseñaTxt.getPassword()).isEmpty()) {
            usuarioCrearContraseñaTxt.setText("*************");
            usuarioCrearContraseñaTxt.setForeground(Color.gray);
        }
        if (String.valueOf(contraseñaConfirmarTxt.getPassword()).isEmpty()) {
            contraseñaConfirmarTxt.setText("*************");
            contraseñaConfirmarTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_usuarioCrearNombretxtMousePressed

    private void usuarioCrearContraseñaTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioCrearContraseñaTxtMousePressed
        if (usuarioCrearNombretxt.getText().isEmpty()){
            usuarioCrearNombretxt.setText("Digite su nombre de usuario");
            usuarioCrearNombretxt.setForeground(Color.gray);
        }
        if (String.valueOf(usuarioCrearContraseñaTxt.getPassword()).equals("*************")) {
            usuarioCrearContraseñaTxt.setText("");
            usuarioCrearContraseñaTxt.setForeground(Color.black);
        }
        if (String.valueOf(contraseñaConfirmarTxt.getPassword()).isEmpty()) {
            contraseñaConfirmarTxt.setText("*************");
            contraseñaConfirmarTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_usuarioCrearContraseñaTxtMousePressed

    private void contraseñaConfirmarTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contraseñaConfirmarTxtMousePressed
        if (String.valueOf(contraseñaConfirmarTxt.getPassword()).equals("*************")){
            contraseñaConfirmarTxt.setText("");
            contraseñaConfirmarTxt.setForeground(Color.black);
        }
        if (usuarioCrearNombretxt.getText().isEmpty()){
            usuarioCrearNombretxt.setText("Digite su nombre de usuario");
            usuarioCrearNombretxt.setForeground(Color.gray);
        }
        if (String.valueOf(usuarioCrearContraseñaTxt.getPassword()).isEmpty()) {
            usuarioCrearContraseñaTxt.setText("*************");
            usuarioCrearContraseñaTxt.setForeground(Color.gray);
        }
        
        
    }//GEN-LAST:event_contraseñaConfirmarTxtMousePressed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(registroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel aceptarBtn;
    private javax.swing.JLabel aceptarTxt;
    private javax.swing.JPanel cancelarBtn;
    private javax.swing.JLabel cancelarTxt;
    private javax.swing.JPanel cerrarBtn;
    private javax.swing.JLabel cerrarTxt;
    private javax.swing.JPasswordField contraseñaConfirmarTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPasswordField usuarioCrearContraseñaTxt;
    private javax.swing.JTextField usuarioCrearNombretxt;
    // End of variables declaration//GEN-END:variables
}
