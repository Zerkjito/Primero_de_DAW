/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24;

import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas, columnas;
        do {
            System.out.print("Introduce filas: ");
            filas = sc.nextInt();
            System.out.print("Introduce columnas: ");
            columnas = sc.nextInt();
        } while (filas < 5 || columnas < 5 || filas % 2 == 0 || columnas % 2 == 0);

        int centroFil = filas / 2 + 1;
        int centroCol = columnas / 2 + 1;
        int contador = 1;
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= columnas; j++) {
                if (i == 1 && j > 1 && j < columnas || i == filas && j > 1 && j < columnas) {
                    System.out.print("*");
                } else if (j == centroCol) {
                    System.out.print("|");
                } else if (i == centroFil) {
                    System.out.print("-");
                } else if (j == 1 || j == columnas) {
                    System.out.print(contador % 10);
                } else {
                    System.out.print(" ");
                }
            }
            contador++;
            System.out.println();
        }

    }

}
