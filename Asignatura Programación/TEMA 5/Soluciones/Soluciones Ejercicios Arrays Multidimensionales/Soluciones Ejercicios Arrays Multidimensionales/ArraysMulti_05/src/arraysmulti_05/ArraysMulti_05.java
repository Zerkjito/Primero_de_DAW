/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraysmulti_05;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class ArraysMulti_05 {

    public static void main(String[] args) {
        int filas, columnas;
        //lectura del número de filas y columnas
        do {
            System.out.print("Número de filas: ");
            filas = leerEntero();
        } while (filas < 1);
        do {
            System.out.print("Número de columnas: ");
            columnas = leerEntero();
        } while (columnas < 1);

        //crear las matrices A y B
        int[][] A = crearMatriz(filas, columnas);
        int[][] B = crearMatriz(filas, columnas);

        //Introducir datos en matrices
        System.out.println("matriz A:");
        llenarMatriz(A);
        System.out.println("matriz B:");
        llenarMatriz(B);

        //crear matriz C como suma de A + B
        int[][] C = sumarMatrices(A, B);

        //mostrar resultados
        System.out.println("matriz A:");
        mostrarMatriz(A);
        System.out.println("\nmatriz B:");
        mostrarMatriz(B);
        System.out.println("\nmatriz Suma:");
        mostrarMatriz(C);
    }

    //método para crear una matriz
    public static int[][] crearMatriz(int f, int c) {
        int[][] M = new int[f][c];
        return M;
    }

    //nmétodo para leer un número entero por teclado
    public static int leerEntero() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        return n;
    }

    //método para llenar una matriz con números enteros introducidos por teclado
    public static void llenarMatriz(int[][] M) {
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                System.out.print("Elemento[" + i + "][" + j + "] = ");
                M[i][j] = leerEntero();
            }
        }
    }

    //método para mostrar una matriz por pantalla
    public static void mostrarMatriz(int[][] M) {
        int i, j;
        for (i = 0; i < M.length; i++) {//FILAS
            for (j = 0; j < M[i].length; j++) {//COLUMNAS
                System.out.printf("%3d", M[i][j]);
            }
            System.out.println();
        }
    }

    //método para sumar dos matrices
    public static int[][] sumarMatrices(int[][] a, int[][] b) {
        int[][] c = crearMatriz(a.length, a[0].length);
        int i, j;
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

}
