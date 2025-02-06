/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio08;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio08 {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        do {
            System.out.print("Introduce el tamaño del array: ");
            while (!sc.hasNextInt()) {
                System.out.println("Error. Entrada invalida.");
                sc.nextLine();
                System.out.print("Introduce el tamaño del array: ");
            }
            n = sc.nextInt();
        } while (n < 1);
        int[] arrPrimos = arrayPrimos(n);
        System.out.println("\nARRAY CON PRIMOS ALEATORIOS:");
        for (int primo : arrPrimos) {
            System.out.print(primo + " ");
        }

    }

    public static int[] arrayPrimos(int a) {
        Random rnd = new Random();
        int[] arr = new int[a];
        int i = 0;
        while (i < arr.length) {
            int numero = rnd.nextInt(1, 1000 + 1);
            if (esPrimo(numero)) {
                arr[i] = numero;
                i++;
            }
        }
        return arr;
    }

    public static boolean esPrimo(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

}
