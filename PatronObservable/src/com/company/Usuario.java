package com.company;

import java.util.ArrayList;
import java.util.List;

public class Usuario implements Observable{

    private String nombre;
    private String apellido;
    private List<Observer> seguidores;

    public Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        seguidores = new ArrayList<Seguidor>();
    }

    @Override
    public void agregarSeguidor(Observer nuevoSeguidor) {
        seguidores.add(nuevoSeguidor);
    }

    @Override
    public void eliminarSeguidor(Observer actualSeguidor) {
       seguidores.remove(actualSeguidor);
    }

    @Override
    public void notificarSeguidor() {

        for()

    }
}
