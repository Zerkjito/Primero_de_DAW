/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repetitiva29;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Repetitiva29 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sumaCifras = 0;  //sumaCifras contendrá la suma de las cifras del número
        System.out.print("Introduce un número entero: ");
        n = sc.nextInt();
        while (n != 0) {    //mientras a n le queden cifras
            sumaCifras = sumaCifras + (n % 10);   //sumamos la última cifra de n
            n = n / 10;     //le quitamos a n la última cifra 
        }
        System.out.println("La suma de sus cifras es: " + sumaCifras);
    }
}
