/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int tamaño;
        int n;
        boolean continuar = true;
        do {
            System.out.print("Introduce el tamaño del array: ");
            while (!sc.hasNextInt()) {
                System.out.println("Entrada invalida. Introduce un numero valido.");
                sc.nextLine();
                System.out.print("Introduce el tamaño del array: ");
            }
            tamaño = sc.nextInt();
            if (tamaño <= 0) {
                System.out.println("Tamaño invalido. Debe ser a partir de 1");
            }
        } while (tamaño <= 0);

        int[] array = new int[tamaño];
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(-100, 100 + 1);
        }

        while (continuar) {
            System.out.print("Introduce un numero entero entre -100 y 100 (fuera del rango para finalizar): ");
            while (!sc.hasNextInt()) {
                System.out.println("Entrada invalida. Introduce un numero valido.");
                sc.nextLine();
                System.out.print("Introduce un numero entero entre -100 y 100 (fuera del rango para finalizar): ");
            }
            n = sc.nextInt();
            if (n < -100 || n > 100) {
                continuar = false;
            } else {
                boolean encontrado = false;
                for (int valor : array) {
                    if (n == valor) {
                        encontrado = true;
                        break;
                    }
                }
                System.out.println(n + (encontrado ? " SI" : " NO") + " se encuentra en el array\n");
            }
        }
        System.out.println("\nVALORES ASIGNADOS DENTRO DEL ARRAY");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Posicion %2d: %4d%n", i, array[i]);
            
        }

    }

}
