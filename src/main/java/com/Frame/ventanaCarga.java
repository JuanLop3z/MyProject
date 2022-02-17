/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.Frame;

import java.awt.Color;

/**
 *
 * @author JuanSebastianLopezGa
 */
public class ventanaCarga extends javax.swing.JFrame {
        int xMouse, yMouse;
    public ventanaCarga() {
        initComponents();
        setLocationRelativeTo(null);
    }
        

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cerrarBtn = new javax.swing.JPanel();
        cerrarTxt = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\JuanSebastianLopezGa\\Documents\\NetBeansProjects\\ProyectoInventario\\src\\main\\java\\com\\Imagenes\\IconoBarra.png")); // NOI18N
        jLabel2.setText("Inventario");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel1.add(cerrarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 20));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\JuanSebastianLopezGa\\Documents\\NetBeansProjects\\ProyectoInventario\\src\\main\\java\\com\\Imagenes\\cargarInicio.gif")); // NOI18N
        jLabel3.setText("Cargando Componentes");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 210, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\JuanSebastianLopezGa\\Documents\\NetBeansProjects\\ProyectoInventario\\src\\main\\java\\com\\Imagenes\\IconoBarra.png")); // NOI18N
        jLabel4.setText("Inventario");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 160, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void cerrarTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarTxtMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_cerrarTxtMousePressed

    private void cerrarTxtMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarTxtMouseDragged
        int x = evt.getXOnScreen();
        int y = evt .getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_cerrarTxtMouseDragged

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
            java.util.logging.Logger.getLogger(ventanaCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaCarga().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cerrarBtn;
    private javax.swing.JLabel cerrarTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
