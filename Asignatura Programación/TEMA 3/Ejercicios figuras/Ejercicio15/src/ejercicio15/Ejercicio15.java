/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;
import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas, columnas;

        do {
            System.out.print("Introduce el numero filas: ");
            filas = sc.nextInt();
            if (filas < 4) {
                System.out.println("Valor incorrecto. Minimo 4 filas");
            } else if (filas % 2 != 0) {
                System.out.println("Valor incorrecto. Filas debe ser par");
            }

        } while (filas < 4 || filas % 2 != 0);

        do {
            System.out.print("Introduce el numero de columnas: ");
            columnas = sc.nextInt();
            if (columnas < 4) {
                System.out.println("Valor incorrecto. Minimo 4 columnas");
            }
        } while (columnas < 4);
        
        int centro = filas / 2;
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= columnas; j++) {
                if (j == columnas && i <= centro || j == 1 && i >= centro) {
                    System.out.print("*");
                } else if (i == 1 || i == centro || i == filas) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
