/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio11 {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int filas;
        System.out.print("Introduce el numero de filas: ");
        filas = sc.nextInt();
        int[][] multi = devolverMatriz(filas);
        for (int i = 0; i < multi.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(multi[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] devolverMatriz(int n) {
        return new int[n][n];
    }

}
