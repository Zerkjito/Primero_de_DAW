/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;

import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio03 {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        do {
            System.out.print("Introduce un numero de 6 cifras: ");
            while (!sc.hasNextInt()) {
                System.out.println("Error. Entrada invalida.");
                sc.nextLine();
                System.out.print("Introduce un numero de 6 cifras: ");
            }
            n = sc.nextInt();
        } while (n > 999999 || n < 100000);

        int arr[] = transformarEnArray(n);
        
        if (esCapicua(arr)) {
            System.out.println("El numero es capicua");
        } else {
            System.out.println("El numero NO es capicua");
        }

    }

    public static int[] transformarEnArray(int n) {
        int[] arr = new int[6];
        int divisor = 1;
        int aux = n;
        int contador = 0;

        while (aux >= 10) {
            divisor *= 10;
            aux /= 10;
        }

        while (divisor > 0) {
            arr[contador++] = (n / divisor) % 10;
            divisor /= 10;
        }
        return arr;
    }

    public static boolean esCapicua(int a[]) {
        int izquierda = 0;
        int derecha = a.length - 1;
        
        while (izquierda < derecha) {
            if (a[izquierda] != a[derecha]) {
                return false;
            }
            izquierda++;
            derecha--;
        }
        return true;
    }
}
