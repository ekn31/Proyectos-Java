package com.company;


import java.util.ArrayList;
import java.util.List;

public class Equipo {

    // atributos
    private String nombre;
    private List<Jugador> jugadores;


    // constructor
    public Equipo(String nombre) {
        this.nombre = nombre;
        jugadores = new ArrayList<Jugador>();  // referencio la lista con la clase
    }

    // metodos

    public void addJugador(Jugador unJugador) {
        jugadores.add(unJugador);
    }

    public void mostrarJudadoresTitulares() {

        jugadores.sort(null);   // ordena toda la lista

        for (Jugador jugador : jugadores) {    // (clase atributo : atributoDeLaLista)
            if (jugador.getTitular()) {
                System.out.println(jugador.toString());
            }
        }

    }

    public int getCantidadJugadoresLesionados(){
        int cantidadJugadoresLesionados = 0;

        for (Jugador jugador : jugadores) {

            if (jugador.getTitular() && jugador.getLesionado()){
                cantidadJugadoresLesionados++;
            }

        }

        return cantidadJugadoresLesionados;
    }

}
