package com.company;

public class Main {

    public static void main(String[] args) {

        Cliente unCliente = new Cliente(1143343, "Elkin Fuentes");    // Creo la instacia del cliente
        Cliente otroCliente = new Cliente(34534,"Ronny");


        System.out.println("Hola mi nombre es: " + unCliente.getNombre());         // llamo al getter para obtener el nombre
        System.out.println("Hola mi nombre es: " + otroCliente.getNombre());




        System.out.println("Mi deudad es : " + unCliente.getDeuda());      // llamo al getter para obtener la deuda
        System.out.println("Mi deudad es : " + otroCliente.getDeuda());



        unCliente.incrementarDeuda(34.0);    // envio por parametro el valor y se lo paso al metodo crear deuda
        otroCliente.incrementarDeuda(50.0);

        System.out.println("Mi deudad aumento : " + unCliente.getDeuda());      // llamo al getter para obtener la deuda
        System.out.println("Mi deudad aumento : " + otroCliente.getDeuda());


        unCliente.pagarDeuda();
        otroCliente.pagarDeuda();

        System.out.println("Mi deudad ha sido pagada : " + unCliente.getDeuda());      // llamo al getter para obtener la deuda
        System.out.println("Mi deudad ha sido pagada : " + otroCliente.getDeuda());

        unCliente.setNombre("Elkin Rodriguez");
        otroCliente.setNombre("Ronny Rodriguez");
        System.out.println("Mi nuevo nombre es : " + unCliente.getNombre());      // llamo al getter para obtener la deuda
        System.out.println("Mi nuevo nombre es : " + otroCliente.getNombre());
    }
}
