package Empresa;

public class Empleado {
    // atributos
    private String nombre;
    private String apellido;
    private String dni;


    // metodos
    public void trabajar(){
        System.out.println("Empleado" + nombre + "Trabajando");

    }public void descansar(){
        System.out.println("Empleado" + nombre + "Descansando");
    }

    @Override
    public String toString() {
        return apellido +','+ nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Empleado(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
}
