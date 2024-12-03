/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio20;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, digito;

        do {
            System.out.print("Introduce un numero positivo: ");
            n = sc.nextInt();
        } while (n <= 0);
        int divisor = 1;

        while ((n / divisor >= 10)) {
            divisor *= 10;
        }
        int posicion = 1;

        while (divisor > 0) {
            digito = n / divisor;
            n = n % divisor;
            divisor /= 10;
            System.out.print(digito * posicion);
            if (divisor > 0) {
                System.out.print(" - ");
            }
            posicion++;
        }
    }

}
