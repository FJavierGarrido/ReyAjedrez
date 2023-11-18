package org.iesalandalus.programacion.reyajedrez.modelo;

public enum Color {
    BLANCO("Blanco"),
    NEGRO("Negro");

    private String cadenaAMostrar;

    //Constructor
    private Color(String cadenaAMostrar){
        this.cadenaAMostrar=cadenaAMostrar;
    }

    //Método toString
    @Override
    public String toString(){
        return cadenaAMostrar;
    }
}
