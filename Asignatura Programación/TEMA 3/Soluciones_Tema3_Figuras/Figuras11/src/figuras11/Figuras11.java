/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figuras11;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Figuras11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas;
        do {
            System.out.print("Introduce numero de filas: ");
            filas = sc.nextInt();
        } while (filas < 2);
        for (int i = 1; i <= filas; i++) {  // este for indica en qué fila estamos
            for (int j = 1; j <= filas; j++) { // este for indica, para cada una de las filas, en qué columna estamos
                System.out.printf("%4d", i * j); //el valor de cada posición es el producto de la fila por la columna en la que está
            }
            System.out.println();
        }

    }
}
