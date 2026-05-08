
package com.mycompany.implementacionjava.Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.JOptionPane.showMessageDialog;

import com.mycompany.implementacionjava.Vista.Ventana;
import com.mycompany.implementacionjava.Modelo.Grafico;
import com.mycompany.implementacionjava.Modelo.PerceptronSimpleAND;
import java.awt.BorderLayout;
import java.awt.Dimension;
import org.jfree.chart.ChartPanel;

public class Controlador implements ActionListener {
    
    private Ventana view;
    private Grafico grafico;
    private Grafico graficoConRecta;
    private ChartPanel chartPanel;
    private ChartPanel chartPanel2;
    private PerceptronSimpleAND perceptronSimpleAND;

    public Controlador (Ventana view, Grafico grafico, PerceptronSimpleAND perceptronSimpleAND) {
        this.view = view;
        this.grafico = grafico;
        this.perceptronSimpleAND = perceptronSimpleAND;
        this.view.btnEntrenamiento.addActionListener(this);
        this.view.btnAprendizaje.addActionListener(this);
        this.view.btnPrueba.addActionListener(this);
   
        this.chartPanel = this.grafico.getChartPanel();
        this.chartPanel.setPreferredSize(new Dimension(400, 400));
        this.view.panelGrafico.removeAll();
        this.view.panelGrafico.add(chartPanel, BorderLayout.CENTER);
        this.view.panelGrafico.validate();     
    }
    
    public void iniciar () {
        
        view.setTitle("PERCEPTRÓN SIMPLE AND");
        view.setLocationRelativeTo(null);   
        
    }
    
    public void actionPerformed (ActionEvent e) {
        
        if (e.getSource() == view.btnEntrenamiento) {
            
            perceptronSimpleAND.Entrenamiento();
            
            if (perceptronSimpleAND.getFila() == 4) {
                view.jlbEstado.setText("ENTRENAMIENTO COMPLETADO - DATOS FINALES:");
            } else {
                view.jlbEstado.setText("ENTRENAMIENTO FALLIDO - DATOS OBTENIDO:");
            }

            view.jlbEntrada1.setText("Entada 1: " + Float.toString(perceptronSimpleAND.getEntradas(1)));
            view.jlbEntrada2.setText("Entada 2: " + Float.toString(perceptronSimpleAND.getEntradas(2)));

            view.jlbPeso1.setText("Peso 1: " + Float.toString(perceptronSimpleAND.getW1()));
            view.jlbPeso2.setText("Peso 2: " + Float.toString(perceptronSimpleAND.getW2()));
            view.jlbUmbral.setText("Umbral: " + Float.toString(perceptronSimpleAND.getW0()));

            view.jlbSalidaDeseada.setText("Salida Deseada: " + Float.toString(perceptronSimpleAND.getSalidas((int) perceptronSimpleAND.getFila())));
            view.jlbSalidaObtenida.setText("Salida Obtenida: " + Float.toString(perceptronSimpleAND.getY()));
            
            float X1 = -2;
            float Y1 = (-perceptronSimpleAND.getW0() - perceptronSimpleAND.getW1() * X1) / perceptronSimpleAND.getW2();

            float X2 = 2;
            float Y2 = (-perceptronSimpleAND.getW0() - perceptronSimpleAND.getW1() * X2) / perceptronSimpleAND.getW2();

            graficoConRecta = new Grafico(Y1, Y2, X1, X2, perceptronSimpleAND.getRepeticion());
            chartPanel2 = graficoConRecta.getChartPanel();
            chartPanel2.setPreferredSize(new Dimension(400, 400));
            view.panelGrafico.removeAll();
            view.panelGrafico.add(chartPanel2, BorderLayout.CENTER);
            view.panelGrafico.validate();

        }
        
        if (e.getSource() == view.btnAprendizaje) {
            
            if (perceptronSimpleAND.getError() != 0f) {
                
                perceptronSimpleAND.Aprendizaje();
            
                showMessageDialog(null, """
                                        Recalculamos los Pesos
                                         Nuevo Umbral = """ + perceptronSimpleAND.getW0() + 
                                        "\n Nuevo Peso 1 = " + perceptronSimpleAND.getW1() + 
                                        "\n Nuevo Peso 2 = " + perceptronSimpleAND.getW2());
            
            }
            
        }
        
        if (e.getSource() == view.btnPrueba) {
            
            String Entrada1 = view.jtfEntrada1.getText();
            String Entrada2 = view.jtfEntrada2.getText();
            boolean bandera = false ;
            
            if ((((Entrada1.compareTo("1")) != 0) && ((Entrada1.compareTo("-1")) != 0)) || (((Entrada2.compareTo("1")) != 0) && ((Entrada2.compareTo("-1")) != 0))) {
                showMessageDialog(null, "ERROR. Solamente se haceptan valores 1 o -1");
                bandera = true;
            }
            
            if (bandera == false) {
                float y = perceptronSimpleAND.PruebaFuncionamiento(Integer.parseInt(Entrada1), Integer.parseInt(Entrada2));
                view.jlbSalidaPrueba.setText("Salida Obtenida: " + Float.toString(y));
            }
            
        }
        
    }
    
}
