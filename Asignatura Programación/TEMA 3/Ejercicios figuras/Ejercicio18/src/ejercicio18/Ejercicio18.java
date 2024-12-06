/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas;
        boolean asteriscos = true;

        do {
            System.out.print("Introduce el numero de filas: ");
            filas = sc.nextInt();
            if (filas < 2) {
                System.out.println("Minimo 2 filas");
            }
        } while (filas < 2);

        for (int i = 1; i <= filas; i++) {
            for (int j = filas; j >= i; j--) {
                if (asteriscos) {
                    System.out.print("*");
                } else {
                    System.out.print("#");
                }
            }
            asteriscos = !asteriscos;
            System.out.println();
        }
    }

}
