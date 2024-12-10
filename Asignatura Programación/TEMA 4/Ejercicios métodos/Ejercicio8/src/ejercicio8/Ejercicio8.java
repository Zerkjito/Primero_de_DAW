/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x; 
        int n;
        System.out.print("Introduce el angulo en radianes: ");
        x = sc.nextDouble();
        System.out.print("Introduce el numero de terminos a realizar: ");
        n = sc.nextInt();
        System.out.println("sen (" + x + ")" + " = " + calcularSeno(x, n));
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
    
    public static double calcularSeno(double x, int n) {
        boolean sumar = true;
        double resultado = 0;
        int contador = 1;
        for (int i = 0; i < n; i++) {
            double termino = Math.pow(x, contador) / calcularFactorial(contador);
            if (sumar) {
                resultado+=termino;
            } else {
                resultado-=termino;
            }
            contador+=2;
            sumar = !sumar;
        }
        return resultado;
    } 
    
}
