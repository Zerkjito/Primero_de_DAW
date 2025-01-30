/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
 /*
 * Arrays1_12 Programa que crea un array de enteros de tamaño N y lo llene 
 * con números aleatorios entre -100 y 100 ambos incluidos. El tamaño N del 
 * array se introduce por teclado. A continuación se piden números por
 * teclado entre -100 y 100 y se muestra un mensaje indicando si el número 
 * introducido se encuentra en el array. La lectura de números finaliza cuando
 * se introduce un valor menor que -100 o mayor que 100.
 * Cuando finaliza la lectura de números se muestra el contenido del array.
 */
package arrays1_12;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Arrays1_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        int N, valor;
        boolean existe;

        do {
            System.out.print("Introduce tamaño del array: ");
            N = sc.nextInt();
        } while (N < 1);

        //Se crea el array de tamaño N
        int[] numeros = new int[N];

        //Se llena el array con números aleatorios entre -100 y 100
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rnd.nextInt(-100 ,101);
        }

        //pedimos números entre -100 y 100 y comprobamos si están en el array
        do {
            System.out.print("Introduce un número entre -100 y 100: ");
            valor = sc.nextInt(); //se lee un número
            if (valor >= -100 && valor <= 100) { //si está entre -100 y 100
                existe = false;
                for (int i = 0; i < numeros.length && !existe; i++) {//se busca en el array
                    if (numeros[i] == valor) {//si el número se encuentra en el array
                        existe = true; //asignamos a la variable boolean el valor true. esto provocará que el bucle for finalice
                    }
                }
                if (existe) {
                    System.out.println("El número " + valor + " se encuentra en el array");
                } else {
                    System.out.println("El número " + valor + " no se encuentra en el array");
                }
            }
        } while (valor >= -100 && valor <= 100);

        //Esta instrucción ordena el contenido del array en orden ascendente
        //Esto NO lo pide el ejercicio y por lo tanto no es necesario hacerlo
        //La ordenación la veremos en detalle un poco más adelante.
        //Se muestra ordenado solo para ver mejor si los números que hemos introducido 
        //se encontraban o no en el array
        Arrays.sort(numeros);

        //se muestra el array
        System.out.println("Contenido del array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

    }

}
