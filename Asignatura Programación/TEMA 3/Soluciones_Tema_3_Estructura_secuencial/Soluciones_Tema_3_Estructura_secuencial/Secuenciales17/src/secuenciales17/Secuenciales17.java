/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package secuenciales17;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Secuenciales17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;

        System.out.print("Introduzca Número de 3 cifras: ");
        N = sc.nextInt(); //supondremos que el número introducido tiene 3 cifras

        System.out.println("Cifra central de " + N + " -> " + N / 10 % 10);
        //la división entre enteros da como resultado la parte entera de la división (sin decimales)
        //si por ejemplo N = 123 la operación N/10 da como resultado 12 y no 12.3 
    }   //a continuación se realiza 12%10 que da como resultado 2

}
