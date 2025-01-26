/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio28;

import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int filas;
        System.out.print("Introduce filas: ");
        filas = sc.nextInt();
        
        int cont = 2 * filas - 3;
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= cont; j++) {
                System.out.print(" ");
            }
            if (i == filas) {
                for (int j = 1; j <= i - 1; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            }
            cont = cont - 2;
            System.out.println();
        }
    }
    
}
