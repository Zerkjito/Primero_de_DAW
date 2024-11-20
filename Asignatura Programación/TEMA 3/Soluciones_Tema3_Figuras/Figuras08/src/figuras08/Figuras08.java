/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figuras08;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Figuras08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas;
        do {
            System.out.print("Introduce número de filas: ");
            filas = sc.nextInt();
        } while (filas < 1);

        for (int i = 1; i <= filas; i++) { //filas
            for (int j = i; j <= filas; j++) { //columnas
                if (j == filas) { //en la última columna de cada fila se escribe el número de fila
                    System.out.print(i);
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }

    }

}
