package com.company;

public class ProgramasIntensivos extends OfertaAcademica{
    // atributos
    private Integer porcentaje;
    private Integer precioFinal;


    public ProgramasIntensivos(String nombre, String descripcion, Integer porcentaje) {
        super(nombre, descripcion);
        this.porcentaje = porcentaje;
        precio = 0;

    }


    // metodos

    public Integer precio(Integer cursos) {
        return precio = precio + cursos;
    }

    public Integer precioFinal(){
        return precioFinal = (precio - ((precio * 20)/100)) ;
    }

    // setter and getter

    public Integer getPorcentaje() {
        return porcentaje;
    }

    @Override
    public Integer getPrecio() {
        return precio;
    }


}
