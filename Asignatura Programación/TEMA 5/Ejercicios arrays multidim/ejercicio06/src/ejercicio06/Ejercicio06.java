/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06;

import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio06 {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[][] multi = crearMatriz();
        double[] arr = fusionarValores(multi);
        System.out.println("\nMATRIZ ORIGINAL:");
        mostrarMatriz(multi);
        System.out.println("\nARRAY FUSIONADO:");
        mostrarArray(arr);

    }

    public static double[][] crearMatriz() {
        double[][] multi = new double[4][5];
        for (int i = 0; i < multi.length; i++) {
            for (int j = 0; j < multi[i].length; j++) {
                System.out.print("Fila " + i + ", columna " + j + ": ");
                while (!sc.hasNextDouble()) {
                    System.out.println("Error. Entrada invalida");
                    sc.nextLine();
                    System.out.print("Fila " + i + ", columna " + j + ": ");
                }
                multi[i][j] = sc.nextDouble();
            }
        }
        return multi;
    }

    public static double[] fusionarValores(double[][] matriz) {
        double[] arr = new double[matriz.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                arr[i] += matriz[i][j];
            }
        }
        return arr;
    }

    public static void mostrarArray(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%6.2f", arr[i]);
        }
        System.out.println();
    }

    public static void mostrarMatriz(double[][] multi) {
        for (int i = 0; i < multi.length; i++) {
            for (int j = 0; j < multi[i].length; j++) {
                System.out.printf("%6.2f", multi[i][j]);
            }
            System.out.println();
        }
    }

}
