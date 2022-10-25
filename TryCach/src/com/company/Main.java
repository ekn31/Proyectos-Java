package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String arquero = Jugador.arquero;
        String defesor = Jugador.defensor;
        String medicampista = Jugador.mediocampista;
        String delantero = Jugador.delantero;

        Seleccion argentina = new Seleccion("Argentina");


        // creo una lista de jugadores llamada reservas argentina y lo obtengo del metodo obtenerReserva
    ArrayList<Jugador> reservasArgentina = argentina.obtenerReserva();


    // recorro la lista reservasArgentina
    for (Jugador unJugador: reservasArgentina){
        System.out.println(unJugador.toString());  // imprimo cada jugador encontrado
    }

    }
}
