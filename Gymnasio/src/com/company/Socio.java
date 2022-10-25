package com.company;

public class Socio {
    // atributos

    private String numeroSocio;
    private String nombre;
    protected Double cuotaMensual;
    private String actividad;

    // constructor

    public Socio(String numero,String nombre, String actividad, Double cuota){
        numeroSocio = numero;
        this.nombre = nombre;
        this.actividad = actividad;
        cuotaMensual = cuota;

    }


    // metodos

    public Double costoMensual(){
        return cuotaMensual;
    }

    // metodo toString
    @Override
    public String toString() {
       return "Nombre : " + nombre + "\n" +
               "Numero de socio: " + numeroSocio;
    }

    // metodo para comparar ojetos
    @Override
    public boolean equals(Object object){
        if(object == null)return false;     // pregunto si object es vacio

        if(!(object instanceof Socio)) {return false;}  // si object es una instancia de socio, continuo

        Socio socioAux = (Socio) object; // casteo la variable con una clase socio (tratar el object como un socio)
        return socioAux.numeroSocio.equals(numeroSocio);  // comparo el socio instanciado en este metodo
    }

    @Override
    public int hashCode(){
        int hash = 11;

        return  hash * numeroSocio.hashCode();
    }
}
