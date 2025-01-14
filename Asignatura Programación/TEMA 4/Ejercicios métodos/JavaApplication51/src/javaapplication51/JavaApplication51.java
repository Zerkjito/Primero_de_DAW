/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication51;

import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class JavaApplication51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas, columnas;
        do {
            System.out.print("Introduce columnas: ");
            filas = sc.nextInt();
            System.out.print("Introduce filas: ");
            columnas = sc.nextInt();

        } while (filas <= 4 || columnas <= 4 || filas % 2 != 0);

        int centro = filas / 2;
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= columnas; j++) {
                if (j == columnas && i <= centro || j == 1 && i >= centro) {
                    System.out.print("*");
                } else if (i == 1 || i == centro || i == filas) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
