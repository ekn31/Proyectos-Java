package com.company;

public class Main {

    public static void main(String[] args) {

        Instituto HighSchool = new Instituto("HighSchool");

        OfertaAcademica cursoBackEnd = OfertaAcademicaFactory.getInstance().crearOferta("Back End");
        OfertaAcademica cursoFrontEnd = OfertaAcademicaFactory.getInstance().crearOferta("Front End");
        OfertaAcademica cursoFullStack = OfertaAcademicaFactory.getInstance().crearOferta("Full Stack");


        HighSchool.agregarOferta(cursoBackEnd);
        HighSchool.agregarOferta(cursoFrontEnd);
        HighSchool.agregarOferta(cursoFullStack);

        HighSchool.generarInforme();
    }
}
