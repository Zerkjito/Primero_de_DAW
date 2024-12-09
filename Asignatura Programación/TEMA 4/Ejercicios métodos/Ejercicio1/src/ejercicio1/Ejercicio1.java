/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        

        do {
            System.out.print("Introduce un numero entero positivo para comprobar si es perfecto: ");
            n = sc.nextInt();
        } while (n <= 0);
        
        if (perfecto(n)) {
            System.out.println("El numero " + n + " es perfecto");
        } else {
            System.out.println("El numero " + n + " NO es perfecto");
        }

    }
    static boolean perfecto(int n) {
        int suma = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                suma = suma + i;
            }
        }
        return suma == n;
    }
}
