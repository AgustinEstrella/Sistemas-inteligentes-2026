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
        btnPrueba = new javax.swing.JButton();

        textoEstado = new javax.swing.JLabel();

        // =========================
        // LABELS ENTRENAMIENTO
        // =========================
        textoEntrada1 = new javax.swing.JLabel();
        textoEntrada2 = new javax.swing.JLabel();
        textoEntrada3 = new javax.swing.JLabel();

        textoPeso1 = new javax.swing.JLabel();
        textoPeso2 = new javax.swing.JLabel();
        textoPeso3 = new javax.swing.JLabel();

        textoInfoConversionBinario = new javax.swing.JLabel();
        textoInfoUmbral = new javax.swing.JLabel();

        textoSalidaDeseada = new javax.swing.JLabel();
        textoSalidaObtenida = new javax.swing.JLabel();

        // =========================
        // INPUTS PRUEBA
        // =========================
        ingresoEntrada1 = new javax.swing.JTextField();
        ingresoEntrada2 = new javax.swing.JTextField();
        ingresoEntrada3 = new javax.swing.JTextField();

        // =========================
        // PRUEBA
        // =========================
        textoDefensa = new javax.swing.JLabel();
        textoDefensa.setText("Defensa");
        textoPotencia = new javax.swing.JLabel();
        textoPotencia.setText("Potencia");
        textoDireccion = new javax.swing.JLabel();
        textoDireccion.setText("Direccion");

        textoTituloPrueba = new javax.swing.JLabel();
        textoSalidaPrueba = new javax.swing.JLabel();

        // =========================
        // INFO
        // =========================
        textoInfoAprendizaje = new javax.swing.JLabel();
        jLabelInfo = new javax.swing.JLabel();

        // =========================
        // PANEL GRAFICO
        // =========================
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
        textoEstado.setText("PERCEPTRON GOL / NO GOL CON DEFENSA");

        // ==========================================
        // LABELS ENTRENAMIENTO
        // ==========================================
        textoEntrada1.setText("Defensa:");
        textoEntrada2.setText("Potencia:");
        textoEntrada3.setText("Direccion:");

        textoPeso1.setText("Peso 1:");
        textoPeso2.setText("Peso 2:");
        textoPeso3.setText("Peso 3:");

        textoInfoConversionBinario.setText("Entrada Bias: 1");

        textoInfoUmbral.setText("Umbral:");

        textoSalidaDeseada.setText("Salida Deseada:");
        textoSalidaObtenida.setText("Salida Obtenida:");

        // ==========================================
        // INPUTS
        // ==========================================
        ingresoEntrada1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ingresoEntrada2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ingresoEntrada3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        // ==========================================
        // TITULO PRUEBA
        // ==========================================
        textoTituloPrueba.setFont(new java.awt.Font("Dialog", 1, 13));
        textoTituloPrueba.setText("PROBAR JUGADA");

        textoSalidaPrueba.setFont(new java.awt.Font("Dialog", 1, 12));
        textoSalidaPrueba.setText("Resultado:");

        // ==========================================
        // INFO
        // ==========================================
        textoInfoAprendizaje.setText("Factor Aprendizaje: 0.6");

        jLabelInfo.setText(
                "<html>"
                        + "Potencia: 1 = Fuerte | -1 = Debil<br>"
                        + "Direccion: 1 = Al arco | -1 = Fuera<br>"
                        + "Defensa: -1 = Sin defensa | 1 = Defensa fuerte"
                        + "</html>"
        );

        jLabelInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

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
                        .addGap(0, 400, Short.MAX_VALUE)
        );

        panelGraficoLayout.setVerticalGroup(
                panelGraficoLayout.createParallelGroup(
                                javax.swing.GroupLayout.Alignment.LEADING
                        )
                        .addGap(0, 280, Short.MAX_VALUE)
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
                                                        140,
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

                                .addGap(40, 40, 40)

                                // CENTRO
                                .addGroup(layout.createParallelGroup(
                                                        javax.swing.GroupLayout.Alignment.CENTER
                                                )

                                                .addComponent(textoEstado)

                                                // FILA LABELS
                                                .addGroup(layout.createSequentialGroup()

                                                        .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.CENTER
                                                                        )

                                                                        .addComponent(textoEntrada1)
                                                                        .addComponent(textoPeso1)
                                                                        .addComponent(textoSalidaDeseada)
                                                        )

                                                        .addGap(40, 40, 40)

                                                        .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.CENTER
                                                                        )

                                                                        .addComponent(textoEntrada2)
                                                                        .addComponent(textoPeso2)
                                                                        .addComponent(textoSalidaObtenida)
                                                        )

                                                        .addGap(40, 40, 40)

                                                        .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.CENTER
                                                                        )

                                                                        .addComponent(textoEntrada3)
                                                                        .addComponent(textoPeso3)
                                                                        .addComponent(textoInfoAprendizaje)
                                                        )

                                                        .addGap(40, 40, 40)

                                                        .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.CENTER
                                                                        )

                                                                        .addComponent(textoInfoConversionBinario)
                                                                        .addComponent(textoInfoUmbral)
                                                        )
                                                )

                                                .addGap(20, 20, 20)

                                                .addComponent(textoTituloPrueba)

                                                // LABELS DE LOS INPUTS
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(textoDefensa, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(20, 20, 20)
                                                        .addComponent(textoPotencia, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(20, 20, 20)
                                                        .addComponent(textoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                )

                                                // INPUTS
                                                .addGroup(layout.createSequentialGroup()

                                                        .addComponent(
                                                                ingresoEntrada1,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                100,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE
                                                        )

                                                        .addGap(20, 20, 20)

                                                        .addComponent(
                                                                ingresoEntrada2,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                100,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE
                                                        )

                                                        .addGap(20, 20, 20)

                                                        .addComponent(
                                                                ingresoEntrada3,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                100,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE
                                                        )

                                                        .addGap(30, 30, 30)

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
                                )

                                .addContainerGap(30, Short.MAX_VALUE)
                        )
        );

        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(textoEstado)
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(textoEntrada1)
                                                        .addComponent(textoEntrada2)
                                                        .addComponent(textoEntrada3)
                                                        .addComponent(textoInfoConversionBinario)
                                                )
                                                .addGap(20, 20, 20)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(textoPeso1)
                                                        .addComponent(textoPeso2)
                                                        .addComponent(textoPeso3)
                                                        .addComponent(textoInfoUmbral)
                                                )
                                                .addGap(20, 20, 20)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(textoSalidaDeseada)
                                                        .addComponent(textoSalidaObtenida)
                                                        .addComponent(textoInfoAprendizaje)
                                                )
                                        )
                                )
                                .addGap(35, 35, 35)
                                .addComponent(textoTituloPrueba)
                                .addGap(20, 20, 20)

                                // ---------------------------------------------------
                                // LABELS DE PRUEBA
                                // ---------------------------------------------------
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(textoDefensa)
                                        .addComponent(textoPotencia)
                                        .addComponent(textoDireccion)
                                )
                                .addGap(5, 5, 5)

                                // ---------------------------------------------------
                                // INPUTS DE PRUEBA (Esta era la apertura que faltaba)
                                // ---------------------------------------------------
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ingresoEntrada1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ingresoEntrada2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ingresoEntrada3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textoSalidaPrueba)
                                )

                                .addGap(25, 25, 25)
                                .addComponent(jLabelInfo)
                                .addGap(25, 25, 25)
                                .addComponent(panelGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    // ==========================================
    // VARIABLES
    // ==========================================
    public javax.swing.JButton btnAprendizaje;
    public javax.swing.JButton btnEntrenamiento;
    public javax.swing.JButton btnPrueba;

    public javax.swing.JLabel textoEstado;

    public javax.swing.JLabel textoEntrada1;
    public javax.swing.JLabel textoEntrada2;
    public javax.swing.JLabel textoEntrada3;

    public javax.swing.JLabel textoPeso1;
    public javax.swing.JLabel textoPeso2;
    public javax.swing.JLabel textoPeso3;

    public javax.swing.JLabel textoSalidaDeseada;
    public javax.swing.JLabel textoSalidaObtenida;
    public javax.swing.JLabel textoSalidaPrueba;

    public javax.swing.JLabel textoInfoUmbral;

    private javax.swing.JLabel textoInfoConversionBinario;
    private javax.swing.JLabel textoInfoAprendizaje;

    private javax.swing.JLabel textoTituloPrueba;

    private javax.swing.JLabel textoDefensa;
    private javax.swing.JLabel textoPotencia;
    private javax.swing.JLabel textoDireccion;

    private javax.swing.JLabel jLabelInfo;

    public javax.swing.JTextField ingresoEntrada1;
    public javax.swing.JTextField ingresoEntrada2;
    public javax.swing.JTextField ingresoEntrada3;

    public javax.swing.JPanel panelGrafico;

    // ==========================================
    // METODO PARA ACTIVAR/DESACTIVAR PRUEBA
    // ==========================================
    public void editarAccesoPrueba(boolean llave) {

        ingresoEntrada1.setEditable(llave);
        ingresoEntrada2.setEditable(llave);
        ingresoEntrada3.setEditable(llave);

        btnPrueba.setEnabled(llave);
    }
}