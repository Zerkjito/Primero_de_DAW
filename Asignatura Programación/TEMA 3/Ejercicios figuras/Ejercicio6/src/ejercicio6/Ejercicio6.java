/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas, contador = 1;

        do {
            System.out.print("Introduce el numero de filas: ");
            filas = sc.nextInt();
        } while (filas <= 0);
        
        for (int i = 1; i <= filas; i++) {
            for (int j = filas; j >= i; j--) {
                if (contador == 10) {
                    contador = 0;
                }
                System.out.print(contador++ + " ");
            }
            System.out.println();
        }

    }

}
