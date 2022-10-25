package com.company;

public class Cliente {

    // atributos
    private Integer numeroCliente;
    private String nombre;
    private Double deuda;


    // Constructor
    public  Cliente(Integer numero, String nombre){
        numeroCliente = numero;                          // asignacion del parametros
        this.nombre = nombre;
        deuda = 0.0;
    }

    // Metodos

    public Double incrementarDeuda(Double valor){
        deuda = deuda + valor;                         // le agrega una cantidad a la deudad
        return  deuda;
    }

    public void pagarDeuda(){
        deuda = 0.0;
    }

    // setter y getter

    public String getNombre(){                   // los get deben devolver el mismo tipo del valor del parametro
        return nombre;
    }

    public void setNombre(String nombre){       // los set no devuelven valor, siempre poner void
        this.nombre = nombre;
    }

    public Double getDeuda(){
        return deuda;
    }
}
