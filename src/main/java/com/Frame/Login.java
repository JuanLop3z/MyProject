
package com.Frame;

import java.awt.Color;


public class Login extends javax.swing.JFrame {
    int xMouse, yMouse;
    public Login() {
        initComponents();
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
        cancelarBtn = new javax.swing.JPanel();
        cancelarTxt = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        Fondologin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusableWindowState(false);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cerrarBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cerrarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        cerrarBtnLayout.setVerticalGroup(
            cerrarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cerrarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE)
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

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\JuanSebastianLopezGa\\Documents\\NetBeansProjects\\ProyectoInventario\\src\\main\\java\\com.Imagenes\\social_media_logo_whatsapp_icon-icons.com_59066_1.png")); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, 130, 140));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Inicio de sesion");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel3.setText("Usuario");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\JuanSebastianLopezGa\\Documents\\NetBeansProjects\\ProyectoInventario\\src\\main\\java\\com.Imagenes\\social_media_logo_whatsapp_icon-icons.com_59066.png")); // NOI18N
        jLabel4.setText("Logo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel5.setText("Contraseña");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 310, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 320, 10));

        entrarBtn.setBackground(new java.awt.Color(42, 81, 138));
        entrarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        entrarBtn.setPreferredSize(new java.awt.Dimension(80, 20));

        entrarTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
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
            .addComponent(entrarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        entrarBtnLayout.setVerticalGroup(
            entrarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(entrarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(entrarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 90, 30));

        cancelarBtn.setBackground(new java.awt.Color(42, 81, 138));

        cancelarTxt.setBackground(new java.awt.Color(42, 81, 138));
        cancelarTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancelarTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancelarTxt.setText("Cancelar");
        cancelarTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelarTxt.setPreferredSize(new java.awt.Dimension(55, 20));
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
            .addComponent(cancelarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        cancelarBtnLayout.setVerticalGroup(
            cancelarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cancelarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(cancelarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 90, 30));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("¿Registrate?");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 80, 20));

        Fondologin.setIcon(new javax.swing.ImageIcon("C:\\Users\\JuanSebastianLopezGa\\Documents\\NetBeansProjects\\ProyectoInventario\\src\\main\\java\\com.Imagenes\\IMG_2965-1.jpg")); // NOI18N
        jPanel1.add(Fondologin, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 310, 470));

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

    private void nombreUsuariotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreUsuariotxtActionPerformed
        String nombreUsuario, contraseñaUsuario;
        nombreUsuario = nombreUsuariotxt.getText();
        contraseñaUsuario = contraseñaUsuariotxt.getText();
        
    }//GEN-LAST:event_nombreUsuariotxtActionPerformed

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
        cerrarTxt.setBackground(Color.white);
    }//GEN-LAST:event_cerrarTxtMouseEntered

    private void cerrarTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarTxtMouseExited
        cerrarBtn.setBackground(Color.white);
        cerrarTxt.setBackground(Color.black);
    }//GEN-LAST:event_cerrarTxtMouseExited

    private void entrarTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarTxtMouseEntered
        entrarBtn.setBackground(new Color(42,113,183));
    }//GEN-LAST:event_entrarTxtMouseEntered

    private void entrarTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarTxtMouseExited
        entrarBtn.setBackground(new Color(42,81,138));
    }//GEN-LAST:event_entrarTxtMouseExited

    private void cancelarTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarTxtMouseEntered
        cancelarBtn.setBackground(new Color(42,113,183));
    }//GEN-LAST:event_cancelarTxtMouseEntered

    private void cancelarTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarTxtMouseExited
        cancelarBtn.setBackground(new Color(42,81,138));
    }//GEN-LAST:event_cancelarTxtMouseExited

    private void nombreUsuariotxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreUsuariotxtMousePressed
        nombreUsuariotxt.setText("");
        nombreUsuariotxt.setForeground(Color.black);
        contraseñaUsuariotxt.setText("*************");
        contraseñaUsuariotxt.setForeground(Color.gray);
    }//GEN-LAST:event_nombreUsuariotxtMousePressed

    private void contraseñaUsuariotxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contraseñaUsuariotxtMousePressed
        nombreUsuariotxt.setText("Ingrese su nombre de usuario");
        nombreUsuariotxt.setForeground(Color.gray);
        contraseñaUsuariotxt.setText("");
        contraseñaUsuariotxt.setForeground(Color.black);
    }//GEN-LAST:event_contraseñaUsuariotxtMousePressed

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
    private javax.swing.JPanel cancelarBtn;
    private javax.swing.JLabel cancelarTxt;
    private javax.swing.JPanel cerrarBtn;
    private javax.swing.JLabel cerrarTxt;
    private javax.swing.JPasswordField contraseñaUsuariotxt;
    private javax.swing.JPanel entrarBtn;
    private javax.swing.JLabel entrarTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField nombreUsuariotxt;
    // End of variables declaration//GEN-END:variables
}
