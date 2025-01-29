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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean primerNum = true;
        int n, aux = 0;
        int mayor = 0, menor = 0;
        int posicionMay = 0, posicionMen = 0;
        int[] a = new int[20];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Introduce el valor " + (i + 1) + ": ");
            while (!sc.hasNextInt()) {
                System.out.println("Error. Entrada invalida.");
                sc.nextLine();
                System.out.print("Introduce el valor " + (i + 1) + ": ");
            }
            n = sc.nextInt();
            a[i] = n;

            if (primerNum) {
                aux = n;
                mayor = aux;
                menor = aux;
                primerNum = false;
            }

            if (n > mayor) {
                mayor = n;
                posicionMay = i;
            }

            if (n < menor) {
                menor = n;
                posicionMen = i;
            }
        }
        System.out.println("El mayor numero registrado ha sido " + mayor + " en la posicion " + posicionMay + " del indice.");
        System.out.println("El menor numero registrado ha sido " + menor + " en la posicion " + posicionMen + " del indice.");
    }

}
