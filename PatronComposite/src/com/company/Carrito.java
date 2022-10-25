package com.company;

import java.util.ArrayList;
import java.util.List;

public class Carrito {

    private List<Producto> productos;

    public Carrito() {
        productos = new ArrayList<Producto>();
    }

    public void agregarProducto(Producto producto){
        productos.add(producto);
    }

    public Double totalCompra(){
        Double costoTotalProductos = 0.0;
        for (Producto producto: productos){
            costoTotalProductos += producto.costo();
        }
        return costoTotalProductos;
    }
}
