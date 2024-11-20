/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figuras01;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Figuras01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas, columnas;
        do {
            System.out.print("Introduce numero de filas: ");
            filas = sc.nextInt();
        } while (filas < 2);
        do {
            System.out.print("Introduce numero de columnas: ");
            columnas = sc.nextInt();
        } while (columnas < 2);
        for (int i = 1; i <= filas; i++) {  // este for indica en qué fila estamos
            for (int j = 1; j <= columnas; j++) {// este for indica, para cada una de las filas, en qué columna estamos
                System.out.print("* ");
            }
            System.out.println();//Cuando se acaba una fila, salto de línea para continuar dibujando la figura en la línea siguiente
        }
    }

}
