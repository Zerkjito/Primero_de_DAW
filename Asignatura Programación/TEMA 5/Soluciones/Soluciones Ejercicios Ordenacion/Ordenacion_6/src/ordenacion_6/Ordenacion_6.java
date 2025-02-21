/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenacion_6;

import java.util.Random;

/**
 *
 * @author enrique
 */
public class Ordenacion_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int N = 50000;
        int[] array = new int[N];
        llenarArray(array);
        int[] aux = array.clone();
        System.out.println("Número de elementos: " + N);

        System.out.println("Ordenando mediante el método de la burbuja...");
        long t1 = System.currentTimeMillis();
        burbuja(array);
        long t2 = System.currentTimeMillis();
        System.out.println("Burbuja (ms): " + (t2 - t1));

        array = aux.clone();
        System.out.println("Ordenando mediante el método de selección...");
        t1 = System.currentTimeMillis();
        seleccion(array);
        t2 = System.currentTimeMillis();
        System.out.println("Seleccion (ms): " + (t2 - t1));
        
        array = aux.clone();
        System.out.println("Ordenando mediante el método Quicksort...");
        t1 = System.currentTimeMillis();
        quicksort(array, 0, N - 1);
        t2 = System.currentTimeMillis();
        System.out.println("Quicksort (ms): " + (t2 - t1));

        //// Lo mismo para el resto de métodos de ordenación
    }

    public static void llenarArray(int[] x) {
        Random rnd = new Random();
        for (int i = 0; i < x.length; i++) {
            x[i] = rnd.nextInt(1000);
        }
    }

    public static void burbuja(int[] A) {
        int i, j, aux;
        for (i = 0; i < A.length - 1; i++) {
            for (j = 0; j < A.length - i - 1; j++) {
                if (A[j + 1] < A[j]) {
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                }
            }
        }
    }

    public static void seleccion(int A[]) {
        int i, j, menor, pos, tmp;
        for (i = 0; i < A.length - 1; i++) { // tomamos como menor el primero
            menor = A[i];         // de los elementos que quedan por ordenar
            pos = i;              // y guardamos su posición
            for (j = i + 1; j < A.length; j++) { // buscamos en el resto
                if (A[j] < menor) {         // del array algún elemento
                    menor = A[j];           // menor que el actual
                    pos = j;
                }
            }
            if (pos != i) { // si hay alguno menor se intercambia
                tmp = A[i];
                A[i] = A[pos];
                A[pos] = tmp;
            }
        }
    }

    public static void quicksort(int A[], int izq, int der) {
        int pivote = A[izq]; // tomamos primer elemento como pivote
        int i = izq, j = der, aux; // i realiza la búsqueda de izquierda a derecha
        // j realiza la búsqueda de derecha a izquierda
        while (i < j) { // mientras no se crucen las búsquedas
            while (A[i] <= pivote && i < j) {
                i++; // busca elemento mayor que pivote
            }
            while (A[j] > pivote) {
                j--; // busca elemento menor que pivote
            }
            if (i < j) { // si no se han cruzado
                aux = A[i]; // los intercambia
                A[i] = A[j];
                A[j] = aux;
            }
        }
        A[izq] = A[j]; // se coloca el pivote en su lugar de forma que tendremos
        A[j] = pivote; // los menores a su izquierda y los mayores a su derecha
        if (izq < j - 1) {
            quicksort(A, izq, j - 1); // ordenamos subarray izquierdo
        }
        if (j + 1 < der) {
            quicksort(A, j + 1, der); // ordenamos subarray derecho
        }
    }
}
