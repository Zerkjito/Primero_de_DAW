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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] pares = new int[20];

        for (int i = 0; i < pares.length; i++) {
            int num;
            do {
                System.out.print("Introduce el valor " + (i + 1) + ": ");

                while (!sc.hasNextInt()) {
                    System.out.println("Error. El valor debe ser un numero valido.");
                    sc.nextLine();
                    System.out.print("Introduce el valor " + (i + 1) + ": ");
                }
                
                num = sc.nextInt();
                if (num % 2 != 0) {
                    System.out.println("Error. El valor debe ser numero par.");
                }
            } while (num % 2 != 0);
            
            pares[i] = num;
        }
        System.out.println();
        for (int j = 0; j < pares.length; j++) {
            System.out.println("El valor del numero " + (j + 1) + " es: " + pares[j]);
        }

    }

}
