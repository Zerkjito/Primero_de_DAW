/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas;
        
        do {
            System.out.print("Introduce el numero de filas: ");
            filas = sc.nextInt();
        } while (filas <= 0);
        System.out.println();
        
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= filas; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
    
}
