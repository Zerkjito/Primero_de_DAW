/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figuras17;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Figuras17 {

    public static void main(String[] args) {
        int filas;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduce número de filas > 2: ");
            filas = sc.nextInt();
            if(filas <= 2){
                System.out.println("Debe ser > 2");
            }
        } while (filas <= 2);
        
        for (int i = 1; i <= filas; i++) { //filas
            for (int j = 1; j <= i; j++) { //columnas
                if (j == 1 || i == filas) { //si es la primera columna o la última fila
                    System.out.print("*");
                } else if (i == j) { //si es la diagonal
                    System.out.print("#");
                } else { //en cualquier otro lugar se muestra un espacio en blanco
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    
}
