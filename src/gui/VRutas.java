/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import static java.awt.Color.blue;
import java.io.IOException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.paint.Color;
import javax.swing.BorderFactory;

/**
 *
 * @author alumnogreibd
 */
public class VRutas extends javax.swing.JFrame {

    private aplicacion.FachadaAplicacion fa;

    /**
     * Creates new form VMercado
     */
    public VRutas(aplicacion.FachadaAplicacion fa) {
        this.fa = fa;
        initComponents();
        pulse1.setVisible(false);
        pulse2.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnInicio = new javax.swing.JButton();
        btnRuta = new javax.swing.JButton();
        btnBilletes = new javax.swing.JButton();
        btnMas = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        ruta2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pulse2 = new javax.swing.JLabel();
        pulse1 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(390, 844));
        setResizable(false);
        setSize(new java.awt.Dimension(390, 844));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 714, 390, -1));

        jPanel2.setBackground(new java.awt.Color(153, 216, 221));
        jPanel2.setPreferredSize(new java.awt.Dimension(390, 111));

        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Inicio.png"))); // NOI18N
        btnInicio.setBorderPainted(false);
        btnInicio.setContentAreaFilled(false);
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicio.setFocusable(false);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        btnRuta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mapa.png"))); // NOI18N
        btnRuta.setBorderPainted(false);
        btnRuta.setContentAreaFilled(false);
        btnRuta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRuta.setFocusable(false);
        btnRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRutaActionPerformed(evt);
            }
        });

        btnBilletes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/billetes.png"))); // NOI18N
        btnBilletes.setBorderPainted(false);
        btnBilletes.setContentAreaFilled(false);
        btnBilletes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBilletes.setFocusable(false);
        btnBilletes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBilletesActionPerformed(evt);
            }
        });

        btnMas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Mas.png"))); // NOI18N
        btnMas.setBorderPainted(false);
        btnMas.setContentAreaFilled(false);
        btnMas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMas.setFocusable(false);
        btnMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(btnBilletes, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRuta)
                .addGap(19, 19, 19)
                .addComponent(btnMas, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBilletes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 748, -1, 111));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(390, 844));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Rutas");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 44, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(92, 179, 193));
        jButton2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("RESERVAR BILLETES");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusPainted(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 130, 39));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ruta1.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 270));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 350, 270));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(92, 179, 193));
        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("RESERVAR BILLETES");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 130, 40));

        ruta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ruta2.png"))); // NOI18N
        ruta2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ruta2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ruta2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ruta2MouseExited(evt);
            }
        });
        jPanel5.add(ruta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 350, 270));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("_____________________________________\n");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 340, 20));

        pulse2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pulse2.setText("Pulse para ver más información");
        jPanel3.add(pulse2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 710, -1, 30));

        pulse1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pulse1.setText("Pulse para ver más información");
        jPanel3.add(pulse1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, -1, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBilletesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBilletesActionPerformed
        // TODO add your handling code here:
        fa.vistaBilletes();
        this.dispose();
    }//GEN-LAST:event_btnBilletesActionPerformed

    private void btnRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRutaActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnRutaActionPerformed

    private void btnMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasActionPerformed
        // TODO add your handling code here:
        fa.vistaMas();
        this.dispose();
    }//GEN-LAST:event_btnMasActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        // TODO add your handling code here:
        fa.vistaInicio();
        this.dispose();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            fa.vistaSeleccion("Ruta Cabo do Mundo"
                    + "", this);
            this.setVisible(false);
        } catch (ParseException ex) {
            Logger.getLogger(VRutas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            // TODO add your handling code here:
            fa.vistaSeleccion("Ruta por el cañón del Sil", this);
            this.setVisible(false);
        } catch (ParseException ex) {
            Logger.getLogger(VRutas.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        try {
            // TODO add your handling code here:
            fa.vistaRuta1(this);
        } catch (IOException ex) {
            Logger.getLogger(VRutas.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        // TODO add your handling code here:
        fa.vistaRuta2(this);
        this.setVisible(false);
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        // TODO add your handling code here:
        pulse1.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        // TODO add your handling code here:
        pulse1.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseExited

    private void ruta2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ruta2MouseEntered
        // TODO add your handling code here:
        pulse2.setVisible(true);
    }//GEN-LAST:event_ruta2MouseEntered

    private void ruta2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ruta2MouseExited
        // TODO add your handling code here:
        pulse2.setVisible(false);
    }//GEN-LAST:event_ruta2MouseExited

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            fa.vistaRuta1(this);
        } catch (IOException ex) {
            Logger.getLogger(VRutas.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void ruta2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ruta2MouseClicked
        // TODO add your handling code here:
        fa.vistaRuta2(this);
        this.setVisible(false);
    }//GEN-LAST:event_ruta2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBilletes;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnMas;
    private javax.swing.JButton btnRuta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel pulse1;
    private javax.swing.JLabel pulse2;
    private javax.swing.JLabel ruta2;
    // End of variables declaration//GEN-END:variables

}
