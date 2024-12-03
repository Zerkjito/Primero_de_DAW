/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas, contador = 1;

        do {
            System.out.print("Introduce el numero de filas: ");
            filas = sc.nextInt();
        } while (filas < 2 || filas > 9);

        for (int i = filas; i > 0; i--) {
            for (int j = 1; j <= filas; j++) {
                if (j == i)    {
                    System.out.print(contador++ + " ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }

}
