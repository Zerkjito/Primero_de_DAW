/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25;

import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio25 {

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
        } while (filas % 2 == 0 || filas < 5 || columnas < 5);
        
        int contador = 1;
        int centro = filas / 2 + 1;
        for (int i = 1; i <= filas; i++) {
            for (int j =1; j <= columnas; j++) {
                if (i == 1 && j > 1 && j < columnas || i == filas && j > 1 && j < columnas) {
                    System.out.print("*");
                } else if (i == centro) {
                    System.out.print(contador % 10);
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
