/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figuras26;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Figuras26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas, mitad;
        do {
            System.out.print("Introduce numero de filas (impar y >= 3): ");
            filas = sc.nextInt();
            if (filas < 3 || filas % 2 == 0) {
                System.out.println("Debe ser impar y > 2");
            }
        } while (filas < 3 || filas % 2 == 0);

        mitad = filas / 2 + 1;

        // primero se dibuja la mitad de arriba
        for (int i = 1; i <= mitad; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // a continuación se dibuja la mitad de abajo
        for (int i = mitad - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
