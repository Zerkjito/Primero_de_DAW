/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraysmulti_06;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class ArraysMulti_06 {

    public static void main(String[] args) {
        //crear array A
        double[][] A = new double[4][5];

        //lectura de datos por teclado
        System.out.println("matriz A:");
        leerDatosMatriz(A);

        //sumar las filas de la matriz
        double[] B = sumarFilas(A);

        //mostrar resultados
        System.out.println("matriz A:");
        mostrarMatriz(A);
        System.out.println("\nvector B:");
        mostrarVector(B);

    }

    //método para introducir por teclado los valores de la matriz
    public static void leerDatosMatriz(double[][] M) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                System.out.print("Elemento[" + i + "][" + j + "] = ");
                M[i][j] = sc.nextDouble();
            }
        }
    }

    //este método recibe una matriz de tipo double 
    //y devuelve un array cuyos elementos contienen
    //las suma de cada fila de la matriz que recibe
    public static double[] sumarFilas(double[][] a) {
        //se crea el array que contendrá la suma de cada fila de la matriz
        //el número de elementos de este array es el número de filas de la matriz
        double[] b = new double[a.length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                b[i] = b[i] + a[i][j];
            }
        }
        return b;
    }

    //método para mostrar una matriz por pantalla
    public static void mostrarMatriz(double[][] M) {
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                System.out.printf("%10.4f ", M[i][j]);
            }
            System.out.println();
        }
    }

    //método para mostrar un array de una dimensión (vector) por pantalla
    public static void mostrarVector(double[] M) {
        for (int i = 0; i < M.length; i++) {
            System.out.printf("%10.4f ", M[i]);
        }
        System.out.println();
    }
}
