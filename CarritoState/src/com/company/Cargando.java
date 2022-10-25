package com.company;

public class Cargando implements CarritoState{

    // atributo

    private Carrito carrito;
    static String estado = "CARGANDO";

    // constructor


    public Cargando(Carrito carrito) {
        this.carrito = carrito;
    }

    // metodos

    @Override
    public void cambiarEstado() {

    }

    @Override
    public void vacio() {

    }

    @Override
    public void cargando() {

    }

    @Override
    public void pagando() {

    }

    @Override
    public String estado() {
        return estado;
    }
}
