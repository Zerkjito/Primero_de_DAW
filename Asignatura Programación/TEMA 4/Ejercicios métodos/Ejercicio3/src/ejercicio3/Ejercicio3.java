/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Introduce el numero entero: ");
        n = sc.nextInt();
        System.out.println("El numero de cifras de " + n + " es " + calcularCifras(n));
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
    
}
