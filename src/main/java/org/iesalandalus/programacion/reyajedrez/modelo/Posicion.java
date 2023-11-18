package org.iesalandalus.programacion.reyajedrez.modelo;

import java.util.Objects;

public class Posicion {
    private int fila;
    private char columna;


    //Método get fila
    public int getFila() {
        return fila;
    }

    //Método set fila
    public void setFila(int fila) {
        if (fila<1 || fila>8){
            throw new IllegalArgumentException("La fila tiene que estar entre 1 y 8.");
        }
        this.fila = fila;
    }



    //Método get columna
    public char getColumna() {
        return columna;
    }

    //Método set columna
    public void setColumna(char columna) {
        if (columna<'a' || columna>'h'){
            throw new IllegalArgumentException("La columna tiene que estar entre a y h.");
        }
        this.columna = columna;
    }

    //Constructor que valida fila y columna
    public Posicion(int fila,char columna){
        setFila(fila);
        setColumna(columna);
    }

    //Constructor copia
    public Posicion(Posicion otraPosicion){
        this(otraPosicion.getFila(), otraPosicion.getColumna());
    }

    @Override
    public boolean equals(Objects obj){
        if (this == obj) return true;
        if (obj==null || !getClass().equals(obj.getClass())) return false;
        Posicion otraPosicion = (Posicion) obj;
        return fila== otraPosicion.fila && columna == otraPosicion.columna;
    }

    @Override
    public int hasCode(){
        return Objects.hash(fila,columna);
    }


}
