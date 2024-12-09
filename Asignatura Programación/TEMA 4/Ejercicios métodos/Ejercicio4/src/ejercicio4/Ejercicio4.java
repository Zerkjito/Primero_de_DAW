/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k;
        do {
           System.out.print("Introduce un numero entero positivo: ");
            n = sc.nextInt(); 
        } while (n <= 0);
        do {
          System.out.print("Introduce el numero de cifras (1-9): ");
            k = sc.nextInt();  
        } while (k < 1 || k > 9);
        
        int m = ultimosDigitos(n, k);
        if (m == -1) {
            System.out.println("El numero no tiene dichas cifras");
        } else {
            System.out.println("El resultado es -> " + m);
            sc.close();
        }
    }
    
    static int calcularCifras(int n) {
        if (n == 0) {
            return 1;
        }
        
        int cifras = 0;
        n = Math.abs(n);
        
        while (n != 0) {
            cifras++;
            n/=10;
        }
        return cifras;
    }
    
    static int ultimosDigitos(int n, int k) {
        int cifras = calcularCifras(n);
        
        if (cifras < k) {
            return -1;
        }
        int divisor = (int) Math.pow(10, k);
        return n % divisor;
    }
    
    
}
