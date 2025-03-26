/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionhoteles;

import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class Menu {
    private int opcion;

    public void mostrar() {
        System.out.println(" 1. Registrar huésped");
        System.out.println(" 2. Generar reservas para hoy");
        System.out.println(" 3. Mostrar huéspedes");
        System.out.println(" 4. Mostrar huéspedes por ciudad");
        System.out.println(" 5. Inicializar sistema");
        System.out.println(" 6. Modificar límite de reservas");
        System.out.println(" 0. Salir");
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
        } while (opcion < 0 || opcion > 6);
        return opcion;
    }
}

