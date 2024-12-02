/*
 * 4. Escribe un método que reciba un número N entero positivo y un número 
   entero k entre 1 y 9. El método debe devolver un número entero formado por 
   los k dígitos del número N situados más a la derecha.
   Ejemplo para N = 12345 y k = 2 el método devolverá 45. 
   Si el número N tiene menos cifras que las que se quieren obtener, el método
   devolverá -1. 
   Por ejemplo para N = 123 y k = 4 el método devolverá -1 porque el número 
   tiene menos de 4 cifras. 
   Utiliza el método creado en el ejercicio anterior para saber las cifras 
   que tiene el número N.
 */
package metodos04;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Metodos04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, k, M;
        do {
            System.out.print("Introduce número entero positivo: ");
            N = sc.nextInt();
        } while (N <= 0);
        do {
            System.out.print("Introduce numero de cifras (entero positivo (1 a 9): ");
            k = sc.nextInt();
        } while (k < 1 || k > 9);
        M = ultimasCifras(N, k);
        if (M == -1) {
            System.out.println("El número no tiene tantas cifras");
        } else {
            System.out.println("Número formado por las " + k + " últimas cifras de " + N + ": " + ultimasCifras(N, k));
        }
    }
    
    
    //método para obtener las k últimas cifras del número N
    //devuelve -1 si N tiene menos de k cifras
    public static int ultimasCifras(int numero, int k) {
        if(contarCifras(numero) < k){//llamamos al método contarCifras para que nos devuelva las cifras que tiene el número
            return -1;
        }
        return numero % (int) Math.pow(10, k);
    }
    
    //método que recibe un entero y devuelve el número de cifras que tiene
    public static int contarCifras(int n){
        int contador = 0;
        while(n != 0){
            n = n / 10;
            contador++;
        }
        return contador;
    }
}
