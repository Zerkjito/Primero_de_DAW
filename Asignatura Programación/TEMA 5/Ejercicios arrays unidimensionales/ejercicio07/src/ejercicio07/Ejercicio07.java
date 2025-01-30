/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07;

import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int[] b = new int[10];
        int[] suma = new int[10];
        int[] producto = new int[10];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Introduce el valor " + (i + 1) + " del array A: ");
            while (!sc.hasNextInt()) {
                System.out.println("Error. Entrada invalida");
                sc.nextLine();
                System.out.print("Introduce el valor " + (i + 1) + " del array A: ");
            }
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < b.length; i++) {
            System.out.print("Introduce el valor " + (i + 1) + " del array B: ");
            while (!sc.hasNextInt()) {
                System.out.println("Error. Entrada invalida");
                sc.nextLine();
                System.out.print("Introduce el valor " + (i + 1) + " del array B: ");
            }
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < suma.length; i++) {
            suma[i] = a[i] + b[i];
        }

        for (int i = 0; i < producto.length; i++) {
            producto[i] = a[i] * b[i];
        }

        System.out.println("\nResultados de las sumas:");
        for (int i = 0; i < suma.length; i++) {
            System.out.println("Suma de A[" + i + "] y B[" + i + "]: " + suma[i]);
        }

        System.out.println("\nResultados de los productos:");
        for (int i = 0; i < producto.length; i++) {
            System.out.println("Producto de A[" + i + "] y B[" + i + "]: " + producto[i]);

        }
    }

}
