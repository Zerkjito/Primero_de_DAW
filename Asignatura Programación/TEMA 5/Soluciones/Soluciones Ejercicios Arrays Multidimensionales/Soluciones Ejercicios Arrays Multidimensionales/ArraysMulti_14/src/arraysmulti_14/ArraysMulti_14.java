/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraysmulti_14;

import java.util.Random;

/**
 *
 * @author enrique
 */
public class ArraysMulti_14 {

    public static void main(String[] args) {
        //Para probar el método creamos una matriz de 5 filas y 7 columnas
        int[][] A = new int[5][7];
        //Llenamos la matriz con números aleatorios. 
        modificarMatriz(A);
        //Obtenemos el array con el valor mayor de cada fila de la matriz y su posición
        int[][] B = metodo(A);
        //mostramos la matriz A
        System.out.println("Matriz A: ");
        mostrarMatriz(A);
        //mostramos el la matriz B
        System.out.println("\n\nMatriz B: ");
        mostrarMatriz(B);
        System.out.println();
    }

    //--->>> este método es el que pide el ejercicio
    //método que recibe una matriz de enteros A y devuelve una matriz B que contiene
    //en cada fila el mayor elemento de cada fila de A y su posición dentro de la fila 
    public static int[][] metodo(int[][] A) {
        int[][] B = new int[A.length][2];//Se la matriz B con las mismas filas que A y dos columnas
        int mayor, posicion;
        for (int i = 0; i < A.length; i++) {
            mayor = A[i][0];//En cada fila tomamamos el primer elemento como el mayor
            posicion = 0;
            for (int j = 1; j < A[i].length; j++) { //comprobamos el resto de elementos de la fila
                if (A[i][j] > mayor) {
                    mayor = A[i][j];
                    posicion = j;
                }
            }
            B[i][0] = mayor;//Guardamos en B el mayor de la fila y su posición
            B[i][1] = posicion;
        }
        return B;
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

}
