package com.company;

public class Persona implements Comparable{
    // atributos
    private int edad;


    // metodos
    public int getEdad(){
        return this.edad;
    }

    public void decirEdad(){
        System.out.println(this.edad);
    }

    @Override
    public int compareTo(Object o) {
        return this.edad -((Persona) o).getEdad();  // se castea y se hace la resta
    }
}
