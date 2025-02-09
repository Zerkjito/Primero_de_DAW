/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraysmulti_09;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class ArraysMulti_09 {

    public static void main(String[] args) {
        //crear los arrays
        
        //array para guardar los nombres de los 10 estudiantes
        String nombres[] = new String[10];
        
        //array para guardar las notas de cada estudiante
        //Es una matriz irregular. Se crea con 10 filas, una para cada estudiante
        //después a cada alumno (a cada fila) se le asignará el número de notas (el número de columnas)
        double[][] notas = new double[10][];  
        double[] medias;

        double mediaTotal;

        //lectura de datos
        leerEstudiantes(nombres, notas);

        //calcular media de cada estudiante
        medias = calcularMedias(notas);

        //calcular media de todos los estudiantes
        mediaTotal = calcularMediaTotal(medias);

        //Mostrar resultados
        mostrarResultados(nombres, notas, medias, mediaTotal);

    }

    //leer el nombre y las notas de cada estudiante
    public static void leerEstudiantes(String[] s, double[][] M) {
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.println("Lectura de notas de cada estudiante:");
        for (int i = 0; i < M.length; i++) {
            System.out.println("Alumno " + (i + 1) + ": ");
            System.out.print("Nombre: ");
            s[i] = sc.nextLine();
            
            //pedimos el número de notas que tiene el estudiante
            do {
                System.out.print("Número de notas: ");
                N = sc.nextInt();
            } while (N <= 0);
            
            M[i] = new double[N]; //asignamos el tamaño para la fila i de la matriz
                                  //la fila tendrá N columnas, tantas como notas tiene este estudiante
            
            //se leen las notas del estudiante 
            for (int j = 0; j < M[i].length; j++) {
                do {
                    System.out.print("Nota " + (j + 1) + " = ");
                    M[i][j] = sc.nextDouble();
                } while (M[i][j] < 0 || M[i][j] > 10);
                sc.nextLine();
            }
        }
    }

    public static double[] calcularMedias(double[][] a) {
        double[] b = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                b[i] = b[i] + a[i][j];
            }
            b[i] = b[i] / a[i].length;
        }
        return b;
    }

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
            System.out.printf(" -> Diferencia con la media %+5.2f %n", (B[i] - m));
        }
        System.out.println();
        System.out.printf("Media de la clase: %.2f %n", m);
    }
    
}
