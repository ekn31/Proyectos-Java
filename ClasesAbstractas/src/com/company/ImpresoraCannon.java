package com.company;

public class ImpresoraCannon extends Impresora{

    public ImpresoraCannon(String modelo, String conexion) {
        super(modelo, conexion);
        porcentajeTinta = 50.0;
    }

    @Override
    public String imprimir(){
        if(tienePapel() && porcentajeTinta > 25.0){
           realizarImpresion();
            return "Estoy imprimiendo desde una impresora canon";
        }else{
            return "No tengo papel";
        }
    }


}
