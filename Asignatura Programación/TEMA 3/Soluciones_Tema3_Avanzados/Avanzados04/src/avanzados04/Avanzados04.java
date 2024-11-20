/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avanzados04;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Avanzados04 {

    public static void main(String[] args) {
        int n, i;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduce un numero >0: ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Debe ser > 0");
            }
        } while (n <= 0);
        if (n == 1) { //el número 1 no es primo
            System.out.println("No es primo");
        } else {
            i = 2;    //i es el divisor
            while (n % i != 0) {  //mientras el número no sea divisible por el divisor
                i++; //siguiente divisor
            }
            if (i == n) { //cuando sale del while, si el divisor i es el propio número    
                System.out.println("Primo");   //el número es primo
            } else {
                System.out.println("No es primo");  //sino no lo es
            }
        }
    }

}
