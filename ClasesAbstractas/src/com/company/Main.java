package com.company;

public class Main {

    public static void main(String[] args) {

        Impresora unaImpresora = new ImpresoraEpson("EP423", "USB");

        System.out.println(unaImpresora.imprimir());

        unaImpresora = new ImpresoraCannon("C342", "CABLE");
        unaImpresora.setHojasDisponibles(1);
        System.out.println(unaImpresora.imprimir());
        System.out.println(unaImpresora.imprimir());

    }
}
