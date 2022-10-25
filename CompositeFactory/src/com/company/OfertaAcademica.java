package com.company;

public abstract class  OfertaAcademica {

    private String nombre;
    private String descripcion;

    public OfertaAcademica(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public abstract Integer precio();

    @Override
    public String toString() {
        return "OfertaAcademica{" +
                "nombre='" + nombre + '\'' +
                ", precio='" + precio() + '\'' +
                '}';
    }
}
