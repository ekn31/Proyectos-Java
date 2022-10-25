package com.company;

public class UsuarioJuego {

    // atributos
    private String nombre;
    private String clave;
    private Double puntaje;
    private Integer nivel;



    public UsuarioJuego(String nombre, String clave) {

        this.nombre =nombre;
        this.clave =clave;
        puntaje =0.0;
        nivel =0;

       }
    // constructor



    // metodos

    public void aumentarPuntaje(){puntaje = puntaje + 10.0;}
    public void subirNivel(){
        nivel = nivel + 1;
    }
    public void bonus(){puntaje = puntaje + 0.5;}

    // setter y getter

    public String getNombre(){return nombre;}
    public String getClave(){
        return clave;
    }
    public Integer getNivel(){return nivel;}
    public Double getPuntaje(){return puntaje;}







}
