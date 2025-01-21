/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ejercicio03 ln =  new Ejercicio03 ();
        int n = ln.leerNumeros();
        int resultado = calcularFactorial(n);
        System.out.println("El resultado del factorial de " + n + " es -> " + resultado);
    }
    
    public int leerNumeros() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        while (!sc.hasNextInt()) {
            System.out.println("Esto no es un numero. Intentalo de nuevo.");
            sc.next();   
        }
        int numero = sc.nextInt();
        return numero;
    }
    
    public static int calcularFactorial (int n) {
        if (n == 0) {
            return 1;
        }
        return n * calcularFactorial(n - 1);
    }
}
