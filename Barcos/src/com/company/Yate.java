package com.company;

public class Yate extends Embarcacion implements Comparable {

     private Integer cantidadMastil;

    public Yate(Capitan capitan, Double valorBase, Double valorAdicional, Integer añoFabricacion, Integer eslora, Integer cantidadMastil) {
        super(capitan, valorBase, valorAdicional, añoFabricacion, eslora);
        this.cantidadMastil = cantidadMastil;
    }


    @Override
    public int compareTo(Object object) {
        Yate yate = (Yate) object;
        return  cantidadMastil - yate.cantidadMastil;
    }
    @Override
    public String toString() {
        return "Yate{" +
                "capitan=" + getCapitan().getNombre() +
                ", precio=" + getPrecio() +
                ", valorAdicional=" + getValorAdicional() +
                ", añoFabricacion=" + getAñoFabricacion() +
                ", eslora=" + getEslora()+
                ", valorBase=" + getValorBase() +
                '}';
    }
}
