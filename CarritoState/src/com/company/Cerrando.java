package com.company;

public class Cerrando implements CarritoState{

    // atributos

    private Carrito carrito;
    static String estado = "CARGANDO";

    // constructor

    public Cerrando(Carrito carrito) {
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
