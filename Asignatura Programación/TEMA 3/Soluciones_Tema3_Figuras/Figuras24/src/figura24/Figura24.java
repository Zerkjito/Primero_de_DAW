/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figura24;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Figura24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas, columnas, i, j;
        do {
            System.out.print("Introduce filas (impar >= 5): ");
            filas = sc.nextInt();
            if (filas < 5 || filas % 2 == 0) {
                System.out.println("Debe ser impar y >= 5");
            }
        } while (filas < 5 || filas % 2 == 0);
        do {
            System.out.print("Introduce columnas (impar >= 5): ");
            columnas = sc.nextInt();
            if (columnas < 5 || columnas % 2 == 0) {
                System.out.println("Debe ser impar y >= 5");
            }
        } while (columnas < 5 || columnas % 2 == 0);
        
        int centroFilas = filas / 2 + 1;
        int centroColumnas = columnas / 2 + 1;
        
        for (i = 1; i <= filas; i++) {
            for (j = 1; j <= columnas; j++) {
                if (i == centroFilas && j != centroColumnas) {
                    System.out.print("-");
                } else if (j == 1 || j == columnas) {
                    System.out.print(i % 10);
                } else if (i == 1 || i == filas) {
                    System.out.print("*");
                } else if (j == centroColumnas) {
                    System.out.print("|");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

}
