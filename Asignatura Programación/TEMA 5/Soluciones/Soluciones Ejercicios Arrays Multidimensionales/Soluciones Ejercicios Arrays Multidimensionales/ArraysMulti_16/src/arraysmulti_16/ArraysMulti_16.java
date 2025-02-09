/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraysmulti_16;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class ArraysMulti_16 {

    public static void main(String[] args) {
        //leer el número de filas
        int N = leerFilas();

        //crear un cuadrado latino de 
        int[][] M = cuadradoLatino(N);

        //mostrar matriz 
        mostrarMatriz(M);

    }

    public static int leerFilas() {
        Scanner sc = new Scanner(System.in);
        int filas;
        //lectura del número de filas
        do {
            System.out.print("Número de filas > 2: ");
            filas = sc.nextInt();
        } while (filas <= 2);
        return filas;
    }

    //método que crea un cuadrado latino de orden n
    public static int[][] cuadradoLatino(int n) {
        //se crea la matriz de n filas y n columnas
        int[][] a = new int[n][n];
        for (int j = 0; j < a.length; j++) { //en la primera fila guardamos los numeros desde 1 hasta N 
            a[0][j] = j + 1;
        }

        for (int i = 1; i < a.length; i++) { //para el resto de filas
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = a[i - 1][j]; //en cada fila copiamos la anterior
            }
            desplazarDerecha(a[i]);  //y la rotamos
        }
        return a;
    }

    //método que desplaza los elementos de un array de una dimensión un lugar a la derecha
    public static void desplazarDerecha(int[] a) {
        int i;
        int aux = a[a.length - 1]; //guardo el último elemento del array
        for (i = a.length - 1; i > 0; i--) { //desplazo los elementos empezando por el final. A cada elemento se asigna el elemeno anterior
            a[i] = a[i - 1];
        }
        a[0] = aux; //al primer elemento se asigna el último que teníamos guardado en aux
    }

    public static void mostrarMatriz(int[][] A) {
        int i, j;
        for (i = 0; i < A.length; i++) {
            for (j = 0; j < A[i].length; j++) {
                System.out.printf("%5d", A[i][j]);
            }
            System.out.println();
        }
    }
}
