package ordenacion_1;

import java.util.Arrays;
import java.util.Random;

public class Ordenacion_1 {

    public static void main(String[] args) {
        Random rnd = new Random();
        //creamos un array de 20 elementos de tipo int
        int[] numeros = new int[20];
        int i;
        
        //llenamos el array con 20 números aleatorios del 1 al 100
        for (i = 0; i < numeros.length; i++) {
            numeros[i] = rnd.nextInt(100) + 1;
        }
        
        //ordenamos el array de menor a mayor
        Arrays.sort(numeros);
        
        //también podemos ordenar utilizando un algoritmo propio de ordenación
        //por ejemplo el método de la burbuja
        //burbuja(numeros);
        
        //mostramos el array ordenado
        System.out.print("Array creado: ");
        for (i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
        
        //cinco menores: mostramos los cinco primeros elementos del array
        System.out.print("Cinco menores: ");
        for (i = 0; i < 5; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
        
        //cinco mayores: mostramos los cinco últimos elementos del array
        System.out.print("Cinco mayores: ");
        for (i = numeros.length-5; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
    }

    //Si no utilizamos Arrays.sort
    public static void burbuja(int[] A) {
        int i, j, aux;
        for (i = 0; i < A.length - 1; i++) {
            for (j = 0; j < A.length - i - 1; j++) {
                if (A[j + 1] < A[j]) { 
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                }
            }
        }
    }
}
