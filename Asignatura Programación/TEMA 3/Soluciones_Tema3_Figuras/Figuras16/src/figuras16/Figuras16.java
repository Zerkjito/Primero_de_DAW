/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figuras16;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Figuras16 {

    public static void main(String[] args) {
        int filas, columnas, filaCentro, columnaCentro, contador = 2;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.print("Introduce número de filas ( >= 3 e impar): ");
            filas = sc.nextInt();
            if (filas < 3 || filas % 2 == 0){
                System.out.println("Debe ser >= 3 e impar");
            }
        } while (filas < 3 || filas % 2 == 0);
        
        do {
            System.out.print("Introduce número de columnas ( >= 3 e impar): ");
            columnas = sc.nextInt();
            if (columnas < 3 || columnas % 2 == 0){
                System.out.println("Debe ser >= 3 e impar");
            }
        } while (columnas < 3 || columnas % 2 == 0);
        
        filaCentro = filas / 2 + 1; //obtenemos la fila del centro
        columnaCentro = columnas / 2 + 1;  //obtenemos la columna del centro
        
        for (int i = 1; i <= filas; i++) { //filas
            for (int j = 1; j <= columnas; j++) { //columnas
                if (i == filaCentro) { //si es la fila del centro
                    System.out.print(" - ");
                } else if (j == columnaCentro) { //si es la columna del centro
                    System.out.print(" | ");
                } else { //si no es la fila central ni la columna central se muestra un dígito
                    System.out.print(" " + contador % 10 + " ");
                    contador += 2;
                }
            }
            System.out.println();
        }

    }

}
