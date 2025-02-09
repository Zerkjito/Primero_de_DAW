/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio04 {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rnd = new Random();
        int sumaDiag = 0;
        int multi[][] = new int[6][6];
        for (int i = 0; i < multi.length; i++) {
            for (int j = 0; j < multi[i].length; j++) {
                multi[i][j] = rnd.nextInt(10, 20 + 1);
                if (i == j) {
                    sumaDiag += multi[i][j];
                }
            }
        }
        System.out.println("CONTENIDO DEL ARRAY:");
        mostrarMulti(multi);
        System.out.println("\nSuma de elementos de diagonal principal: " + sumaDiag);

    }

    public static void mostrarMulti(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
