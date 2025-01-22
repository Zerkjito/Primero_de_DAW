/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;
import java.util.Scanner;

/**
 *
 * @author Erick
 */

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Introduce un numero entero: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            boolean esPrimo = true;

            if (i <= 1) {
                esPrimo = false; // 0 y 1 no son primos
            } else {
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        esPrimo = false; // Si tiene un divisor, no es primo
                        break; // No es necesario seguir comprobando
                    }
                }
            }

            if (esPrimo) {
                System.out.println(i + " es primo");
            }
        }
    }
}

