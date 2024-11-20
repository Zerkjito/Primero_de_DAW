/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avanzados32;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Avanzados32 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, dosPrimerasCifras, aux, cifras;
        boolean coincide;
        do {
            do {
                System.out.print("Introduce un número positivo de tres o más cifras: ");
                N = sc.nextInt();
                if (N < 100 && N != 0) {
                    System.out.println("Error: el número debe tener tres cifras como mínimo");
                }
            } while (N < 100 && N != 0); /// Si N == 0 el programa termina

            if (N != 0) {

                /////// calculamos las cifras del número
                aux = N;
                cifras = 0;
                while (aux != 0) {
                    aux = aux / 10;
                    cifras++;
                }

                ////// sabiendo las cifras que tiene puedo obtener las dos primeras juntas
                dosPrimerasCifras = N / (int) Math.pow(10, cifras - 2);

                ///// A continuación mostramos los divisores del número
                ///// y comprobamos si alguno coincide con las dos primeras cifras
                coincide = false;
                System.out.print("Divisores: ");
                for (int i = 1; i < N; i++) {
                    if (N % i == 0) {
                        System.out.print(i + " ");
                        if (dosPrimerasCifras == i) {
                            coincide = true;
                        }
                    }
                }

                ///// Cuando finaliza el proceso de mostrar los divisores
                ///// se muestra un mensaje indicando si algún divisor coincide o no con las dos primeras cifras del número
                if (coincide) {
                    System.out.println("\nLas dos primeras cifras del número SI coinciden con uno de sus divisores\n");
                } else {
                    System.out.println("\nLas dos primeras cifras del número NO coinciden con ninguno de sus divisores\n");
                }
            }
        } while (N != 0);
    }

}
