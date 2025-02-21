package ordenacion_2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Ordenacion_2 {

    public static void main(String[] args) {
        int[] numeros = new int[20];
        llenarArray(numeros);
        System.out.print("Array original: ");
        mostrarArray(numeros);
        System.out.println();
        burbuja(numeros);

        //Tambien podemos ordenar utilizando Arrays.sort
        //junto con el método Collections.reverseOrder()
        //en ese caso el array DEBE SER de tipo Integer
        //para poder utilizar Collections.reverseOrder()
        //
        //Arrays.sort(numeros, Collections.reverseOrder());
        //
        
        System.out.print("Array ordenado: ");
        mostrarArray(numeros);
        System.out.println();
    }

    public static void llenarArray(int[] A) {
        Random rnd = new Random();
        for (int i = 0; i < A.length; i++) {
            A[i] = rnd.nextInt(100) + 1;
        }
    }

    public static void mostrarArray(int[] A) {
        for (int i = 0; i < A.length; i++) {
            System.out.printf("%4d", A[i]);
        }
    }

    //Método de la burbuja para ordenar de mayor a menor un array de tipo int
    public static void burbuja(int[] A) {
        int i, j, aux;
        for (i = 0; i < A.length - 1; i++) {
            for (j = 0; j < A.length - i - 1; j++) {
                if (A[j + 1] > A[j]) { ///cambiando < por > ordena de mayor a menor
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                }
            }
        }
    }
}
