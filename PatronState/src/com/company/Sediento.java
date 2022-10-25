package com.company;

public class Sediento implements TamagochiState{

    // atributos
    private Tamagochi tamagochi;


    // constructor
    public Sediento(Tamagochi tamagochi) {
        this.tamagochi = tamagochi;
    }


    // metodos
    @Override
    public void beber() {
        tamagochi.setState(new Feliz(tamagochi));
    }

    @Override
    public void comer() {
        System.out.println("Estoy sediento y me estas dando de comer");
    }

    @Override
    public void mimar() {
        System.out.println("Estoy sediento pero me estan mimando");
    }
}
