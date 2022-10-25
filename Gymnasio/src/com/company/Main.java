package com.company;

public class Main {

    public static void main(String[] args) {


        Socio unSocio = new Socio("32345345", "Elkin Fuentes","Gimnasio", 3403.0);
        SocioHabilitado unSocioHabilitado = new SocioHabilitado("340234","Melisa Torres","Gimnasio", 3340.4, 34343.4 );

        System.out.println(unSocio.toString());
        System.out.println(unSocioHabilitado.toString());

        System.out.println(unSocio.costoMensual());
        System.out.println(unSocioHabilitado.costoMensual());

        unSocioHabilitado.hacerRevisionMedica();

        System.out.println(unSocio.costoMensual());
        System.out.println(unSocioHabilitado.costoMensual());

    }
}
