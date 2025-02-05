/*
 * Arrays2_09 Escribe un método que reciba dos arrays de tipo double y devuelva 
 * el mayor valor contenido en los dos arrays.
 */
package arrays2_09;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Arrays2_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //como el ejercicio no indica nada, los tamaños del array los pediremos por teclado.
        int N;
        do {
            System.out.print("Introduce tamaño del array A( > 0 ): ");
            N = sc.nextInt();
        } while (N < 1);
        double[] A = new double[N];

        do {
            System.out.print("Introduce tamaño del array B( > 0 ): ");
            N = sc.nextInt();
        } while (N < 1);
        double[] B = new double[N];

        //En lugar de introducir los valores de los arrays por teclado los vamos a obtener de forma aleatoria
        llenarConAleatoriosDouble(A);
        llenarConAleatoriosDouble(B);

        System.out.println("Array A: ");
        mostrar(A);
        System.out.println("Array B: ");
        mostrar(B);

        System.out.printf("Elemento mayor: %.4f%n", elementoMayor(A, B));
    }

    //método que llena un array de tipo double con números aleatorios
    public static void llenarConAleatoriosDouble(double[] x) {
        Random rnd = new Random();
        for (int i = 0; i < x.length; i++) {
            x[i] = rnd.nextDouble(-100, 100); //El ejercicio no indica nada así que se ha decidido limitar los números aleatorios entre -100 y 100
        }
       
    }

    //métdoo que recibe dos arrays de tipo double y devuelve el mayor elemento
    //de ambos 
    public static double elementoMayor(double[] a, double[] b) {
        double mayor = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > mayor) {
                mayor = a[i];
            }
        }
        for (int i = 0; i < b.length; i++) {
            if (b[i] > mayor) {
                mayor = b[i];
            }
        }
        return mayor;
    }

    //método para mostrar un array de tipo double
    public static void mostrar(double[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.printf("%.4f ", v[i]);
        }
        System.out.println();
    }

}
