/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio10 {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean[] arr = new boolean[101];
        boolean esPrimero = true;
        int n, primerNum = -1;
        do {
            System.out.print("Introduce un numero entre 1 y 100 (0 para terminar): ");
            while (!sc.hasNextInt()) {
                System.out.println("Error. Entrada invalida");
                sc.nextLine();
                System.out.print("Introduce un numero entre 1 y 100 (0 para terminar): ");
            }
            n = sc.nextInt();
            if (n != 0) {
                while (n < 1 || n > 100) {
                    System.out.println("Error. El numero debe estar entre 1 y 100.");
                    System.out.print("Introduce un numero entre 1 y 100 (0 para terminar): ");
                    n = sc.nextInt();
                }
            }
            if (esPrimero && n >= 1 && n <= 100) {
                primerNum = n;
                esPrimero = false;
            }
            
            
            if (!arr[n]) {
                arr[n] = true;
            } else {
                System.out.println("El numero " + n + " ya ha sido ingresado. Prueba de nuevo");
            }
        } while (n != 0);
        
        int suma = 0;
        int contador = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]) {
                contador++;
                suma += i;
            }
        }
        double media = (contador > 0) ? (double) suma / contador : 0;
        
        if (primerNum == -1) {
            System.out.println("\nNo se han introducido numeros");
        } else {
            System.out.println("\nNumeros introducidos:");
            for (int i = 1; i < arr.length; i++) {
                if (arr[i]) {
                    System.out.print(i + " ");
                }
            }
            System.out.println("\n");
            System.out.println("Suma de los numeros introducidos -> " + suma);
            System.out.printf("Media de los numeros introducidos -> %.2f%n", media);
        }
    }

}
