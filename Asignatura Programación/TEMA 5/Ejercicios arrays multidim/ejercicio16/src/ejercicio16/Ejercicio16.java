/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class Ejercicio16 {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] multi = crearMatriz();
        int[][] cuadrLatino = rotarMatriz(multi);
        System.out.println("\nCuadrado latino generado:");
        mostrarMatr(cuadrLatino);
        
    }

    public static int[][] crearMatriz() {
        int n;
        do {
            System.out.print("Introduce el numero de filas (min. 2): ");
            while (!sc.hasNextInt()) {
                System.out.println("Error. Entrada invalida");
                sc.nextLine();
                System.out.print("Introduce el numero de filas (min. 2): ");
            }
            n = sc.nextInt();
        } while (n < 2);
        return new int[n][n];
    }
    
    public static int[][] rotarMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i == 0) {
                    m[i][j] = j + 1;
                } else {
                    if (j == 0) {
                        m[i][j] = m[i - 1][m[i].length - 1];
                    } else {
                        m[i][j] = m[i - 1][j - 1];
                    }
                }
            }
            System.out.println();
        }
        return m;
    }
    
    public static void mostrarMatr(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

}
