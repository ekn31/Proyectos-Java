package com.company;

public class cuentaCorriente extends Cuenta{

    private Double descubierto;

    public cuentaCorriente(String numero, Double saldo) {
        super(numero, saldo);
        descubierto = 1000.0;
    }

    public Double getDescubierto() {
        return descubierto;
    }

    public void setDescubierto(Double descubierto) {
        this.descubierto = descubierto;
    }
}
