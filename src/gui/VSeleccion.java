/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import aplicacion.Reserva;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonModel;

/**
 *
 * @author alumnogreibd
 */
public class VSeleccion extends javax.swing.JFrame {

    private aplicacion.FachadaAplicacion fa;
    private java.awt.Frame parent;

    /**
     * Creates new form VMercado
     */
    public VSeleccion(aplicacion.FachadaAplicacion fa, String ruta, java.awt.Frame parent) throws ParseException {
        this.fa = fa;
        this.parent = parent;
        initComponents();
        if (!ruta.isEmpty()) {
            if (ruta.equals("Ruta Cabo do Mundo")) {
                boxRuta.setSelectedItem("Ruta Cabo do Mundo");
                btnInfo.setVisible(true);
            } else {
                boxRuta.setSelectedItem("Ruta por el cañón del Sil");
                btnInfo.setVisible(true);
            }

        } else {
            btnInfo.setVisible(false);
            boxRuta.setSelectedIndex(0);
        }

        Date today = new Date();
        Date max = new Date();
        max.setYear(max.getYear() + 1);

        calendario.setDate(today);
        calendario.setMinSelectableDate(today);
        calendario.setMaxSelectableDate(max);
        SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");
        txtfecha.setText(fecha.format(today));

        grupoBotones.add(btnIndv);
        ButtonModel modelo = btnIndv.getModel();
        grupoBotones.add(btnGrupo);
        grupoBotones.setSelected(modelo, true);
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
        buttonGroup1 = new javax.swing.ButtonGroup();
        grupoBotones = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        panelFondo = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnInfo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        boxRuta = new javax.swing.JComboBox<>();
        cerrar = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        reservar = new javax.swing.JButton();
        boxHora = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnIndv = new javax.swing.JRadioButton();
        btnGrupo = new javax.swing.JRadioButton();
        calendario = new com.toedter.calendar.JCalendar();
        jLabel5 = new javax.swing.JLabel();
        txtfecha = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

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

        panelFondo.setBackground(new java.awt.Color(255, 255, 255));
        panelFondo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        panelFondo.setPreferredSize(new java.awt.Dimension(390, 844));
        panelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ayuda2.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panelFondo.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 760, 60, 60));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("_____________________________________\n");
        panelFondo.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 340, 20));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/grupo2.png"))); // NOI18N
        panelFondo.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 690, 50, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/usuario1.png"))); // NOI18N
        panelFondo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 640, 40, 40));

        btnInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/informacion.png"))); // NOI18N
        btnInfo.setBorderPainted(false);
        btnInfo.setContentAreaFilled(false);
        btnInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInfo.setFocusable(false);
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });
        panelFondo.add(btnInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 50, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Selección de Ruta");
        panelFondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        boxRuta.setBackground(new java.awt.Color(1, 88, 122));
        boxRuta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        boxRuta.setForeground(new java.awt.Color(255, 255, 255));
        boxRuta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Ruta", "Ruta por el cañón del Sil", "Ruta Cabo do Mundo" }));
        boxRuta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boxRuta.setFocusable(false);
        boxRuta.setRequestFocusEnabled(false);
        boxRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxRutaActionPerformed(evt);
            }
        });
        panelFondo.add(boxRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 270, 43));

        cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cerrar.png"))); // NOI18N
        cerrar.setBorderPainted(false);
        cerrar.setContentAreaFilled(false);
        cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrar.setFocusable(false);
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });
        panelFondo.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 40, 30));

        volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/volver.png"))); // NOI18N
        volver.setBorderPainted(false);
        volver.setContentAreaFilled(false);
        volver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        volver.setFocusable(false);
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        panelFondo.add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 40, -1));

        reservar.setBackground(new java.awt.Color(255, 255, 255));
        reservar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        reservar.setText("Reservar");
        reservar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 88, 122), 2));
        reservar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reservar.setFocusPainted(false);
        reservar.setFocusable(false);
        reservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservarActionPerformed(evt);
            }
        });
        panelFondo.add(reservar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 770, 140, 40));

        boxHora.setBackground(new java.awt.Color(1, 88, 122));
        boxHora.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        boxHora.setForeground(new java.awt.Color(255, 255, 255));
        boxHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9:00", "12:00", "17:00" }));
        boxHora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boxHora.setFocusable(false);
        boxHora.setRequestFocusEnabled(false);
        boxHora.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                boxHoraItemStateChanged(evt);
            }
        });
        boxHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxHoraActionPerformed(evt);
            }
        });
        panelFondo.add(boxHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 140, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(16, 137, 177));
        jLabel2.setText("Seleccione el día de la reserva");
        panelFondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(16, 137, 177));
        jLabel3.setText("Seleccione la ruta a reservar");
        panelFondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(16, 137, 177));
        jLabel4.setText("Tipo de entradas");
        panelFondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, -1, -1));

        btnIndv.setBackground(new java.awt.Color(1, 88, 122));
        btnIndv.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnIndv.setForeground(new java.awt.Color(255, 255, 255));
        btnIndv.setText("Individuales");
        btnIndv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelFondo.add(btnIndv, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, 260, 40));

        btnGrupo.setBackground(new java.awt.Color(1, 88, 122));
        btnGrupo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnGrupo.setForeground(new java.awt.Color(255, 255, 255));
        btnGrupo.setText("De grupo ( +10 personas)");
        btnGrupo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelFondo.add(btnGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 690, 260, 40));

        calendario.setBackground(new java.awt.Color(255, 255, 255));
        calendario.setDate(new java.util.Date(1669302201000L));
        calendario.setDecorationBackgroundColor(new java.awt.Color(231, 231, 255));
        calendario.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                calendarioPropertyChange(evt);
            }
        });
        panelFondo.add(calendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 330, 160));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(16, 137, 177));
        jLabel5.setText("Seleccione la hora de la ruta");
        panelFondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, -1));

        txtfecha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtfecha.setForeground(new java.awt.Color(1, 88, 122));
        txtfecha.setText("-");
        txtfecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        panelFondo.add(txtfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 190, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/calendario.png"))); // NOI18N
        panelFondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 50, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/reloj.png"))); // NOI18N
        panelFondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 490, -1, -1));

        getContentPane().add(panelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void boxRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxRutaActionPerformed
        // TODO add your handling code here:
        if (String.valueOf(boxRuta.getSelectedItem()).equals("Ruta por el cañón del Sil")) {
            btnInfo.setVisible(true);
        } else if (String.valueOf(boxRuta.getSelectedItem()).equals("Ruta Cabo do Mundo")) {
            btnInfo.setVisible(true);
        } else {
            btnInfo.setVisible(false);
        }
    }//GEN-LAST:event_boxRutaActionPerformed

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        // TODO add your handling code here:
        this.cerrar();
    }//GEN-LAST:event_cerrarActionPerformed

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        // TODO add your handling code here:
        if (String.valueOf(boxRuta.getSelectedItem()).equals("Ruta por el cañón del Sil")) {
            try {
                fa.vistaRuta1(this);
            } catch (IOException ex) {
                Logger.getLogger(VSeleccion.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.setVisible(false);
        } else if (String.valueOf(boxRuta.getSelectedItem()).equals("Ruta Cabo do Mundo")) {
            fa.vistaRuta2(this);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnInfoActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        // TODO add your handling code here:
        this.cerrar();
    }//GEN-LAST:event_volverActionPerformed

    private void boxHoraItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxHoraItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_boxHoraItemStateChanged

    private void boxHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxHoraActionPerformed

    private void reservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservarActionPerformed
        // TODO add your handling code here:
        double precRuta=0.0;
        if (boxRuta.getSelectedIndex() == 0) {
            fa.muestraMensaje(this, "Debe seleccionar una ruta para realizar la reserva");
        } else {
            Reserva res = new Reserva();
            res.setRuta(boxRuta.getSelectedItem().toString());
            res.setFecha(txtfecha.getText());
            res.setHora(boxHora.getSelectedItem().toString());

            if (String.valueOf(boxRuta.getSelectedItem()).equals("Ruta Cabo do Mundo")) {
                precRuta=3.0;
            } 

            if (grupoBotones.getSelection().equals(btnIndv.getModel())) {
                try {
                    fa.vistaIndividual(this, res, precRuta);
                    this.setVisible(false);
                } catch (ParseException ex) {
                    Logger.getLogger(VSeleccion.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                try {
                    fa.vistaGrupo(this, res, precRuta);
                    this.setVisible(false);
                } catch (ParseException ex) {
                    Logger.getLogger(VSeleccion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_reservarActionPerformed

    private void calendarioPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_calendarioPropertyChange
        // TODO add your handling code here:
        // TODO add your handling code here:
        if (evt.getOldValue() != null) {
            SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");
            txtfecha.setText(fecha.format(calendario.getCalendar().getTime()));
        }
    }//GEN-LAST:event_calendarioPropertyChange

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        fa.vistaAyuda(this);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxHora;
    private javax.swing.JComboBox<String> boxRuta;
    private javax.swing.JRadioButton btnGrupo;
    private javax.swing.JRadioButton btnIndv;
    private javax.swing.JButton btnInfo;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JCalendar calendario;
    private javax.swing.JButton cerrar;
    private javax.swing.ButtonGroup grupoBotones;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JButton reservar;
    private javax.swing.JLabel txtfecha;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables

    public void cerrar() {
        this.dispose();
        this.parent.setVisible(true);
    }

}
