
package com.Frame;

import java.awt.Color;


public class Login extends javax.swing.JFrame {
    public boolean mostrar = true;
    
    int xMouse, yMouse;
    public Login() {
        initComponents();
        contraseñaUsuariotxt.setVisible(true);
        contraseñaVisualizadorTxt.setVisible(false);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cerrarBtn = new javax.swing.JPanel();
        cerrarTxt = new javax.swing.JLabel();
        nombreUsuariotxt = new javax.swing.JTextField();
        contraseñaUsuariotxt = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        entrarBtn = new javax.swing.JPanel();
        entrarTxt = new javax.swing.JLabel();
        salirBtn = new javax.swing.JPanel();
        salirTxt = new javax.swing.JLabel();
        registroUsuarioBtn = new javax.swing.JPanel();
        registroUsuarioTxt = new javax.swing.JLabel();
        Fondologin = new javax.swing.JLabel();
        claveVisible = new javax.swing.JButton();
        contraseñaVisualizadorTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cerrarBtn.setBackground(new java.awt.Color(255, 255, 255));
        cerrarBtn.setForeground(new java.awt.Color(255, 255, 255));

        cerrarTxt.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cerrarTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cerrarTxt.setText("x");
        cerrarTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
            .addGroup(cerrarBtnLayout.createSequentialGroup()
                .addComponent(cerrarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cerrarBtnLayout.setVerticalGroup(
            cerrarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cerrarBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cerrarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(cerrarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        nombreUsuariotxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nombreUsuariotxt.setForeground(new java.awt.Color(153, 153, 153));
        nombreUsuariotxt.setText("Ingrese su nombre de usuario");
        nombreUsuariotxt.setBorder(null);
        nombreUsuariotxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nombreUsuariotxtMousePressed(evt);
            }
        });
        nombreUsuariotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreUsuariotxtActionPerformed(evt);
            }
        });
        jPanel1.add(nombreUsuariotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 320, 30));

        contraseñaUsuariotxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        contraseñaUsuariotxt.setForeground(new java.awt.Color(153, 153, 153));
        contraseñaUsuariotxt.setText("*************");
        contraseñaUsuariotxt.setBorder(null);
        contraseñaUsuariotxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                contraseñaUsuariotxtMousePressed(evt);
            }
        });
        jPanel1.add(contraseñaUsuariotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 310, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Su empresa");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, 90, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\ProyectoInventario\\src\\main\\java\\com.Imagenes\\whatsappIconoGrande.png")); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, 130, 140));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Inicio de sesion");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 190, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel3.setText("Usuario");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\ProyectoInventario\\src\\main\\java\\com.Imagenes\\whatsappIconoPequeño.png")); // NOI18N
        jLabel4.setText("Logo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel5.setText("Contraseña");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 310, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 320, 10));

        entrarBtn.setBackground(new java.awt.Color(27, 17, 88));
        entrarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        entrarBtn.setPreferredSize(new java.awt.Dimension(80, 20));

        entrarTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        entrarTxt.setForeground(new java.awt.Color(255, 255, 255));
        entrarTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        entrarTxt.setText("Entrar");
        entrarTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                entrarTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                entrarTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout entrarBtnLayout = new javax.swing.GroupLayout(entrarBtn);
        entrarBtn.setLayout(entrarBtnLayout);
        entrarBtnLayout.setHorizontalGroup(
            entrarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(entrarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        entrarBtnLayout.setVerticalGroup(
            entrarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(entrarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(entrarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 90, 30));

        salirBtn.setBackground(new java.awt.Color(27, 17, 88));

        salirTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        salirTxt.setForeground(new java.awt.Color(255, 255, 255));
        salirTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salirTxt.setText("Salir");
        salirTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salirTxt.setPreferredSize(new java.awt.Dimension(55, 20));
        salirTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salirTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salirTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout salirBtnLayout = new javax.swing.GroupLayout(salirBtn);
        salirBtn.setLayout(salirBtnLayout);
        salirBtnLayout.setHorizontalGroup(
            salirBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(salirTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        salirBtnLayout.setVerticalGroup(
            salirBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(salirTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(salirBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 90, 30));

        registroUsuarioBtn.setBackground(new java.awt.Color(255, 255, 255));
        registroUsuarioBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        registroUsuarioTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        registroUsuarioTxt.setForeground(new java.awt.Color(102, 102, 102));
        registroUsuarioTxt.setText("Registra tu usuario");
        registroUsuarioTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registroUsuarioTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registroUsuarioTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registroUsuarioTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout registroUsuarioBtnLayout = new javax.swing.GroupLayout(registroUsuarioBtn);
        registroUsuarioBtn.setLayout(registroUsuarioBtnLayout);
        registroUsuarioBtnLayout.setHorizontalGroup(
            registroUsuarioBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registroUsuarioBtnLayout.createSequentialGroup()
                .addComponent(registroUsuarioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );
        registroUsuarioBtnLayout.setVerticalGroup(
            registroUsuarioBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registroUsuarioBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(registroUsuarioTxt))
        );

        jPanel1.add(registroUsuarioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 130, 20));

        Fondologin.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\ProyectoInventario\\src\\main\\java\\com.Imagenes\\fondoLogin.jpg")); // NOI18N
        jPanel1.add(Fondologin, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 310, 470));

        claveVisible.setBackground(new java.awt.Color(255, 255, 255));
        claveVisible.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\ProyectoInventario\\src\\main\\java\\com.Imagenes\\ojoVisible.png")); // NOI18N
        claveVisible.setBorder(null);
        claveVisible.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                claveVisibleMousePressed(evt);
            }
        });
        claveVisible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                claveVisibleActionPerformed(evt);
            }
        });
        jPanel1.add(claveVisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 40, 30));

        contraseñaVisualizadorTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        contraseñaVisualizadorTxt.setBorder(null);
        contraseñaVisualizadorTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseñaVisualizadorTxtActionPerformed(evt);
            }
        });
        jPanel1.add(contraseñaVisualizadorTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 310, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarTxtMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
        
    }//GEN-LAST:event_cerrarTxtMousePressed

    private void cerrarTxtMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarTxtMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_cerrarTxtMouseDragged

    private void cerrarTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarTxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_cerrarTxtMouseClicked

    private void cerrarTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarTxtMouseEntered
        cerrarBtn.setBackground(Color.red);
        cerrarTxt.setForeground(Color.white);
    }//GEN-LAST:event_cerrarTxtMouseEntered

    private void cerrarTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarTxtMouseExited
        cerrarBtn.setBackground(Color.white);
        cerrarTxt.setForeground(Color.black);
    }//GEN-LAST:event_cerrarTxtMouseExited

    private void entrarTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarTxtMouseEntered
        entrarBtn.setBackground(new Color(52,29,182));
    }//GEN-LAST:event_entrarTxtMouseEntered

    private void entrarTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarTxtMouseExited
        entrarBtn.setBackground(new Color(27,17,88));
    }//GEN-LAST:event_entrarTxtMouseExited

    private void salirTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirTxtMouseEntered
        salirBtn.setBackground(new Color(52,29,182));
    }//GEN-LAST:event_salirTxtMouseEntered

    private void salirTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirTxtMouseExited
        salirBtn.setBackground(new Color(27,17,88));
    }//GEN-LAST:event_salirTxtMouseExited

    private void contraseñaUsuariotxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contraseñaUsuariotxtMousePressed
        if (nombreUsuariotxt.getText().isEmpty()){
            nombreUsuariotxt.setText("Ingrese su nombre de usuario");
            nombreUsuariotxt.setForeground(Color.gray);
        }
        if (String.valueOf(contraseñaUsuariotxt.getPassword()).equals("*************")) {
            contraseñaUsuariotxt.setText("");
            contraseñaUsuariotxt.setForeground(Color.black);
        }
    }//GEN-LAST:event_contraseñaUsuariotxtMousePressed

    private void nombreUsuariotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreUsuariotxtActionPerformed
        String nombreUsuario, contraseñaUsuario;
        nombreUsuario = nombreUsuariotxt.getText();
        contraseñaUsuario = contraseñaUsuariotxt.getText();
    }//GEN-LAST:event_nombreUsuariotxtActionPerformed

    private void nombreUsuariotxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreUsuariotxtMousePressed
        if (nombreUsuariotxt.getText().equals("Ingrese su nombre de usuario")){
            nombreUsuariotxt.setText("");
            nombreUsuariotxt.setForeground(Color.black);
        }
        if (String.valueOf(contraseñaUsuariotxt.getPassword()).isEmpty()) {
            contraseñaUsuariotxt.setText("*************");
            contraseñaUsuariotxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_nombreUsuariotxtMousePressed

    private void claveVisibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_claveVisibleActionPerformed
        if (mostrar) {
            contraseñaUsuariotxt.setVisible(true);
            contraseñaVisualizadorTxt.setVisible(false);
            contraseñaVisualizadorTxt.setText(contraseñaUsuariotxt.getText());
            mostrar = false;
        }
        else{
            contraseñaUsuariotxt.setVisible(false);
            contraseñaVisualizadorTxt.setVisible(true);
            contraseñaUsuariotxt.setText(contraseñaVisualizadorTxt.getText());
            mostrar = true;
        }    

    }//GEN-LAST:event_claveVisibleActionPerformed

    private void registroUsuarioTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registroUsuarioTxtMouseEntered
        registroUsuarioTxt.setForeground(Color.black);
    }//GEN-LAST:event_registroUsuarioTxtMouseEntered

    private void registroUsuarioTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registroUsuarioTxtMouseExited
        registroUsuarioTxt.setForeground(Color.gray);
    }//GEN-LAST:event_registroUsuarioTxtMouseExited

    private void contraseñaVisualizadorTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaVisualizadorTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraseñaVisualizadorTxtActionPerformed

    private void claveVisibleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_claveVisibleMousePressed

    }//GEN-LAST:event_claveVisibleMousePressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondologin;
    private javax.swing.JPanel cerrarBtn;
    private javax.swing.JLabel cerrarTxt;
    private javax.swing.JButton claveVisible;
    private javax.swing.JPasswordField contraseñaUsuariotxt;
    private javax.swing.JTextField contraseñaVisualizadorTxt;
    private javax.swing.JPanel entrarBtn;
    private javax.swing.JLabel entrarTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField nombreUsuariotxt;
    private javax.swing.JPanel registroUsuarioBtn;
    private javax.swing.JLabel registroUsuarioTxt;
    private javax.swing.JPanel salirBtn;
    private javax.swing.JLabel salirTxt;
    // End of variables declaration//GEN-END:variables
}
