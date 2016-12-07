package com.android.grupo5;

/**
 * @author Carlos García y Javier Sánchez
 */

public class Casilla {

    private int x;
    private int y;
    private int valor;

    public Casilla(int x, int y, int valor) {
        this.x = x;
        this.y = y;
        this.valor = valor;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getValor() {
        return valor;
    }
}
