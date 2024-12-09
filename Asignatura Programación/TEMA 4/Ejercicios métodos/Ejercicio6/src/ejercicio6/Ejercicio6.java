/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Introduce el numero hasta el que quieras leer: ");
            n = sc.nextInt();
        } while (n < 0);
        for (int i = 0; i <= n; i++) {
            System.out.println("Factorial de " + i + " -> " + calcularFactorial(i));
        }
        
    }
    
    public static long calcularFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * calcularFactorial(n - 1);
    }
    
}
