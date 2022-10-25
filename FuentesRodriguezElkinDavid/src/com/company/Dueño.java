package com.company;

public class Dueño {
    // atributos

    private String nombre;
    private String apellido;
    private Integer cuil;

    // constructor

    public Dueño(String nombre, String apellido, Integer cuil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuil = cuil;
    }

    // getter


    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getCuil() {
        return cuil;
    }
}
