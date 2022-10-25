package com.company;

public class Main {

    public static void main(String[] args) {

        Barco barco = new Barco("POO");

        Carga TV = CargaFactory.getInstance().crearCarga("TV LED");
        Carga Medicamentos = CargaFactory.getInstance().crearCarga("Medicamentos");
        Carga Contenedor = CargaFactory.getInstance().crearCarga("Evergreen");


        barco.agregarCarga(Contenedor);

        barco.generarInforme();




    }
}
