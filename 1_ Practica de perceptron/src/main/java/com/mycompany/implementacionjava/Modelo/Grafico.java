package com.mycompany.implementacionjava.Modelo;

import java.awt.BasicStroke;
import java.awt.Color;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Grafico {

    XYSeries ejeX = new XYSeries("Eje X");
    XYSeries ejeY = new XYSeries("Eje Y");
    XYSeries puntoA1 = new XYSeries("Punto A1");
    XYSeries puntoA2 = new XYSeries("Punto A2");
    XYSeries puntoA3 = new XYSeries("Punto A3");
    XYSeries puntoB1 = new XYSeries("Punto B1");
    XYSeries recta = new XYSeries("Recta");

    XYSeriesCollection dataset = new XYSeriesCollection();

    JFreeChart xylineChart;
    XYPlot plot;
    XYLineAndShapeRenderer renderer;

    public Grafico() {

        this.ejeX.add(-2, 0);
        this.ejeX.add(2, 0);
        this.ejeY.add(0, 2);
        this.ejeY.add(0, -2);
        this.puntoB1.add(1.0, 1.0);
        this.puntoA1.add(1.0, -1.0);
        this.puntoA2.add(-1.0, 1.0);
        this.puntoA3.add(-1.0, -1.0);

        dataset.addSeries(ejeX);
        dataset.addSeries(ejeY);
        dataset.addSeries(puntoB1);
        dataset.addSeries(puntoA1);
        dataset.addSeries(puntoA2);
        dataset.addSeries(puntoA3);

        inicializarGrafico();
    }

    public Grafico(float Y1, float Y2, float X1, float X2, int repeticion) {

        this.ejeX.add(-2, 0);
        this.ejeX.add(2, 0);
        this.ejeY.add(0, 2);
        this.ejeY.add(0, -2);
        this.puntoB1.add(1.0, 1.0);
        this.puntoA1.add(1.0, -1.0);
        this.puntoA2.add(-1.0, 1.0);
        this.puntoA3.add(-1.0, -1.0);
        this.recta.add(X1, Y1);
        this.recta.add(X2, Y2);

        dataset.addSeries(ejeX);
        dataset.addSeries(ejeY);
        dataset.addSeries(puntoB1);
        dataset.addSeries(puntoA1);
        dataset.addSeries(puntoA2);
        dataset.addSeries(puntoA3);
        dataset.addSeries(recta);

        inicializarGrafico();
        
        xylineChart.addSubtitle(new TextTitle("Iteración: " + repeticion));
    }

    private void inicializarGrafico() {
        
        xylineChart = ChartFactory.createXYLineChart(
                "Gráfica",
                "Referencias",
                "",
                dataset,
                PlotOrientation.VERTICAL, true, true, false
        );

        plot = xylineChart.getXYPlot();
        renderer = new XYLineAndShapeRenderer();

        for (int i = 0; i < dataset.getSeriesCount(); i++) {
            renderer.setSeriesPaint(i, elegirColor(i));
            renderer.setSeriesStroke(i, new BasicStroke(elegirGrosor(i)));
        }

        plot.setRenderer(renderer);
        plot.getDomainAxis().setRange(-2.0, 2.0);
        plot.getRangeAxis().setRange(-2.0, 2.0);
    }

    private Color elegirColor(int index) {
        
        return switch (index) {
            case 0 -> Color.BLACK; // ejeX
            case 1 -> Color.BLACK; // ejeY
            case 2 -> Color.RED; // puntoB1
            case 3 -> Color.GREEN; // puntoA1
            case 4 -> Color.YELLOW; // puntoA2
            case 5 -> Color.BLUE; // puntoA3
            case 6 -> Color.CYAN; // recta
            default -> Color.BLACK;
        }; 
 
    }

    private float elegirGrosor(int index) {
        
        return switch (index) {
            case 2, 3, 4, 5 -> 2.0f; // puntos
            case 6 -> 2.0f; // recta
            default -> 1.0f; // ejes
        }; 

    }

    public ChartPanel getChartPanel() {
        
        return new ChartPanel(xylineChart);
    }
}
