package com.company;

public class Pagando implements CarritoState{

    // atributos
    private Carrito carrito;
    static String estado = "PAGANDO";

    // constructor


    public Pagando(Carrito carrito) {
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
