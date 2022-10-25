package com.company;

public class Curso extends OfertaAcademica{

    private  Integer cargaHoraria;
    private  Integer cantidadMeses;
    private  Integer valorHora;

    public Curso(String nombre, String descripcion, Integer cargaHoraria, Integer cantidadMeses, Integer valorHora) {
        super(nombre, descripcion);
        this.cargaHoraria = cargaHoraria;
        this.cantidadMeses = cantidadMeses;
        this.valorHora = valorHora;
    }

    @Override
    public Integer precio() {
        return cargaHoraria * cantidadMeses * valorHora;
    }
}
