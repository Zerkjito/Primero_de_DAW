/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04;

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
        int arr[] = crearArray();
        System.out.println("\nARRAY ORIGINAL:");
        mostrarArray(arr);
        int arrInvertido[] = invertirArray(arr);
        System.out.println("\nARRAY INVERTIDO:");
        mostrarArray(arrInvertido);
        
        
    }
    
    public static int[] crearArray() {
        int n;
        do {
            System.out.print("Introduce el numero de elementos del array (min. 1): ");
            while (!sc.hasNextInt()) {
                System.out.println("Error. Entrada invalida.");
                sc.nextLine();
                System.out.print("Introduce el numero de elementos del array (min. 1): ");
            }
            n = sc.nextInt();
        } while (n < 1);
        int[]a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Introduce el valor del elemento " + i + ": ");
            while (!sc.hasNextInt()) {
                System.out.println("Entrada invalida");
                sc.nextLine();
                System.out.print("Introduce el valor del elemento " + i + ": ");
            }
            a[i] = sc.nextInt();
        }
        return a;
    }
    
    public static int[] invertirArray(int a[]) {
        int izquierda = 0;
        int derecha = a.length - 1;
        while (izquierda < derecha) {
            int temp = a[izquierda];
            a[izquierda] = a[derecha];
            a[derecha] = temp;
            izquierda++;
            derecha--;
        }
        return a;
    }
    
    public static void mostrarArray(int precoz[]) {
        for (int i = 0; i < precoz.length; i++) {
            System.out.print(precoz[i] + " ");
        }
        System.out.println();
    }
    
}
