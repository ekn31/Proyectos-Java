package com.company;

public class Automovil extends Vehiculo{

    // atributos
    private String tipoCombustible;
    private Integer cilindrada;

    // constructor

    public Automovil(Dueño dueño, String fecha, String marca, String patente, String tipo, String tipoCombustible, Integer cilindrada) {
        super(dueño, fecha, marca, patente, tipo);
        this.tipoCombustible = tipoCombustible;
        this.cilindrada = cilindrada;
    }

    // metodos
    public String valoracion(){
        if(tipoCombustible == "GAS" || cilindrada < 1200){
            return "Es un vehiculo economico";
        }else return "No es un vehiculo economico";
    }
}
