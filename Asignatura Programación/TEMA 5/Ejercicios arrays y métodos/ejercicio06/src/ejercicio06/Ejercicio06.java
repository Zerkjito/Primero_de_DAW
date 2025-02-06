/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06;

import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio06 {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] pesos = leerPesos();
        int[] aux = contarPesos(pesos);
        mostrarDatos(aux);
    }

    public static int[] leerPesos() {
        int n;
        System.out.print("Introduce cuantos pesos quieres leer: ");
        while (!sc.hasNextInt()) {
            System.out.println("Error. Entrada invalida.");
            sc.nextLine();
            System.out.print("Introduce cuantos pesos quieres leer: ");
        }
        n = sc.nextInt();

        int[] pesos = new int[n];
        for (int i = 0; i < pesos.length; i++) {
            System.out.print("Introduce el peso del alumno " + (i + 1) + ": ");
            while (!sc.hasNextInt()) {
                System.out.println("Error. Entrada invalida.");
                sc.nextLine();
                System.out.print("Introduce el peso del alumno " + (i + 1) + ": ");
            }
            pesos[i] = sc.nextInt();
        }
        System.out.println();
        return pesos;
    }

    public static int[] contarPesos(int[] pesos) {
        int pesoMax = 100;
        int[] conteo = new int[pesoMax + 1];
        for (int peso : pesos) {
            if (peso >= 0 && peso <= pesoMax) {
                conteo[peso]++;
            }
        }
        return conteo;
    }

    public static void mostrarDatos(int[] conteo) {
        System.out.printf("%-10s %-10s%n", "PESO", "ALUMNOS");
        System.out.println("----------------------");

        for (int i = 0; i < conteo.length; i++) {
            if (conteo[i] > 0) {
                System.out.printf("%-10d ", i);
                for (int j = 0; j < conteo[i]; j++) {
                    int k = conteo[j];
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

}
