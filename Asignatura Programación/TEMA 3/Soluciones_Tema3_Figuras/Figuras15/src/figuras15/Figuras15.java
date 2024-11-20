/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figuras15;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Figuras15 {

    public static void main(String[] args) {
        int filas, columnas, centro;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.print("Introduce número de filas ( > 4 y par): ");
            filas = sc.nextInt();
            if(filas <= 4 || filas % 2 != 0){
                System.out.println("Debe ser > 4 y par");
            }
        } while (filas <= 4 || filas % 2 != 0);
        
        do {
            System.out.print("Introduce número de columnas ( > 4): ");
            columnas = sc.nextInt();
            if(filas <= 4 ){
                System.out.println("Debe ser > 4");
            }
        } while (columnas <= 4);
        
        centro = filas / 2; //obtenemos la fila del centro
        
        for (int i = 1; i <= filas; i++) { //filas
            for (int j = 1; j <= columnas; j++) { //columnas
                if (j == columnas && i <= centro || j == 1 && i >= centro) {
                    System.out.print("*");
                } else if (i == 1 || i == centro || i == filas) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //El primer if contiene los lugares donde se deben mostrar asteriscos
        //En la última columna de las filas menores o iguales que la fila central o en la primera columna de las filas mayores o iguales que la fila central 
        //if (j == columnas && i <= centro || j == 1 && i >= centro) { 
        //   System.out.print("*");
        //Si este if no se cumple y por lo tanto no se ha escrito un asterisco, tenemos que ver si se escribe # o espacio en blanco
        //este else if contiene los lugares donde se deben mostrar #
        //en la primera fila, en la fila central o en la última fila
        //else if (i == 1 || i == centro || i == filas) {
        //        System.out.print("#");
        //Si no se ha mostrado + ó # hay que mostrar un espacio en blanco
    }

}
