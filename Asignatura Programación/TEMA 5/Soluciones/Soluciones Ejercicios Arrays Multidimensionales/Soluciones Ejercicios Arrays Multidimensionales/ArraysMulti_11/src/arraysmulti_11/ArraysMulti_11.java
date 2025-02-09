/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraysmulti_11;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class ArraysMulti_11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        do {
            System.out.print("Introduce número de filas (> 0): ");
            N = sc.nextInt();
        } while (N <= 0);
        int[][] A = crearMatriz(N);
        mostrarMatriz(A);
        
    }

    //Método que devuelve una matriz irregular de N filas
    //--->> Este es el método que pide el ejercicio
    public static int[][] crearMatriz(int N) {
        int[][] A = new int[N][];
        for (int i = 0; i < N; i++) {
            A[i] = new int[i + 1];
        }
        return A;
    }
    
    public static void mostrarMatriz(int [][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
    }
}
