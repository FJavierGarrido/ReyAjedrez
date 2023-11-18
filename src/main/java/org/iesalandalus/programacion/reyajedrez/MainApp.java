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
    }


}