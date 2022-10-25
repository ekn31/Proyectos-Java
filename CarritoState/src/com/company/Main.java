package com.company;

public class Main {

    public static void main(String[] args) {

        Carrito carrito = new Carrito("Elkin Fuentes");

        Producto p1 = new Producto("Pan", 2000.0);
        Producto p2 = new Producto("Coca-cola", 3000.0);

        System.out.println("El dueño del carrito es " + carrito.getNombreComprador() + " y su estado es: " + carrito.estado());

        System.out.println("primer estado");
        System.out.println(carrito.estado());
        carrito.cambiarEstado();
        System.out.println("agrego producto");
        carrito.agregarProducto(p1);
        carrito.cambiarEstado();
        carrito.cancelarCarrito();
        System.out.println(carrito.estado());
        carrito.cambiarEstado();




    }
}
