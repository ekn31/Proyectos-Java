package com.company;

public class Saldo {
    // atributos
    private int numeroDeCuenta;
    private Double saldo;


    // constructor

    public Saldo(int numeroDeCuenta, Double saldo) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = saldo;
    }

    // metodos

    public void depositar(Double cantidad){
        saldo = saldo + cantidad;

    }

    public void retirar(Double cantidad){
        if(saldo>cantidad){
            saldo = saldo -cantidad;

        }else {System.out.println("saldo insuficiente");}

    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
