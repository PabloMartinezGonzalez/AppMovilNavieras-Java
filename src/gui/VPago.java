/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import aplicacion.Reserva;
import com.sun.glass.events.KeyEvent;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ButtonModel;

/**
 *
 * @author alumnogreibd
 */
public class VPago extends javax.swing.JFrame {

    private aplicacion.FachadaAplicacion fa;
    private java.awt.Frame parent;
    private Reserva reserva;

    /**
     * Creates new form VMercado
     */
    public VPago(aplicacion.FachadaAplicacion fa, java.awt.Frame parent, Reserva res) {
        this.fa = fa;
        this.parent = parent;
        this.reserva = res;
        initComponents();

        ruta.setText(" " + reserva.getRuta());
        dia.setText(" " + reserva.getFecha());
        hora.setText(" " + reserva.getHora());
        num.setText(" " + reserva.getBilletes());
        DecimalFormat df = new DecimalFormat("#.00");
        imp.setText(" " + df.format(reserva.getImporte()) + "€");
        if (reserva.isGuia()) {
            guia.setText(" Si");
        } else {
            guia.setText(" No");
        }
        if (reserva.isMovRed()) {
            mov.setText(" Si");
        } else {
            mov.setText(" No");
        }
        nombre.setText(reserva.getNombre());
        dni.setText(reserva.getDni());
        correo.setText(reserva.getCorreo());
        telefono.setText(reserva.getTelefono());
        postal.setText(reserva.getCodPostal());
        fallo.setVisible(false);

    }

    VPago() {
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
        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        cerrar = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        pagar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtHora1 = new javax.swing.JLabel();
        txtRuta1 = new javax.swing.JLabel();
        txtDia1 = new javax.swing.JLabel();
        txtBilletes1 = new javax.swing.JLabel();
        txtGuia1 = new javax.swing.JLabel();
        postal = new javax.swing.JLabel();
        telefono = new javax.swing.JLabel();
        correo = new javax.swing.JLabel();
        dni = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        targeta4 = new javax.swing.JTextField();
        targeta1 = new javax.swing.JTextField();
        targeta2 = new javax.swing.JTextField();
        targeta3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        mes = new javax.swing.JSpinner();
        anho = new javax.swing.JSpinner();
        cvv = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fallo = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtHora = new javax.swing.JLabel();
        txtRuta = new javax.swing.JLabel();
        txtImporte = new javax.swing.JLabel();
        txtDia = new javax.swing.JLabel();
        txtBilletes = new javax.swing.JLabel();
        txtGuia2 = new javax.swing.JLabel();
        ruta = new javax.swing.JLabel();
        dia = new javax.swing.JLabel();
        guia = new javax.swing.JLabel();
        num = new javax.swing.JLabel();
        txtGuia3 = new javax.swing.JLabel();
        hora = new javax.swing.JLabel();
        mov = new javax.swing.JLabel();
        imp = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

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

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(390, 844));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel3.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 40, -1));

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
        jPanel3.add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 40, -1));

        pagar.setBackground(new java.awt.Color(1, 88, 122));
        pagar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        pagar.setForeground(new java.awt.Color(255, 255, 255));
        pagar.setText("Pagar");
        pagar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pagar.setFocusPainted(false);
        pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagarActionPerformed(evt);
            }
        });
        jPanel3.add(pagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 770, 140, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Pago");
        jLabel2.setName(""); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 190, 30));

        jPanel4.setBackground(new java.awt.Color(1, 88, 122));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtHora1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtHora1.setForeground(new java.awt.Color(255, 255, 255));
        txtHora1.setText("Código Postal:");
        jPanel4.add(txtHora1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 30));

        txtRuta1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtRuta1.setForeground(new java.awt.Color(255, 255, 255));
        txtRuta1.setText("Nombre:");
        jPanel4.add(txtRuta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 30));

        txtDia1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDia1.setForeground(new java.awt.Color(255, 255, 255));
        txtDia1.setText("DNI:");
        jPanel4.add(txtDia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 50, 30));

        txtBilletes1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtBilletes1.setForeground(new java.awt.Color(255, 255, 255));
        txtBilletes1.setText("Correo:");
        jPanel4.add(txtBilletes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 30));

        txtGuia1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtGuia1.setForeground(new java.awt.Color(255, 255, 255));
        txtGuia1.setText("Teléfono:");
        jPanel4.add(txtGuia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 30));

        postal.setBackground(new java.awt.Color(255, 255, 255));
        postal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        postal.setText("-");
        postal.setOpaque(true);
        jPanel4.add(postal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 160, 30));

        telefono.setBackground(new java.awt.Color(255, 255, 255));
        telefono.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        telefono.setText("-");
        telefono.setOpaque(true);
        jPanel4.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 160, 30));

        correo.setBackground(new java.awt.Color(255, 255, 255));
        correo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        correo.setText("-");
        correo.setOpaque(true);
        jPanel4.add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 160, 30));

        dni.setBackground(new java.awt.Color(255, 255, 255));
        dni.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dni.setText("-");
        dni.setOpaque(true);
        jPanel4.add(dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 160, 30));

        nombre.setBackground(new java.awt.Color(255, 255, 255));
        nombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nombre.setText("-");
        nombre.setOpaque(true);
        jPanel4.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 160, 30));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 350, 210));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Número targeta de crédito");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, -1));

        targeta4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        targeta4.setForeground(new java.awt.Color(16, 137, 177));
        targeta4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 88, 122), 2));
        targeta4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                targeta4KeyTyped(evt);
            }
        });
        jPanel3.add(targeta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 560, 60, 30));

        targeta1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        targeta1.setForeground(new java.awt.Color(16, 137, 177));
        targeta1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 88, 122), 2));
        targeta1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                targeta1KeyTyped(evt);
            }
        });
        jPanel3.add(targeta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 60, 30));

        targeta2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        targeta2.setForeground(new java.awt.Color(16, 137, 177));
        targeta2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 88, 122), 2));
        targeta2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                targeta2KeyTyped(evt);
            }
        });
        jPanel3.add(targeta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 560, 60, 30));

        targeta3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        targeta3.setForeground(new java.awt.Color(16, 137, 177));
        targeta3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 88, 122), 2));
        targeta3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                targeta3KeyTyped(evt);
            }
        });
        jPanel3.add(targeta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 560, 60, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("-");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 560, 30, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("-");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 560, 40, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("-");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 560, 40, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("CVV");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 620, -1, 20));

        mes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mes.setModel(new javax.swing.SpinnerNumberModel(12, 1, 12, 1));
        mes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 88, 122), 2));
        mes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mes.setEditor(new javax.swing.JSpinner.NumberEditor(mes, ""));
        mes.setFocusable(false);
        mes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mesKeyTyped(evt);
            }
        });
        jPanel3.add(mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, 60, 30));

        anho.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        anho.setModel(new javax.swing.SpinnerNumberModel(22, 22, 35, 1));
        anho.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 88, 122), 2));
        anho.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                anhoStateChanged(evt);
            }
        });
        jPanel3.add(anho, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 650, 60, 30));

        cvv.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cvv.setForeground(new java.awt.Color(16, 137, 177));
        cvv.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cvv.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 88, 122), 2));
        cvv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cvvKeyTyped(evt);
            }
        });
        jPanel3.add(cvv, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 650, 60, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Mes de caducidad");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, -1, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel8.setText("/");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 650, -1, 30));

        fallo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fallo.setForeground(new java.awt.Color(193, 0, 0));
        fallo.setText("*Targeta no válida o caducada*");
        jPanel3.add(fallo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 700, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("_____________________________________\n");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 340, 20));

        jPanel2.setBackground(new java.awt.Color(1, 88, 122));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtHora.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtHora.setForeground(new java.awt.Color(255, 255, 255));
        txtHora.setText("Hora:");
        jPanel2.add(txtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, -1));

        txtRuta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtRuta.setForeground(new java.awt.Color(255, 255, 255));
        txtRuta.setText("Ruta: ");
        jPanel2.add(txtRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        txtImporte.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtImporte.setForeground(new java.awt.Color(255, 255, 255));
        txtImporte.setText("Importe:");
        jPanel2.add(txtImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, -1));

        txtDia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDia.setForeground(new java.awt.Color(255, 255, 255));
        txtDia.setText("Día:");
        jPanel2.add(txtDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 40, -1));

        txtBilletes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtBilletes.setForeground(new java.awt.Color(255, 255, 255));
        txtBilletes.setText("Nº Billetes:");
        jPanel2.add(txtBilletes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        txtGuia2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtGuia2.setForeground(new java.awt.Color(255, 255, 255));
        txtGuia2.setText("Guía incluido:");
        jPanel2.add(txtGuia2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        ruta.setBackground(new java.awt.Color(255, 255, 255));
        ruta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ruta.setText("-");
        ruta.setOpaque(true);
        jPanel2.add(ruta, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 260, -1));

        dia.setBackground(new java.awt.Color(255, 255, 255));
        dia.setText("-");
        dia.setOpaque(true);
        jPanel2.add(dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 100, -1));

        guia.setBackground(new java.awt.Color(255, 255, 255));
        guia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        guia.setText("-");
        guia.setOpaque(true);
        jPanel2.add(guia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 40, -1));

        num.setBackground(new java.awt.Color(255, 255, 255));
        num.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        num.setText("-");
        num.setOpaque(true);
        jPanel2.add(num, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 50, -1));

        txtGuia3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtGuia3.setForeground(new java.awt.Color(255, 255, 255));
        txtGuia3.setText("Mov. Red.:");
        jPanel2.add(txtGuia3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, -1));

        hora.setBackground(new java.awt.Color(255, 255, 255));
        hora.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        hora.setText("-");
        hora.setOpaque(true);
        jPanel2.add(hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 90, -1));

        mov.setBackground(new java.awt.Color(255, 255, 255));
        mov.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mov.setText("-");
        mov.setOpaque(true);
        jPanel2.add(mov, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 40, -1));

        imp.setBackground(new java.awt.Color(255, 255, 255));
        imp.setText("-");
        imp.setOpaque(true);
        jPanel2.add(imp, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 70, -1));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 350, 150));

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
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 760, 60, 60));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        // TODO add your handling code here:
        fa.muestraCancelar(this);
    }//GEN-LAST:event_cerrarActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        // TODO add your handling code here:
        this.dispose();
        parent.setVisible(true);
    }//GEN-LAST:event_volverActionPerformed

    private void pagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagarActionPerformed
        // TODO add your handling code here:
        //comprobaciones();
        if (targeta1.getText().length() == 4 && targeta2.getText().length() == 4 && targeta3.getText().length() == 4 && targeta4.getText().length() == 4 
                && cvv.getText().length()==3) {
            if((Integer) anho.getValue() ==22 && (Integer) mes.getValue()<12){
                fallo.setVisible(true);
            }else{
                fa.vistaReserva(this, reserva);
                fallo.setVisible(false);
                this.setVisible(false);
            }
        }else{
            fallo.setVisible(true);
        }
            

    }//GEN-LAST:event_pagarActionPerformed

    private void targeta4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_targeta4KeyTyped
        // TODO add your handling code here:
        String s = targeta4.getText();
        if (s.length() >= 4) {
            evt.consume();
        } else {
            char c = evt.getKeyChar();
            try {
                Integer.parseInt("" + c);
            } catch (NumberFormatException excepcion) {
                evt.consume();
            }
        }

    }//GEN-LAST:event_targeta4KeyTyped

    private void targeta1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_targeta1KeyTyped
        // TODO add your handling code here:

        String s = targeta1.getText();
        if (s.length() >= 4) {
            targeta2.requestFocus();
            evt.consume();
        } else {
            char c = evt.getKeyChar();
            try {
                Integer.parseInt("" + c);
            } catch (NumberFormatException excepcion) {
                evt.consume();
            }
        }

    }//GEN-LAST:event_targeta1KeyTyped

    private void targeta2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_targeta2KeyTyped
        // TODO add your handling code here:
        String s = targeta2.getText();
        if (s.length() >= 4) {
            targeta3.requestFocus();
            evt.consume();
        } else {
            char c = evt.getKeyChar();
            try {
                Integer.parseInt("" + c);
            } catch (NumberFormatException excepcion) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_targeta2KeyTyped

    private void targeta3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_targeta3KeyTyped
        // TODO add your handling code here:
        String s = targeta3.getText();
        if (s.length() >= 4) {
            targeta4.requestFocus();
            evt.consume();
        } else {
            char c = evt.getKeyChar();
            try {
                Integer.parseInt("" + c);
            } catch (NumberFormatException excepcion) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_targeta3KeyTyped

    private void cvvKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cvvKeyTyped
        // TODO add your handling code here:
        String s = cvv.getText();
        if (s.length() >= 3) {
            evt.consume();
        } else {
            char c = evt.getKeyChar();
            try {
                Integer.parseInt("" + c);
            } catch (NumberFormatException excepcion) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_cvvKeyTyped

    private void anhoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_anhoStateChanged
        // TODO add your handling code here:
        if ((Integer) anho.getValue() < 1) {
            anho.setValue(1);
        } else if ((Integer) anho.getValue() > 40) {
            anho.setValue(40);
        }
    }//GEN-LAST:event_anhoStateChanged

    private void mesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mesKeyTyped
        // TODO add your handling code here:
        String s = mes.getValue().toString();

        char c = evt.getKeyChar();
        try {
            Integer.parseInt("" + c);
            if (Integer.parseInt(s) < 1) {
                mes.setValue(1);
            } else if (Integer.parseInt(s) > 12) {
                mes.setValue(12);
            }
        } catch (NumberFormatException excepcion) {
            evt.consume();
        }

    }//GEN-LAST:event_mesKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        fa.vistaAyuda(this);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner anho;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cerrar;
    private javax.swing.JLabel correo;
    private javax.swing.JTextField cvv;
    private javax.swing.JLabel dia;
    private javax.swing.JLabel dni;
    private javax.swing.JLabel fallo;
    private javax.swing.ButtonGroup grupoBotones;
    private javax.swing.JLabel guia;
    private javax.swing.JLabel hora;
    private javax.swing.JLabel imp;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JSpinner mes;
    private javax.swing.JLabel mov;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel num;
    private javax.swing.JButton pagar;
    private javax.swing.JLabel postal;
    private javax.swing.JLabel ruta;
    private javax.swing.JTextField targeta1;
    private javax.swing.JTextField targeta2;
    private javax.swing.JTextField targeta3;
    private javax.swing.JTextField targeta4;
    private javax.swing.JLabel telefono;
    private javax.swing.JLabel txtBilletes;
    private javax.swing.JLabel txtBilletes1;
    private javax.swing.JLabel txtDia;
    private javax.swing.JLabel txtDia1;
    private javax.swing.JLabel txtGuia1;
    private javax.swing.JLabel txtGuia2;
    private javax.swing.JLabel txtGuia3;
    private javax.swing.JLabel txtHora;
    private javax.swing.JLabel txtHora1;
    private javax.swing.JLabel txtImporte;
    private javax.swing.JLabel txtRuta;
    private javax.swing.JLabel txtRuta1;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables

    public void cerrar() {
        this.dispose();
        VCompra vc = (VCompra) parent;
        vc.cerrar();
    }

    public void confirmacionSalir(boolean dec) {
        if (dec) {
            this.cerrar();
        }
    }
}
