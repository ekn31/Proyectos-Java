package com.company;

import java.util.ArrayList;
import java.util.List;

public class Carrito {

    // atributos
     private CarritoState state;   // agregamos es estado que obtiene de la interface
     private List<Producto> productos;
     private String nombreComprador;



     // constructor


    public Carrito(String nombre) {
        nombreComprador = nombre;
        productos = new ArrayList<Producto>(); // creo una lista de jugador vacia
        state = new Vacio(this);   // creamos un stado nuevo y se lo asignamos a esta misma clase
    }


    public void agregarProducto(Producto producto){

        setState(new Cargando(this));
        productos.add(producto);   // agrego un producto  a la lista
        System.out.println("PASANDO A ESTADO: " + state.estado());


    }

    public void  eliminarProducto(Producto producto){
        productos.remove(producto);
    }

    public void mostrarProductos() {
        for (Producto producto : productos) {    // (clase atributo : atributoDeLaLista)
            System.out.println(producto.toString());
        }
    }

    public void cambiarEstado(){
        state.cambiarEstado();
    }

    public void cancelarCarrito(){
        productos.clear();
        setState(new Vacio(this));
    }

    // getter


    public CarritoState getState() {
        return state;
    }

    public String getNombreComprador() {
        return nombreComprador;
    }

    public int getProductos() {
        return productos.size();
    }

    public String estado(){
        return state.estado();
    }

    //setter


    public void setState(CarritoState state) {
        this.state = state;
    }


}
