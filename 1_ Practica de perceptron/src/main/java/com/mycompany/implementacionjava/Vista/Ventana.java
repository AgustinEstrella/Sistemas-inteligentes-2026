
package com.mycompany.implementacionjava.Vista;

import java.awt.BorderLayout;

public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents();
        
        panelGrafico.setLayout(new BorderLayout());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEntrenamiento = new javax.swing.JButton();
        btnAprendizaje = new javax.swing.JButton();
        jlbEstado = new javax.swing.JLabel();
        jlbEntrada1 = new javax.swing.JLabel();
        jlbEntrada2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlbPeso1 = new javax.swing.JLabel();
        jlbPeso2 = new javax.swing.JLabel();
        jlbUmbral = new javax.swing.JLabel();
        jlbSalidaDeseada = new javax.swing.JLabel();
        jlbSalidaObtenida = new javax.swing.JLabel();
        jtfEntrada1 = new javax.swing.JTextField();
        jtfEntrada2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlbSalidaPrueba = new javax.swing.JLabel();
        btnPrueba = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        panelGrafico = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnEntrenamiento.setText("Entrenamiento");

        btnAprendizaje.setText("Aprendizaje");

        jlbEstado.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jlbEstado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbEstado.setText("HAGA CLICK EN \"Entrenamiento\" PARA COMENZAR");
        jlbEstado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jlbEntrada1.setText("Entrada 1:");
        jlbEntrada1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jlbEntrada2.setText("Entrada 2:");
        jlbEntrada2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel4.setText("Entrada 0: 1");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jlbPeso1.setText("Peso 1:");
        jlbPeso1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jlbPeso2.setText("Peso 2:");
        jlbPeso2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jlbUmbral.setText("Umbral:");
        jlbUmbral.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jlbSalidaDeseada.setText("Salida Deseada:");
        jlbSalidaDeseada.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jlbSalidaObtenida.setText("Salida Obtenida: ");
        jlbSalidaObtenida.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jtfEntrada1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jtfEntrada2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setText("Entrada 1: ");

        jLabel2.setText("Entrada 2:");

        jLabel3.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel3.setText("EJERCICIO PARA PROBAR EL PERCEPTRON:");

        jlbSalidaPrueba.setText("Salida Obtenida:");

        btnPrueba.setText("Prueba");

        jLabel5.setText("Factor Aprendizaje:: 0.6");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelGraficoLayout = new javax.swing.GroupLayout(panelGrafico);
        panelGrafico.setLayout(panelGraficoLayout);
        panelGraficoLayout.setHorizontalGroup(
            panelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 212, Short.MAX_VALUE)
        );
        panelGraficoLayout.setVerticalGroup(
            panelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 199, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEntrenamiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAprendizaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPrueba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbSalidaDeseada)
                    .addComponent(jlbPeso1)
                    .addComponent(jlbEntrada1)
                    .addComponent(jtfEntrada1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jlbEntrada2)
                    .addComponent(jlbPeso2)
                    .addComponent(jlbSalidaObtenida)
                    .addComponent(jlbEstado)
                    .addComponent(jLabel3)
                    .addComponent(jtfEntrada2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(panelGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4)
                    .addComponent(jlbUmbral)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbSalidaPrueba))
                .addGap(0, 178, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jlbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbEntrada1)
                            .addComponent(jlbEntrada2)
                            .addComponent(jLabel4))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbPeso1)
                            .addComponent(jlbPeso2)
                            .addComponent(jlbUmbral))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbSalidaDeseada)
                            .addComponent(btnAprendizaje)
                            .addComponent(jlbSalidaObtenida)
                            .addComponent(jLabel5)))
                    .addComponent(btnEntrenamiento))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPrueba)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jtfEntrada2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlbSalidaPrueba))
                            .addComponent(jtfEntrada1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28)
                .addComponent(panelGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(224, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAprendizaje;
    public javax.swing.JButton btnEntrenamiento;
    public javax.swing.JButton btnPrueba;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jlbEntrada1;
    public javax.swing.JLabel jlbEntrada2;
    public javax.swing.JLabel jlbEstado;
    public javax.swing.JLabel jlbPeso1;
    public javax.swing.JLabel jlbPeso2;
    public javax.swing.JLabel jlbSalidaDeseada;
    public javax.swing.JLabel jlbSalidaObtenida;
    public javax.swing.JLabel jlbSalidaPrueba;
    public javax.swing.JLabel jlbUmbral;
    public javax.swing.JTextField jtfEntrada1;
    public javax.swing.JTextField jtfEntrada2;
    public javax.swing.JPanel panelGrafico;
    // End of variables declaration//GEN-END:variables
}
