/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
 /* 
 * Arrays1_11 Escribe un programa que lea un array A de N elementos numéricos 
 * enteros y obtenga otro array B de N elementos con los mismos datos que A 
 * pero en el que los números negativos preceden A los positivos. 
 * Por ejemplo:
 * si A = (2 ,1 ,4, -3, 7, -8, 2, 3, -9, 6)
 * entonces B debe ser: (-3, -8, -9, 2, 1, 4, 7, 2, 3, 6).
 * El valor de N se introduce por teclado. 
 * No hay que ordenar el array, solo colocar los negativos al
 * principio y el resto al final.
 */
package arrays1_11;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Arrays1_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, i, j;

        //Pedimos el tamaño del array
        do {
            System.out.print("Cuantos elementos tendrá el array (>0)? ");
            N = sc.nextInt();
        } while (N <= 0);

        //Creamos los dos arrays de tamaño N
        int[] A = new int[N];
        int[] B = new int[N];

        //lectura del array A
        System.out.println("Elementos del array A: ");
        for (i = 0; i < A.length; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = sc.nextInt();
        }

        j = 0;   //j es el indice del array B 
        //recorremos el array A para copiar en B los negativos
        for (i = 0; i < A.length; i++) {
            if (A[i] < 0) {    //si el valor es negativo
                B[j] = A[i];   //se copia en B en la posición j
                j++;           //se incrementa el indice del array B
            }
        }

        //recorremos de nuevo el array A 
        //para copiar en B los positivos a continuación de los negativos
        for (i = 0; i < A.length; i++) {
            if (A[i] >= 0) {
                B[j] = A[i];
                j++;
            }
        }

        //Mostramos los arrays A y B
        System.out.println("Array A: ");
        for (i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
        System.out.println("Array B: ");
        for (i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
        System.out.println();

    }

}
