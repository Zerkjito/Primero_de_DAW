package poo2_6;

import java.util.Scanner;

public class Menu {

    private int opcion;

    public void mostrar() {
        System.out.println("1. Nuevo libro");
        System.out.println("2. Extraer Libro");
        System.out.println("3. Ver cima");
        System.out.println("4. Mostrar Pila");
        System.out.println("5. Eliminar Pila");
        System.out.println("0. FIN");
    }

    public int leer() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduzca opción: ");
            opcion = sc.nextInt();
        } while (opcion < 0 || opcion > 5);
        return opcion;
    }
}
