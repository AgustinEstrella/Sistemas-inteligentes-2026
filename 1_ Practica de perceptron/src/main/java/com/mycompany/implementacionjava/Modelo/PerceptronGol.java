package com.mycompany.implementacionjava.Modelo;

import java.util.Random;

public class PerceptronGol {

    // ENTRADAS:
    // [1, defendida(si o no), potencia(despacio o fuerte), dirección: va al arco(si o no)]

    private float[][] entradas = {

            {1f, -1f, -1f, -1f}, // No se la defiende, le pega despacio, no va al arco === NO ES GOL
            {1f, -1f, -1f,  1f}, // No se la defiende, le pega despacio, va al arco === NO ES GOL
            {1f, -1f,  1f, -1f}, // No se la defiende, le pega fuerte, no va al arco === NO ES GOL
            {1f, -1f,  1f,  1f}, // No se la defiende, le pega fuerte, va al arco === GOL
            {1f,  1f, -1f, -1f}, // Se la defiende, le pega despacio, no va al arco === NO ES GOL
            {1f,  1f, -1f,  1f}, // Se la defiende, le pega despacio, va al arco === NO ES GOL
            {1f,  1f,  1f, -1f}, // Se la defiende, le pega fuerte, no va al arco === NO ES GOL
            {1f,  1f,  1f,  1f}, // Se la defiende, le pega fuerte, va al arco === NO ES GOL

    };

    private float[] salidas = new float[8];

    public PerceptronGol(){
        this.salidas[0] = -1f;
        this.salidas[1] = -1f;
        this.salidas[2] = -1f;
        this.salidas[3] =  1f;
        this.salidas[4] = -1f;
        this.salidas[5] = -1f;
        this.salidas[6] = -1f;
        this.salidas[7] = -1f;

    }

    private float factorAprendizaje = 0.6f;

    // PESOS
    private float w0 = new Random().nextFloat();
    private float w1 = new Random().nextFloat();
    private float w2 = new Random().nextFloat();
    private float w3 = new Random().nextFloat();

    private float y = 0f;
    private float error = 0f;

    private int fila = 0;
    private int repeticion = 1;

    private boolean bandera = true;

    // GETTERS

    public float getEntradas(int x) {

        if (fila == 8) {
            return entradas[7][x];
        }

        return entradas[fila][x];
    }

    public float getSalidas(int x) {

        if (x == 8) {
            return salidas[7];
        }

        return salidas[x];
    }

    public float getW0() {
        return w0;
    }

    public float getW1() {
        return w1;
    }

    public float getW2() {
        return w2;
    }

    public float getW3() {
        return w3;
    }

    public float getY() {
        return y;
    }

    public float getError() {
        return error;
    }

    public int getFila() {
        return fila;
    }

    public int getRepeticion() {
        return repeticion;
    }

    // =========================
    // ENTRENAMIENTO
    // =========================

    public void Entrenamiento() {

        if (bandera == true) {

            System.out.println("PERCEPTRON GOL");

            while (fila < 8) {

                y = (w0 * entradas[fila][0]) + (w1 * entradas[fila][1]) + (w2 * entradas[fila][2]) + (w3 * entradas[fila][3]);
                System.out.println("Resultado bruto de la funcion: " + y);

                System.out.println("-------------------");
                System.out.println("FILA " + (fila+1));
                System.out.println("-------------------");

                // ACTIVACION

                if (y > 0) {
                    this.y = 1;
                } else {
                    this.y = -1;
                }

                error = salidas[fila] - y;
                System.out.println("Error: " + error);

                if (error == 0f) {

                    this.fila++;

                } else {

                    break;
                }

            }

            if (fila == 8) {

                bandera = false;

                System.out.println("APRENDIZAJE COMPLETADO");
            }

        }

    }

    // =========================
    // APRENDIZAJE
    // =========================

    public void Aprendizaje() {

        w0 = w0 + (factorAprendizaje * error * entradas[fila][0]);

        w1 = w1 + (factorAprendizaje * error * entradas[fila][1]);

        w2 = w2 + (factorAprendizaje * error * entradas[fila][2]);

        w3 = w3 + (factorAprendizaje * error * entradas[fila][3]);

        fila = 0;

        repeticion++;

    }

    // =========================
    // PRUEBA
    // =========================

    public String PruebaFuncionamiento(
            int defensa,
            int potencia,
            int direccion
    ) {

        y =
                (w0 * 1) +
                        (w1 * defensa) +
                        (w2 * potencia) +
                        (w3 * direccion);

        if (y > 0) {
            return "GOL";
        }

        return "NO GOL";
    }

}