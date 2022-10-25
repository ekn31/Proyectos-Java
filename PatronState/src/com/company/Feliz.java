package com.company;

public class Feliz implements TamagochiState{

    private Tamagochi tamagochi;

    // constructor
    public Feliz(Tamagochi tamagochi) {
        this.tamagochi = tamagochi;
    }


    // metodos
    @Override
    public void beber() {
        System.out.println("Beep");
        System.out.println("Beep");
        System.out.println("Beep");
        System.out.println("Beep");
        System.out.println("Beep");
    }

    @Override
    public void comer() {
        System.out.println("Estoy feliz y estoy comiendo");
    }

    @Override
    public void mimar() {
        System.out.println("Estoy feliz y me estan haciendo mimos");

    }
}
