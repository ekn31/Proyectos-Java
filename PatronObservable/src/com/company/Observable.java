package com.company;

public interface Observable {

    public void agregarSeguidor (Observer nuevoSeguidor);
    public void eliminarSeguidor (Observer actualSeguidor);
    public void notificarSeguidor();
}
