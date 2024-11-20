/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figuras19;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Figuras19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas, columnas, contador;
        do {
            System.out.print("Introduce número de filas: ");
            filas = sc.nextInt();
        } while (filas < 2);
        do {
            System.out.print("Introduce número de columnas: ");
            columnas = sc.nextInt();
        } while (columnas < 2);
        for (int i = 1; i <= filas; i++) {
            contador = i;//contador es el valor que se muestra. En cada fila se empieza por el número de fila correspondiente
            for (int j = 1; j <= columnas; j++) {
                System.out.print(contador % 10 + " ");
                contador += filas; //los números a mostrar en la fila se obtienen sumando al anterior el número de filas
            }
            System.out.println();
        }

    }

}
