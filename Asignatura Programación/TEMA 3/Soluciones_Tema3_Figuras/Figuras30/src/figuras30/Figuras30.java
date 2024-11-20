/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figuras30;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Figuras30 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas, cont, centro;
        do {
            System.out.print("Introduce número de filas (impar): ");
            filas = sc.nextInt();
        } while (filas <= 0 || filas % 2 == 0);
        
        centro = filas / 2 + 1;
        cont = 1; // Esta variable contiene el número de asteriscos que se escriben en cada fila

        //el dibujo de la figura se hará en dos partes.
        //parte de arriba de la figura. Pirámide hacia arriba     
        for (int i = 1; i <= centro; i++) {  // Total de filas de la pirámide. Para cada fila.....
            for (int j = 1; j <= centro - i; j++) {  // Escribimos primero los blancos. En cada fila i hay filas-i blancos
                System.out.print(" ");
            }
            for (int k = 1; k <= cont; k++) { // A continuación escribimos los asteriscos. En la primera fila hay solo uno
                System.out.print("*");
            }
            cont += 2; // en cada fila hay 2 asteriscos más que en la anterior
            System.out.println();//Salto de línea
        }

        //parte de abajo de la figura. Pirámide hacia abajo     
        cont -= 4; //asteriscos en la primera fila
        for (int i = 1; i <= centro - 1; i++) {  // Total de filas de la pirámide. Para cada fila.....
            for (int j = 1; j <= i; j++) {  // Escribimos primero los blancos. En cada fila i hay i blancos
                System.out.print(" ");
            }
            for (int k = 1; k <= cont; k++) { // A continuación escribimos los asteriscos. 
                System.out.print("*");
            }
            cont -= 2; // en cada fila hay 2 asteriscos menos que en la anterior
            System.out.println();//Salto de línea
        }

    }

}
