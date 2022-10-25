package com.company;

import java.util.List;

public class Combo implements Producto{

    private String nombre;
    private List<Producto> productos;
    private Integer descuento;

    public Combo(String nombre, List<Producto> productos, Integer descuento) {
        this.nombre = nombre;
        this.productos = productos;
        this.descuento = descuento;
    }

    public Combo() {
    }

    @Override
    public Double costo() {
        Double costoTotalProductos = 0.0;
        for (Producto producto: productos){
            costoTotalProductos += producto.costo();
        }
        return costoTotalProductos + (100 - descuento) /100;
    }
}
