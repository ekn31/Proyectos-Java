package com.company;

import java.util.List;

public class Programa extends OfertaAcademica{

    private List<OfertaAcademica> ofertasAcademicas;
    private Integer bonificacion;


    public Programa(String nombre, String descripcion, List<OfertaAcademica> ofertasAcademicas, Integer bonificacion) {
        super(nombre, descripcion);
        this.ofertasAcademicas = ofertasAcademicas;
        this.bonificacion = bonificacion;
    }

    @Override
    public Integer precio() {
        Integer precioCursos = 0;
        for (OfertaAcademica curso : ofertasAcademicas){
            precioCursos += curso.precio();
        }
        return precioCursos * (100-bonificacion)/100;
    }
}
