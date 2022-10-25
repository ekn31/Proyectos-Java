package com.company;

import java.awt.*;
import java.io.InputStream;
import java.util.Scanner;
import java.util.SplittableRandom;

public class Main {

    public static void main(String[] args) {
        // write your code here


        // Programa para saber si un numero es divisible por otro
        /*   int x = 10;
        int y = 3;
        if ((x%y == 0)){

            System.out.println("El numero " + x + " si es divisible por " + y);
            System.out.println("El resultado de la division es : " + (x/y));
        }

        else {
            System.out.println("El numero " + x + " no es divisible por " + y);

        }
       */

        // uso de clases
        /*  Articulo articulo;  // instancia de la clase articulo
        articulo = new Articulo("articulo1",1000,100);  // le envia los parametros al objeto
        System.out.println("Precio: "+ articulo.consultarPrecio());  // usa el metodo del objeto
         */


        // comparacion de string
        /*String x = "ELKIN";
        String y = "ELIN";

        if (x==y){
            System.out.println("Son iguales");
        }
        else{
            System.out.println("Son diferentes");
        }



         */

        // comparacion de dos numero
        /*Integer x = 11;
        Integer y = 11;

        if (x>y){
            System.out.println(x + " es mayor que " + y);
        }
        else if (x<y){
            System.out.println(y + " es mayor que " + x);
        }
        else {
            System.out.println(x + " es igual " + y);
        }

         */


        // piedra, papel o tijera
/*
        Scanner miScanner = new Scanner(System.in);
        String jugador1;
        String jugador2;

        System.out.println("Ingrese nombre de jugador 1: ");
        jugador1 = miScanner.nextLine();
        System.out.println("Ingrese nombre de jugador 2: ");
        jugador2 = miScanner.nextLine();

        String jp1;
        String jp2;

        System.out.println("Eleccion jugador uno : ¿PIEDRA, PAPEL, TIJERA?");
        jp1 = miScanner.nextLine();
        System.out.println("Eleccion jugador uno : ¿PIEDRA, PAPEL, TIJERA?");
        jp2 = miScanner.nextLine();

        System.out.println("Jugada de juador 1: " + cualGana(jp1));



    }

      public static String cualGana(String jp1){

        return jp1;
      }

    }
*/

        // saldo

        Saldo saldo1 = new Saldo(34545, 23435345.3);

        System.out.println(saldo1.getSaldo());
        saldo1.retirar(99999999999999.4);
        System.out.println(saldo1.getSaldo());


    }
}


