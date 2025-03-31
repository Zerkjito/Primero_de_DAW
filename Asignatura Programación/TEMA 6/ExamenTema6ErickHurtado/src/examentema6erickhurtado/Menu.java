/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examentema6erickhurtado;

import java.util.Scanner;

/**
 *
 * @author lliurex
 */
public class Menu {
    private int opcion;
    
    public void mostrar() {
        System.out.println("\n1. Leer perros");
        System.out.println("2. Mostrar perros");
        System.out.println("3. Gestionar ingresos");
        System.out.println("4. Consultar ingresos");
        System.out.println("5. Modificar valores");
        System.out.println("0. Salir");
    }
    
    public int leer() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Opcion: ");
            while (!sc.hasNextInt()) {
                System.out.println("Error: Entrada invalida.");
                sc.nextLine();
                System.out.print("Opcion: ");
            }
            opcion = sc.nextInt();
            sc.nextLine();
            
            if (opcion < 0 ||opcion > 5) {
                System.out.println("Error: Rango invalido.");
            }
        } while (opcion < 0 ||opcion > 5);
        return opcion;
    }
}
