/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figuras02;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Figuras02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas, columnas, contador = 0;
        do {
            System.out.print("Introduce numero de filas: ");
            filas = sc.nextInt();
        } while (filas < 3);
        do {
            System.out.print("Introduce numero de columnas: ");
            columnas = sc.nextInt();
        } while (columnas < 3);
        
        for (int i = 1; i <= filas; i++) { //for para las filas 
            for (int j = 1; j <= columnas; j++) {//for para las columnas de cada fila
                System.out.print(contador % 10 + " "); 
                contador++;
            }
            System.out.println();
        }
        //la operación contador % 10 obtiene la última del contador que será un número del 0 al 9
        //utilizando esta operación nos evitamos poner el contador a 0 cada vez que llegue a 10

    }
    
}
