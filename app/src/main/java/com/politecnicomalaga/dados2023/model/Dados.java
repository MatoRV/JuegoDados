package com.politecnicomalaga.dados2023.model;

public class Dados {
    private int num;

    public Dados() {
    }
    // Tira los dados
    public void valor() {
        num = (int) (Math.random()*6+1);
    }
    // Devuelve el valor de un dado
    public int getNum() {
        return num;
    }
}
