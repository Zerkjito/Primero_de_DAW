/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avanzados21;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Avanzados21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, contadorCifras, aux, cifra;

        do {
            System.out.print("Introduce número entero positivo (<=0 para finalizar): ");
            N = sc.nextInt();
            
            if (N > 0) {

                contadorCifras = 0;
                ////////Calculamos las cifras del número
                aux = N;
                while (aux != 0) {
                    aux = aux / 10;
                    contadorCifras++;
                }

                aux = N; //volvemos a guardar el número en la variable auxiliar para trabajar con ella

                for (int i = contadorCifras - 1, posicion = 1; i >= 0; i--, posicion++) {
                    cifra = aux / (int) Math.pow(10, i); ///// obtenemos la primera cifra del número
                    if (cifra % 2 == 0) {
                        System.out.print(cifra * 2); //// si es par la mostramos multiplicada por 2
                    } else {
                        System.out.print(cifra * 3); //// si es impar la mostramos multiplicada por 3
                    }
                    if (i > 0) { //// si no es la última cifra del número se muestra a continuación un guión
                        System.out.print(", ");
                    } else {
                        System.out.println();
                    }
                    aux = aux % (int) Math.pow(10, i); //// quitamos la primera cifra del número (la que acabamos de mostrar) 
                }
            }
        } while (N > 0); //se repite el priceso mientras el número introducido sea > 0
    }

}
