package org.iesalandalus.programacion.reyajedrez;

import org.iesalandalus.programacion.reyajedrez.modelo.Color;
import org.iesalandalus.programacion.reyajedrez.modelo.Direccion;
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


    public static Direccion mostrarMenuDirecciones(){
        Direccion direccion=null;
        int opcion;
        do {

            System.out.println("****   Menu   ****");
            System.out.println("==================");
            System.out.println("| 1. NORTE       |");
            System.out.println("| 2. NORESTE     |");
            System.out.println("| 3. ESTE        |");
            System.out.println("| 4. SURESTE     |");
            System.out.println("| 5. SUR         |");
            System.out.println("| 6. SUROESTE    |");
            System.out.println("| 7. OESTE       |");
            System.out.println("| 8. NOROESTE    |");
            System.out.println("------------------");
            System.out.println(" ");
            System.out.print("Introduce el número de opción: ");
            opcion = Entrada.entero();

        }while (opcion <1 || opcion>8);

        switch (opcion){
            case 1:
                direccion = Direccion.NORTE;
                break;
            case 2:
                direccion = Direccion.NORESTE;
                break;
            case 3:
                direccion = Direccion.ESTE;
                break;
            case 4:
                direccion = Direccion.SURESTE;
                break;
            case 5:
                direccion = Direccion.SUR;
                break;
            case 6:
                direccion = Direccion.SUROESTE;
                break;
            case 7:
                direccion = Direccion.OESTE;
                break;
            case 8:
                direccion = Direccion.NOROESTE;
                break;
            default:
                System.out.println("Opción no válida.");
                break;

        }
        return direccion;
    }

    public static void despedirse(){
        System.out.println("Hasta pronto.");
    }


}
