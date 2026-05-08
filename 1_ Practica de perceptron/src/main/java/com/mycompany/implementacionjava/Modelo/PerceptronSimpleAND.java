package com.mycompany.implementacionjava.Modelo;

import java.util.Random;

public class PerceptronSimpleAND {

    // Tabla de verdad AND
    // la columna 0 sirve para que no se rompa al aplicar la formula de aprendizaje
    // columna 1 y 2 son los valores de la tabla
    private float[][] entradas = {
                                {1f, 1f, 1f},
                                {1f, 1f, -1f},
                                {1f, -1f, 1f},
                                {1f, -1f, -1f}
                                 };

    //Variable para los resultados
    private float[] salidas = new float[4];

    private float factorAprendizaje = (float) 0.6;
    private float w0 = new Random().nextFloat();
    private float w1 = new Random().nextFloat();
    private float w2 = new Random().nextFloat();
    private float y = 0.0f;
    private float error = 0.0f;
    private int fila = 0;
    private int repeticion = 1;
    private boolean bandera = true;

    // Valores para los resultados esperados
    public PerceptronSimpleAND () {
        this.salidas[0] = 1f;
        this.salidas[1] = -1f;
        this.salidas[2] = -1f;
        this.salidas[3] = -1f;
    }
    
    public float getEntradas(int X) {
        if (fila == 4) {
            return entradas[3][X];
        } else {
            return entradas[fila][X];
        }   
    }

    public void setEntradas(float[][] entradas) {
        this.entradas = entradas;
    }

    public float getSalidas(int X) {
        if (X == 4) {
            return salidas[3];
        } else {
            return salidas[X];
        }  
        
    }

    public void setSalidas(float[] salidas) {
        this.salidas = salidas;
    }

    public float getFactorAprendizaje() {
        return factorAprendizaje;
    }

    public void setFactorAprendizaje(float factorAprendizaje) {
        this.factorAprendizaje = factorAprendizaje;
    }

    public float getW0() {
        return w0;
    }

    public void setW0(float w0) {
        this.w0 = w0;
    }

    public float getW1() {
        return w1;
    }

    public void setW1(float w1) {
        this.w1 = w1;
    }

    public float getW2() {
        return w2;
    }

    public void setW2(float w2) {
        this.w2 = w2;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getError() {
        return error;
    }

    public void setError(float error) {
        this.error = error;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getRepeticion() {
        return repeticion;
    }

    public void setRepeticion(int repeticion) {
        this.repeticion = repeticion;
    }
 
    public boolean getBandera() {
        return bandera;
    }

    public void setBandera(boolean bandera) {
        this.bandera = bandera;
    }

//---------------------------------------------------------------------------------//
    //PROCEDIMIENTOS//

    public void Entrenamiento () {
        
        if (bandera == true) {

            //Comienzo bucle
            System.out.println("PERCEPTRON AND");
            System.out.println("Factor de Aprendizaje: " + factorAprendizaje);
            System.out.println("Umbral: " + w0);
            System.out.println("Peso 1: " + w1);
            System.out.println("Peso 2: " + w2);
            System.out.println("");
            System.out.println("ITERACION: " + repeticion + "-------------------------------------");

            while (fila < 4) {
                System.out.println("y = (" + w0 + "*" + entradas[fila][0] + ") + (" + w1 + "*" + entradas[fila][1] + ") + (" + w2 + "*" + entradas[fila][2] + ")"); 
                this.y = w0 * entradas[fila][0] + w1 * entradas[fila][1] + w2 * entradas[fila][2];
                //La primera multicacion mantiene al umbral en su valor, lo multiplica por 1

                //Resultado de nuestra ecuacion
                System.out.println("y = " + y);

                //Agregado mio
                System.out.println("--------------");
                System.out.println("Fila: " +fila);
                System.out.println("--------------");
                System.out.println();
                //Agregado mio

                //Estandariza el resultado como "binario" siendo -1 equivalente a 0]
                if (y > 0) {
                    this.y = 1;
                    System.out.println("Como y > 0 entonces");
                } else {
                    if (y <= 0) {
                        this.y = -1;
                        System.out.println("Como y <= 0 entonces");
                    }
                }
                System.out.println("y = " + y);


                //Calculo error
                this.error = salidas[fila] - y;
                System.out.println("Error = " + error);

                //Si el error da 0 significa que aprendio, sino vuelve a pedir las entradas para recalcular pesos y umbral
                if (error == 0f) {
                    System.out.println("-----------------------------------------------------------");
                    this.fila++;
                } else {
                    break;
                }
            }

            if (fila == 4) {
                System.out.println("");
                System.out.println("---------------------------------");
                System.out.println("| PESOS FINALES\t\t\t|");
                System.out.println("| Factor de Aprendizaje: " + factorAprendizaje + "\t|");
                System.out.println("| Umbral: " + w0 + "\t\t|");
                System.out.println("| Peso 1: " + w1 + "\t\t|");
                System.out.println("| Peso 2: " + w2 + "\t\t|");
                System.out.println("---------------------------------");
                System.out.println("");
                
                bandera = false;
            }

        }          
    }   
    
    public void Aprendizaje() {

        System.out.println("-----------------------------------------------------------");
        System.out.println("Recalculamos los Pesos");

        this.w0 = w0 + (factorAprendizaje * (error) * entradas[fila][0]);
        this.w1 = w1 + (factorAprendizaje * (error) * entradas[fila][1]);
        this.w2 = w2 + (factorAprendizaje * (error) * entradas[fila][2]);

        System.out.println("Nuevo Umbral = " + w0);
        System.out.println("Nuevo Peso 1 = " + w1);
        System.out.println("Nuevo Peso 2 = " + w2);

        this.fila = 0;
        this.repeticion++;
        System.out.println("");
        System.out.println("");


    }

    public float PruebaFuncionamiento(int entrada1, int entrada2) {

        y = (w0 * 1) + (w1 * entrada1) + (w2 * entrada2);
        
        if (y > 0) {
            y = 1;
        } else {
            if (y <= 0) {
                y = -1;
            }
        }
        
        return y;

    }
    
}