/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n;
        do {
            System.out.print("Introduce un numero entero >= 0: ");
            n = sc.nextInt();
        } while (n <= 0);
        double resultado = Ejercicio5.calcularFactorial(n);
        System.out.println("El factorial de " + n + " es -> " + resultado);

    }

    public static double calcularFactorial(long n) {
        if (n == 0) {
            return 1;
        }
        System.out.println(n);
        return n * calcularFactorial(n - 1);
    }

}
