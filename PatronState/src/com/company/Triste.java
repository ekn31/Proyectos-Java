package com.company;

public class Triste implements TamagochiState{

    // atributos
    private Tamagochi tamagochi;


    // constructor
    public Triste(Tamagochi tamagochi) {
        this.tamagochi = tamagochi;
    }

    // metodos

    @Override
    public void beber() {
        System.out.println("Beep");
        System.out.println("Beep");
        System.out.println("Beep");
        System.out.println("***********");
    }

    @Override
    public void comer() {
        System.out.println("Beep");
        System.out.println("Beep");
        System.out.println("vomito");
    }

    @Override
    public void mimar() {
        tamagochi.setState(new Feliz(tamagochi)); // se cambia el estado
    }
}
