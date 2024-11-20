/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figuras29;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Figuras29 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas,cont;
        do {
            System.out.print("Introduce numero de filas: ");
            filas = sc.nextInt();
        } while (filas <= 0);
        cont = 2 * filas - 3;               // numero de blancos en la primera fila
        for (int i = 1; i <= filas; i++) {      // para cada una de las filas de la figura
            for (int j = 1; j <= i; j++) {      /// se escriben los números del principio. Coinciden con el número de fila
                System.out.print(i % 10);     //i%10 por si hay más de 9 filas
            }
            for (int j = 1; j <= cont; j++) {   // a continuación se escriben los blancos
                System.out.print(" ");

            }
            if (i == filas) {                     // si es la última fila
                for (int j = 1; j <= i - 1; j++) {    // en la última fila se escribe un número menos

                    System.out.print(i % 10);
                }
            } else {
                for (int j = 1; j <= i; j++) {
                    System.out.print(i % 10);
                }
            }

            cont = cont - 2;      // dos blancos menos en cada línea
            System.out.println();
        }

    }

}
