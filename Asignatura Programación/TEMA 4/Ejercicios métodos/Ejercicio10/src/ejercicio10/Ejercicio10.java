/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Introduce el valor de e: ");
        n = sc.nextInt();
        System.out.println("El valor aproximado de e es -> " + calcularNeperiano(n));
    }
    
    public static long calcularFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado*=i;
        }
        return resultado;
    }
    
    public static double calcularNeperiano(int n) {
        double neperiano = 0.0;
        for (int i = 0; i <= n; i++) {
            neperiano+= + 1.0 / calcularFactorial(i);
        }
        return neperiano;
        
    }
    
}
