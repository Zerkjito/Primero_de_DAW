/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23;

import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas, columnas;
        do {
            System.out.print("Introduce el numero de filas: ");
            filas = sc.nextInt();
            System.out.print("Introduce el numero de columnas: ");
            columnas = sc.nextInt();
        } while (filas < 7 || columnas < 7 || filas % 2 == 0 || columnas % 2 == 0);

        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int contador4 = 0;
        int centroFil = filas / 2 + 1;
        int centroCol = columnas / 2 + 1;
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= columnas; j++) {
                if (i == 1 || i == centroFil || i == filas || j == 1 || j == centroCol || j == columnas) {
                    System.out.print("*");
                } else if (j == 2 || j == centroCol - 1 || j == centroCol + 1 || j == columnas - 1) {
                    System.out.print(" ");
                } else if (j < centroCol && i < centroFil) {
                    System.out.print(contador1 % 10);
                    contador2 = contador1;
                    contador3 = contador1;
                    contador1++;
                } else if (j > centroCol && i < centroFil) {
                    System.out.print(contador2 % 10);
                    contador2--;
                } else if (j < centroCol && i > centroFil) {
                    System.out.print(contador3 % 10);
                    contador4 = contador3;
                    contador3--;
                } else {
                    System.out.print(contador4 % 10);
                    contador4++;
                }
            }
            System.out.println();

        }

    }

}
