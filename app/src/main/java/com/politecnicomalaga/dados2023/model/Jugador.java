package com.politecnicomalaga.dados2023.model;

public class Jugador implements Comparable<Jugador>{

    // Llamada a Tiradas
    private Tiradas tirada;
    // Llamada a Estadisticas
    private Estadisticas estadisticas;

    // Constructor
    public Jugador() {
        this.tirada = new Tiradas();
        this.estadisticas = new  Estadisticas();
    }
    // Devuelve las tiradas
    public Tiradas getTirada() {
        return tirada;
    }
    public void tirada() {
        tirada.tirar();
    }
    // Devuelve Estadisticas
    public Estadisticas getEstadisticas() {
        return estadisticas;
    }

    public void victoria() {
        estadisticas.aumVic();
    }
    public void derrota() {
        estadisticas.aumDer();
    }

    public void empate() {
        estadisticas.aumEmp();
    }

    // Compara un jugador con otro
    @Override
    public int compareTo(Jugador otro) {
        int compJ = Integer.compare(this.tirada.cont_seis(),otro.tirada.cont_seis());

        if (compJ != 0) {
            return compJ;
        } else {
            return Integer.compare(this.tirada.suma(),otro.tirada.suma());
        }
    }
}
