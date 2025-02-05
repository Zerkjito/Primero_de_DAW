/*
 * Arrays2_10.  Escribe un método llamado posicionNumero que reciba 
 * tres parámetros: un array de enteros, un entero que representa una posición 
 * dentro del array y otro entero que es un número a buscar dentro del array. 
 * El método buscará el número dentro del array a partir de la posición indicada. 
 * El método devolverá la posición donde se ha encontrado el número o -1 si el 
 * número buscado no se encuentra en el array.
 */
package arrays2_10;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Arrays2_10 {

    public static void main(String[] args) {
        int n, posicionInicial, posicion;
        Scanner sc = new Scanner(System.in);

        //Para probar el método posicionNumero vamos a crear un array de 10 enteros aleatorios entre 1 y 50
        Random rnd = new Random();
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rnd.nextInt(50) + 1; //aleatorios entre 1 y 50 (incluido)
        }

        //Vamos a pedir números por teclado para comprobar si están o no en el array
        do {
            do {
                System.out.println("Introduce un número entre 1 y 50 (0 para finalizar): ");
                n = sc.nextInt();
                if ((n < 1 || n > 50) && n != 0) {
                    System.out.println("Valor no válido");
                }
            } while ((n < 1 || n > 50) && n != 0);
            if (n != 0) {
                do {
                    System.out.println("Introduce posición del array a partir de la que quieres buscar el número (entre 0 y 10): ");
                    posicionInicial = sc.nextInt();
                } while (posicionInicial < 0 || posicionInicial > numeros.length);
                posicion = posicionNumero(numeros, posicionInicial, n);
                if (posicion == -1) {
                    System.out.println("El número no se encuentra en el array a partir de esa posición");
                } else {
                    System.out.println("El número se ha encontrado en la posición " + posicion);
                }
            }
        } while (n != 0);

        //Finalmente podemos mostrar el array que estamos utilizando
        System.out.println("Array utilizado: ");
        mostrar(numeros);
    }

    //método que recibe un array, un valor y una posición y comprueba si el valor
    //se encuentra en el array a partir de la posición indicada
    //devuelve la posición donde ha encontrado el número
    //devuelve -1 si no lo ha encontrado
    public static int posicionNumero(int[] numeros, int posicion, int valor) {
        for (int i = posicion; i < numeros.length; i++) {
            if (numeros[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    //método para mostrar un array de enteros
    public static void mostrar(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }

}
