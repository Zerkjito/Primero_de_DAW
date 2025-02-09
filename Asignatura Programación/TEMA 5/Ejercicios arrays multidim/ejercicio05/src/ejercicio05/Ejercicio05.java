/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio05 {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] arrMulti1 = arrayMulti();
        int[][] arrMulti2 = arrayMulti();
        int[][] arrSuma = sumarArrays(arrMulti1, arrMulti2);
        System.out.println("ARRAY A:");
        mostrarMulti(arrMulti1);
        System.out.println("\nARRAY B:");
        mostrarMulti(arrMulti2);
        System.out.println("\nARRAY C (SUMA DE ARRAY A + ARRAY B):");
        mostrarMulti(arrSuma);

    }

    public static int[][] arrayMulti() {
        int filas, columnas;
        do {
            System.out.print("Introduce numero filas: ");
            while (!sc.hasNextInt()) {
                System.out.println("Error. Entrada invalida");
                sc.nextLine();
                System.out.print("Introduce numero filas: ");
            }
            filas = leerEntero();

            System.out.print("Introduce numero columnas: ");
            while (!sc.hasNextInt()) {
                System.out.println("Error. Entrada invalida");
                sc.nextLine();
                System.out.print("Introduce numero columnas: ");
            }
            columnas = leerEntero();
        } while (filas <= 0 || columnas <= 0);

        int[][] multi = new int[filas][columnas];
        llenarArray(multi);
        return multi;
    }

    public static int leerEntero() {
        int n = sc.nextInt();
        return n;
    }

    public static void llenarArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Fila " + i + ", elemento " + j + ": ");
                while (!sc.hasNextInt()) {
                    System.out.println("Error. Entrada invalida");
                    sc.nextLine();
                    System.out.print("Fila " + i + ", elemento " + j + ": ");
                }
                arr[i][j] = leerEntero();
            }
        }
        System.out.println();
    }

    public static int[][] sumarArrays(int[][] arr1, int[][] arr2) {
        int[][] arrSuma = new int[arr1.length][arr1[0].length];
        for (int i = 0; i < arrSuma.length; i++) {
            for (int j = 0; j < arrSuma[i].length; j++) {
                arrSuma[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return arrSuma;
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
