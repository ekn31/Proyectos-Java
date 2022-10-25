package com.company;

public class Main {

    public static void main(String[] args) {

        Dueño dueño1 = new Dueño("Elkin","Fuentes", 1143348012);
        Dueño dueño2 = new Dueño("David", "Rodriguez", 2108433411);
        Camion camion1 = new Camion(dueño1,"20021-12-23","Chevrolet","UAL315", "EXTRANJERO", 4,30);
        Camion camion2 = new Camion(dueño2,"20020-03-23","Hyundai","UEY034", "NACIONAL", 6,40);
        Automovil automovil1 = new Automovil(dueño1,"2020-03-13","Suzuki","SKF436","NACIONAL","GAS",1400);
        Automovil automovil2 = new Automovil(dueño2,"2021-04-25","Nissan","ADF945","EXTRANJERO","GASOLINA",1400);

        System.out.println("El automovil 1: " + automovil1.valoracion());
        System.out.println("El automovil 2: " + automovil2.valoracion());

        camion1.compareTo(camion2);
        System.out.println(camion1.mayor());

    }



}
