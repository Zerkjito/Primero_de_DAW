/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraysmulti_15;

import java.util.Random;

/**
 *
 * @author enrique
 */
public class ArraysMulti_15 {

    public static void main(String[] args) {
        //Para probar el método vamos a crear 3 arrays de enteros.
        //El tamaño de cada array lo vamos a obtener de forma aleatoria
        //El tamaño será un valor aleatorio entre 5 y 20
        Random rnd = new Random();
        int[] A = new int[rnd.nextInt(5, 21)];
        int[] B = new int[rnd.nextInt(5, 21)];
        int[] C = new int[rnd.nextInt(5, 21)];
        //Asigmanos valores aleatorios a los arrays 
        arrayAleatorio(A);
        arrayAleatorio(B);
        arrayAleatorio(C);

        //obtenemos la matriz que contiene los 3 arrays
        int[][] matriz = obtenerMatriz(A, B, C);

        //mostramos los arrays
        System.out.println("Array A:");
        mostrarArray(A);
        System.out.println("\nArray B:");
        mostrarArray(B);
        System.out.println("\nArray C:");
        mostrarArray(C);

        //mostramos la matriz
        System.out.println("\nMatriz:");
        mostrarMatriz(matriz);

    }

    ///--->>> este es el método que pide el ejercicio
    //Método que recibe tres arrays de enteros y devuelve una matriz de 3 filas en la 
    //que cada fila contiene los valores de cada uno de los arrays
    public static int[][] obtenerMatriz(int[] A, int[] B, int[] C) {
        int[][] matriz = new int[3][]; //matriz de 3 filas    
        //A cada fila de la matriz le asignamos el número de columnas según el tamaño del array correspondiente
        matriz[0] = new int[A.length];//Número de columnas de la primera fila
        matriz[1] = new int[B.length];//Número de columnas de la segunda fila
        matriz[2] = new int[C.length];//Número de columnas de la tercera fila
        //Asignamos a cada fila el contenido del array correspondiente
        //fila 0 de la matriz
        for (int i = 0; i < matriz[0].length; i++) {
            matriz[0][i] = A[i];
        }
        //fila 1 de la matriz
        for (int i = 0; i < matriz[1].length; i++) {
            matriz[1][i] = B[i];
        }
        //fila 2 de la matriz
        for (int i = 0; i < matriz[2].length; i++) {
            matriz[2][i] = C[i];
        }

        return matriz;
    }

    public static void arrayAleatorio(int[] array) {
        Random rnd = new Random();
        //llenar el array con números aleatorios entre 1 y 100
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(100) + 1;
        }
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%5d", matriz[i][j]);
            }
            System.out.println("");
        }
    }

    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%5d", array[i]);
        }
    }

}
