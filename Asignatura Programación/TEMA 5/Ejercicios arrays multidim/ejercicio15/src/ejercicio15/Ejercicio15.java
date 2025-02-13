/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio15 {
    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr1 = generarArray();
        int[] arr2 = generarArray();
        int[] arr3 = generarArray();
        int[][] multi = fusionarArrays(arr1, arr2, arr3);
        System.out.println("\nArray 1:");
        mostrarArr(arr1);
        System.out.println("\nArray 2:");
        mostrarArr(arr2);
        System.out.println("\nArray 3:");
        mostrarArr(arr3);
        System.out.println();
        System.out.println("\nMatriz fusionada resultante:");
        mostrarMatr(multi);
        
        
    }
    
    public static int[] generarArray() {
        Random rnd = new Random();
        int[] arr = new int[rnd.nextInt(1, 8+1)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(-10, 50+1);
        }
        return arr;
    }
    
    public static int[][] fusionarArrays(int[] n1, int[] n2, int[] n3) {
        int[][] matr = new int[3][];
        
        matr[0] = new int[n1.length];
        matr[1] = new int[n2.length];
        matr[2] = new int[n3.length];
        
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                switch (i) {
                    case 0 -> matr[i][j] = n1[j];
                    case 1 -> matr[i][j] = n2[j];
                    case 2 -> matr[i][j] = n3[j];
                }
            }
        }
        return matr;
    }
    
    public static void mostrarMatr(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    public static void mostrarArr(int[] a) {
        for (int i : a) {
            System.out.print(i + "  ");
        }
        System.out.println();
    }
    
}
