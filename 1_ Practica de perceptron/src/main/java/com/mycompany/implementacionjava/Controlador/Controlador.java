package com.mycompany.implementacionjava.Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.JOptionPane.showMessageDialog;

import com.mycompany.implementacionjava.Vista.Ventana;
import com.mycompany.implementacionjava.Modelo.Grafico;
import com.mycompany.implementacionjava.Modelo.PerceptronGol;

import java.awt.BorderLayout;
import java.awt.Dimension;

import org.jfree.chart.ChartPanel;

public class Controlador implements ActionListener {

    private Ventana view;
    private Grafico grafico;
    private Grafico graficoConRecta;

    private ChartPanel chartPanel;
    private ChartPanel chartPanel2;

    private PerceptronGol perceptronGol;

    public Controlador(Ventana view, Grafico grafico, PerceptronGol perceptronGol) {

        this.view = view;
        this.grafico = grafico;
        this.perceptronGol = perceptronGol;

        this.view.btnEntrenamiento.addActionListener(this);
        this.view.btnAprendizaje.addActionListener(this);
        this.view.btnPrueba.addActionListener(this);

        this.chartPanel = this.grafico.getChartPanel();
        this.chartPanel.setPreferredSize(new Dimension(400, 400));

        this.view.panelGrafico.removeAll();
        this.view.panelGrafico.add(chartPanel, BorderLayout.CENTER);
        this.view.panelGrafico.validate();
    }

    public void iniciar() {

        view.setTitle("PERCEPTRÓN GOL / NO GOL");
        view.setLocationRelativeTo(null);
        view.editarAccesoPrueba(false);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        // =========================
        // BOTON ENTRENAMIENTO
        // =========================
        if (e.getSource() == view.btnEntrenamiento) {

            perceptronGol.Entrenamiento();

            if (perceptronGol.getFila() == 4) {

                view.textoEstado.setText("ENTRENAMIENTO COMPLETADO");
                view.editarAccesoPrueba(true);

            } else {

                view.textoEstado.setText("ENTRENAMIENTO EN PROCESO");
                view.editarAccesoPrueba(false);

            }

            // MOSTRAR ENTRADAS
            view.textoEntrada1.setText(
                    "Potencia: "
                    + Float.toString(perceptronGol.getEntradas(1))
            );

            view.textoEntrada2.setText(
                    "Direccion: "
                    + Float.toString(perceptronGol.getEntradas(2))
            );

            // MOSTRAR PESOS
            view.textoPeso1.setText(
                    "Peso 1: "
                    + Float.toString(perceptronGol.getW1())
            );

            view.textoPeso2.setText(
                    "Peso 2: "
                    + Float.toString(perceptronGol.getW2())
            );

            view.textoInfoUmbral.setText(
                    "Umbral: "
                    + Float.toString(perceptronGol.getW0())
            );

            // MOSTRAR SALIDAS
            view.textoSalidaDeseada.setText(
                    "Salida Deseada: "
                    + Float.toString(
                            perceptronGol.getSalidas(
                                    perceptronGol.getFila()
                            )
                    )
            );

            view.textoSalidaObtenida.setText(
                    "Salida Obtenida: "
                    + Float.toString(perceptronGol.getY())
            );

            // =========================
            // CREAR RECTA
            // =========================
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

            chartPanel2 = graficoConRecta.getChartPanel();

            chartPanel2.setPreferredSize(new Dimension(400, 400));

            view.panelGrafico.removeAll();

            view.panelGrafico.add(chartPanel2, BorderLayout.CENTER);

            view.panelGrafico.validate();

        }

        // =========================
        // BOTON APRENDIZAJE
        // =========================
        if (e.getSource() == view.btnAprendizaje) {

            if (perceptronGol.getError() != 0f) {

                perceptronGol.Aprendizaje();

                showMessageDialog(
                        null,
                        """
                        Recalculamos los Pesos

                        Nuevo Umbral = """
                        + perceptronGol.getW0()
                        + "\nNuevo Peso 1 = "
                        + perceptronGol.getW1()
                        + "\nNuevo Peso 2 = "
                        + perceptronGol.getW2()
                );

            } else {

                showMessageDialog(
                        null,
                        "NO HAY ERROR. EL PERCEPTRON YA APRENDIO"
                );

            }

        }

        // =========================
        // BOTON PRUEBA
        // =========================
        if (e.getSource() == view.btnPrueba) {

            String entrada1 = view.ingresoEntrada1.getText();
            String entrada2 = view.ingresoEntrada2.getText();

            boolean bandera = false;

            // VALIDACION
            if ((((entrada1.compareTo("1")) != 0)
                    && ((entrada1.compareTo("-1")) != 0))
                    || (((entrada2.compareTo("1")) != 0)
                    && ((entrada2.compareTo("-1")) != 0))) {

                showMessageDialog(
                        null,
                        """
                        ERROR

                        Solamente se aceptan valores:

                        1  = POSITIVO
                        -1 = NEGATIVO
                        """
                );

                bandera = true;
            }

            // PRUEBA
            if (bandera == false) {

                String resultado
                        = perceptronGol.PruebaFuncionamiento(
                                Integer.parseInt(entrada1),
                                Integer.parseInt(entrada2)
                        );

                view.textoSalidaPrueba.setText(
                        "Resultado: " + resultado
                );

            }

        }

    }

}