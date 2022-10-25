package com.company;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Curso FrontEnd = new Curso("FrontEnd","FrontEnd",16,2,1000);
        Curso BackEnd = new Curso("BackEnd","BackEnd",20,2,900);

        ProgramasIntensivos FullStack = new ProgramasIntensivos("FullStack","FullStack",20);


        System.out.println("Curso " + FrontEnd.getNombre() + " tiene una carga horaria de " + FrontEnd.getCargaHoraria() + " horas mensuales");
        System.out.println("de " + FrontEnd.getMesDuracion() + " meses de duracion, con un precio de " + FrontEnd.getValorHora() + " pesos la hora");
        System.out.println("es decir, tiene un precio de " + FrontEnd.precio());

        System.out.println("##########################################################################################################################");

        System.out.println("Curso " + BackEnd.getNombre() + " tiene una carga horaria de " + BackEnd.getCargaHoraria() + " horas mensuales");
        System.out.println("de " + BackEnd.getMesDuracion() + " meses de duracion, con un precio de " + BackEnd.getValorHora() + " pesos la hora");
        System.out.println("es decir, tiene un precio de " + BackEnd.precio());

        System.out.println("##########################################################################################################################");

        FullStack.precio(32000);
        FullStack.precio(36000);
        System.out.println(FullStack.getPrecio());


        System.out.println("El programa FullStack ofrece ambas materias " + BackEnd.getNombre() + " y " + FrontEnd.getNombre() + " y cuyo porcentaje de bonificacion es de " + FullStack.getPorcentaje()+"%");
        System.out.println("tiene un precio final de " + FullStack.precioFinal());

    }




}
