/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenacion_5;

import java.util.Random;

/**
 *
 * @author enrique
 */
public class Ordenacion_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] numeros = new double[20];
        llenarArray(numeros);
        System.out.println("Array original: ");
        mostrarArray(numeros);
        System.out.println();
        
        burbuja(numeros);
        //Tambien podemos ordenar utilizando Arrays.sort
        //junto con el método Collections.reverseOrder()
        //en ese caso el array DEBE SER de tipo Double
        //para poder utilizar Collections.reverseOrder()
        //Arrays.sort(numeros, Collections.reverseOrder());
        
        System.out.println("Array ordenado: ");
        mostrarArray(numeros);
        System.out.println();
    }

    public static void llenarArray(double[] A) {
        Random rnd = new Random();
        for (int i = 0; i < A.length; i++) {
            A[i] = rnd.nextDouble() * 100 + 1;
        }
    }

    public static void mostrarArray(double[] A) {
        for (int i = 0; i < A.length; i++) {
            System.out.printf("%7.2f", A[i]);
        }
    }

    //Método de la burbuja para ordenar de mayor a menor un array de tipo double
    public static void burbuja(double[] A) {
        double aux;
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = 0; j < A.length - i - 1; j++) {
                if (A[j + 1] > A[j]) { ///cambiando < por > ordena de mayor a menor
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                }
            }
        }
    }

}
