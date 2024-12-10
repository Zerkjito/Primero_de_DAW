/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, r;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el numero n: ");
        n = sc.nextInt();
        System.out.print("Introduce el numero r: ");
        r = sc.nextInt();
        System.out.println("El numero combinatorio es " + combinaciones(n, r));
        
    }
    
    public static long calcularFactorial(long n) {
        if (n == 0) {
            return 1;
        }
        return n * calcularFactorial(n - 1);
    }
    
    public static long combinaciones(int n, int r) {
        if (r > n) {
            return 0;
            
        }
        return calcularFactorial(n) / (calcularFactorial(r) * calcularFactorial(n - r));  
    }
    
}
