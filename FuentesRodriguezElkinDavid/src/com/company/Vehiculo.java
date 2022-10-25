package com.company;

public abstract class Vehiculo {

    // atributos

    private Dueño dueño;
    private String fecha;
    private String marca;
    private String patente;
    private String tipo;

    // constructor

    public Vehiculo(Dueño dueño, String fecha, String marca, String patente, String tipo) {
        this.dueño = dueño;
        this.fecha = fecha;
        this.marca = marca;
        this.patente = patente;
        this.tipo = tipo;
    }

    // getter

    public String getTipo() {
        return tipo;
    }
}
