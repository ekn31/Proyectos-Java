package Empresa;

public class EmpleadoProduccion extends Empleado{

    private int tiempoExperiencia;

    @Override                       // sobreescritura es tomar un metodo heredado y modificarlos a nuestra clase
    public void trabajar() {
        System.out.println("Empleado de produccion" + getNombre() + "Trabajando en " + "con un tiempo de " +tiempoExperiencia);

    }

    public EmpleadoProduccion(String nombre, String apellido, String dni, int tiempoExperiencia) {
        super(nombre, apellido, dni);
        this.tiempoExperiencia = tiempoExperiencia;
    }
}
