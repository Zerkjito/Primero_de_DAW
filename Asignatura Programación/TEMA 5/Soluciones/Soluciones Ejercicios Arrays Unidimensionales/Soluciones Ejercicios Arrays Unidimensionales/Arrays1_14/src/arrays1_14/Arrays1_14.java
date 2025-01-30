/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
 /*
 * Arrays1_14 Programa que pida un número entero N y genere 10000 números 
 * aleatorios entre 1 y N. A continuación mostrar cuántas veces se ha generado 
 * cada uno de los números entre 1 y N
 */
package arrays1_14;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Arrays1_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        int N, aleatorio;
        do {
            System.out.print("Introduce valor de N: ");
            N = sc.nextInt();
        } while (N < 1);
        //Se crea el array de tamaño N
        int[] numeros = new int[N];
        //Se obtienen 10000 números aleatorios entre 1 y N
        for (int i = 1; i <= 10000; i++) {
            aleatorio = rnd.nextInt(1, N + 1);
            numeros[aleatorio - 1]++;//se incrementa la posición del array correspondiente al número aleatorio obtenido
        }
        //se muestra el array
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("El número " + (i + 1) + " se ha obtenido " + numeros[i] + " veces");
        }

    }

}
