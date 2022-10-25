package com.company;

public class Camion extends Vehiculo implements Comparable {

    // atrbutos
    private Integer cantidadEjes;
    private Integer cantidadCarga;
    private int valor;


    // constructor

    public Camion(Dueño dueño, String fecha, String marca, String patente, String tipo, Integer cantidadEjes, Integer cantidadCarga) {
        super(dueño, fecha, marca, patente, tipo);
        this.cantidadEjes = cantidadEjes;
        this.cantidadCarga = cantidadCarga;
    }

    // metodos
    @Override
    public int compareTo(Object object) {
        Camion camion = (Camion) object;
        return valor = cantidadCarga - camion.getCantidadCarga();
    }


    public String mayor(){
        if(valor>0){
            return "El primer camion es mayor";
        }else if(valor<0){return "El segundo camion es mayor";}
        return "Ambos son iguales";
    }
    // getter


    public Integer getCantidadCarga() {
        return cantidadCarga;
    }
}
