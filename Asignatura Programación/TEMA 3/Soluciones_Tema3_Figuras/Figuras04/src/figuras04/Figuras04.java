/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figuras04;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Figuras04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas, centro;
        System.out.println("Primera Figura ");
        do {
            System.out.print("Introduce número de filas: ");
            filas = sc.nextInt();
        } while (filas <= 0);
        for (int i = 1; i <= filas; i++) { //filas
            for (int j = 1; j <= filas; j++) { //columnas
                if (i == j) { //los unos aparecen en la diagonal donde el número de fila coincide con el número de columna
                    System.out.print("1 ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        System.out.println("\nSegunda Figura ");
        do {
            System.out.print("Introduce número de filas (número impar): ");
            filas = sc.nextInt();
        } while (filas % 2 == 0);
        centro = filas / 2 + 1; //calculamos cuál es la columna del centro
        for (int i = 1; i <= filas; i++) { //filas
            for (int j = 1; j <= filas; j++) { //columnas
                if (j == centro) { //los unos aparecen en columna del centro
                    System.out.print("1 ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        System.out.println("\nTercera Figura ");
        do {
            System.out.print("Introduce número de filas (número impar): ");
            filas = sc.nextInt();
        } while (filas % 2 == 0);
        centro = filas / 2 + 1;  //calculamos cuál es la fila del centro
        for (int i = 1; i <= filas; i++) { //filas
            for (int j = 1; j <= filas; j++) { //columnas
                if (i == centro) { //los unos aparecen en fila del centro
                    System.out.print("1 ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

    }
    
}
