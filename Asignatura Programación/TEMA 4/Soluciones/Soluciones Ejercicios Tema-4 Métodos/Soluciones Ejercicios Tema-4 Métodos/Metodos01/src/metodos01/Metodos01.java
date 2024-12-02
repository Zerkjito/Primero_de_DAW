/*
 * 1. Escribe un método que reciba un número entero positivo y calcule
   si es un número perfecto. El método devolverá true si el número es perfecto
   y false si no lo es.
 */
package metodos01;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Metodos01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Introduce número entero positivo: ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Valor no válido");
            }
        } while (n <= 0);
        if (esPerfecto(n)) {//llamada al método 
            System.out.println("Es perfecto");
        } else {
            System.out.println("No es perfecto");
        }
    }

    
    //método que recibe un número entero y comprueba si es perfecto
    public static boolean esPerfecto(int numero) {
        int suma = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }
        if (numero == suma) {
            return true;
        }
        return false;
    }

}
