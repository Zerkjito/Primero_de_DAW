/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas, columnas;
        int contador = 0;
        
        do {
            System.out.print("Introduce el numero de filas (min. 3): ");
            filas = sc.nextInt();
        } while (filas < 3);
        
        do {
            System.out.print("Introduce el numero de columnas (min. 3): ");
            columnas = sc.nextInt();
        } while (columnas < 3);
        
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= columnas; j++) {
                if (contador == 10) {
                    contador = 0;
                }
                System.out.print(contador++ + " ");
            }
            System.out.println();
        }
    }
    
}
