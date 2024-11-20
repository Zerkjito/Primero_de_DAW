/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figuras05;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Figuras05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas, numero;
        do {
            System.out.print("Introduce número de filas: ");
            filas = sc.nextInt();
        } while (filas <= 0);
        do {
            System.out.print("Introduce número para comenzar (0 - 9): ");
            numero = sc.nextInt();
        } while (numero < 0 || numero > 9);
        for (int i = 1; i <= filas; i++) { //filas
            for (int j = 1; j <= i; j++) { //columnas. El número de columnas que hay en cada fila coincide con el número de la fila. En la primera fila hay una columna, en la segunda fila hay dos columnas, etc.
                System.out.print(numero-- + " ");
                if (numero < 0) {
                    numero = 9;
                }
            }
            System.out.println();
        }

    }

}
