package com.company;

import java.util.Date;

public abstract class Impresora {

    // atributos
    private String modelo;
    private String tipoConexion;
    private Date fechaFabricacion;
    protected Integer hojasDisponibles;
    protected Double porcentajeTinta;

    // constructor

    protected Impresora(String modelo, String conexion) {
        this.modelo = modelo;
        this.tipoConexion = conexion;
        this.fechaFabricacion = new Date();
        this.hojasDisponibles = 0;
        this.porcentajeTinta = 100.0;
    }

    // metodos
    public Boolean tienePapel(){
        return hojasDisponibles > 0;
    }

    public Boolean necesitaTinta(){
        return porcentajeTinta == 0.0;
    }

    protected void  realizarImpresion(){
        porcentajeTinta = porcentajeTinta - 10.0;
        hojasDisponibles --;
    }

    public abstract String imprimir();


    public void setHojasDisponibles(Integer hojasDisponibles) {
        this.hojasDisponibles = hojasDisponibles;
    }




}
