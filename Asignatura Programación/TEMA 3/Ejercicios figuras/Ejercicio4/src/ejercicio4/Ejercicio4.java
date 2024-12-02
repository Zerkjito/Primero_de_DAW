/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas, columnas;
        System.out.println("Primera Figura ");
        do {
            System.out.print("Introduce el numero de filas: ");
            filas = sc.nextInt();
        } while (filas <= 0);

        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= filas; j++) {
                if (i == j) {
                    System.out.print("1 ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println("\nSegunda Figura ");
        do {
            System.out.print("Introduce el numero de filas (debe ser impar): ");
            filas = sc.nextInt();
        } while (filas % 2 == 0);
        int centro = filas / 2 + 1;
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= filas; j++) {
                if (j == centro) {
                    System.out.print("1 ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        System.out.println("\nTercera Figura ");
        do {
            System.out.print("Introduce el numero de filas (debe ser impar): ");
            filas = sc.nextInt();
        } while (filas % 2 == 0);
        centro = filas / 2 + 1;
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= filas; j++) {
                if (i == centro) {
                    System.out.print("1 ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        sc.close();
    }

}
