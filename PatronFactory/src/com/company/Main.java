package com.company;

public class Main {

    public static void main(String[] args) {

        Empresa digitalHouse = new Empresa("Digital House");

        digitalHouse.contratarEmpleado("Elkin", "Fuentes", 12345, "EMP-INT");
        digitalHouse.contratarEmpleado("Ronny", "Rodiguez", 1455, "EMP-ET");

    }
}
