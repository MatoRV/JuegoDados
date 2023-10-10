package com.politecnicomalaga.dados2023.model;

import com.politecnicomalaga.dados2023.model.Dados;

public class Tiradas {

    // Creamos 2 dados
    private Dados d1;

    private Dados d2;

    // Constructor
    public Tiradas() {
        d1 = new Dados();
        d2 = new Dados();
    }

    // Devuelve dado 1
    public Dados getD1() {
        return d1;
    }

    // Devuelve dado 2
    public Dados getD2() {
        return d2;
    }
    // Cuenta la cantidad de 6
    public void tirar() {
        d1.valor();
        d2.valor();
    }
    public int cont_seis() {
        int cont6 = 0;
        if (getD1().getNum() == 6) cont6++;
        if (getD2().getNum() == 6) cont6++;
        return cont6;
    }
    // Hace la suma
    public int suma() {
        return getD1().getNum() + getD2().getNum();
    }

}
