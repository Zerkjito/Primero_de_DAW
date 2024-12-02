/*
 5.Escribe un método que reciba un número entero positivo y calcule 
 y devuelva su factorial.
 */
package metodos05;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Metodos05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        do {
            System.out.print("Introduce número entero >= 0: ");
            N = sc.nextInt();
        } while (N < 0);
        System.out.printf("%d! = %.0f%n", N, factorial(N));
        //El método factorial nos devuelve un valor de tipo double
        //Esto quiere decir que será algo como por ejemplo  3628800.0
        //Los decimales siempre serán .0 porque el factorial se obtiene de multiplicar números enteros
        //y por lo tanto no obtendremos decimales 
        //para mostrarlo sin la parte decimal utilizamos printf e indicamos que 
        //el número se muestra con 0 decimales (%.0f)
    }

    
    //método para calcular el factorial de un número
    //el valor devuelto es de tipo double en lugar de int porque el factorial 
    //de un número es un valor que puede muy fácilmente superar el rango de los números int
    //Por ejemplo, el factorial de 20 es 2432902008176640000
    //valor que supera ampliamente el rango de los número de tipo int
    public static double factorial(int numero) {
        double factorial = 1;
        for(int i = 1; i <= numero; i++){
            factorial = factorial * i;
        }
        return factorial;
    }
}
