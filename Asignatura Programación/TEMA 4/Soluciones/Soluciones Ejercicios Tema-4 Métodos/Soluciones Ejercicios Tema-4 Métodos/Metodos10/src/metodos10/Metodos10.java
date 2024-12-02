/*
  10. Escribe un método que calcule el valor aproximado del número e utilizando 
  siguiente fórmula:
  e = 1/0! + 1/1! + 1/2! + 1/3! + … + 1/N!
 */
package metodos10;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Metodos10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.println("Cálculo del valor aproximado del numero e");
        do {
            System.out.print("Introduce el numero de términos para calcular la aproximación: ");
            N = sc.nextInt();
            if (N < 1) {
                System.out.println("Debe introducir un numero >= 1");
            }
        } while (N < 1);
        System.out.printf("Valor del numero e para %d términos: %.20f %n", N, numeroE(N));
    }

    //método para calcular el número e
    public static double numeroE(int n) {
        double resultado = 0;
        int i;
        for (i = 0; i <= n; i++) {
            resultado = resultado + 1 / factorial(i);
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
