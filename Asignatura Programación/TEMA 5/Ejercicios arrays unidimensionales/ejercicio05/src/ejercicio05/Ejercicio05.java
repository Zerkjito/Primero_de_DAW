/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05;

import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int[] array = new int[10];
        int pares = 0;
        int sumaPares = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduce el valor de " + (i + 1) + ": ");

            while (!sc.hasNextInt()) {
                System.out.println("Entrada invalida. Introduce un numero valido");
                sc.nextLine();
                System.out.print("Introduce el valor de " + (i + 1) + ": ");
            }

            n = sc.nextInt();
            array[i] = n;

            if (i % 2 == 0 && n % 2 != 0) {
                System.out.println("El numero " + n + " en la posicion " + i + " es impar pero ocupa una posicion par.");
            }
            if (n % 2 == 0) {
                sumaPares += n;
                pares++;
            }
        }
        if (pares > 0) {
            double  mediaPares = sumaPares / pares;
            System.out.println("\nLa media de los numeros pares ha sido " + mediaPares);
        } else {
            System.out.println("\nNo se han introducido numeros pares.");
        }
        sc.close();
    }

}
