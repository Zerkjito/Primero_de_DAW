/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02;

import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class Ejercicio02 {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[] = crearArray();
        leerArray(a);
        rotarArray(a);
        mostrar(a);
    }

    public static int[] crearArray() {
        int n;
        do {
            System.out.print("Introduce el numero de elementos a leer: ");
            while (!sc.hasNextInt()) {
                System.out.println("Error. Entrada invalida.");
                sc.nextLine();
                System.out.print("Introduce el numero de elementos del array mayor a 0: ");
            }
            n = sc.nextInt();
        } while (n < 1);
        int[] a = new int[n];
        return a;
    }

    public static void leerArray(int[] f) {
        for (int i = 0; i < f.length; i++) {
            System.out.print("Introduce el valor para " + (i + 1) + ": ");
            while (!sc.hasNextInt()) {
                System.out.println("Error. Entrada invalida.");
                sc.nextLine();
                System.out.print("Introduce el valor para el elemento" + i + ": ");
            }
            f[i] = sc.nextInt();
        }
    }
    
     public static void rotarArray(int[] a) {
         int aux = a[a.length - 1];
         for (int i = a.length - 1; i > 0; i--) {
             a[i] = a[i - 1];
         }
         a[0] = aux;
     }
     
     public static void mostrar(int[] arr) {
         for (int i = 0; i < arr.length; i++) {
             System.out.print(arr[i] + " ");
         }
     }
}
