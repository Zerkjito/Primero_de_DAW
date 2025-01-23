/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19;

import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas, columnas;
        do {
            System.out.println("Introduce el numero de filas: ");
            filas = sc.nextInt();
            System.out.print("Introduce el numero de columnas: ");
            columnas = sc.nextInt();
        } while (filas < 2 || columnas < 2);
        
        int contador = 0;
        for (int i = 1; i <= filas; i++) {
            contador = i;
            for (int j = 1; j <= columnas; j++) {
                System.out.print(contador % 10 + " ");
                contador+=filas;
            }
            System.out.println();
        }
    }
    
}
