package com.company;

public class Main {

    public static void main(String[] args) {

        Contenedor unoContenedor = new Contenedor(1456,"Desconocida",true);
        Contenedor dosContenedor = new Contenedor(1346,"EEUU",true);
        Contenedor tresContenedor = new Contenedor(1298,"Desconocida",true);

        Puerto puerto = new Puerto("Argentina");

        puerto.addContenedor(unoContenedor);
        puerto.addContenedor(dosContenedor);
        puerto.addContenedor(tresContenedor);

        puerto.ordenarContenedores();
        unoContenedor.compareTo(dosContenedor);
        System.out.println(unoContenedor.mayor());

        System.out.println("En el puerto de " + puerto.getNombre() + " Existen " + puerto.candtidadPeligroso() + " contenedores peligrosos");
    }
}
