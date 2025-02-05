/*
 * Arrays2_07
 * Escribe un método que reciba un entero N y devuelva un array con N números 
 * aleatorios entre 0 y 9.
 */
package arrays2_07;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Arrays2_07 {

    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduce tamaño del array ( > 0): ");
            N = sc.nextInt();
        } while (N < 1);

        int[] A = llenarConAleatorios(N);

        System.out.println("Array creado:");
        mostrar(A);
    }

    //Método que crea y devuelve un array de enteros de tamaño n
    //los elementos del array son valores aleatorios entre 0 y 9
    public static int[] llenarConAleatorios(int n) {
        Random rnd = new Random();
        int[] numeros = new int[n];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rnd.nextInt(10);//números entre 0 al 9
        }
        return numeros;
    }

    //método para mostrar el array de enteros
    public static void mostrar(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.printf("%3d", v[i]);
        }
        System.out.println();
    }

}
