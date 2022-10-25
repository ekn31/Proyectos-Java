package com.company;

public interface CarritoState {

    // metodos

    public void cambiarEstado();
    public void vacio();
    public void cargando();
    public void pagando();
    public String estado();
}
