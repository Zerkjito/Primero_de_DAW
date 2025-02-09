/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraysmulti_07;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class ArraysMulti_07 {

    public static void main(String[] args) {
        //crear array ventas
        //contendrá las ventas mensuales de cada almacén
        //10 almacenes
        //12 meses
        double[][] ventas = new double[10][12];

        double mediaTotal; //media de ventas de todos los almacenes     

        //lectura de datos por teclado
        leerMatriz(ventas);

        //calcular media de ventas de cada almacén
        double[] medias = calcularMedias(ventas);

        //calcular media de todos los almacenes
        mediaTotal = calcularMediaTotal(medias);

        //Mostrar resultados
        mostrarResultados(ventas, medias, mediaTotal);
    }

    //método para introducir en la matriz las ventas mensuales de cada almacén
    public static void leerMatriz(double[][] M) {
        //Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        //System.out.println("Lectura de ventas de cada almacén:");
        for (int i = 0; i < M.length; i++) {
            //System.out.println("Almacén " + (i + 1));
            for (int j = 0; j < M[i].length; j++) {
                //System.out.print("Ventas mes " + (j + 1) + " = ");       
                //M[i][j] = sc.nextDouble();

                //En lugar de leer por teclado se generan valores aleatoriamente para probar el funcionamiento del programa
                //******************************************************
                M[i][j] = rnd.nextDouble() * 50000;
                //******************************************************
            }
        }
    }

    //método para calcular la media de ventas anual de cada almacén
    //devuelve un array de 10 elementos que contiene la media de ventas de cada almacén
    public static double[] calcularMedias(double[][] a) {
        double[] b = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                b[i] = b[i] + a[i][j];
            }
            b[i] = b[i] / a[i].length;  //media de ventas del alamcén = suma de ventas de todos los dividido por el número de meses
        }
        return b;
    }

    //método para calcular la media de ventas de todos los almacenes
    public static double calcularMediaTotal(double[] a) {
        double media = 0;
        for (int i = 0; i < a.length; i++) {
            media = media + a[i];
        }
        media = media / a.length;

        return media;
    }

    //método para mostrar los datos por pantalla
    public static void mostrarResultados(double[][] A, double[] B, double m) {
        String[] meses = {"ENE", "FEB", "MAR", "ABR", "MAY", "JUN", "JUL", "AGO", "SEP", "OCT", "NOV", "DIC", "MEDIA"};
        //mostrar meses
        System.out.print("          ");
        for (int i = 0; i < meses.length; i++) {
            System.out.printf("%11s", meses[i]);
        }
        System.out.println();
        //mostrar ventas y media de cada almacén
        for (int i = 0; i < A.length; i++) {
            System.out.printf("Almacén %2s: ", (i + 1));
            for (int j = 0; j < A[i].length; j++) {
                System.out.printf("%,11.2f", A[i][j]);
            }
            System.out.printf("%,11.2f", B[i]);
            if (B[i] > m) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.printf("Media total de ventas: %,.2f %n", m);
        System.out.println("--> * indica que las ventas del almacén son superiores a la media");
    }
    
}
