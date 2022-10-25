package com.company;

public class Main {

    public static void main(String[] args) {

        Jugador primerJugador = new Jugador(10, "Elkin", true, true);
        Jugador segundoJugador = new Jugador(1, "Fuents", false, true);
        Jugador tercerJugador = new Jugador(5, "Ronny", false, false);

        Equipo unEquipo = new Equipo("Los Fuentes");

        unEquipo.addJugador(primerJugador);
        unEquipo.addJugador(segundoJugador);
        unEquipo.addJugador(tercerJugador);

        unEquipo.mostrarJudadoresTitulares();

        unEquipo.getCantidadJugadoresLesionados();

        System.out.println("La cantidad de personas lesionadas en el equipo es de: " + unEquipo.getCantidadJugadoresLesionados());

    }
}
