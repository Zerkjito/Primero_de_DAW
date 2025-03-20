/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carcity;

import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Menu {
    
    private int opcion;

    public void mostrar() {
        System.out.println("\n 1. Nuevo coche");
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
        sc.nextLine(); //limpiar el intro
        return opcion;
    }
    
}
