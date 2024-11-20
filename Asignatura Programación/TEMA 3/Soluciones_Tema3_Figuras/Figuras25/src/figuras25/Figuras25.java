/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figuras25;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Figuras25 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int filas, cont;
        do {
            System.out.print("Introduce número de filas (>=3): ");
            filas = sc.nextInt();
        } while (filas < 3);
        cont = 1; // Esta variable contiene el número de asteriscos que se escriben en cada fila
        for (int i = 1; i <= filas; i++) {  // Total de filas de la pirámide. Para cada fila.....
            for (int j = 1; j <= filas - i; j++) {  // Escribimos primero los espacios en blanco. En cada fila i hay filas-i espacios
                System.out.print(" ");
            }
            for (int k = 1; k <= cont; k++) { // A continuación escribimos los asteriscos. 
                System.out.print("*");
            }
            cont += 2; // en cada fila hay 2 asteriscos más que en la anterior
            System.out.println();//Salto de línea
        }

    }
    
}
