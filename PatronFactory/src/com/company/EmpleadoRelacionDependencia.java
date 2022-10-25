package com.company;

public class EmpleadoRelacionDependencia extends Empleado {
    private  Double sueldoMensual;

    public EmpleadoRelacionDependencia(Double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    @Override
    public Double calcularSueldo(Integer cantidadDias) {
        return sueldoMensual * cantidadDias /30;
    }
}
