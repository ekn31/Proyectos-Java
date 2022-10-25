package com.company;

public class ImpresoraEpson extends Impresora{

    // constructoy

    public ImpresoraEpson(String modelo, String conexion) {
        super(modelo, conexion);
        hojasDisponibles = 10;
    }


    // sobre escrituta del metodo
    @Override
    public String imprimir(){
        realizarImpresion();
        if(tienePapel()){
            return "Estoy imprimiendo desde una impresora epson";
        }else{
            return "No tengo papel";
        }
    }
}
