package ordenacion_4;

import java.util.Arrays;
import java.util.Scanner;

public class Ordenacion_4 {

    public static void main(String[] args) {
        String[] cadenas = leerCadenas();
        mostrar(cadenas);
        burbuja(cadenas);
        //también podemos ordenar utilizando
        //Arrays.sort(cadenas, String.CASE_INSENSITIVE_ORDER);
        mostrar(cadenas);
    }

    public static String[] leerCadenas() {
        Scanner sc = new Scanner(System.in);
        String[] array = new String[5];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Cadena " + (i + 1) + ": ");
            array[i] = sc.nextLine();
        }
        return array;
    }

    public static void mostrar(String[] array) {
        for (String s : array) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void burbuja(String[] A) {
        String aux;
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = 0; j < A.length - i - 1; j++) {
                if (A[j + 1].compareToIgnoreCase(A[j]) < 0) {
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                }
            }
        }
    }

}
