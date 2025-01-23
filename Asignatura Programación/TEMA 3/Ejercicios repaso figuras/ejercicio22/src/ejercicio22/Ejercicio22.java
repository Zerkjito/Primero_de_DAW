/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio22;

import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio22 {

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
        } while (filas < 5 || columnas < 5 || filas % 2 == 0);

        int centro = filas / 2 + 1;
        int contador = 0;
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= columnas; j++) {
                if (i == 1 || i == centro || i == filas || j == 1 || j == columnas) {
                    System.out.print("*");
                } else if (j >= 3 && j <= columnas - 2) {
                    System.out.print(contador % 10);
                    if (i < centro) {
                        contador++;
                    } else {
                        contador--;
                    }
                } else {
                    System.out.print(" ");
                }
            }
            if (i == centro) {
                contador = contador - 1;
            }
            System.out.println();
        }
    }

}
