package com.company;

import java.time.temporal.JulianFields;
import java.util.ArrayList;
import java.util.List;

public class Puerto  {
    // atributos
    private List<Contenedor> contenedor;
    private String nombre;


    // constructo


    public Puerto(String nombre) {
        this.nombre = nombre;
        contenedor = new ArrayList<Contenedor>();
    }

    public int candtidadPeligroso(){

        int x = 0;
        for(Contenedor contenedor : contenedor){
            if(contenedor.getPeligroso() && contenedor.getDescripcion() == "Desconocida"){
                x++;
            }
        }
        return x;
    }

    public void ordenarContenedores(){
        contenedor.sort(null);
        for(Contenedor contenedor : contenedor){

                System.out.println(contenedor.toString());
            }

    }

    public void addContenedor(Contenedor unContenedor){
          contenedor.add(unContenedor);
    }

    public String getNombre() {
        return nombre;
    }
}
