package com.company;

public class Articulo {

    // atributos (siempre van en privado)
    private String descripcion;
    private double precioVenta;
    private int stock;


    // metodos
    public Articulo(String descripcion, double precio, int stock){  // Constructor

        this.descripcion= descripcion;
        precioVenta = precio;
        this.stock = stock;

    }


    //metodos get y set
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;

    }
    public String getDescripcion(String descripcion){
        return descripcion;
    }



    // metodos para la clase
    public boolean hayStock(){
        return stock>0;
    }

    public double consultarPrecio(){
        return precioVenta;
    }

}
