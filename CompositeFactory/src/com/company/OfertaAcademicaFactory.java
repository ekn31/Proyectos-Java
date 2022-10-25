package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OfertaAcademicaFactory {
    // inicio de singleton
    private static OfertaAcademicaFactory instance; // crea la instancia

    // constructor de la factory
    private OfertaAcademicaFactory(){}

    // responsabilidad

    public static OfertaAcademicaFactory getInstance(){
        if(instance == null){
            instance = new OfertaAcademicaFactory();
        }
        return instance;
    }
    // fin de singleton

    // aqui inicia la factory
    public OfertaAcademica crearOferta(String codigo){
        switch (codigo){
            case "Front End":
                return new Curso("Curso de FrontEnd", "Este es un curso de FrontEnd",14,2,1000);
            case "Back End":
                return new Curso("Curso de Back End", "Este es un curso de BackEnd",20,2,9000);
            case "Full Stack":

                List<OfertaAcademica> cursoFullStack = new ArrayList<OfertaAcademica>();
                cursoFullStack.add(new Curso("Curso de FrontEnd", "Este es un curso de FrontEnd",14,2,1000));
                cursoFullStack.add(new Curso("Curso de Back End", "Este es un curso de BackEnd",20,2,9000));
                return new Programa("Programa Full Stack", "Este es un programa FullStack", cursoFullStack, 20);

            default:
                throw new RuntimeException("No existe el codigo");
        }

    }
}
