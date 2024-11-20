/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figuras13;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Figuras13 {

    public static void main(String[] args) {
        int filas, digito, numero;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduce número de filas: ");
            filas = sc.nextInt();
        } while (filas < 1);

        do {
            System.out.print("Introduce dígito: ");
            digito = sc.nextInt();
        } while (digito < 0 || digito > 9);

        for (int i = 1; i <= filas; i++) {//filas
            numero = digito; //número es el valor que vamos mostrando. En esta instrucción guardamos en numero el valor inicial de la fila
            for (int j = 1; j <= i; j++) {//columnas
                System.out.print(numero % 10 + " ");
                numero++;
            }
            System.out.println();
            digito++;//cada fila empieza por un número más que la anterior
        }
        //digito contiene el valor inicial a mostrar
        //A partir de la segunda fila, el valor por el que se empieza a mostrar se obtiene sumando 1 al dígito inicial
        //por ejemplo si digito = 3
        //la primera fila empieza por 3
        //la segunda fila empieza por 4
        //la tercera fila empieza por 5
        //etc.

    }

}
