package com.company;

import java.util.ArrayList;
import java.util.List;

public class Barco {

    // atributos

    private String nombre;
    private List<Carga> cargas;


    // constructor

    public Barco(String nombre) {
        this.nombre = nombre;
        cargas = new ArrayList<Carga>();
    }

    // METODO

    public void agregarCarga(Carga nuevaCarga){
        cargas.add(nuevaCarga);
    }

   public void generarInforme(){
           for(Carga cargas: cargas){
               System.out.println("Nombre barco: " + nombre + " "  + " Contiente: " + cargas.toString());

           }

   }
}
