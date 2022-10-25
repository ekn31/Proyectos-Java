package com.company;

public class Chofer {
    // atributos
    private String nombre;
    private String apellido;
    private Auto auto;

    // constructor
    public Chofer(String nombre, String apellido, Auto auto){
        this.nombre = nombre;
        this.apellido = apellido;
        this.auto = auto;
    }

    // metodos

    public String verPatente(){ return auto.getPatente();}
}
