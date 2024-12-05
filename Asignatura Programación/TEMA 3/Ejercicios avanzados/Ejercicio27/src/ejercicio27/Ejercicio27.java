/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio27;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, a, b;
        boolean sumar = true;
        double resultado = 0;
        
        do {
            System.out.print("Introduce el numero de terminos: ");
            n = sc.nextInt();
        } while (n < 1);
        
        do {
            System.out.print("Introduce el valor de a: ");
            a = sc.nextInt();
        } while (a < 1);
        
        do {
            System.out.print("Introduce el valor de b: ");
            b = sc.nextInt();
        } while (b < 1);
        
        for (int i = 1, j = 2; i <= n; i++, j+=2) {
            if (sumar) {
                resultado = resultado + (Math.pow(i, a)) / (Math.pow(j, b));
            } else {
                resultado = resultado - (Math.pow(i, b)) / (Math.pow(j, a));
            }
            sumar = !sumar;
        }
        System.out.printf("Resultado -> %.4f\n", resultado);
    }
    
}
