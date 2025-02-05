/*
 * Arrays2_02 Escribe un programa que lea un array de N elementos y rote todas 
 * sus componentes un lugar hacia su derecha, teniendo en cuenta que la última 
 * componente se ha de desplazar al primer lugar. No se puede utilizar un array 
 * auxiliar. Utiliza un método que realice el proceso de rotar las componentes 
 * del array.
 */
package arrays2_02;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Arrays2_02 {

    public static void main(String[] args) {
        int[] A = crearArray();
        System.out.println("Lectura de datos del array");
        leerArray(A);
        System.out.println("Array introducido;");
        mostrar(A);
        desplazarDerecha(A);
        System.out.println("Array modificado;");
        mostrar(A);
    }

    //Método que crea y devuelve un array de enteros
    //El tamaño del array se lee por teclado dentro del método
    public static int[] crearArray() {
        Scanner sc = new Scanner(System.in);
        int N;
        do {
            System.out.print("Número de elementos del array (>0): ");
            N = sc.nextInt();
        } while (N <= 0);
        int[] A = new int[N];
        return A;
    }

    //Método para leer un array de enteros
    public static void leerArray(int[] v) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < v.length; i++) {
            System.out.print("elemento[" + i + "]= ");
            v[i] = sc.nextInt();
        }
    }

    //método para desplazar un lugar a la derecha todos los elementos
    //de un array de enteros 
    public static void desplazarDerecha(int[] a) {
        int i;
        int aux = a[a.length - 1]; //guardo el último elemento
        for (i = a.length - 1; i > 0; i--) { //desplazo los elementos a la derecha
            a[i] = a[i - 1];
        }
        a[0] = aux; //el último elemento ahora es el primero
    }

    //método para mostrar un array de enteros
    public static void mostrar(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }

}
