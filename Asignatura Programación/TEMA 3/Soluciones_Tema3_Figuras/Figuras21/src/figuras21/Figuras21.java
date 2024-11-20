/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figuras21;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Figuras21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas, columnas, contador = 0;
        do {
            System.out.print("Introduce número de filas >= 3: ");
            filas = sc.nextInt();
            if(filas < 3){
                System.out.println("Debe ser >= 3");
            }
        } while (filas < 3);
        do {
            System.out.print("Introduce número de columnas >= 5: ");
            columnas = sc.nextInt();
            if(columnas < 5){
                System.out.println("Debe ser >= 5");
            }
        } while (columnas < 5);
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= columnas; j++) {
                //si es la primera fila o la última fila o la primera columna o la última columna se muestra *
                if (i == 1 || i == filas || j == 1 || j == columnas) { 
                    System.out.print("*");
                } else if (j == 2 || j == columnas - 1) { //sino si es la segunda columna o la penúltima se muestra un espacio en blanco
                    System.out.print(" ");
                } else { //en cualquier otra posición se muestra un dígito
                    System.out.print(contador % 10);
                    contador++;
                }
            }
            System.out.println();
        }

    }
    
}
