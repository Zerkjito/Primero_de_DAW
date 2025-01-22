/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repasofigura;

import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class RepasoFigura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas;
        do {
            System.out.print("Introduce un numero de filas mayor a 4 e impar: ");
            filas = sc.nextInt();
            if (filas <= 4 || filas % 2 == 0) {
                System.out.println("Valor incorrecto. Debe ser impar y mayor a 4");
            }
        } while (filas <= 4 || filas % 2 == 0);
        
        int contador = 1;
        int centro =  filas / 2 + 1;
        System.out.println("\nEjemplo para " + filas + " filas\n");
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= filas; j++) {
                if (i == 1 || i == filas) {
                    System.out.print("*");
                } else if (i == centro) {
                    System.out.print("=");
                } else if (j == 1 || j == filas) {
                    System.out.print("*");
                } else if (j == centro) {
                    System.out.print(contador % 10);
                } else {
                    System.out.print("-");
                }
                
            }
            contador++;
            System.out.println();
        }
        for (int numPerf = 1; numPerf <= 1000; numPerf++) {
            int suma = 0;
            for (int i = 1; i < numPerf; i++) {
                if (numPerf % i == 0) {
                    suma+=i;
                }
            }
            if (suma == numPerf) {
                System.out.println(numPerf + " es perfecto");
            }
        }
        
    }
    
}
