package com.company;

import java.util.ArrayList;
import java.util.List;

public class CargaFactory {

    // creacion de la instancia

    private static CargaFactory instance;

    // constructor

    public CargaFactory() {
    }

    // responsabilidad

    public static CargaFactory getInstance(){
        if(instance == null){
            instance = new CargaFactory();
        }
        return instance;
    }

    public Carga crearCarga(String codigo){
        switch (codigo){
            case "TV LED":
                return new CargaSimple("TV LED","TELEVISOR LED",3.0, false);

            case "Medicamentos":
                return new CargaSimple("Medicamentos","Medicina",2.0, true);

            case "Evergreen":
                List<CargaSimple> cargas = new ArrayList<CargaSimple>();
                cargas.add(new CargaSimple("TV LED","TELEVISOR LED",3.0, false));
                cargas.add(new CargaSimple("Medicamentos","Medicina",2.0, true));
                return new Contenedor("Evergreen","Contenedor",cargas,100.0);

            default:
                throw new RuntimeException("No existe el codigo");
        }

    }
}
