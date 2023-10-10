package com.politecnicomalaga.dados2023.model;

import com.politecnicomalaga.dados2023.model.Estadisticas;
import com.politecnicomalaga.dados2023.model.Jugador;

import java.util.ArrayList;
import java.util.List;

public class Partida {

    // Creamos los jugadores
    private Jugador jugador1;

    private Jugador jugador2;
    // Declara una lista para almacenar las estadísticas de cada jugador
    private List<Estadisticas> estadisticasJugadores;


    // Constructor privado de partida
    public Partida() {
        this.jugador1 = new Jugador();
        this.jugador2 = new Jugador();
        this.estadisticasJugadores = new ArrayList<>();
        // Se añaden las estadísticas a la lista
        estadisticasJugadores.add(jugador1.getEstadisticas());
        estadisticasJugadores.add(jugador2.getEstadisticas());

    }
    // Se realiza la tirada de los jugadores
    public void tiradas() {
        jugador1.tirada();
        jugador2.tirada();
    }
    // Devuelve la lista de estadísticas
    public List<Estadisticas> getEstadisticasJugadores() {
        return estadisticasJugadores;
    }
    // Devuelve el J1
    public Jugador getJugador1() {
        return jugador1;
    }
    // Devuelve el J2
    public Jugador getJugador2() {
        return jugador2;
    }
    // Comparaciones
    public String jugada() {
        String resultado;
        if (jugador1.compareTo(jugador2) > 0) {
            resultado = "Gana J1";
            jugador1.victoria();
            jugador2.derrota();
        } else if (jugador1.compareTo(jugador2) < 0) {
            resultado = "Gana J2";
            jugador1.derrota();
            jugador2.victoria();
        } else {
            resultado = "Empate";
            jugador1.empate();
        }
        return resultado;
    }
}
