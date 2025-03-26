/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante;

import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class Menu {

    private int opcion;

    public void mostrar() {
        System.out.println("\n1. Nueva reserva");
        System.out.println("2. Cancelar reserva");
        System.out.println("3. Mostrar reservas");
        System.out.println("4. Mostrar mesas disponibles");
        System.out.println("5. Modificar número de mesas");
        System.out.println("6. Agregar mesa");
        System.out.println("7. Eliminar mesa");
        System.out.println("0. Salir");
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
            sc.nextLine();
            
        } while (opcion < 0 || opcion > 7);
        return opcion;
    }
}
