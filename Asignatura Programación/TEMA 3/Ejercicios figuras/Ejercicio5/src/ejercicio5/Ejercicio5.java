/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas, valor;
        do {
            System.out.print("Introduce el numero de filas (positivo): ");
            filas = sc.nextInt();
        } while (filas <= 0);
        
        do {
            System.out.print("Introduce el valor inicial (0-9): ");
            valor = sc.nextInt();
        } while (valor < 0 || valor > 9);
        
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= i; j++) {
                if (valor == 0 - 1) {
                    valor = 9;
                }
                System.out.print(valor-- + " ");
            }
            System.out.println();
        }

    }

}
