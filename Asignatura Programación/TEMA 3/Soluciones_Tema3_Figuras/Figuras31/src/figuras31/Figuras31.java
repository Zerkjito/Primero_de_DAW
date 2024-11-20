/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figuras31;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Figuras31 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas,  cont;
        do {
            System.out.print("Introduce número de filas: ");
            filas = sc.nextInt();
        } while (filas <= 0);
        cont = 0; // variable auxiliar para controlar el centro de cada fila.
        for (int i = 1; i <= filas; i++) {  // Total de filas de la pirámide. Para cada fila.....
            for (int j = 1; j <= filas - i; j++) {  // Escribimos primero los espacios en blanco. En cada fila i hay filas-i blancos
                System.out.print(" ");
            }
            for (int k = i; k <= i + cont; k++) { // A continuación escribimos los números en orden ascendente hasta el centro de la fila. 
                System.out.print(k % 10);
            }
            for (int k = i + cont - 1; k >= i; k--) { // A continuación escribimos los números en orden descendente.
                System.out.print(k % 10);
            }
            cont++; // en cada fila hay 1 número más que en la anterior hasta el centro
            System.out.println();//Salto de línea
        }

    }

}
