/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraysmulti_08;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class ArraysMulti_08 {

    public static void main(String[] args) {
        //leer el número total de estudiantes
        int N = leerNumeroDeEstudiantes();

        //crear los arrays
        String nombres[] = new String[N];
        double[][] notas = new double[N][10];
        double[] medias;

        double mediaTotal;

        //lectura de datos
        leerEstudiantes(nombres, notas);

        //calcular media de cada estudiante
        medias = calcularMedias(notas);

        //calcular media de todos los almacenes
        mediaTotal = calcularMediaTotal(medias);

        //Mostrar resultados
        mostrarResultados(nombres, notas, medias, mediaTotal);

    }

    public static int leerNumeroDeEstudiantes() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Número de estudiantes: ");
            n = sc.nextInt();
        } while (n <= 0);
        return n;
    }

    //método para leer el nombre y las notas de cada estudiante
    public static void leerEstudiantes(String[] s, double[][] M) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lectura de notas de cada estudiante:");
        for (int i = 0; i < M.length; i++) {
            System.out.println("Alumno " + (i + 1) + ": ");
            System.out.print("Nombre: ");
            s[i] = sc.nextLine();
            for (int j = 0; j < M[i].length; j++) {
                do {
                    System.out.print("Nota " + (j + 1) + " = ");
                    M[i][j] = sc.nextDouble();
                } while (M[i][j] < 0 || M[i][j] > 10);            
            }
            sc.nextLine();
        }
    }

    //método para calcular la media de cada estudiante
    public static double[] calcularMedias(double[][] a) {
        double[] b = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                b[i] = b[i] + a[i][j];
            }
            b[i] = b[i] / a[i].length;  //media = suma de todas las notas entre el número de notas
        }
        return b;
    }

    //método para calcular la media de la clase
    public static double calcularMediaTotal(double[] a) {
        double media = 0;
        for (int i = 0; i < a.length; i++) {
            media = media + a[i];
        }
        media = media / a.length;

        return media;
    }

    public static void mostrarResultados(String[] n, double[][] A, double[] B, double m) {
        //mostrar notas y media de cada alumno
        for (int i = 0; i < A.length; i++) {
            System.out.printf("%2d %-20s: ", (i + 1), n[i]);
            for (int j = 0; j < A[i].length; j++) {
                System.out.printf("%6.2f", A[i][j]);
            }
            System.out.printf(" Media: %5.2f", B[i]);
            System.out.printf(" -> Diferencia con la media de la clase %+5.2f %n", (B[i] - m));
        }
        System.out.println();
        System.out.printf("Media de la clase: %.2f %n", m);
    }

    
}
