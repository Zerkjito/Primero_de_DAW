/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2_4;

import java.util.Scanner;

public class Menu {

    private int opcion;

    public void mostrar() {
        System.out.println("1. Nuevo libro");
        System.out.println("2. Mostrar todos los libros");
        System.out.println("3. Buscar libros");
        System.out.println("4. Bajas de libros por referencia");
        System.out.println("5. Bajas de libros por posición");
        System.out.println("6. Préstamo");
        System.out.println("7. Devolución");
        System.out.println("8. Mostrar libros disponibles");
        System.out.println("0. FIN");
    }

    public int leer() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduzca opción: ");
            opcion = sc.nextInt();
        } while (opcion < 0 || opcion > 8);
        sc.nextLine(); //limpiar el buffer
        return opcion;
    }
}
