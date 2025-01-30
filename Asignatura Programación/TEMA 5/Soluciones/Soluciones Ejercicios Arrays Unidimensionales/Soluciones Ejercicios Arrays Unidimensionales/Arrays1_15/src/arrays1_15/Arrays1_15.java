/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*
 * Arrays1_15 Programa que llene un array de 30 números enteros al azar 
 * entre 1 y 50. Muestra por pantalla el array y a continuación muestra por 
 * pantalla los elementos del array que no estén repetidos, es decir, 
 * los que solo aparezcan una vez en el array.
 */

package arrays1_15;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author enrique
 */
public class Arrays1_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] numeros = new int[30];
        boolean repetido;

        //Llenamos el array con 30 números al azar entre 1 y 50
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rnd.nextInt(1,51);
        }

        //ordenamos el array de menor a mayor
        //No es necesario que se ordene
        //Se realiza la ordenación solo para facilitar la comprobación 
        Arrays.sort(numeros);

        //Se muestra el array
        System.out.println("Array original: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println();

        //Recorremos el array para mostrar los que no estén repetidos
        System.out.println("Valores que no se repiten: ");
        for (int i = 0; i < numeros.length; i++) {

            //para cada elemento se comprueba si no está repetido en el array
            //para comprobar que no esté repetido, se busca el elemento desde el
            //principio hasta el final del array, comprobando que no sea el propio elemento
            repetido = false;
            for (int j = 0; j < numeros.length && !repetido; j++) {
                if (i != j && numeros[i] == numeros[j]) {
                    repetido = true;
                }
            }
            //Si no está repetido se muestra
            if (!repetido) {
                System.out.print(numeros[i] + " ");
            }
        }

    }

}
