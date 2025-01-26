/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;

import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, digito;

        do {
            System.out.print("Introduce un numero(s) positivo: ");
            n = sc.nextInt();

            int divisor = 1;
            while ((n / divisor) >= 10) {
                divisor *= 10;
            }

            while (divisor != 0) {
                digito = n / divisor;
                if (digito % 2 == 0) {
                    System.out.print(digito * 2);
                } else {
                    System.out.print(digito * 3);
                }
                n = n % divisor;
                divisor /= 10;
                if (divisor != 0) {
                    System.out.print(", ");
                }
            }
        } while (n > 0);
    }

}
