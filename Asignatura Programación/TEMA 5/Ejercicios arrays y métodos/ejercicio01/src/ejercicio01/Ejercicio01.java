/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;

import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class Ejercicio01 {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] V1 = leerArray();
        int [] V2 = leerArray();
        int nuevoArray[] = concatenarArray(V1, V2);
        
        System.out.println("\nARRAY CONCATENADO:");
        for (int i = 0; i < nuevoArray.length; i++) {
            System.out.print(nuevoArray[i] + " ");
        }
    }

    public static int[] leerArray() {
        int[] nuevoArray = new int[20];
        for (int i = 0; i < nuevoArray.length; i++) {
            System.out.print("Introduce el valor " + (i + 1) + ": ");
            while (!sc.hasNextInt()) {
                System.out.println("Error. Entrada invalida.");
                sc.nextLine();
                System.out.print("Introduce el valor " + (i + 1) + ": ");
            }
            nuevoArray[i] = sc.nextInt();
        }
        return nuevoArray;
    }
    
    public static int[] concatenarArray (int[] v1, int[] v2) {
        int[] nuevoArray = new int[v1.length + v2.length];
        
        for (int i = 0; i < v1.length; i++) {
            nuevoArray[i] = v1[i];
        }
        
        for (int i = 0; i < v2.length; i++) {
            nuevoArray[v1.length + i] = v2[i];
        }
        return nuevoArray;
    }

}
