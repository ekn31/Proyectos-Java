package com.company;

import java.util.ArrayList;
import java.util.List;

public class Instituto {

    // atributos
    private String nombre;
    private List<OfertaAcademica> ofertasAcademicas;

    public Instituto(String nombre) {
        this.nombre = nombre;
        ofertasAcademicas = new ArrayList<OfertaAcademica>();
    }

    public void agregarOferta(OfertaAcademica nuevaOferta){
        ofertasAcademicas.add(nuevaOferta);
    }

    public void generarInforme(){
        for(OfertaAcademica ofertaAcademica: ofertasAcademicas){
            System.out.println(nombre + ofertaAcademica.toString());
        }
    }
}
