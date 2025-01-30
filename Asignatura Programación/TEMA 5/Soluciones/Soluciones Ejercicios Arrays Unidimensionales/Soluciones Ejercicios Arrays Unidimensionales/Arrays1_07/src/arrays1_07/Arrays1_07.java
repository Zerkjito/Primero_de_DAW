/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
 /* 
 * Arrays1_07 Programa que lea por teclado números enteros y los guarde en dos 
 * arrays, a y b de 10 elementos cada uno. A continuación calcula:
 * a) Un nuevo array suma.      suma[i] = a[i] + b[i]
 * b) Un nuevo array producto.  producto[i] = a[i] * b[i]
 */
package arrays1_07;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Arrays1_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;

        //Creamos los arrays
        int[] a = new int[10];
        int[] b = new int[10];
        int[] suma = new int[10];
        int[] producto = new int[10];

        //Introducimos los datos del array a
        System.out.println("Lectura de los elementos del array a: ");
        for (i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        //Introducimos los datos del array b
        System.out.println("Lectura de los elementos del array b: ");
        for (i = 0; i < b.length; i++) {
            System.out.print("b[" + i + "] = ");
            b[i] = sc.nextInt();
        }

        //Obtenemos los valores de los arrays suma y producto
        for (i = 0; i < a.length; i++) {
            suma[i] = a[i] + b[i];
            producto[i] = a[i] * b[i];
        }

        //Mostramos el array a
        System.out.print("array a : ");
        for (i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();

        //Mostramos el array b
        System.out.print("array b : ");
        for (i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();

        //Mostramos el array suma
        System.out.print("suma    : ");
        for (i = 0; i < suma.length; i++) {
            System.out.print(suma[i] + " ");
        }
        System.out.println();

        //Mostramos el array producto
        System.out.print("producto: ");
        for (i = 0; i < producto.length; i++) {
            System.out.print(producto[i] + " ");
        }
        System.out.println();

    }

}
