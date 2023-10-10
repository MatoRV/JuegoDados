package com.politecnicomalaga.dados2023.model;

public class Estadisticas {

    private int victorias;
    private int derrotas;
    private int empates;

    // Constructor privado para evitar instancias múltiples
    public Estadisticas() {
        this.victorias = 0;
        this.derrotas = 0;
        this.empates = 0;
    }

    // Devuelve las victorias
    public int getVictorias() {
        return victorias;
    }

    // Devuelve las derrotas
    public int getDerrotas() {
        return derrotas;
    }

    // Devuelve los empates
    public int getEmpates() {
        return empates;
    }

    // Aumenta las victorias
    public void aumVic() {
        victorias++;
    }

    // Aumenta las derrotas
    public void aumDer() {
        derrotas++;
    }

    // Aumenta los empates
    public void aumEmp() {
        empates++;
    }
}
