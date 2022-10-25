package com.company;

public class Jugador implements  Comparable{
     // atributos
    private Integer nroCamiseta;
    private String nombre;
    private Boolean lesionado;
    private Boolean titular;

    // constructor

    public Jugador(Integer nroCamiseta, String nombre, Boolean lesionado, Boolean titular) {
        this.nroCamiseta = nroCamiseta;
        this.nombre = nombre;
        this.lesionado = lesionado;
        this.titular = titular;
    }

    // comparable
    @Override
    public int compareTo(Object object) {
        Jugador otroJugador = (Jugador) object;
        return  nroCamiseta - otroJugador.nroCamiseta;
    }

    public Boolean getTitular() {
        return titular;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nroCamiseta=" + nroCamiseta +
                ", nombre='" + nombre + '\'' +

                '}';
    }

    public Boolean getLesionado() {
        return lesionado;
    }
}
