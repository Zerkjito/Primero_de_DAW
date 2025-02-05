/*
 * Arrays2_6
 * Se desea realizar un histograma con los pesos de los alumnos de un determinado curso:
 * Peso Número de Alumnos
 * 58 **
 * 62 ****
 * 65 **************
 * 66 ********
 * ... ....
 * El número de asteriscos se corresponde con el número de alumnos del peso
 * especificado. Realiza un programa que lea los pesos e imprima el histograma
 * correspondiente. Suponer que los pesos están comprendidos entre los valores 45 y
 * 100 Kg. En el histograma sólo aparecerán los pesos que se corresponden con 1 o
 * más alumnos. Utiliza un método para leer los pesos y otro para mostrar el
 * histograma.
 */
package arrays2_06;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Arrays2_06 {

    public static void main(String[] args) {
        int[] pesos = new int[101]; // Elementos del 0 al 100
        leerPesos(pesos);
        mostrarPesos(pesos);
    }

    //método para leer los pesos de los alumnos 
    //el método recibe un array de enteros
    //cada elemento del array será un contador
    //si por ejemplo se lee el peso 50, al elemento 50 del array se le suma 1
    public static void leerPesos(int[] pesos) {
        Scanner sc = new Scanner(System.in);
        int p, cont = 1;
        //lectura de pesos
        //la lectura termina cuando se lea un 0
        do {
            do {
                System.out.print("Peso del alumno " + cont + " entre 45 y 100. (0 para acabar): ");
                p = sc.nextInt();
            } while ((p < 45 || p > 100) && p != 0);
            if (p != 0) {
                pesos[p]++; //el peso introducido se usa como índice del array
                cont++; //variable para mostrar el número de alumno que estamos leyendo
            }
        } while (p != 0); //la lectura de pesos finaliza cuando se introduzca un 0.

    }

    //métomo para mostrar el histograma
    public static void mostrarPesos(int[] pesos) {
        int i, j;
        System.out.println();
        System.out.println("Peso Numero de Alumnos");
        System.out.println("----------------------");
        for (i = 45; i < pesos.length; i++) { //el menor peso de un alumno es 45
            if (pesos[i] > 0) { //si hay alumnos de este peso
                System.out.printf("%4d ", i);
                for (j = 0; j < pesos[i]; j++) { //se muestran tantos asterisco como indique el contador correspondiente
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

}
