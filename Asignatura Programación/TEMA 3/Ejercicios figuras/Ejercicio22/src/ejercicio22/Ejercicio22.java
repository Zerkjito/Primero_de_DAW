/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio22;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas, columnas, contador = 0;
        
        do {
            System.out.print("Introduce el numero de filas: ");
            filas = sc.nextInt();
            if (filas < 5) {
                System.out.println("Minimo de filas -> 5");
            } else if (filas % 2 == 0){
                System.out.println("Debe ser impar");
            }
        } while(filas < 5 || filas % 2 == 0);
        
        do {
            System.out.print("Introduce el numero de columnas: ");
            columnas = sc.nextInt();
            if (columnas < 5) {
                System.out.println("Minimo de columnas -> 5");
            }
        } while(columnas < 5);
        int centro = filas / 2 + 1;
        
        for (int i = 1; i <= filas; i++) {
            if (i == centro + 1) {
                contador = contador - 1;
            }
            for (int j = 1; j <= columnas; j++) {
                if (i == 1 || i == filas) {
                    System.out.print("*");
                } else if (j == 1 || j == columnas) {
                    System.out.print("*");
                } else if (i == centro) {
                    System.out.print("*");
                } else if (j == 2 || j == columnas - 1) {
                    System.out.print(" ");
                } else if (i < centro) {
                    System.out.print(contador % 10);
                    contador++;
                } else {
                    System.out.print(contador % 10);
                    contador--;
                }
            }
            System.out.println();
        }
    }

}
