/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figuras23;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Figuras23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //utilizamos 4 contadores. Uno para cada una de las cuatro zonas en las que se divide la figura 
        int filas, columnas;
        int contador1 = 0; //valores que se muestran en el cuadrante superior izquierdo
        int contador2 = 9; //valores que se muestran en el cuadrante superior derecho
        int contador3 = 0; //valores que se muestran en el cuadrante inferior izquierdo
        int contador4 = 0; //valores que se muestran en el cuadrante inferior derecho
        int filaCentral, columnaCentral;
        do {
            System.out.print("Introduce número de filas (impar y >= 7): ");
            filas = sc.nextInt();
            if(filas % 2 == 0 || filas < 7){
                System.out.println("Debe ser impar y >= 7");
            }
        } while (filas % 2 == 0 || filas < 7);
        do {
            System.out.print("Introduce número de columnas (impar y >= 7): ");
            columnas = sc.nextInt();
            if(columnas % 2 == 0 || columnas < 7){
                System.out.println("Debe ser impar y >= 7");
            }
        } while (columnas % 2 == 0 || columnas < 7);
        
        filaCentral = filas / 2 + 1; //calculamos la fila del centro
        columnaCentral = columnas / 2 + 1; //calculamos la columna del centro
        
        for (int i = 1; i <= filas; i++) { //filas
            for (int j = 1; j <= columnas; j++) { //columnas
                //en la prilera fila, en la última fila, en la fial del centro, en la primera columna, en la última columna o en la del centro se muestra *
                if (i == 1 || i == filas || i == filaCentral || j == 1 || j == columnas || j == columnaCentral) {
                    System.out.print("*");
                } else if (j == 2 || j == columnas - 1 || j == columnaCentral - 1 || j == columnaCentral + 1) {
                    //sino en la segunda columna, en la penúltima, en la anterior a la columna central o en la siguiente a la columna central se muestra un espacio en blanco
                    System.out.print(" ");
                } else if (i < filaCentral && j < columnaCentral) { //sino si la fila es menor que la fila central y la columna es menor que la columna central, estamos en el cuadrante superior izquierdo -> mostramos el contador1 
                    System.out.print(contador1 % 10);
                    contador2 = contador1; //como los valores iniciales de contador2 y contador3 dependen del valor de contador1 lo guardamos cada vez que se muestra
                    contador3 = contador1;
                    contador1++;
                } else if (i < filaCentral && j > columnaCentral) { //si la fila es menor que la fila central y la columna es mayor que la columna central, estamos en el cuadrante superior derecho -> mostramos contador2. 
                    System.out.print(contador2 % 10); //El valor inicial de contador2 es el valor de contador1
                    contador2--;
                } else if (i > filaCentral && j < columnaCentral) { //si la fila es mayor que la fila central y la columna es menor que la columna central, estamos en el cuadrante inferior izquierdo -> mostramos contador3
                    System.out.print(contador3 % 10); //El valor inicial de contador3 es el valor de contador1
                    contador4 = contador3; //como el valor inicial de contador4 depende del valor de contador3 lo guardamos cada vez que se muestra
                    contador3--;
                } else { //si la fila es mayor que la fila central y la columna es mayor que la columna central, estamos en el cuadrante inferior derecho -> mostramos contador4 
                    System.out.print(contador4 % 10);
                    contador4++;
                }
            }
            System.out.println();
        }

    }

}
