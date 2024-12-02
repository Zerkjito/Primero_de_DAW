/*
7. Un número combinatorio es el valor numérico de las combinaciones ordinarias
   (sin repetición) de un conjunto de n elementos tomados en grupos de r, 
   siendo n y r dos números enteros y positivos tales que n >= r.
   Matemáticamente, un número combinatorio se calcula así:
       n!
   -----------
   r! * (n-r)!

   Escribe un método que reciba dos números enteros n y r y devuelva el número 
   combinatorio correspondiente. Utiliza el método factorial creado en el 
   ejercicio 5 para calcularlo.
 */
package metodos07;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Metodos07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, r;
        do {
            System.out.print("Introduce el valor de n > 0: ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Valor no válido");
            }
        } while (n <= 0);
        do {
            System.out.print("Introduce el valor de r >0 y <= n: ");
            r = sc.nextInt();
            if (r <= 0 || r > n) {
                System.out.println("Valor no válido");
            }
        } while (r <= 0 || r > n);

        System.out.print("Número combinatorio C " + n + "," + r + " -> ");
        System.out.printf("%.0f %n", numeroCombinatorio(n, r));
    }

    
    //método para calcular el número combinatorio
    public static double numeroCombinatorio(int a, int b) {
        return factorial(a) / (factorial(b) * factorial(a - b));
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
