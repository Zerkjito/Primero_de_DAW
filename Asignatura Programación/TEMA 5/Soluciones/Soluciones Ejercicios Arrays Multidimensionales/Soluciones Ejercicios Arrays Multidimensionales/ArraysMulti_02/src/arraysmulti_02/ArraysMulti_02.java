/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraysmulti_02;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class ArraysMulti_02 {

    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        int filas, columnas;

        //introducir por teclado el número de filas
        do {
            System.out.print("Número de filas: ");
            filas = sc.nextInt();
        } while (filas <= 0);

        //introducir pior teclado el número de columnas
        do {
            System.out.print("Número de columnas: ");
            columnas = sc.nextInt();
        } while (columnas <= 0);

        //se crea el array del tamaño indicado por las variables filas y columnas
        int[][] A = new int[filas][columnas];

        //llenar el array con números aleatorios entre 0 y 9
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                A[i][j] = rnd.nextInt(10);
            }
        }

        //mostrar array
        System.out.println("Array creado: ");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.printf("%3d", A[i][j]);
            }
            System.out.println();
        }
    }

}
