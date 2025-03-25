/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eventos;

import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Menu {
    private int opcion;
    public void mostrar() {
        System.out.println("\n 1. Nuevo evento");
        System.out.println(" 2. Registrar asistente");
        System.out.println(" 3. Mostrar eventos");
        System.out.println(" 4. Buscar eventos por ciudad");
        System.out.println(" 5. Modificar aforo de un evento");
        System.out.println(" 0. FIN");
    }
    public int leer() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduzca opción: ");
            while (!sc.hasNextInt()) {
                System.out.println("Error: Entrada invalida.");
                sc.nextLine();
                System.out.print("Introduzca opción: ");
            }
            opcion = sc.nextInt();
        } while (opcion < 0 || opcion > 5);
        return opcion;
    }
}
