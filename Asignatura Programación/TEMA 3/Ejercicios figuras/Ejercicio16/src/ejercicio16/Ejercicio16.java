/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas, columnas, contador = 2;
        
        do {
            System.out.print("Introduce el numero de filas (debe ser mayor o igual a 3 e impar): ");
            filas = sc.nextInt();
            if (filas < 3) {
                System.out.println("Debe ser mayor a 3");
            } else if (filas % 2 == 0) {
                System.out.println("Debe ser numero impar");
            }
        } while (filas < 3 || filas % 2 == 0);
        
        do {
            System.out.print("Introduce el numero de columnas (debe ser mayor o igual a 3 e impar): ");
            columnas = sc.nextInt();
            if (columnas < 3) {
                System.out.println("Debe ser mayor a 3");
            } else if (columnas % 2 == 0) {
                System.out.println("Debe ser numero impar");
            }
        } while (columnas < 3 || columnas % 2 == 0);
 
        int centroColumnas = columnas / 2 + 1;
        int centroFilas = filas / 2 + 1;

        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= columnas; j++) {
                if (i == centroFilas) {
                    System.out.print("- ");
                } else if (j == centroColumnas) {
                    System.out.print("| ");
                } else {
                    System.out.print(contador + " ");
                    contador += 2;
                    if (contador == 10) {
                        contador = 0;
                    }
                }
            }
            System.out.println();
        }
    }

}
