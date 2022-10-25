package com.company;

public class Main {

    public static void main(String[] args) {


        Tamagochi tamagochi = new Tamagochi("Ronny");

        tamagochi.mimar();
        tamagochi.comer();
        tamagochi.beber();
        tamagochi.setState(new Sediento(tamagochi));
        tamagochi.comer();



    }
}
