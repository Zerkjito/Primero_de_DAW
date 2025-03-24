/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marketing;

import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class Menu {

    private int opcion;

    public void mostrar() {
        System.out.println("\n 1. Nuevo contacto");
        System.out.println(" 2. Llamar hoy");
        System.out.println(" 3. Mostrar contactos");
        System.out.println(" 4. Mostrar contactos de una población");
        System.out.println(" 5. Inicializar");
        System.out.println(" 6. Modificar límite de llamadas");
        System.out.println(" 0. FIN");
    }

    public int leer() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduzca opción: ");
            while (!sc.hasNextInt()) {
                System.out.println("Error: Entrada invalida");
            }
            opcion = sc.nextInt();

        } while (opcion < 0 || opcion > 6);
        return opcion;
    }
}
