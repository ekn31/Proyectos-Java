package com.company;

public class EmpleadoFactory {

    private static EmpleadoFactory instance;  // varaible para inicializar instancia

    // constructor
    private EmpleadoFactory() {
    }



    // metodo para crear instancia

    public static EmpleadoFactory getInstance(){
        if(instance == null){
            instance = new EmpleadoFactory();
        }
        return instance;
    }

    // responsabilidad
    public Empleado crearEmpleado(String codigo){
        switch (codigo) {
            case "EMP-INT":
               return new EmpleadoRelacionDependencia(1000.0);

            case "EMP-EXT":
                return new EmpleadoContratado(7.0, 14.0);

            default:
                throw new RuntimeException("No existe codigo para crear ese empleado");
          }
        }
}
