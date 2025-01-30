/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/* 
 * Arrays1_05 Escribe un programa que lea por teclado 10 enteros y los guarde en 
 * un array. A continuación debe imprimir:
 * a. Los números impares que ocupan posiciones pares
 * b. La media de los números pares.
 */

package arrays1_05;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Arrays1_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, cont = 0;
        double media = 0;

        //Se crea el array de 10 elementos de tipo int
        int[] numeros = new int[10];

        //Se introducen por teclado los datos del array
        System.out.println("Lectura de los elementos del array: ");
        for (i = 0; i < numeros.length; i++) {
            System.out.print("numeros[" + i + "]= ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Numeros impares que ocupan posiciones pares: ");
        for (i = 0; i < numeros.length; i++) {
            //si la posicion es par y el número es impar, mostramos el número por pantalla
            //consideramos la posición 0 como par
            if (i % 2 == 0 && numeros[i] % 2 != 0) {
                System.out.print(numeros[i] + " ");
            }
            //si el número es par se suma para calcular la media
            if (numeros[i] % 2 == 0) {
                media += numeros[i];
                cont++;
            }
        }
        if (cont == 0) {
            System.out.println("\nNo se han introducido numeros pares");
        } else {
            System.out.printf("%nMedia de los numeros pares: %.2f%n" , media / cont);
        }

    }

}
