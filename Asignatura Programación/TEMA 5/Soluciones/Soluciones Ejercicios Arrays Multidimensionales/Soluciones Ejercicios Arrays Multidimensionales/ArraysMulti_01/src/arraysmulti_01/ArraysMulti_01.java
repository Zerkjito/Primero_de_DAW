/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraysmulti_01;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class ArraysMulti_01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //se crea el arrau de 3 filas y 4 columnas
        int[][] A = new int[3][4];

        //llenar el array con números enteros que se introducen por teclado
        System.out.println("Introducir elementos en el array");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = sc.nextInt();
            }
        }

        //mostrar array
        System.out.println("\nContenido del array:\n");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.printf("%3d", A[i][j]);
            }
            System.out.println();
        }
    }
    
}
