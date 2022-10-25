package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Perros {

    // Atributos
    private Boolean estadoAdopcion;
    private Boolean estadoSalud;
    private String raza;
    private Date fechaNacimiento;
    private Double peso;
    private Boolean chip;
    private String nombre;


    // constructor
    public Perros(Boolean adopcion, Boolean salud, String raza, Date nacimiento, Double peso,
                  Boolean chip, String nombre) {
        estadoAdopcion = adopcion;
        estadoSalud = salud;
        this.raza = raza;
        fechaNacimiento = nacimiento;
        this.peso = peso;
        this.chip = chip;
        this.nombre = nombre;

    }

    // getter

    public Boolean getEstadoAdopcion() {return estadoAdopcion;}
    public String getNombre() {return nombre;}
    public Boolean getChip() {return chip;}
    public Double getPeso(){return peso;}
    public Boolean getEstadoSalud(){return estadoSalud;}


    // SETTER

    public void setEstadoAdopcion(Boolean estado) {
        estadoAdopcion = estado;
    }


    // metodos

    public String sePuedePerder(Boolean chip) {
        if (chip == false) {
            return " No se puede perder, tiene chip!!";
        } else {
            return " Se puede perder, no tiene chip!!";
        }
    }

    public String enviarAdopcion(Double peso, Boolean salud){
        if (peso >= 5.0 && salud == true){
            return " Puede ir adopcion!!";
        }else {return " No puede ir adopcion!!";}
    }


}
