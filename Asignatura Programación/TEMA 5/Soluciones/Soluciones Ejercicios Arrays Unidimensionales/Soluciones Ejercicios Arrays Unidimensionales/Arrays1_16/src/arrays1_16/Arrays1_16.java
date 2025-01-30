/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
 /*
   Arrays1_16 Programa que llene un array de 30 números enteros al azar entre 
   1 y 50. Muestra por pantalla el array y a continuación muestra por pantalla
   los elementos del array sin repetirlos, es decir, los que estén repetidos
   se mostrarán solo una vez.
 */
package arrays1_16;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author enrique
 */
public class Arrays1_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] numeros = new int[30];
        int[] salida = new int[30]; //array que contendrá los números sin repetirlos
        int k = 0; //variable que se usará como índice del array salida
        boolean existe;

        //Llenamos el array con 30 números al azar entre 1 y 50
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rnd.nextInt(1, 51);
        }


        //Recorremos el array para mostrar los elementos sin repetirlos
        //Para obtener los elementos sin repetirlos utilizaremos el array salida
        //Cada elemento del array numeros se pasa al array salida comprobando que 
        //no lo hayamos pasado ya 
        for (int i = 0; i < numeros.length; i++) {
            //Para cada elemento del array comprobamos que no esté ya en el array salida
            existe = false;
            for (int j = 0; j < k && !existe; j++) {
                if (salida[j] == numeros[i]) {
                    existe = true;
                }
            }
            //Si no lo hemos hecho antes lo pasamos al array salida
            if (!existe) {
                salida[k] = numeros[i];
                k++;//variable que utilizamos como índice para el array salida. Contiene el número de elementos real que contiene el array
            }
        }
        
        
        //ordenamos el array numeros de menor a mayor
        //No es necesario que se ordene
        //Se realiza la ordenación solo para facilitar la comprobación
        Arrays.sort(numeros);

        //Se muestra el array
        System.out.println("Array original: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        //ordenamos el array salida de menor a mayor
        //No es necesario que se ordene
        //Se realiza la ordenación solo para facilitar la comprobación
        Arrays.sort(salida, 0, k);
        //Se muestra el array
        System.out.println("\nArray sin elementos repetidos: ");
        for (int i = 0; i < k; i++) {
            System.out.print(salida[i] + " ");
        }

    }

}
