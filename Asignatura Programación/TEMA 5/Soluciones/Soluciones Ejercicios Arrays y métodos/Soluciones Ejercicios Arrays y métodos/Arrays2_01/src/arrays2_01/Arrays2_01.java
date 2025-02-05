/* 
 * Arrays2_1 Programa que lea dos arrays V1 y V2 de 20 elementos numéricos 
 * enteros y a continuación crea un array V3 “concatenación” de los dos, 
 * es decir poner los elementos de V2 a continuación de los de V1. 
 * Mostrar los elementos de V3. Utiliza 3 métodos: uno para leer los arrays, 
 * otro para pasar los valores al array V3 y otro para mostrar los arrays.
 */
package arrays2_01;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Arrays2_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Creamos los dos arrays de 20 elementos de tipo int
        int[] V1 = new int[20];
        int[] V2 = new int[20];

        System.out.println("Lectura de datos del array V1");
        leerArray(V1);

        System.out.println("Lectura de datos del array V2");
        leerArray(V2);

        int[] V3 = concatenar(V1, V2);

        System.out.println("array V1: ");
        mostrar(V1);
        System.out.println("array V2: ");
        mostrar(V2);
        System.out.println("array V3: ");
        mostrar(V3);
    }

    //Método para leer un array de enteros
    public static void leerArray(int[] v) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < v.length; i++) {
            System.out.print("elemento[" + i + "]= ");
            v[i] = sc.nextInt();
        }
    }

    //método para concatenar doa arrays de enteros
    //el método devuelve el array resultante
    public static int[] concatenar(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int i, j, k;
        for (i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (j = i, k = 0; k < b.length; k++, j++) {
            c[j] = b[k];
        }
        return c;
    }

    //método para mostrar por pantalla un array de enteros
    public static void mostrar(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }
}
