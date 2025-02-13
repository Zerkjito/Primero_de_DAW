/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio13 {
    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] multi = generarMatrizIrr();
        int[] arr = devolverUltFila(multi);
        System.out.println("\nMatriz original:");
        mostrarMatr(multi);
        System.out.println("\nUltima fila de la matriz:");
        mostrarArr(arr);
        
    }
    
    public static int[][] generarMatrizIrr() {
        Random rnd = new Random();
        int[][] matr =  new int[rnd.nextInt(1,8+1)][];
        for (int i = 0; i < matr.length; i++) {
            matr[i] = new int[rnd.nextInt(1, 8+1)];
            for (int j = 0; j < matr[i].length; j++) {
                matr[i][j] =  rnd.nextInt(1, 100+1);
            }
        }
        return matr;
    }
    
    public static int[] devolverUltFila(int[][] m) {
        int ultimaFila = m.length - 1;
        int[] arr = new int[m[ultimaFila].length];
        
        for (int i = 0; i < m[ultimaFila].length; i++) {
            arr[i] = m[ultimaFila][i];
        }
        return arr;
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
            System.out.print(i + "\t");
        }
        System.out.println( );
    }
}
