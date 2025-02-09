/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraysmulti_13;

import java.util.Random;

/**
 *
 * @author enrique
 */
public class ArraysMulti_13 {

    public static void main(String[] args) {
       //Para probar el método creamos una matriz irregular de 5 filas
        int[][] A = new int[5][];
        //Asignamos a cada fila un número diferente de columnas
        A[0] = new int[5];
        A[1] = new int[2];
        A[2] = new int[8];
        A[3] = new int[10];
        A[4] = new int[3];
        //Llenamos la matriz con números aleatorios. 
        //Utilizamos el método creado en el ejercicio ArraysMulti_12
        modificarMatriz(A);
        //Obtenemos el array con los valores de la última fila
        int[] ultimaFila = obtenerUltimaFila(A);
        //mostramos la matriz
        System.out.println("Matriz: ");
        mostrarMatriz(A);
        //mostramos el array
        System.out.println("\n\nUltima fila de la matriz");
        mostrarArray(ultimaFila);
        System.out.println();
    }

    //Método que devuelve un array con la última fila de la matriz
    //-->>> Este es el método que pide el ejercicio
    public static int[] obtenerUltimaFila(int[][] matriz) {
        int filasMatriz = matriz.length; //número de filas de la matriz
        int columnas = matriz[filasMatriz - 1].length; //número de columnas de la última fila
        int[] array = new int[columnas]; //cremos un array del tamaño de la última fila
        //Pasamos al array la última fila de la matriz
        for (int i = 0; i < columnas; i++) {
            array[i] = matriz[filasMatriz - 1][i];
        }
        
        return array;
    }

    //Método que asigna a cada elemento de la matriz un número aleatorio entre 1 y 100
    public static void modificarMatriz(int[][] matriz) {
        Random rnd = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rnd.nextInt(100) + 1;
            }
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
