package com.company;

public class Empleado {

    private String nombre;
    private String apellido;
    private float sueldo;

    public Empleado(String nombre, String apellido, float sueldo) throws RuntimeException {

        {
            if (nombre == null || nombre == "") {
                throw new RuntimeException("Nombre no puede estar vacio");
            }
            if (apellido == null || apellido == "") {
                throw new RuntimeException("Apellido no puede estar vacio");
            }
            if (sueldo < 0.0 || sueldo == 0.0) {
                throw new RuntimeException("Sueldo no puede ser menor a cero");
            }
            this.nombre = nombre;
            this.apellido = apellido;
            this.sueldo = sueldo;


        }

    }
}
