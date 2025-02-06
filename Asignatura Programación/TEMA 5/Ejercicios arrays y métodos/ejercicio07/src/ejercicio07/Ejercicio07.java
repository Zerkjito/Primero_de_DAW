/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio07 {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;

        do {
            System.out.print("Introduce un el tamaño del array: ");
            while (!sc.hasNextInt()) {
                System.out.println("Error. Entrada invalida");
                sc.nextLine();
                System.out.print("Introduce un el tamaño del array: ");
            }
            n = sc.nextInt();
        } while (n < 1);
        int[] randomArr = randomArray(n);
        System.out.println("ARRAY RANDOM GENERADO CON " + n + " ELEMENTOS:");
        mostrarArray(randomArr);
    }

    public static int[] randomArray(int n) {
        Random rnd = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(0, 9 + 1);
        }
        return arr;
    }
    
    public static void mostrarArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
