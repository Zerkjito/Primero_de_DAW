/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02;

import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class Ejercicio02 {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] gira = rotarArray();
        for (int i = 0; i < gira.length; i++) {
            System.out.print(gira[i] + " ");
        }
        
    }

    public static int[] rotarArray() {
        int n;
        do {
            System.out.print("Introduce el numero de elementos: ");
            n = sc.nextInt();
            if (n < 1) {
                System.out.println("Minimo de elementos -> 1");
            }
        } while (n < 1);
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduce el valor " + (i + 1) + ": ");
            while (!sc.hasNextInt()) {
                System.out.println("Error. Entrada invalida.");
                sc.nextLine();
                System.out.print("Introduce el valor " + (i + 1) + ": ");
            }
            array[i] = sc.nextInt();
        }
        
        for (int i = 1; i < array.length; i++) {
            if (i == array.length - 1) {
                array[0] = array[i];
            } else {
                array[i] = array[i] - 1;
            }
        }
        return array;
    }

}
