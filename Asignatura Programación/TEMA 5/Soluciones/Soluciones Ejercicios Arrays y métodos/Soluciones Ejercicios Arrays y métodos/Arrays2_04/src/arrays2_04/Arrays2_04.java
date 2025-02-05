/*
 * Arrays2_4
 * Escribe un método que reciba un array A de enteros y devuelva mediante return
 * un array con los mismos elementos de A pero en orden inverso
 */
package arrays2_04;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Arrays2_04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Creamos un array de 10 enteros (el ejercicio no indica de qué tamaño debe ser)
        int[] A = new int[10];

        for (int i = 0; i < A.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            A[i] = sc.nextInt();
        }
        System.out.println("Array introducido;");
        mostrar(A);
        int[] B = invertir(A);
        System.out.println("Array invetido;");
        mostrar(B);

    }

    //Este método recibe un array de enteros y devuelve otro array de enteros 
    //con los elementos del array recibido en orden inverso
    public static int[] invertir(int[] array) {
        int[] inverso = new int[array.length]; //creamos un array de enteros del mismo tamaño que el array recibido
        //pasamos el contenido del array original al array inverso
        //j es el índice del array inverso
        //i es el índice del array original
        //el array original lo recorremos desde el final hasta el principio
        for (int j = 0, i = array.length - 1; i >= 0; j++, i--) {
            inverso[j] = array[i];
        }
        return inverso;
    }

    //método para mostrar el array
    public static void mostrar(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }

}
