/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avanzados20;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Avanzados20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, contadorCifras = 0, aux, cifra;

        do {
            System.out.print("Introduce número entero positivo: ");
            N = sc.nextInt();
            if (N <= 0) {
                System.out.println("Debe ser > 0");
            }
        } while (N <= 0);

        ////////Calculamos las cifras del número
        aux = N;
        while (aux != 0) {
            aux = aux / 10;
            contadorCifras++;
        }

        for (int i = contadorCifras - 1, posicion = 1; i >= 0; i--, posicion++) {
            cifra = N / (int) Math.pow(10, i); ///// obtenemos la primera cifra del número (la de la izquierda)
            System.out.print(cifra * posicion); //// la mostramos multiplicada por su posición
            if (i > 0) { //// si no es la última cifra del número se muestra a continuación un guión
                System.out.print(" - ");
            } else {
                System.out.println();
            }
            N = N % (int) Math.pow(10, i); //// quitamos la primera cifra del número (la que acabamos de mostrar) 
        }
    }

}
