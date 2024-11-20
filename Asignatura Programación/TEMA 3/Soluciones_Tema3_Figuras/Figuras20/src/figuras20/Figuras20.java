/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figuras20;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Figuras20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas;
        do {
            System.out.print("Introduce número de filas: ");
            filas = sc.nextInt();
        } while (filas < 2);
        for (int i = 1; i <= filas; i++) { //filas
            for (int j = 1; j < i; j++) { //columnas. En cada fila se muestran i-1 guiones. 
                System.out.print("-"); //Se muestra el carácter -
            }
            System.out.println("*");//Al final de cada fila se muestra un asterisco
        }

    }

}
