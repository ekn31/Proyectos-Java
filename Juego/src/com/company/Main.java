package com.company;

public class Main {

    public static void main(String[] args) {

        UsuarioJuego user = new UsuarioJuego("Elkin","SDF4543");

        System.out.println("Mi nombre es " + user.getNombre());
        System.out.println("Mi clave es " + user.getClave());
        System.out.println("Mi nivel es " + user.getNivel());
        System.out.println("Mi puntaje es " + user.getPuntaje());


        System.out.println("comienza el juego.... " );

        user.aumentarPuntaje();
        System.out.println("Mi nuevo puntaje es " + user.getPuntaje());
        user.aumentarPuntaje();
        System.out.println("Mi nuevo puntaje es " + user.getPuntaje());
        user.aumentarPuntaje();
        System.out.println("Mi nuevo puntaje es " + user.getPuntaje());
        user.aumentarPuntaje();
        user.subirNivel();
        System.out.println("Mi nuevo puntaje es " + user.getPuntaje());
        System.out.println("Mi nuevo nivel es " + user.getNivel());
        user.aumentarPuntaje();
        user.bonus();
        System.out.println("Mi nuevo puntaje es " + user.getPuntaje());
        System.out.println("Mi nuevo nivel es " + user.getNivel());
        user.aumentarPuntaje();
        user.bonus();
        user.subirNivel();
        System.out.println("Mi puntaje final es " + user.getPuntaje());
        System.out.println("Mi nivel alcanzado fue " + user.getNivel());







    }
}
