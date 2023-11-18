package org.iesalandalus.programacion.reyajedrez.modelo;

import javax.naming.OperationNotSupportedException;

public class Rey {

    private Color color;
    private Posicion posicion;
    private int totalMovimientos;


    //Método getColor
    public Color getColor() {
        return color;
    }

    //Método setColor
    public void setColor(Color color) {
        if (color==null){
            throw new NullPointerException("El color no puede ser nulo.");
        }
        this.color = color;
    }



    //Método get Posicion
    public Posicion getPosicion() {
        return posicion;
    }

    //Método set Posicion
    public void setPosicion(Posicion posicion) {
        if (posicion==null){
            throw new NullPointerException("La posición no puede ser nula.");
        }
        this.posicion = posicion;
    }



    //Método get totalMovimientos
    public int getTotalMovimientos() {
        return totalMovimientos;
    }

    //Método set totalMovimientos
    public void setTotalMovimientos(int totalMovimientos) {
        if (totalMovimientos<0){
            throw new IllegalArgumentException("Tiene que haber algún movimiento");
        }
        this.totalMovimientos = totalMovimientos;
    }

    //Constructor Rey posición (1,e)
    public Rey(){
        this.color=Color.BLANCO;
        this.posicion= new Posicion(1,'e');
        this.totalMovimientos=0;
    }

    //Constructor Rey según color (Blanco 1e, Negro 8e)
    public Rey(Color color){
        if(color==Color.BLANCO){
            this.posicion=new Posicion(1,'e');
        }else{
            this.posicion=new Posicion(8,'e');
        }
        this.color=color;
        this.totalMovimientos=0;
    }


    public void mover(Direccion direccion) throws OperationNotSupportedException {
        //comprueba si es nulo
        if (direccion==null){
            throw new NullPointerException("La dirección no puede ser nula");
        }

        //si Rey está en su posición puede enrocarse
        if (totalMovimientos==0 && (direccion==Direccion.ENROQUE_CORTO || direccion==Direccion.ENROQUE_LARGO)){ //puede enrocarse

            char nuevaColumna;
            if (direccion == Direccion.ENROQUE_CORTO){
                nuevaColumna=(char)(posicion.getColumna()+2);  //enroque corto 2 casillas derecha

            }else {  //(direccion == Direccion.ENROQUE_LARGO)
                nuevaColumna = (char)(posicion.getColumna()-2); //enroque largo 2 casillas izquierda
            }
            this.posicion.setColumna(nuevaColumna); //actualizamos la posición del Rey
            totalMovimientos++;


        }else{ //no puede enrocarse, porque ya ha movido el Rey, así que puede hacer movimiento normal

            Posicion nuevaPosicion=null;
            switch (direccion){
                case NORTE:
                    nuevaPosicion= new Posicion(posicion.getFila()+1, posicion.getColumna());
                    break;
                case NORESTE:
                    nuevaPosicion= new Posicion(posicion.getFila()+1, (char) (posicion.getColumna()+1));
                    break;
                case ESTE:
                    nuevaPosicion= new Posicion(posicion.getFila(), (char) (posicion.getColumna()+1));
                    break;
                case SURESTE:
                    nuevaPosicion= new Posicion(posicion.getFila()-1, (char) (posicion.getColumna()+1));
                    break;
                case SUR:
                    nuevaPosicion= new Posicion(posicion.getFila()-1,posicion.getColumna());
                    break;
                case SUROESTE:
                    nuevaPosicion= new Posicion(posicion.getFila()-1, (char) (posicion.getColumna()-1));
                    break;
                case OESTE:
                    nuevaPosicion= new Posicion(posicion.getFila(), (char) (posicion.getColumna()-1));
                    break;
                case NOROESTE:
                    nuevaPosicion= new Posicion(posicion.getFila()+1, (char) (posicion.getColumna()-1));
                    break;
                default:
                    throw new IllegalArgumentException("Direcion no permitida.");
            }

            //verificamos que esté dentro del tablero
            if ((nuevaPosicion.getFila() >=1 && nuevaPosicion.getFila()<=8) &&
                    (nuevaPosicion.getColumna()>='a' && nuevaPosicion.getColumna()<='h')){

                this.posicion=nuevaPosicion;
                totalMovimientos++;
            }else {
                throw new OperationNotSupportedException("Movimiento fuera del tablero");
            }
        }
    }

}
