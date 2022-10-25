package com.company;

public class Hambriento implements TamagochiState {

    private Tamagochi tamagochi;

    public Hambriento(Tamagochi tamagochi) {
        this.tamagochi = tamagochi;
    }

    @Override
    public void beber() {
        System.out.println("Estoy hambriento y me estas dando de tomar");
    }

    @Override
    public void comer() {
        tamagochi.setState(new Feliz(tamagochi));
    }

    @Override
    public void mimar() {
        System.out.println("Estoy hambriento y me estan mimando");
    }
}
