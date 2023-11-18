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
}
