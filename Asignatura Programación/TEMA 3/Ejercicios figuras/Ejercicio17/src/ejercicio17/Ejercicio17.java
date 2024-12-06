/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas;
        
        do {
             System.out.print("Introduce el numero de filas: ");
             filas = sc.nextInt();
             if (filas < 2) {
                 System.out.println("Minimo de filas es 2");
             }
        } while (filas < 2);
        
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || i == filas) {
                    System.out.print("*");
                } else if (j == i) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
