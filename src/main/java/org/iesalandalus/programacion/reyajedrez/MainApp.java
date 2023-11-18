package org.iesalandalus.programacion.reyajedrez;

import org.iesalandalus.programacion.reyajedrez.modelo.*;

import static org.iesalandalus.programacion.reyajedrez.Consola.*;

public class MainApp {

    private static Rey rey;

    public static void main(String[] args) {

        int opcion;


        do {
            mostrarMenu();
            opcion = elegirOpcionMenu();
            ejecutarOpcion(opcion);

        } while (opcion != 4);
    }

    private static void ejecutarOpcion(int opcion) {

        switch (opcion) {
            case 1:
                crearReyDefecto();
                break;
            case 2:
                crearReyColor();
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            default:
                System.out.println("Opción no válida. Introduce un número del 1 al 5.");
                break;
        }


    }

    private static void crearReyColor() {
        rey=new Rey(elegirOpcion());
        System.out.println("El rey elegido es: "+rey);
    }


    private static void crearReyDefecto() {
        rey = new Rey();
        System.out.println("Rey creado por defecto.");
    }
}