/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figuras22;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Figuras22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas, columnas, filaCentro, contadorArriba = 0, contadorAbajo = 0;
        do {
            System.out.print("Introduce número de filas (impar y >= 5 ): ");
            filas = sc.nextInt();
            if (filas % 2 == 0 || filas < 5){
                System.out.println("Debe ser impar y >= 5");
            }
        } while (filas % 2 == 0 || filas < 5);
        do {
            System.out.print("Introduce número de columnas ( >= 5 ): ");
            columnas = sc.nextInt();
            if(columnas < 5){
                System.out.println("Debe ser >= 5");
            }
        } while (columnas < 5);
        
        filaCentro = filas / 2 + 1; //calculamos la fila central
        
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= columnas; j++) {
                //El * se muestra en la primera fila, en la última fila, en la fila del centro, en la primera columna o en la última columna
                if (i == 1 || i == filas || i == filaCentro || j == 1 || j == columnas) {
                    System.out.print("*");
                } else if (j == 2 || j == columnas - 1) { //sino en la segunda columna o en la penúltima se muestra un espacio en blanco
                    System.out.print(" ");
                } else if (i < filaCentro) {//sino en las filas menores que la del centro se muestra el contador ascendente
                    System.out.print(contadorArriba % 10);
                    contadorAbajo = contadorArriba;//se guarda el valor del contador ascendente para utilizarlo cuando comiencen las filas inferiores a la del centro
                    contadorArriba++;
                } else { //en las filas mayores que la del centro se muestra el contador descendente. Se comienza a mostrar a partir del último valor del contador ascendente
                    System.out.print(contadorAbajo % 10);
                    contadorAbajo--;
                    if (contadorAbajo < 0) {//esto realmente no será necesario comprobarlo ya que el contador no llegará a tomar nunca valores negativos. El último valor a mostrar es el cero que es el valor por el que se ha empezado la figura.
                        contadorAbajo = 0;
                    }
                }
            }
            System.out.println();
        }

    }

}
