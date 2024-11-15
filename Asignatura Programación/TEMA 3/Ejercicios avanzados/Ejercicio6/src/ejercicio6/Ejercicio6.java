/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;
import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, resultado = 1;
        do {
            System.out.print("Introduce un numero entero positivo: ");
            n = sc.nextInt();
        } while (n <= 0);
        
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        System.out.println("El factorial de " + n + " es " + resultado);
    }
    
}
