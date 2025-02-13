/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio12 {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matrizIrr[][] = generarMatrizIrr();
        asignarValores(matrizIrr);
        System.out.println();
        mostrarMatriz(matrizIrr);
    }

    public static int[][] generarMatrizIrr() {
        int filas;
        do {
            System.out.print("Introduce el numero de filas: ");
            while (!sc.hasNextInt()) {
                System.out.println("Error. Entrada invalida");
                sc.nextLine();
                System.out.print("Introduce el numero de filas: ");
            }
            filas = sc.nextInt();
        } while (filas < 1);
        int[][] irr = new int[filas][];
        return irr;
    }

    public static int[][] asignarValores(int[][] m) {
        Random rnd = new Random();
        int n;
        for (int i = 0; i < m.length; i++) {
            do {
                System.out.print("Indica la cantidad de elementos a asignar para la fila " + (i + 1) + ": ");
                while (!sc.hasNextInt()) {
                    System.out.println("Error. Entrada invalida");
                    sc.nextLine();
                    System.out.print("Indica la cantidad de elementos a asignar para la fila " + i + ": ");
                }
                n = sc.nextInt();
            } while (n < 1);

            m[i] = new int[n];
            for (int j = 0; j < n; j++) {
                m[i][j] = rnd.nextInt(1, 50 + 1);
            }
        }
        return m;
    }

    public static void mostrarMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "   ");
            }
            System.out.println();
        }

    }

}
