/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
 /* 
 * Arrays1_13 Programa que genere 10 números distintos al azar entre 10 y 50 y 
 * los guarde en un array. A continuación se mostrará el contenido del array.
 */
package arrays1_13;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author enrique
 */
public class Arrays1_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] numeros = new int[10];
        boolean existe;
        int n;

        //Llenamos el array con números aleatorios distintos
        for (int i = 0; i < numeros.length; i++) {

            do {
                //se obtiene un número al azar entre 10 y 50 ambos incluidos
                n = rnd.nextInt(10, 51);
                ///buscamos el número en el array para ver si está repetido
                //recorremos el array desde el principio hasta el último elemento introducido
                existe = false;
                for (int j = 0; j < i && !existe; j++) {
                    if (numeros[j] == n) {
                        existe = true;
                    }
                }
            } while (existe); //si está repetido se vuelve a obtener otro número aleatotio

            numeros[i] = n;

        }

        //La siguiente instrucción ordena el array numeros de menor a mayor.
        //La ordenación la veremos en detalle un poco más adelante.
        //No es necesario ordenar el array, solo se hace para comprobar más fácilmente
        //que no hay elementos repetidos.
        Arrays.sort(numeros);

        //Se muestra el array
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println();
    }

}
