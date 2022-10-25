package com.company;

import java.util.ArrayList;
import java.util.List;

public class Seleccion {

    private String nombre;
    private List<Jugador> plantel;

    public Seleccion(String nombre) {
        this.nombre = nombre;
        plantel = new ArrayList<>();

    }

    public void convocar(Jugador unJugador){
        plantel.add(unJugador);
    }

    public ArrayList<Jugador> obtenerReserva(){
        ArrayList<Jugador> reservas = new ArrayList<Jugador>(); // creo una lista vacia de la clase Jugador llamada reservas
        for (Integer indice = 18; indice < 23; indice++ ){   // recorre la lista desde el indice 18 hasta el 23
            Jugador unJugadorReserva = plantel.get(indice);  // obtiene el jugador de la lista plantel y lo guarda en un nuevo objeto "Jugador"

            reservas.add(unJugadorReserva);   // agrega el jugador encontrado a una nueva lista llamada reservas
        }


        return reservas;
    }

    public Integer cantJugdores(String posicion) {
        if(!(Jugador.arquero.equals(posicion) || Jugador.defensor.equals(posicion) || Jugador.delantero.equals(posicion) || Jugador.mediocampista.equals(posicion))){

            throw new RuntimeException("No existe la posicion " + posicion);
        }

        Integer cantJugadoresEnPosicion = 0;   // contador

        for (Jugador unJugador : plantel) {   // de la lista plantel, guardo el jugador recorrido en la variable unJugador
            if (unJugador.getPosicion().equals(posicion)) { // pregunto si es igual a la posicion por parametro
                cantJugadoresEnPosicion++;
            }

        } return cantJugadoresEnPosicion;

    }


}
