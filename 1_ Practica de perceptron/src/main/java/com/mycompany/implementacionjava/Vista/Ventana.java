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

        textoEstado = new javax.swing.JLabel();

        textoEntrada1 = new javax.swing.JLabel();
        textoEntrada2 = new javax.swing.JLabel();

        textoInfoConversionBinario = new javax.swing.JLabel();

        textoPeso1 = new javax.swing.JLabel();
        textoPeso2 = new javax.swing.JLabel();

        textoInfoUmbral = new javax.swing.JLabel();

        textoSalidaDeseada = new javax.swing.JLabel();
        textoSalidaObtenida = new javax.swing.JLabel();

        ingresoEntrada1 = new javax.swing.JTextField();
        ingresoEntrada2 = new javax.swing.JTextField();

        textoEntrada1 = new javax.swing.JLabel();
        textoEntrada2 = new javax.swing.JLabel();

        textoTituloPrueba = new javax.swing.JLabel();

        textoSalidaPrueba = new javax.swing.JLabel();

        btnPrueba = new javax.swing.JButton();

        textoInfoAprendizaje = new javax.swing.JLabel();

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
        textoEstado.setFont(new java.awt.Font("Dialog", 1, 14));
        textoEstado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoEstado.setText("ENTRENAR EL PERCEPTRON PARA DETECTAR GOL");

        // ==========================================
        // LABELS DE ENTRENAMIENTO
        // ==========================================
        textoEntrada1.setText("Potencia:");
        textoEntrada2.setText("Direccion:");

        textoInfoConversionBinario.setText("Entrada 0: 1");

        textoPeso1.setText("Peso 1:");
        textoPeso2.setText("Peso 2:");

        textoInfoUmbral.setText("Umbral:");

        textoSalidaDeseada.setText("Salida Deseada:");
        textoSalidaObtenida.setText("Salida Obtenida:");

        // ==========================================
        // INPUTS
        // ==========================================
        ingresoEntrada1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        ingresoEntrada2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        // ==========================================
        // LABELS DE PRUEBA
        // ==========================================
        textoEntrada1.setText("Potencia");

        textoEntrada2.setText("Direccion");

        textoTituloPrueba.setFont(new java.awt.Font("Dialog", 1, 13));
        textoTituloPrueba.setText("PROBAR SI LA JUGADA ES GOL");

        textoSalidaPrueba.setFont(new java.awt.Font("Dialog", 1, 12));
        textoSalidaPrueba.setText("Resultado:");

        // ==========================================
        // INFO
        // ==========================================
        textoInfoAprendizaje.setText("Factor Aprendizaje: 0.6");

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

                                        .addComponent(textoEstado)

                                        .addGroup(layout.createSequentialGroup()

                                                .addGroup(layout.createParallelGroup(
                                                        javax.swing.GroupLayout.Alignment.CENTER
                                                )

                                                        .addComponent(textoEntrada1)
                                                        .addComponent(textoPeso1)
                                                        .addComponent(textoSalidaDeseada)

                                                        .addComponent(textoEntrada1)

                                                        .addComponent(
                                                                ingresoEntrada1,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                100,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE
                                                        )
                                                )

                                                .addGap(40, 40, 40)

                                                .addGroup(layout.createParallelGroup(
                                                        javax.swing.GroupLayout.Alignment.CENTER
                                                )

                                                        .addComponent(textoEntrada2)
                                                        .addComponent(textoPeso2)
                                                        .addComponent(textoSalidaObtenida)

                                                        .addComponent(textoEntrada2)

                                                        .addComponent(
                                                                ingresoEntrada2,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                100,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE
                                                        )
                                                )

                                                .addGap(40, 40, 40)

                                                .addGroup(layout.createParallelGroup(
                                                        javax.swing.GroupLayout.Alignment.CENTER
                                                )

                                                        .addComponent(textoInfoConversionBinario)
                                                        .addComponent(textoInfoUmbral)
                                                        .addComponent(textoInfoAprendizaje)
                                                        .addComponent(textoSalidaPrueba)
                                                )
                                        )

                                        .addGap(20, 20, 20)

                                        .addComponent(textoTituloPrueba)

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

                                .addComponent(textoEstado)

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

                                                        .addComponent(textoEntrada1)
                                                        .addComponent(textoEntrada2)
                                                        .addComponent(textoInfoConversionBinario)
                                                )

                                                .addGap(20, 20, 20)

                                                .addGroup(layout.createParallelGroup(
                                                        javax.swing.GroupLayout.Alignment.BASELINE
                                                )

                                                        .addComponent(textoPeso1)
                                                        .addComponent(textoPeso2)
                                                        .addComponent(textoInfoUmbral)
                                                )

                                                .addGap(20, 20, 20)

                                                .addGroup(layout.createParallelGroup(
                                                        javax.swing.GroupLayout.Alignment.BASELINE
                                                )

                                                        .addComponent(textoSalidaDeseada)
                                                        .addComponent(textoSalidaObtenida)
                                                        .addComponent(textoInfoAprendizaje)
                                                )
                                        )
                                )

                                .addGap(30, 30, 30)

                                .addComponent(textoTituloPrueba)

                                .addGap(20, 20, 20)

                                .addGroup(layout.createParallelGroup(
                                        javax.swing.GroupLayout.Alignment.BASELINE
                                )

                                        .addComponent(textoEntrada1)
                                        .addComponent(textoEntrada2)
                                )

                                .addGap(10, 10, 10)

                                .addGroup(layout.createParallelGroup(
                                        javax.swing.GroupLayout.Alignment.BASELINE
                                )

                                        .addComponent(
                                                ingresoEntrada1,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE
                                        )

                                        .addComponent(
                                                ingresoEntrada2,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE
                                        )

                                        .addComponent(textoSalidaPrueba)
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

    private javax.swing.JLabel textoInfoConversionBinario;
    private javax.swing.JLabel textoInfoAprendizaje;

    private javax.swing.JLabel jLabelInfo;

    //Seccion prueba despues de haber aprendido
    public javax.swing.JButton btnPrueba;
    private javax.swing.JLabel textoTituloPrueba;
    public javax.swing.JLabel textoEntrada1;
    public javax.swing.JLabel textoEntrada2;
    public javax.swing.JTextField ingresoEntrada1;
    public javax.swing.JTextField ingresoEntrada2;

    public javax.swing.JLabel textoEstado;

    public javax.swing.JLabel textoPeso1;
    public javax.swing.JLabel textoPeso2;

    public javax.swing.JLabel textoSalidaDeseada;
    public javax.swing.JLabel textoSalidaObtenida;
    public javax.swing.JLabel textoSalidaPrueba;

    public javax.swing.JLabel textoInfoUmbral;


    public javax.swing.JPanel panelGrafico;

    // End of variables declaration
    public void editarAccesoPrueba(boolean llave){
        ingresoEntrada1.setEditable(llave);
        ingresoEntrada2.setEditable(llave);
        btnPrueba.setEnabled(llave);
    }
}
