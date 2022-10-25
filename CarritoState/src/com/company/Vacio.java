package com.company;

import java.util.Collections;

public class Vacio implements CarritoState{

    // atributo: se debe pasar un atributo de la clase que va a implementar este estado

    private Carrito carrito;
    static String estado = "VACIO";


    // constructor
    public Vacio(Carrito carrito) {

        this.carrito = carrito;
    }


    // metodos

    @Override
    public void cambiarEstado() {
        if (carrito.getProductos() == 0) {
            System.out.println("carrito vacio, debe agregar productos");

        }
        if (carrito.getProductos() > 0){
            System.out.println("su estado actual es");
        }


    }

    @Override
    public void vacio() {
        System.out.println("El carrito ya esta vacio");
    }

    @Override
    public void cargando() {
        System.out.println("Debe agregar productos al carrito");
    }

    @Override
    public void pagando() {
        System.out.println("No puede pagar si no tiene productos");
    }

    @Override
    public String estado() {
        return estado;
    }

    // getter

    public static String getEstado() {
        return estado;
    }
}
