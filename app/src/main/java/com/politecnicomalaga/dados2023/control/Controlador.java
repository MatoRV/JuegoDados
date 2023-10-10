package com.politecnicomalaga.dados2023.control;

//Import del modelo
import com.politecnicomalaga.dados2023.model.Estadisticas;
import com.politecnicomalaga.dados2023.model.Partida;
import com.politecnicomalaga.dados2023.model.Tiradas;

//Import del view
import com.politecnicomalaga.dados2023.view.MainActivity;

import java.util.ArrayList;
import java.util.List;


public class Controlador {
    // Patrón de diseño Singleton
    private static Controlador singleton;

    // Este posee las instancias del modelo. Composición
    private Partida partida;


    //CONSTRUCTOR PRIVADO: es un singleton
    private Controlador() {
        partida = new Partida();
    }

    //Llamada al singleton
    public static Controlador getSingleton() {
        if (singleton == null) return singleton = new Controlador();
        return singleton;
    }

    //Métodos de trabajo con el modelo y la vista
    public String[][] jugarPartida() {
        // Array Bidimensional Irregular
        String[][] datos = new String[3][];
        // Tirada nueva
        partida.tiradas();

        datos[0] = new String[1];
        for (int i = 1;i < datos.length;i++) {
            datos[i] = new String[5];
        }
        // Llamada a la lista de estadísticas de cada jugador
        List<Estadisticas> estadisticasJugadores = partida.getEstadisticasJugadores();

        // Datos resultado
        datos[0][0] = partida.jugada();

        // Datos J1
        datos[1][0] = String.valueOf(partida.getJugador1().getTirada().getD1().getNum());
        datos[1][1] = String.valueOf(partida.getJugador1().getTirada().getD2().getNum());
        datos[1][2] = String.valueOf(estadisticasJugadores.get(0).getVictorias());
        datos[1][3] = String.valueOf(estadisticasJugadores.get(0).getDerrotas());
        datos[1][4] = String.valueOf(estadisticasJugadores.get(0).getEmpates());

        // Datos J2
        datos[2][0] = String.valueOf(partida.getJugador2().getTirada().getD1().getNum());
        datos[2][1] = String.valueOf(partida.getJugador2().getTirada().getD2().getNum());
        datos[2][2] = String.valueOf(estadisticasJugadores.get(1).getVictorias());
        datos[2][3] = String.valueOf(estadisticasJugadores.get(1).getDerrotas());
        datos[2][4] = String.valueOf(estadisticasJugadores.get(1).getEmpates());

        return datos;
    }
}
