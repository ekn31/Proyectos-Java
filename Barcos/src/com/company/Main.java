package com.company;

public class Main {

    public static void main(String[] args) {

        Capitan capitan = new Capitan("Elkin", "Fuentes", "ADS345D");
        Capitan capitan2 = new Capitan("Ronny", "alberto", "AD3567D");
        Yate yate1 = new Yate(capitan,3000.0, 1500.0,2021, 30,4 );
        Yate yate2 = new Yate(capitan,4000.0, 2500.0,2020, 20,2 );
        Velero velero1 = new Velero(capitan,4000.0,1200.0,2021,70,2);

        System.out.println(yate1.precioAlquiler());
        System.out.println(yate1.compareTo(yate2));
        System.out.println(velero1.precioAlquiler());
        System.out.println(velero1.tamaño());
        System.out.println(velero1.toString());
        System.out.println(yate1.toString());
    }
}
