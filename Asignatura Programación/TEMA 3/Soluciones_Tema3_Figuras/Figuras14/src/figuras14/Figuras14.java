/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figuras14;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Figuras14 {

    public static void main(String[] args) {
        int filas, cont = 1;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduce número de filas: ");
            filas = sc.nextInt();
        } while (filas < 2);

        for (int i = 1; i <= filas; i++) { //filas
            for (int j = 1; j <= filas; j++) { //columnas
                if (j > i) { //si el número de columna es mayor que el número de fila se escribe un asterisco
                    System.out.print("* ");
                } else { //sino se escribe un dígito
                    System.out.print(cont % 10 + " ");
                    cont++;
                }
            }
            System.out.println();
        }

    }

}
