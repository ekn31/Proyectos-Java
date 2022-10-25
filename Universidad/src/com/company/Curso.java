package com.company;

public class Curso extends  OfertaAcademica {
    // atributos

    private Integer cargaHoraria;
    private Integer mesDuracion;
    private Integer valorHora;



    public Curso(String nombre, String descripcion, Integer cargaHoraria, Integer mesDuracion, Integer valorHora) {
        super(nombre, descripcion);
        this.cargaHoraria = cargaHoraria;
        this.mesDuracion = mesDuracion;
        this.valorHora = valorHora;
        precio = 0;

    }

    @Override
    public Integer precio(){
         return precio = ((cargaHoraria * mesDuracion) * valorHora);
    }


    // setter and getter

    public Integer getPrecio() {
        return precio;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public Integer getMesDuracion() {
        return mesDuracion;
    }

    public Integer getValorHora() {
        return valorHora;
    }
}



