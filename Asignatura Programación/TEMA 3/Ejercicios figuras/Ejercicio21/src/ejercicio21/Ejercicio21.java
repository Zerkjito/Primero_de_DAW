/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas, columnas, contador = 0;
        
        do {
            System.out.print("Introduce el numero de filas: ");
            filas = sc.nextInt();
        } while (filas < 3);
        
        do {
            System.out.print("Introduce el numero de columnas: ");
            columnas = sc.nextInt();
        } while (columnas < 5);
        
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= columnas; j++) {
                if (i == 1 || i == filas) {
                    System.out.print("*");
                } else if (j  == 1 || j == columnas) {
                    System.out.print("*");
                } else if (j == 2 || j == columnas - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print(contador % 10);
                    contador++;
                }
            }
            System.out.println();
        }
        sc.close();
    }
    
}
