package com.company;

public class SocioHabilitado extends Socio{

    // ATRIBUTOS
    private Double costoPileta;
    private Boolean habilitado;



    // constructor
    public SocioHabilitado(String numero, String nombre, String actividad, Double cuota, Double costoIngreso) {
        super(numero, nombre, actividad, cuota);
        costoPileta = costoIngreso;
        habilitado = false;
    }

    // sobreescritura del metodo heredado
    @Override
    public Double costoMensual(){
        if (habilitado){
            return costoPileta + cuotaMensual;
        }else {
            return cuotaMensual;
        }
    }

    // metodo
    public void hacerRevisionMedica(){
        habilitado = true;
    }

}
