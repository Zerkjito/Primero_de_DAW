/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas;

        do {
            System.out.print("Introduce el numero de filas: ");
            filas = sc.nextInt();
        } while (filas < 2);
        int numero = 1;
        
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= filas; j++) {
                if (j <= i) {
                    System.out.print(numero % 10 + " ");
                    numero++;
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

}
