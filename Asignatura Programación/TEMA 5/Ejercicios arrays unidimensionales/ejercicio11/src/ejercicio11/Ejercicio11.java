/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tamaño;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduce el tamaño del array: ");
            tamaño = sc.nextInt();
        } while (tamaño <= 0);
        int [] array = new int [tamaño];
        
        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduce el valor de la posicion " + (i + 1) + ": ");
            while (!sc.hasNextInt()) {
                System.out.println("Error. Entrada invalida");
                sc.nextLine();
                System.out.print("Introduce el valor de la posicion " + (i + 1) + ": ");
            }
            array[i] = sc.nextInt();
        }
        
        int [] arrayB = array.clone();
        Arrays.sort(arrayB);
        
        System.out.println("\nARRAY (A) CON VALORES DESORDENADOS");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);    
        }
        
        System.out.println("\nARRAY (B) CON VALORES ORDENADOS ASCENDENTEMENTE");
        for (int i = 0; i < arrayB.length; i++) {
            System.out.println(arrayB[i]);
        }
    }

}
