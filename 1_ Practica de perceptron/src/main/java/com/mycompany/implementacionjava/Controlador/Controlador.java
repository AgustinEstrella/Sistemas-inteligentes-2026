package com.mycompany.implementacionjava.Controlador;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.JOptionPane.showMessageDialog;

import org.jfree.chart.ChartPanel;

import com.mycompany.implementacionjava.Modelo.Grafico;
import com.mycompany.implementacionjava.Modelo.PerceptronGol;
import com.mycompany.implementacionjava.Vista.Ventana;

public class Controlador implements ActionListener {

    private Ventana view;

    private Grafico grafico;
    private Grafico graficoConRecta;

    private ChartPanel chartPanel;
    private ChartPanel chartPanel2;

    private PerceptronGol perceptronGol;

    // =========================
    // CONSTRUCTOR
    // =========================

    public Controlador(
            Ventana view,
            Grafico grafico,
            PerceptronGol perceptronGol
    ) {

        this.view = view;
        this.grafico = grafico;
        this.perceptronGol = perceptronGol;

        // BOTONES
        this.view.btnEntrenamiento.addActionListener(this);
        this.view.btnAprendizaje.addActionListener(this);
        this.view.btnPrueba.addActionListener(this);

        // GRAFICO
        this.chartPanel = this.grafico.getChartPanel();

        this.chartPanel.setPreferredSize(
                new Dimension(400, 400)
        );

        this.view.panelGrafico.removeAll();

        this.view.panelGrafico.add(
                chartPanel,
                BorderLayout.CENTER
        );

        this.view.panelGrafico.validate();
    }

    // =========================
    // INICIAR VENTANA
    // =========================

    public void iniciar() {

        view.setTitle("PERCEPTRÓN GOL / NO GOL");

        view.setLocationRelativeTo(null);

        view.editarAccesoPrueba(false);

    }

    // =========================
    // EVENTOS BOTONES
    // =========================

    @Override
    public void actionPerformed(ActionEvent e) {

        // =====================================================
        // BOTON ENTRENAMIENTO
        // =====================================================

        if (e.getSource() == view.btnEntrenamiento) {

            perceptronGol.Entrenamiento();

            // =========================
            // ESTADO
            // =========================

            if (perceptronGol.getFila() == 8) {

                view.textoEstado.setText(
                        "ENTRENAMIENTO COMPLETADO"
                );

                view.editarAccesoPrueba(true);

            } else {

                view.textoEstado.setText(
                        "ENTRENAMIENTO EN PROCESO"
                );

                view.editarAccesoPrueba(false);

            }

            // =========================
            // MOSTRAR ENTRADAS
            // =========================

            view.textoEntrada1.setText(
                    "Potencia: "
                            + perceptronGol.getEntradas(1)
            );

            view.textoEntrada2.setText(
                    "Dirección: "
                            + perceptronGol.getEntradas(2)
            );

            view.textoEntrada3.setText(
                    "Defensa: "
                            + perceptronGol.getEntradas(3)
            );

            // =========================
            // MOSTRAR PESOS
            // =========================

            view.textoPeso1.setText(
                    "Peso 1: "
                            + perceptronGol.getW1()
            );

            view.textoPeso2.setText(
                    "Peso 2: "
                            + perceptronGol.getW2()
            );

            view.textoPeso3.setText(
                    "Peso 3: "
                            + perceptronGol.getW3()
            );

            view.textoInfoUmbral.setText(
                    "Umbral: "
                            + perceptronGol.getW0()
            );

            // =========================
            // MOSTRAR SALIDAS
            // =========================

            view.textoSalidaDeseada.setText(
                    "Salida Deseada: "
                            + perceptronGol.getSalidas(
                            perceptronGol.getFila()
                    )
            );

            view.textoSalidaObtenida.setText(
                    "Salida Obtenida: "
                            + perceptronGol.getY()
            );

            // =========================
            // GRAFICO
            // =========================
            // El gráfico sigue usando 2 variables
            // porque ahora el perceptrón trabaja en 3D

            float X1 = -2;

            float Y1 =
                    (-perceptronGol.getW0()
                            - perceptronGol.getW1() * X1)
                            / perceptronGol.getW2();

            float X2 = 2;

            float Y2 =
                    (-perceptronGol.getW0()
                            - perceptronGol.getW1() * X2)
                            / perceptronGol.getW2();

            graficoConRecta = new Grafico(
                    Y1,
                    Y2,
                    X1,
                    X2,
                    perceptronGol.getRepeticion()
            );

            chartPanel2 =
                    graficoConRecta.getChartPanel();

            chartPanel2.setPreferredSize(
                    new Dimension(400, 400)
            );

            view.panelGrafico.removeAll();

            view.panelGrafico.add(
                    chartPanel2,
                    BorderLayout.CENTER
            );

            view.panelGrafico.validate();
        }

        // =====================================================
        // BOTON APRENDIZAJE
        // =====================================================

        if (e.getSource() == view.btnAprendizaje) {

            if (perceptronGol.getError() != 0f) {

                perceptronGol.Aprendizaje();

                showMessageDialog(
                        null,
                        """
                        RECALCULAMOS LOS PESOS

                        Nuevo Umbral =
                        """
                                + perceptronGol.getW0()

                                + "\n\nNuevo Peso 1 = "
                                + perceptronGol.getW1()

                                + "\nNuevo Peso 2 = "
                                + perceptronGol.getW2()

                                + "\nNuevo Peso 3 = "
                                + perceptronGol.getW3()
                );

            } else {

                showMessageDialog(
                        null,
                        """
                        EL PERCEPTRON YA APRENDIO

                        No existe error.
                        """
                );

            }

        }

        // =====================================================
        // BOTON PRUEBA
        // =====================================================

        if (e.getSource() == view.btnPrueba) {

            String entrada1 =
                    view.ingresoEntrada1.getText();

            String entrada2 =
                    view.ingresoEntrada2.getText();

            String entrada3 =
                    view.ingresoEntrada3.getText();

            boolean bandera = false;

            // =========================
            // VALIDACION
            // =========================

            if (

                    (((entrada1.compareTo("1")) != 0)
                            && ((entrada1.compareTo("-1")) != 0))

                            ||

                            (((entrada2.compareTo("1")) != 0)
                                    && ((entrada2.compareTo("-1")) != 0))

                            ||

                            (((entrada3.compareTo("1")) != 0)
                                    && ((entrada3.compareTo("-1")) != 0))

            ) {

                showMessageDialog(
                        null,
                        """
                        ERROR

                        Solamente se aceptan:

                        1
                        -1
                        """
                );

                bandera = true;
            }

            // =========================
            // PRUEBA PERCEPTRON
            // =========================

            if (bandera == false) {

                String resultado =
                        perceptronGol.PruebaFuncionamiento(
                                Integer.parseInt(entrada1),
                                Integer.parseInt(entrada2),
                                Integer.parseInt(entrada3)
                        );

                view.textoSalidaPrueba.setText(
                        "Resultado: " + resultado
                );

            }

        }

    }

}