/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

import java.util.Random;

/**
 *
 * @author zerkje
 */
public class Ejercicio15 {

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

        int[] aux = new int[51];
        for (int num : numeros) {
            aux[num]++;
        }

        int[] unicos = new int[numeros.length];
        int contadorUnicos = 0;

        for (int num : numeros) {
            if (aux[num] == 1) {
                unicos[contadorUnicos++] = num;
            }
        }

        System.out.println("\nNUMEROS UNICOS:");
        if (contadorUnicos == 0) {
            System.out.println("No se encontraron numeros unicos");
        } else {
            for (int i = 0; i < contadorUnicos; i++) {
                System.out.print(unicos[i] + " ");
            }
        }
        System.out.println();
    }

}
