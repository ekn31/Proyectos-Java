package com.company;

public class Tamagochi {

    // atributos
    private String nombre;
    private TamagochiState state;

    // constructor

    public Tamagochi(String nombre) {
        this.nombre = nombre;
        state = new Feliz(this);
    }

    //metodos
    public void beber(){
        state.beber();
    }

    public void comer(){
        state.comer();
    }

    public void mimar(){
        state.mimar();
    }

    // setter

    public void setState(TamagochiState state) {
        this.state = state;
    }


}


