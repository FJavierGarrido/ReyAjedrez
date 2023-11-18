package org.iesalandalus.programacion.reyajedrez;

import org.iesalandalus.programacion.reyajedrez.modelo.Color;
import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {

    //Constructor
    private Consola() {

    }

    public static void mostrarMenu(){
        System.out.println("   ********   Menu   ********");
        System.out.println("==================================");
        System.out.println("| 1. Crear rey por defecto       |");
        System.out.println("| 2. Crear rey eligiendo color   |");
        System.out.println("| 3. Mover                       |");
        System.out.println("| 4. Salir                       |");
        System.out.println("----------------------------------");
    }

    public static int elegirOpcionMenu(){
        int opcion;

        do{
            System.out.print("Introduce el número de opción: ");
            opcion = Entrada.entero();

        }while (opcion <1 || opcion>4);

        return opcion;
    }

    public static Color elegirOpcion(){
        Color color=null;
        int opcion;

        do{
            System.out.println("***   Menu   ***");
            System.out.println("================");
            System.out.println("| 1. Blanco    |");
            System.out.println("| 2. Negro     |");
            System.out.println("----------------");
            System.out.println(" ");
            System.out.print("Introduce el número de opción: ");
            opcion = Entrada.entero();

        }while  (opcion <1 || opcion>2);

        if (opcion==1){
            color = Color.BLANCO;
        }else {
            color = Color.NEGRO;
        }

        return color;
    }



}
