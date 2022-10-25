package com.company;

public class Velero extends Embarcacion{

    // atributos
    private Integer cantidadCamarote;

    // constructor


    public Velero(Capitan capitan, Double valorBase, Double valorAdicional, Integer añoFabricacion, Integer eslora, Integer cantidadCamarote) {
        super(capitan, valorBase, valorAdicional, añoFabricacion, eslora);
        this.cantidadCamarote = cantidadCamarote;
    }

    // metodos

    public String tamaño(){
        if(cantidadCamarote > 4){
            return "El velero es grande, tiene : " + cantidadCamarote + " mastil.";
        }return  "El veler es pequeño, tiene: " + cantidadCamarote + " mastil.";
    }

    @Override
    public String toString() {
        return "Velero{" +
                "capitan=" + getCapitan().getNombre() +
                ", precio=" + getPrecio() +
                ", valorAdicional=" + getValorAdicional() +
                ", añoFabricacion=" + getAñoFabricacion() +
                ", eslora=" + getEslora()+
                ", valorBase=" + getValorBase() +
                '}';
    }
}
