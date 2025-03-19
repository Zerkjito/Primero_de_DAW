
package carcity;

import java.util.Scanner;

public class Menu {

    private int opcion;
    
    public void mostrar() {
        System.out.println(" 1. Nuevo coche");
        System.out.println(" 2. Mostrar todos los coches");
        System.out.println(" 3. Mostrar los que pueden circular hoy");
        System.out.println(" 0. FIN");
    }

    public int leer() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduzca opción: ");
            opcion = sc.nextInt();
        } while (opcion < 0 || opcion > 3);
        sc.nextLine(); //limpiar el buffer
        return opcion;
    }
}
