package org.iesalandalus.programacion.reyajedrez;

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

}
