/*
 13. Escribe un método que reciba dos números A y B de tipo double. 
 El método debe devolver un String con este formato: 
 “A = valor de A con tres cifras decimales B = valor de B con tres cifras decimales”.
 Por ejemplo, si A = 2.44567 y B =1.4423056
 El método devolverá este String: "A = 2,446 B = 1,442"
 */
package metodos13;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Metodos13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y;
        System.out.print("Introduce un número con varias cifras decimales: ");
        x = sc.nextDouble();
        System.out.print("Introduce otro número con varias cifras decimales: ");
        y = sc.nextDouble();
        System.out.println(metodo(x, y));
    }

    public static String metodo(double A, double B) {
        String cadena = String.format("A = %.3f B = %.3f", A, B);
        return cadena;
    }

}
