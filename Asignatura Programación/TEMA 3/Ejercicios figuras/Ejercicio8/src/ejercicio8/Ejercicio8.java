/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas, contador = 1;
        
        System.out.print("Introduce el numero de filas: ");
        filas = sc.nextInt();
        
        for (int i = 1; i <= filas; i++) {
            for (int j = filas; j >= i; j--) {
                if (j == i) {
                    System.out.print(contador++);
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        
    }
    
}
