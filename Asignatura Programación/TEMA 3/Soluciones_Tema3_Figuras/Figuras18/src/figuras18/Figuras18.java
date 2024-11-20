/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figuras18;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Figuras18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas;
        do {
            System.out.print("Introduce numero de filas: ");
            filas = sc.nextInt();
        } while (filas < 2);

        for (int i = 1; i <= filas; i++) { //filas
            for (int j = 1; j <= filas; j++) { //columnas
                if (j >= i) { //si la columna es mayor o igual que la fila
                    if (i % 2 == 0) { //en las filas pares se escribe #
                        System.out.print("#");
                    } else { //en las filas impares se escribe *
                        System.out.print("*");
                    }
                } else { //si la columna es menor que la fila se escribe un espacio en blanco
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

}
