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
        System.out.println("Por favor, introduzca un numero entero");
        n = sc.nextInt();
        
        if (n > 0) {
            System.out.println(n + " es positivo");
        } else if (n < 0) {
            System.out.println(n + " es negativo");
        } else {
            System.out.println("Cero");
        }
        
        if (n % 2 == 0) {
            System.out.println(n + " es par");
        } else {
            System.out.println(n + " es impar");
        }
        
        if (n % 10 == 0) {
            System.out.println(n + " es multiplo de 10");
        } else {
            System.out.println(n + " no es multiplo de 10");
        }
        
        if (n > 99 || n < -99) {
            System.out.println(n + " tiene mas de dos cifras");
        } else {
            System.out.println(n + " no tiene mas de dos cifras");
        }

    }
    
}
