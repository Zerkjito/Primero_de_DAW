/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

import java.util.Random;

/**
 *
 * @author zerkje
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] numeros = new int[30];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rnd.nextInt(1, 50 + 1);
        }
        System.out.println("CONTENIDO DEL ARRAY:");
        for (int n : numeros) {
            System.out.print(n + " ");
        }
        System.out.println("\n");

        int[] repetidos = new int[numeros.length];
        int contadorRepetidos = 0;

        for (int i = 0; i < numeros.length; i++) {
            int num = numeros[i];
            int apariciones = 0;
            
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[j] == num) {
                    apariciones++;
                }
            }
            boolean yaAgregado = false;
            for (int k = 0; k < contadorRepetidos; k++) {
                if (repetidos[k] == num) {
                    yaAgregado = true;
                    break;
                }
            }
            
            if (apariciones > 1 && !yaAgregado) {
                repetidos[contadorRepetidos] = num;
                contadorRepetidos++;
            }
        }

        System.out.println("\nNUMEROS REPETIDOS:");
        if (contadorRepetidos == 0) {
            System.out.println("No se encontraron numeros repetidos");
        } else {
            for (int i = 0; i < contadorRepetidos; i++) {
                System.out.print(repetidos[i] + " ");
            }
        }
        System.out.println();
    }

}
