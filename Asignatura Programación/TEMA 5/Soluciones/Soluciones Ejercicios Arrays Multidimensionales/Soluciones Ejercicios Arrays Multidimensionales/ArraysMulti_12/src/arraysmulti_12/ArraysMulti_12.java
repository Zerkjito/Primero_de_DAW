/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraysmulti_12;

import java.util.Random;

/**
 *
 * @author enrique
 */
public class ArraysMulti_12 {

    public static void main(String[] args) {
        //Para probar el método creamos una matriz irregular de 5 filas
        int[][] A = new int[5][];
        //Asignamos a cada fila un número diferente de columnas
        A[0] = new int[5];
        A[1] = new int[2];
        A[2] = new int[8];
        A[3] = new int[10];
        A[4] = new int[3];

        modificarMatriz(A);
        mostrarMatriz(A);

    }

    //Método que recibe una matriz de enteros y asigna a cada elemento de la matriz un número aleatorio entre 1 y 100
    //--->>>> este es el método que pide el ejercicio
    public static void modificarMatriz(int[][] matriz) {
        Random rnd = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rnd.nextInt(1,101);
            }
        }
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%5d" , matriz[i][j]);
            }
            System.out.println("");
        }
    }
}
