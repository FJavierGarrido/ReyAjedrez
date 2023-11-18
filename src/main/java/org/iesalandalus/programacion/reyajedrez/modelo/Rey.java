package org.iesalandalus.programacion.reyajedrez.modelo;

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

    public Rey(){
        this.color=Color.BLANCO;
        this.posicion= new Posicion(1,'e');
        this.totalMovimientos=0;
    }

}
