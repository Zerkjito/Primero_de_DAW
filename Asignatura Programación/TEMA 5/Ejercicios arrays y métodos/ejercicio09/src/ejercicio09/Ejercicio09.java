/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio09;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio09 {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] arr1 = crearArray();
        double[] arr2 = crearArray();
        System.out.println("\nARRAY 1:");
        mostrarArray(arr1);
        System.out.println("\nARRAY 2:");
        mostrarArray(arr2);
        double mayor = devolverMayor(arr1, arr2);
        System.out.printf("Elemento mayor: %.4f%n", mayor);

    }

    public static double[] crearArray() {
        Random rnd = new Random();
        int n;
        do {
            System.out.print("Introduce el tamaño del array: ");
            while (!sc.hasNextInt()) {
                System.out.println("Error. Entrada invalida");
                sc.nextLine();
                System.out.print("Introduce el tamaño del array: ");
            }
            n = sc.nextInt();
        } while (n < 1);
        double[] arr = new double[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextDouble(-100, 100 + 1);
        }
        return arr;
    }

    public static double devolverMayor(double[] a1, double[] a2) {
        double mayor = a1[0];

        for (int i = 1; i < a1.length; i++) {
            if (a1[i] > mayor) {
                mayor = a1[i];
            }
        }

        for (int i = 0; i < a2.length; i++) {
            if (a2[i] > mayor) {
                mayor = a2[i];
            }
        }
        return mayor;
    }
    
    public static void mostrarArray(double arr[]) {
        for (double num : arr) {
            System.out.printf("%.4f ", num);
        }
        System.out.println();
    }
}
