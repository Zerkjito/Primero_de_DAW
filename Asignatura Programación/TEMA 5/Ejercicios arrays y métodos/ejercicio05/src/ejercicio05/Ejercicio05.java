/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio05 {
static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arr[] = generarArray();
        System.out.println("ARRAY ORIGINAL:");
        mostrarArray(arr);
        int arrModif[] = modificarArray(arr);
        System.out.println("ARRAY MODIFICADO:");
        mostrarArray(arrModif);
        
        
    }
    
    public static int[] generarArray() {
        Random rnd = new Random();
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = rnd.nextInt(1, 14+1);
        }
        return a;
    }
    
    public static int[] modificarArray(int a[]) {
        int aux[] = a.clone();
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < aux.length; j++) {
                if (a[i] == aux[j] && aux[j] != -1) {
                    aux[j] = -1;
                }
            }
        }
        return aux;
    }
    
    public static void mostrarArray(int precoz[]) {
        for (int i = 0; i < precoz.length; i++) {
            System.out.print(precoz[i] + " ");
        }
        System.out.println();
    }
    
}
