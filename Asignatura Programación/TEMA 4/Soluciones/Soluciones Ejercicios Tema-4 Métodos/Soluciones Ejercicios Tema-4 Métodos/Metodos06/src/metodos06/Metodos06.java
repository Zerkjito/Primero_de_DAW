/*
 6. Escribe un programa que lea un número entero N mayor o igual a cero
    y muestre el factorial de todos los números desde 0 hasta N. 
    Utiliza el método factorial creado en el ejercicio anterior.
 */
package metodos06;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Metodos06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, i;
        do {
            System.out.print("Introduce número entero >= 0: ");
            N = sc.nextInt();
        } while (N < 0);
        for (i = 1; i <= N; i++) {
            System.out.printf("%3d!  =  %.0f %n", i, factorial(i));
        }
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
