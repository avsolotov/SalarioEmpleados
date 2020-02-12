package empleado;

import javax.swing.JOptionPane;

public class GUI extends javax.swing.JFrame {

    Archivo ar = new Archivo();
    Modelo sanBosco;

    public GUI() {
        initComponents();
        sanBosco = new Modelo(ar.leer());
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jblCedula = new javax.swing.JLabel();
        jblNombre = new javax.swing.JLabel();
        jblAntiguedad = new javax.swing.JLabel();
        jblSalario = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jtxtCedula = new javax.swing.JTextField();
        jtxtNombre = new javax.swing.JTextField();
        jtxtAntiguedad = new javax.swing.JTextField();
        jtxtSalario = new javax.swing.JTextField();
        jbtnGenerarPago = new javax.swing.JButton();
        jbtnBuscarPago = new javax.swing.JButton();
        jbtGaurdarRegistro = new javax.swing.JButton();
        jbtnLimpiar = new javax.swing.JButton();
        jbtnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jblCedula.setText("Cedula :");

        jblNombre.setText("Nombre :");

        jblAntiguedad.setText("Antiguedad :");

        jblSalario.setText("Salario :");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jbtnGenerarPago.setText("Generar Pago");
        jbtnGenerarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGenerarPagoActionPerformed(evt);
            }
        });

        jbtnBuscarPago.setText("Buscar Mejor Pago");
        jbtnBuscarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuscarPagoActionPerformed(evt);
            }
        });

        jbtGaurdarRegistro.setText("Guardar Registro");
        jbtGaurdarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtGaurdarRegistroActionPerformed(evt);
            }
        });

        jbtnLimpiar.setText("Limpiar");
        jbtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLimpiarActionPerformed(evt);
            }
        });

        jbtnSalir.setText("Salir");
        jbtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalirActionPerformed(evt);
            }
        });

        jLabel1.setText("SOLTOVMEDIA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jblCedula, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jblNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jblAntiguedad, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jblSalario, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxtCedula, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                            .addComponent(jtxtNombre)
                            .addComponent(jtxtAntiguedad)
                            .addComponent(jtxtSalario))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbtnLimpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtGaurdarRegistro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnGenerarPago, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jbtnBuscarPago, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblCedula)
                    .addComponent(jtxtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblNombre)
                    .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnSalir))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblAntiguedad)
                    .addComponent(jtxtAntiguedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnLimpiar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblSalario)
                    .addComponent(jtxtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtGaurdarRegistro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnBuscarPago)
                    .addComponent(jbtnGenerarPago))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jbtnSalirActionPerformed

    private void jbtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimpiarActionPerformed
        // TODO add your handling code here:
        jtxtCedula.setText("");
        jtxtNombre.setText("");
        jtxtAntiguedad.setText("");
        jtxtSalario.setText("");
    }//GEN-LAST:event_jbtnLimpiarActionPerformed

    private void jbtGaurdarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtGaurdarRegistroActionPerformed
        // TODO add your handling code here:
        int cedula, antiguedad;
        String nombre;
        double salario;
        cedula = Integer.parseInt(jtxtCedula.getText());
        nombre = jtxtNombre.getText();
        antiguedad = Integer.parseInt(jtxtAntiguedad.getText());
        salario = Double.parseDouble(jtxtSalario.getText());

        Empleado empleado = new Empleado(cedula, nombre, antiguedad, salario);

        empleado.ObtenerTipo();
        empleado.calcularNuevoSalario();
        empleado.calcularValorPago();

        sanBosco.getEmpleado().add(empleado);
        JOptionPane.showMessageDialog(this, "Registro Exitoso");
        ar.escribir(sanBosco.getEmpleado());
    }//GEN-LAST:event_jbtGaurdarRegistroActionPerformed

    private void jbtnGenerarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGenerarPagoActionPerformed
        // TODO add your handling code here:
        int cedula, antiguedad;
        String nombre;
        double salario;

        cedula = Integer.parseInt(jtxtCedula.getText());
        nombre = jtxtNombre.getText();
        antiguedad = Integer.parseInt(jtxtAntiguedad.getText());
        salario = Double.parseDouble(jtxtSalario.getText());

        Empleado empleado = new Empleado(cedula, nombre, antiguedad, salario);

        empleado.ObtenerTipo();
        empleado.calcularNuevoSalario();
        empleado.calcularValorPago();

        String empleadoPagar = "Cedula : " + cedula + "\nNombre : " + nombre + "\nAntiguedad : " + antiguedad + "\nSalario : " + salario + "\nTipoEmpleado : " + empleado.tipoEmpleado + "\nNuevo salario : " + empleado.nuevoSalario + "\nPagoFinal : " + empleado.pagarEmpleado;
        jTextArea1.setText(empleadoPagar);
    }//GEN-LAST:event_jbtnGenerarPagoActionPerformed

    private void jbtnBuscarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarPagoActionPerformed
        // TODO add your handling code here:
        Empleado empleadoBuscado = sanBosco.buscar();
        jTextArea1.setText(sanBosco.toString());
    }//GEN-LAST:event_jbtnBuscarPagoActionPerformed

    /*
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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel jblAntiguedad;
    private javax.swing.JLabel jblCedula;
    private javax.swing.JLabel jblNombre;
    private javax.swing.JLabel jblSalario;
    private javax.swing.JButton jbtGaurdarRegistro;
    private javax.swing.JButton jbtnBuscarPago;
    private javax.swing.JButton jbtnGenerarPago;
    private javax.swing.JButton jbtnLimpiar;
    private javax.swing.JButton jbtnSalir;
    private javax.swing.JTextField jtxtAntiguedad;
    private javax.swing.JTextField jtxtCedula;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtSalario;
    // End of variables declaration//GEN-END:variables
}
