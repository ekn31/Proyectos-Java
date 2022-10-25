package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Date fecha = new Date();
        Perros perro1 = new Perros(true,true,"pequinez",
               fecha , 6.0,true,"Ronny");

       // System.out.println("El perro " + perro1.getNombre() + " ¿Se puede adoptar?: " + perro1.getEstadoAdopcion());
        System.out.println("El perro " + perro1.getNombre() + perro1.sePuedePerder(perro1.getChip()));
        System.out.println("El perro " + perro1.getNombre() + perro1.enviarAdopcion(perro1.getPeso(), perro1.getEstadoSalud()));

    }
}
