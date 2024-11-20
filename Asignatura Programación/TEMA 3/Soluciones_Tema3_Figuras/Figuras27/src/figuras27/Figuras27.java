/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figuras27;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Figuras27 {

    public static void main(String[] args) {
        int filas, mitad;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduce número de filas (impar y >= 3): ");
            filas = sc.nextInt();
            if (filas < 3 || filas % 2 == 0) {
                System.out.println("Debe ser impar y >= 3");
            }
        } while (filas < 3 || filas % 2 == 0);

        mitad = filas / 2 + 1;
        
        //primera parte de la figura hasta la fila del centro
        for (int i = 1; i <= mitad; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j % 10 + " ");
            }
            System.out.println();
        }

        //parte de abajo de la figura
        for (int i = mitad - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j % 10 + " ");
            }
            System.out.println();
        }

    }

}
