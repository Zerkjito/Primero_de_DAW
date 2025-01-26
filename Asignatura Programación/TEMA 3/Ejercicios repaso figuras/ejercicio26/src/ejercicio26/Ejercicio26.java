/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26;

import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas;

        do {
            System.out.print("Introduce filas: ");
            filas = sc.nextInt();
        } while (filas < 2 || filas % 2 == 0);

        int contador = 1;
        int centro = filas / 2 + 1;
        for (int i = 1; i <= centro; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(contador++ % 10 + " ");
            }
            contador = 1;
            System.out.println();
        }
        
        for (int i = centro - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(contador++ % 10 + " ");
            }
            contador = 1;
            System.out.println();
        }
    }

}
