package com.company;

public abstract class Embarcacion {

    private Capitan capitan;
    private Double precio;
    private Double valorAdicional;
    private Integer añoFabricacion;
    private Integer eslora;
    private Double valorBase;


    // constructor


    public Embarcacion(Capitan capitan,Double valorBase, Double valorAdicional, Integer añoFabricacion, Integer eslora) {
        this.capitan = capitan;
        this.valorBase = valorBase;
        this.valorAdicional = valorAdicional;
        this.añoFabricacion = añoFabricacion;
        this.eslora = eslora;
    }

    // metodos
    public Double precioAlquiler(){
        if(añoFabricacion > 2020){
            return precio = valorBase + valorAdicional;
        }else return precio = valorBase;
    }

    // getter


    public Double getPrecio() {
        return precio;
    }


    // getter

    public Capitan getCapitan() {
        return capitan;
    }

    public Double getValorAdicional() {
        return valorAdicional;
    }

    public Integer getAñoFabricacion() {
        return añoFabricacion;
    }

    public Integer getEslora() {
        return eslora;
    }

    public Double getValorBase() {
        return valorBase;
    }
}
