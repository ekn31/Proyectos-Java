package com.company;

public abstract class Animal {

    // atributos
    private String nombre;
    private Integer edad;

    // constructor

    public Animal(String nombre, Integer edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    // metodo

    public abstract void hacerRuido(); // metodos abtractos no usan llaves
}
