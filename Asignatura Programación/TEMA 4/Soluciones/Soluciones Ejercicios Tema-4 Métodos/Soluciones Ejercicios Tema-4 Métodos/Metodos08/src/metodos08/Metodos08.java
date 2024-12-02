/*
   8. Escribe un método que calcule de forma aproximada el seno de un ángulo x,
   expresado en radianes, utilizando el desarrollo de Taylor: 
   sen(x) = x – (x3 / 3!) + (x5 / 5!) -  (x7 / 7!) + (x9 / 9!) -  (x11 / 11!)   ..........  
 */
package metodos08;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Metodos08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x;
        int n;
        System.out.print("Introduce ángulo en radianes: ");
        x = sc.nextDouble();
        do {
            System.out.print("Introduce número de términos para realizar el cálculo: ");
            n = sc.nextInt();
        } while (n <= 0);
        System.out.println("sen(" + x + ") = " + seno(x, n));
    }

    //método que calcula el seno de un ángulo en radianes utilizando el desarrollo de Taylor
    public static double seno(double x, int n) {
        double resultado = 0;
        boolean sumar = true;
        for (int i = 1, j = 1; i <= n; i++, j+=2) {
            if (sumar) {
                resultado = resultado + Math.pow(x, j) / factorial(j);
            } else {
                resultado = resultado - Math.pow(x, j) / factorial(j);
            }
            sumar = !sumar;
        }
        return resultado;
    }

    //método para calcular el factorial de un número
    public static double factorial(int numero) {
        double factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
