package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    Scanner miScanner = new Scanner(System.in);   // pedir datos por pantalla

    System.out.print("Ingrese su nombre: ");
    String unNombre = miScanner.nextLine();   // Asignamos lo ingresado a una variable

    System.out.print("Ingrese su apellido: ");
    String unApellido = miScanner.nextLine();

    Character inicialNombre = unNombre.charAt(0);  // toma el primer caracter
    Character inicialApellido = unApellido.charAt(0);

    //System.out.println(inicialNombre.toString() + inicialApellido.toString() );  // el .toString toma el valor como un string
    // String unasIniciales = "" + inicialNombre + inicialApellido

        String unasIniciales = new StringBuilder().append(inicialNombre).append(inicialApellido).toString(); // StringBuilder construye un string, y agrego con append
        System.out.println(unasIniciales);

        System.out.print("Ingrese su dia de nacimiento : ");
        Integer unDia = miScanner.nextInt();
        System.out.print("Ingrese su mes de nacimiento : ");
        Integer unMes = miScanner.nextInt();
        System.out.print("Ingrese su año de nacimiento : ");
        Integer unAnio = miScanner.nextInt();

        System.out.println("Mi fecha de nacimiento es : " +unDia+ "/" + unMes +"/" + unAnio);

        System.out.println("Mi fecha completa : " + fecha(unDia,unMes,unAnio)); // llamo la funcion fecha y le envio los parametros

    }

    //FUNCION

    public static String fecha(Integer dia, Integer mes, Integer anio){
        return dia + "/" + mes + "/" + anio;
    }
}
