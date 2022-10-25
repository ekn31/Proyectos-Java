package com.company;


import java.util.List;

public class Contenedor extends Carga{

    private double peso;
    private List<CargaSimple> cargas;

    // constructor


    public Contenedor(String nombre, String descripcion, List<CargaSimple> cargas, Double peso) {
        super(nombre, descripcion);
        this.cargas = cargas;
        this.peso = peso;
    }



    @Override
    public Double peso() {
        Double pesoTotal = 0.0;
        for (CargaSimple cargas: cargas ){
            pesoTotal += cargas.getPeso();

        }
        return pesoTotal + peso;
    }

    @Override
    public String toString() {
        return "Contenedor{" +
                "peso=" + peso +
                ", cargas=" + cargas +
                '}';
    }

    // getter

    public List<CargaSimple> getCargas() {
        return cargas;
    }
}
