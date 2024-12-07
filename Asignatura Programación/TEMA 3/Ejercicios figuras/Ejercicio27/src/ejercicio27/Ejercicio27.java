/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio27;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas, contador = 1;
        
        do {
            System.out.print("Introduce el numero de filas (mayor que 2 e impar): ");
            filas = sc.nextInt();
        } while (filas < 2 || filas % 2 == 0);
        
        int centro = filas / 2 + 1;
        
        for (int i = 1; i <= centro; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(contador++ + " ");
            }
            contador = 1;
            System.out.println();
        }
        for (int i = centro - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(contador++ + " ");
            }
            contador = 1;
            System.out.println();
        }
        sc.close(); 
         
    }
    
}
