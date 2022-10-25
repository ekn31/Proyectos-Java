package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    Scanner miScanner = new Scanner(System.in);    // permite capturar datos por pantalla

    System.out.print("Ingrese nombre del perro: ");
    String nombrePerro = miScanner.nextLine();  // asinga a la variable lo ingresado por pantalla

    System.out.print("Ingrese cantidad de alimentos: ");
    Integer comidaPerro = miScanner.nextInt();    // asigna a la variable el dato ingresado por consola (int)


        while (comidaPerro < 3) {

            System.out.print("Ingrese nuevamente, la cantidad de alimentos diario tiene que ser minimo 3kg: ");
             comidaPerro = miScanner.nextInt();

        }

        System.out.println(("La cantidad de comida de " + nombrePerro + " es " + comidaPerro));



        System.out.print(nombrePerro + " precisa " + cuantosPaquetes(comidaPerro, miScanner));  // se envian los parametros a la funcion

    }

    public static Integer cuantosPaquetes (Integer comidaPerro, Scanner miScanner){   // paso los parametros a mi funcion

        Integer cantidadDePaquetes= 0;   // inicia en cero la cantidad de paquetes
        Double totalPesoPaquete = 0.0;   // incia en cero el total de peso



                while (totalPesoPaquete < comidaPerro){   // si un peso es menor que la comida de perro, entra al while

                     System.out.print("Ingrese la cantidad de comida de un paquete: ");
                     Double pesoPaquete = miScanner.nextDouble();
                     totalPesoPaquete = totalPesoPaquete + pesoPaquete;  // toma el peso del paquete ingresado y lo va sumando
                     cantidadDePaquetes++;
                }



                return  cantidadDePaquetes;



    }
}
