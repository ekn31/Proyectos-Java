package com.company;

public class CargaSimple extends Carga{

    // atributos
     private Double peso;
     private Boolean refrigeracion;



    public CargaSimple(String nombre, String descripcion, Double peso, Boolean refrigeracion) {
        super(nombre, descripcion);
        this.peso = peso;
        this.refrigeracion = refrigeracion;

    }

    // constructor


    @Override
    public Double peso() {
        if(refrigeracion == true){
            return peso * 1.1;
        }
        else { return peso;}

    }


    // getter

    public Double getPeso() {
        return peso;
    }
}
