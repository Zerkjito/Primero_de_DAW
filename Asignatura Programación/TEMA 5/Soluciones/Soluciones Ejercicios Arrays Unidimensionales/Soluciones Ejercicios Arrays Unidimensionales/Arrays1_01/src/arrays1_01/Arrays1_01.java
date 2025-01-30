/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/* 
 * Arrays1_01 Programa que lea por teclado 10 números enteros y los guarde en un array. 
 * A continuación calcula y muestra la media de los valores positivos y la 
 * de los valores negativos.
 */

package arrays1_01;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Arrays1_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, positivos = 0, negativos = 0;
        double sumaPositivos = 0, sumaNegativos = 0;

        //Se crea el array de 10 elementos de tipo int
        int[] numeros = new int[10];

        //Lectura por teclado de los elementos del array
        System.out.println("Lectura de los elementos del array: ");
        for (i = 0; i < numeros.length; i++) {
            System.out.print("numeros[" + i + "]= ");
            numeros[i] = sc.nextInt();
        }

        //Sumar positivos y negativos
        for (i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) { //sumar positivos
                sumaPositivos += numeros[i];
                positivos++;
            } else if (numeros[i] < 0) { //sumar negativos
                sumaNegativos += numeros[i];
                negativos++;
            }
        }

        //Mostrar resultados
        if (positivos != 0) {
            System.out.println("Media de los valores positivos: " + sumaPositivos / positivos);
        } else {
            System.out.println("No ha introducido numeros positivos");
        }
        if (negativos != 0) {
            System.out.println("Media de los valores negativos: " + sumaNegativos / negativos);
        } else {
            System.out.println("No ha introducido numeros negativos");
        }
    }
}

