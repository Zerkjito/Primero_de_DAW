/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionvideoclub;

import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Menu {
    private int opcion;
    public void mostrar() {
        System.out.println("\n 1. Añadir nueva pelicula");
        System.out.println(" 2. Eliminar pelicula por codigo");
        System.out.println(" 3. Realizar un alquiler");
        System.out.println(" 4. Realizar una devolucion");
        System.out.println(" 5. Listar peliculas disponibles");
        System.out.println(" 6. Listar todas las peliculas");
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
            sc.nextLine();
            
            if (opcion < 0 || opcion > 6) {
                System.out.println("Error: Rango invalido.");
            }
        } while (opcion < 0 || opcion > 6);
        return opcion;
    }
}
