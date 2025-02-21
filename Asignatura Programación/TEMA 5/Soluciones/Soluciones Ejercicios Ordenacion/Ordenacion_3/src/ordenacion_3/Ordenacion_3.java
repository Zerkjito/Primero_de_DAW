package ordenacion_3;

import java.util.Random;

public class Ordenacion_3 {

    public static void main(String[] args) {
        char[] caracteres = new char[50];
        
        llenarArray(caracteres);
        
        System.out.println("Array obtenido:");
        System.out.println(caracteres);
        
        burbuja(caracteres);
        //También podemos ordenar utilizando
        //Arrays.sort(caracteres);
        
        System.out.println("Array ordenado:");
        System.out.println(caracteres);
    }

    public static void llenarArray(char[] A) {
        Random rnd = new Random();
        int i;
        for (i = 0; i < A.length; i++) {
            //obtener una minúscula al azar y guardarla en el array
            A[i] = (char) (rnd.nextInt('a', 'z' + 1));
        }
    }

    public static void burbuja(char[] A) {
        int i, j;
        char aux;
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
