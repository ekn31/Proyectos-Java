package com.company;

public class Auto {

    // atributos
    private String patente;
    private String marca;
    private String modelo;

    // constructor
    public Auto(String patente, String marca, String modelo){
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
    }

    // metodo
    public String getPatente(){return patente;}
    public String getMarca(){return marca;}
    public String getModelo(){return modelo;}

}
