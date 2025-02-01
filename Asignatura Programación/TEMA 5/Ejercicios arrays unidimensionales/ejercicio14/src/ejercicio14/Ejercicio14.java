/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int n, generado;
        System.out.print("Introduce el valor de N: ");
        while (!sc.hasNextInt()) {
            System.out.println("Error. Entrada invalida.");
            sc.nextLine();
            System.out.print("Introduce el valor de N: ");
        }
        n = sc.nextInt();
        int[] numeros = new int[n];
        for (int i = 1; i <= 10000; i++) {
            generado = rnd.nextInt(1, n + 1);
            numeros[generado - 1]++;
        }
        for (int i = 0; i < numeros.length; i++) {
            String veces = numeros[i] == 1 ? " vez" : " veces";
            System.out.printf("El numero %2d se ha obtenido %3d %s%n", i + 1, numeros[i], veces);
        }
    }

}
