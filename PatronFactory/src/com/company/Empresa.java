package com.company;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String razonSocial;
    private List<Empleado> empleados;

    public Empresa(String razonSocial) {
        this.razonSocial = razonSocial;
        empleados = new ArrayList<Empleado>();  // inicializa la lista vacia
    }

    // responsabilidad de crear empleado

    public void contratarEmpleado(String nombre, String apellido, Integer legajo, String codigo){

        EmpleadoFactory empleadoFactory = EmpleadoFactory.getInstance();

        Empleado nuevoEmpleado = empleadoFactory.crearEmpleado(codigo);
        nuevoEmpleado.setNombre(nombre);
        nuevoEmpleado.setApellido(apellido);
        nuevoEmpleado.setLegajo(legajo);

        empleados.add(nuevoEmpleado);
    }
}
