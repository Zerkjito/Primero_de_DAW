/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiondearticulos;

import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Menu {

    private int opcion;

    public void mostrar() {
        System.out.println("\n 1. Nuevo artículo");
        System.out.println(" 2. Mostrar artículos");
        System.out.println(" 3. Poner en oferta");
        System.out.println(" 4. Eliminar artículos");
        System.out.println(" 5. Producto estrella");
        System.out.println(" 6. Eliminar productos estrella");
        System.out.println(" 7. Modificar descuento");
        System.out.println(" 0. FIN");
    }

    public int leer() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduzca opción: ");
            opcion = sc.nextInt();
        } while (opcion < 0 || opcion > 7);
        sc.nextLine(); //limpiar el intro
        return opcion;
    }

}
