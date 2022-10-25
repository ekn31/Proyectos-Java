package Empresa;

public class EmpleadoMarketing extends Empleado {

    private String area;



    @Override                       // sobreescritura es tomar el metodo heredado y cambiarle el retorno
    public void trabajar() {
        System.out.println("Empleado de Marketing " + getNombre() + " Trabajando en " + area);

    }
    public void trabajar(int horasExtras){   // sobrecarga es tomar un metodo y agregarle parametros para cambiar firma
        System.out.println("Empleado de Marketing " + getNombre() + " Trabajando en " + area + " con " + horasExtras + " horas extas");
    }





    public EmpleadoMarketing(String nombre, String apellido, String dni, String area) {
        super(nombre, apellido, dni);
        this.area = area;
    }
}
