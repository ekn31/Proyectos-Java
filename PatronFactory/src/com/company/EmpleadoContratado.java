package com.company;

public class EmpleadoContratado extends Empleado{

    private Double importePorHora;
    private Double retencionImpuesto;

    public EmpleadoContratado(double importePorHora, double retencion) {
        super();
        this.importePorHora = importePorHora;
        retencionImpuesto = retencion;
    }


    @Override
    public Double calcularSueldo(Integer cantidadDias) {
        return (cantidadDias * 8 * importePorHora) * (100 * retencionImpuesto)/ 100;
    }
}
