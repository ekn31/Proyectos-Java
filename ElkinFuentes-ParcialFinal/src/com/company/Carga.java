package com.company;

public abstract class Carga {

    // atributos
    private String nombre;
    private String descripcion;

    // contructor


    public  Carga(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    // metodo
    public  abstract Double peso();

    @Override
    public String toString() {
        return "Carga{" +
                " descripcion='" + descripcion + '\'' +
                "peso='" + peso() + '\'' +
                '}'
                ;
    }
}
