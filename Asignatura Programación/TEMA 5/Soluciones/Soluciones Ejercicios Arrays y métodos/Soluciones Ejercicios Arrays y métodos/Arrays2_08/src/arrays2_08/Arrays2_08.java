/*
 * Arrays2_08 Escribe un método que reciba un entero n y devuelva un array 
 * con n números primos obtenidos de forma aleatoria.
 */
package arrays2_08;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Arrays2_08 {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduce tamaño del array ( > 0): ");
            n = sc.nextInt();
        } while (n < 1);

        int[] A = llenarConPrimos(n);

        System.out.println("Números primos obtenidos:");
        mostrar(A);
    }

    //Método que recibe un número entero N y devuelve un array con N números primos 
    public static int[] llenarConPrimos(int N) {
        Random rnd = new Random();
        int[] numeros = new int[N];
        int aleatorio;
        for (int i = 0; i < numeros.length; i++) {

            //Se obtiene un número al azar y se comprueba si es primo.
            //si no es primo se obtiene otro número aleatorio
            do {
                aleatorio = rnd.nextInt(10000);//entre 0 y 10000. El ejercicio no especifica un límite para obtener números aleatorios
            } while (!esPrimo(aleatorio)); //si el número no es primo se repite el do ..while para obtener otro

            numeros[i] = aleatorio;
        }
        return numeros;
    }

    //métod que recibe un entero y devuelve si es primo o no
    public static boolean esPrimo(int n) {
        if (n != 1) { //El 1 no es primo
            int i = 2;    //i es el divisor
            while (n % i != 0) {  //mientras el número no sea divisible por el divisor
                i++; //siguiente divisor
            }
            if (i == n) { //cuando sale del while, si el divisor es el propio número    
                return true;   //el número es primo
            }
        }
        return false;
    }

    //método para mostrar un array de enteros
    public static void mostrar(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }

}
