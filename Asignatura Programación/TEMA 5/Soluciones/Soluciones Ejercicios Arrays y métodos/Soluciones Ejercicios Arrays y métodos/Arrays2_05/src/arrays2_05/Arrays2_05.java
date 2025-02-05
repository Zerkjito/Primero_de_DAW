/*
 * Arrays2_5
 * Escribe un método que reciba un array de enteros positivos que puede contener
 * elementos duplicados y reemplace cada elemento repetido con el valor -1.
 * El método devolverá el número de elementos modificados
 */
package arrays2_05;

import java.util.Random;

/**
 *
 * @author enrique
 */
public class Arrays2_05 {

    public static void main(String[] args) {
        int[] A = new int[10];
        llenarConAleatorios(A);
        System.out.println("Array original:");
        mostrar(A);
        int n = eliminarDuplicados(A);
        System.out.println("Array modificado:");
        mostrar(A);
        System.out.println("Había " + n + " elementos duplicados");

    }

    //método que recibe un array de enteros y asigna a sus elementos valores 
    //aleatorios entre 1 y 20
    public static void llenarConAleatorios(int[] v) {
        Random rnd = new Random();
        for (int i = 0; i < v.length; i++) {
            v[i] = rnd.nextInt(1, 21);//números entre 1 y 20
        }
    }

    //método para mostrar un array de enteros
    public static void mostrar(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.printf("%3d", v[i]);
        }
        System.out.println();
    }

    //método que recibe un array de enteros y lo modifica
    //reemplazando los elementos duplicados por el valor -1
    //el método devuelve el número de elementos duplicados que contenía el array
    public static int eliminarDuplicados(int[] v) {
        int cont = 0;
        for (int i = 0; i < v.length; i++) {
            for (int j = i + 1; j < v.length; j++) {
                if (v[j] != -1 && v[j] == v[i]) {
                    v[j] = -1;
                    cont++;
                }
            }
        }
        return cont;
    }

}
