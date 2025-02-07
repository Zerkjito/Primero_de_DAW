/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

import java.util.Random;
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
        int[] arr = generarArray();
        int posicion, num;
        do {
            System.out.print("Introduce la posicion a consultar: ");
            while (!sc.hasNextInt()) {
                System.out.println("Error. Entrada invalida");
                sc.nextLine();
                System.out.print("Introduce la posicion a consultar: ");
            }
            posicion = sc.nextInt();
            if (posicion < 0 || posicion >= arr.length) {
                System.out.println("Error. La posicion debe estar comprendida entre 0 y " + arr.length);
            }
        } while (posicion < 0 || posicion >= arr.length);
        System.out.print("Introduce el numero a consultar: ");
        while (!sc.hasNextInt()) {
            System.out.println("Error. Entrada invalida.");
            sc.nextLine();
            System.out.print("Introduce el numero a consultar: ");
        }
        num = sc.nextInt();
        int nuevaPos = posicionNumero(arr, posicion, num);
        System.out.println("\nARRAY GENERADO:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        System.out.println("Buscando numero " + num + " en posicion " + posicion + " o mayor...");
        if (nuevaPos == -1) {
            System.out.println("El numero buscado no se encuentra en el array");
        } else {
            System.out.println("El numero " + num + " se ha encontrado en la posicion " + nuevaPos);
        }
    }

    public static int[] generarArray() {
        Random rnd = new Random();
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(1, 20 + 1);
        }
        return arr;
    }
    
    public static int posicionNumero(int[] arr, int posicion, int n) {
        for (int i = posicion; i < arr.length; i++) {
            if (arr[i] == n) {
                return i;
            }
        }
        return -1;
    }

}
