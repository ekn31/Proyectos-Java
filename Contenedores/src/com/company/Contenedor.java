package com.company;

public class Contenedor implements Comparable{

    // atributos
    private int numero;
    private String descripcion;
    private Boolean peligroso;
    private int mayor;

    // constructor


    public Contenedor(int numero, String descripcion, Boolean peligroso) {
        this.numero = numero;
        this.descripcion = descripcion;
        this.peligroso = peligroso;
    }

    // metodo
    @Override
    public int compareTo(Object object) {
        Contenedor otroContenedor = (Contenedor) object;
        return numero - otroContenedor.getNumero();
    }

    public int getNumero() {
        return numero;
    }

    public Boolean getPeligroso() {
        return peligroso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "Contenedor{" +
                "numero=" + numero +
                ", descripcion='" + descripcion + '\'' +
                ", peligroso=" + peligroso +
                '}';
    }

    public String mayor(){
        if(mayor>1){
           return "El contenedor 1 es mayor";
        }else if(mayor<1){
            return "El contenedor 2 es mayor";
        }
        else return  "Son iguales";
    }

}
