/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Introduce un numero entero positivo: ");
        n = sc.nextInt();
        
        int divisor = 1;
        while (n / divisor >= 10) {
            divisor *= 10;
        }
        
        while (divisor > 0) {
            int cifra = n / divisor;
            System.out.print(cifra + " ");
            n = n % divisor;
            divisor /= 10;
        }
    }
    
}
