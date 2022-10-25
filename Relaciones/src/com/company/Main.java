package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Chofer chofer;
        chofer = new Chofer("Elkin", "Fuentes", new Auto("ase34a", "Hyunday","2020"));
        System.out.println("Patente: " + chofer.verPatente());
    }
}
