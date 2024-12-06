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
        Scanner sc = new Scanner (System.in);
        int filas;

        do {
            System.out.print("Introduce el numero de filas: ");
            filas = sc.nextInt();
        } while (filas < 2 || filas % 2 == 0);
        
        for (int i = 1; i <= filas; i++) {
        }
    }

}
