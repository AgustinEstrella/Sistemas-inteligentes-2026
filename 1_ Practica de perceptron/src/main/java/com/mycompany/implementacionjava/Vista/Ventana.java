package com.mycompany.implementacionjava.Vista;

import java.awt.BorderLayout;

public class Ventana extends javax.swing.JFrame {

    public Ventana() {

        initComponents();

        panelGrafico.setLayout(new BorderLayout());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
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

        jLabelInfo = new javax.swing.JLabel();

        panelGrafico = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        // ==========================================
        // BOTONES
        // ==========================================
        btnEntrenamiento.setText("Entrenamiento");

        btnAprendizaje.setText("Aprendizaje");

        btnPrueba.setText("Prueba");

        // ==========================================
        // ESTADO
        // ==========================================
        jlbEstado.setFont(new java.awt.Font("Dialog", 1, 14));
        jlbEstado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbEstado.setText("ENTRENAR EL PERCEPTRON PARA DETECTAR GOL");

        // ==========================================
        // LABELS DE ENTRENAMIENTO
        // ==========================================
        jlbEntrada1.setText("Potencia:");
        jlbEntrada2.setText("Direccion:");

        jLabel4.setText("Entrada 0: 1");

        jlbPeso1.setText("Peso 1:");
        jlbPeso2.setText("Peso 2:");

        jlbUmbral.setText("Umbral:");

        jlbSalidaDeseada.setText("Salida Deseada:");
        jlbSalidaObtenida.setText("Salida Obtenida:");

        // ==========================================
        // INPUTS
        // ==========================================
        jtfEntrada1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jtfEntrada2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        // ==========================================
        // LABELS DE PRUEBA
        // ==========================================
        jLabel1.setText("Potencia");

        jLabel2.setText("Direccion");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 13));
        jLabel3.setText("PROBAR SI LA JUGADA ES GOL");

        jlbSalidaPrueba.setFont(new java.awt.Font("Dialog", 1, 12));
        jlbSalidaPrueba.setText("Resultado:");

        // ==========================================
        // INFO
        // ==========================================
        jLabel5.setText("Factor Aprendizaje: 0.6");

        jLabelInfo.setText(
                "<html>"
                + "Potencia: 1 = Fuerte | -1 = Debil<br>"
                + "Direccion: 1 = Al arco | -1 = Fuera"
                + "</html>"
        );

        jLabelInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabelInfo.setFont(new java.awt.Font("Dialog", 0, 11));

        // ==========================================
        // PANEL GRAFICO
        // ==========================================
        javax.swing.GroupLayout panelGraficoLayout
                = new javax.swing.GroupLayout(panelGrafico);

        panelGrafico.setLayout(panelGraficoLayout);

        panelGraficoLayout.setHorizontalGroup(
                panelGraficoLayout.createParallelGroup(
                        javax.swing.GroupLayout.Alignment.LEADING
                )
                        .addGap(0, 350, Short.MAX_VALUE)
        );

        panelGraficoLayout.setVerticalGroup(
                panelGraficoLayout.createParallelGroup(
                        javax.swing.GroupLayout.Alignment.LEADING
                )
                        .addGap(0, 250, Short.MAX_VALUE)
        );

        // ==========================================
        // LAYOUT GENERAL
        // ==========================================
        javax.swing.GroupLayout layout
                = new javax.swing.GroupLayout(getContentPane());

        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(
                layout.createParallelGroup(
                        javax.swing.GroupLayout.Alignment.LEADING
                )
                        .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)

                                // BOTONES
                                .addGroup(layout.createParallelGroup(
                                        javax.swing.GroupLayout.Alignment.LEADING,
                                        false
                                )
                                        .addComponent(
                                                btnEntrenamiento,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                130,
                                                Short.MAX_VALUE
                                        )

                                        .addComponent(
                                                btnAprendizaje,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                Short.MAX_VALUE
                                        )

                                        .addComponent(
                                                btnPrueba,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                Short.MAX_VALUE
                                        )
                                )

                                .addGap(50, 50, 50)

                                // CENTRO
                                .addGroup(layout.createParallelGroup(
                                        javax.swing.GroupLayout.Alignment.CENTER
                                )

                                        .addComponent(jlbEstado)

                                        .addGroup(layout.createSequentialGroup()

                                                .addGroup(layout.createParallelGroup(
                                                        javax.swing.GroupLayout.Alignment.CENTER
                                                )

                                                        .addComponent(jlbEntrada1)
                                                        .addComponent(jlbPeso1)
                                                        .addComponent(jlbSalidaDeseada)

                                                        .addComponent(jLabel1)

                                                        .addComponent(
                                                                jtfEntrada1,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                100,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE
                                                        )
                                                )

                                                .addGap(40, 40, 40)

                                                .addGroup(layout.createParallelGroup(
                                                        javax.swing.GroupLayout.Alignment.CENTER
                                                )

                                                        .addComponent(jlbEntrada2)
                                                        .addComponent(jlbPeso2)
                                                        .addComponent(jlbSalidaObtenida)

                                                        .addComponent(jLabel2)

                                                        .addComponent(
                                                                jtfEntrada2,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                100,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE
                                                        )
                                                )

                                                .addGap(40, 40, 40)

                                                .addGroup(layout.createParallelGroup(
                                                        javax.swing.GroupLayout.Alignment.CENTER
                                                )

                                                        .addComponent(jLabel4)
                                                        .addComponent(jlbUmbral)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jlbSalidaPrueba)
                                                )
                                        )

                                        .addGap(20, 20, 20)

                                        .addComponent(jLabel3)

                                        .addGap(15, 15, 15)

                                        .addComponent(jLabelInfo)

                                        .addGap(25, 25, 25)

                                        .addComponent(
                                                panelGrafico,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE
                                        )
                                )

                                .addContainerGap(40, Short.MAX_VALUE)
                        )
        );

        layout.setVerticalGroup(
                layout.createParallelGroup(
                        javax.swing.GroupLayout.Alignment.LEADING
                )
                        .addGroup(layout.createSequentialGroup()

                                .addGap(20, 20, 20)

                                .addComponent(jlbEstado)

                                .addGap(30, 30, 30)

                                .addGroup(layout.createParallelGroup(
                                        javax.swing.GroupLayout.Alignment.LEADING
                                )

                                        // BOTONES
                                        .addGroup(layout.createSequentialGroup()

                                                .addComponent(btnEntrenamiento)

                                                .addGap(15, 15, 15)

                                                .addComponent(btnAprendizaje)

                                                .addGap(15, 15, 15)

                                                .addComponent(btnPrueba)
                                        )

                                        // INFORMACION
                                        .addGroup(layout.createSequentialGroup()

                                                .addGroup(layout.createParallelGroup(
                                                        javax.swing.GroupLayout.Alignment.BASELINE
                                                )

                                                        .addComponent(jlbEntrada1)
                                                        .addComponent(jlbEntrada2)
                                                        .addComponent(jLabel4)
                                                )

                                                .addGap(20, 20, 20)

                                                .addGroup(layout.createParallelGroup(
                                                        javax.swing.GroupLayout.Alignment.BASELINE
                                                )

                                                        .addComponent(jlbPeso1)
                                                        .addComponent(jlbPeso2)
                                                        .addComponent(jlbUmbral)
                                                )

                                                .addGap(20, 20, 20)

                                                .addGroup(layout.createParallelGroup(
                                                        javax.swing.GroupLayout.Alignment.BASELINE
                                                )

                                                        .addComponent(jlbSalidaDeseada)
                                                        .addComponent(jlbSalidaObtenida)
                                                        .addComponent(jLabel5)
                                                )
                                        )
                                )

                                .addGap(30, 30, 30)

                                .addComponent(jLabel3)

                                .addGap(20, 20, 20)

                                .addGroup(layout.createParallelGroup(
                                        javax.swing.GroupLayout.Alignment.BASELINE
                                )

                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                )

                                .addGap(10, 10, 10)

                                .addGroup(layout.createParallelGroup(
                                        javax.swing.GroupLayout.Alignment.BASELINE
                                )

                                        .addComponent(
                                                jtfEntrada1,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE
                                        )

                                        .addComponent(
                                                jtfEntrada2,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE
                                        )

                                        .addComponent(jlbSalidaPrueba)
                                )

                                .addGap(20, 20, 20)

                                .addComponent(jLabelInfo)

                                .addGap(25, 25, 25)

                                .addComponent(
                                        panelGrafico,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.PREFERRED_SIZE
                                )

                                .addContainerGap(30, Short.MAX_VALUE)
                        )
        );

        pack();
    }// </editor-fold>

    public static void main(String args[]) {

        try {

            for (javax.swing.UIManager.LookAndFeelInfo info
                    : javax.swing.UIManager.getInstalledLookAndFeels()) {

                if ("Nimbus".equals(info.getName())) {

                    javax.swing.UIManager.setLookAndFeel(
                            info.getClassName()
                    );

                    break;
                }
            }

        } catch (Exception e) {

            e.printStackTrace();
        }

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {

                new Ventana().setVisible(true);

            }

        });
    }

    // Variables declaration
    public javax.swing.JButton btnAprendizaje;
    public javax.swing.JButton btnEntrenamiento;
    public javax.swing.JButton btnPrueba;

    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;

    private javax.swing.JLabel jLabelInfo;

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

    // End of variables declaration
}
