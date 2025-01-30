/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
 /* 
 * Arrays1_08 
 * Una jugada de dados consiste en lanzar un dado tres veces consecutivas y 
 * sumar los puntos obtenidos. La suma obtenida variará entre 3 y 18. 
 * Realiza en programa que calcule las frecuencias de aparición de
 * las distintas sumas en N jugadas. N se pide por teclado y debe ser entero positivo.
 */
package arrays1_08;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Arrays1_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);

        //Creamos un array llamado frecuencias
        //Cada elemento del array será un contador
        //La suma obtenida en cada judada indicará la posición del array que hay que incrementar
        //Si por ejemplo la suma obtenida es un 7, el elemento 7 del array se incrementa en uno
        //Como el valor mayor para la suma de los tres dados es 18, creamos el array de tamaño 19.
        //La última posición del array es la posición 18.
        int[] frecuencias = new int[19];
        int N, suma;

        //Introducimos el número de jugadas
        do {
            System.out.print("Introduce número de jugadas: ");
            N = sc.nextInt();
        } while (N <= 0);

        //N jugadas
        for (int i = 1; i <= N; i++) {
            suma = 0;
            //En cada jugada se lanza 3 veces el dado y se suman los puntos
            for (int j = 1; j <= 3; j++) {
                suma = suma + (rnd.nextInt(1, 7)); //número aleatorio del 1 al 6
            }

            //Se incrementa la posición correspondiente a la suma en el array
            frecuencias[suma]++;
        }

        //Se muestran los resultados
        for (int i = 3; i < frecuencias.length; i++) {
            System.out.printf("Suma %2d -> %6d %s %n", i, frecuencias[i], frecuencias[i] > 1 || frecuencias[i] == 0 ? "veces" : "vez");
        }

    }

}
