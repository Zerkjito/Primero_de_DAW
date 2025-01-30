/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/* 
 * Arrays1_04 Programa que genere 50 números enteros aleatorios entre 1 y 1000 
 * y los guarde en un array. El programa mostrará el contenido del array, 
 * cuántos números pares hay y cuantos impares.
 */

package arrays1_04;

import java.util.Random;

/**
 *
 * @author enrique
 */
public class Arrays1_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rnd = new Random();
        int contPares = 0, contImpares = 0, cont = 0;
        
        //Se crea un array de 50 elementos de tipo int
        int[] numeros = new int[50];
        
        //Se llena el array con números aleatorios entre 1 y 1000
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rnd.nextInt(1,1001);  //se genera número aleatorio del 1 al 1000 
        }
        
        //Se muestra el array creado y al mismo tiempo se suman los pares y los impares
        //Se muestran 10 elementos por línea para mejorar la salida por pantalla
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("%5d", numeros[i]);
            
            cont++; //Este contador es para mostrar 10 elementos por línea
            if (cont % 10 == 0) { //Si el contador es múltiplo de 10 hay que hacer un salto de línea
                System.out.println(); 
            }
            //Se cuentan los pares y los imapres
            if (numeros[i] % 2 == 0) {
                contPares++;
            } else {
                contImpares++;
            }
        }
        
        //Mostrar resultados
        System.out.println("\nNúmeros pares: " + contPares);
        System.out.println("Números impares: " + contImpares);

    }
    
}
