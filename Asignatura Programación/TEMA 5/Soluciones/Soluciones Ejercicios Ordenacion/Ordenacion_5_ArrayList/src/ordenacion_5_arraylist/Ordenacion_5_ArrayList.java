/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenacion_5_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author enrique
 */
public class Ordenacion_5_ArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Double> numeros = new ArrayList<>();
        llenarArray(numeros);
        System.out.println("Array original: ");
        mostrarArray(numeros);
        System.out.println();

        Collections.sort(numeros, Collections.reverseOrder());
        //También podemos ordenar utilizando
        //burbuja(numeros);
        
        System.out.println("Array ordenado: ");
        mostrarArray(numeros);
        System.out.println();
    }

    public static void llenarArray(ArrayList<Double> A) {
        Random rnd = new Random();
        for (int i = 1; i <= 20; i++) {
            A.add(rnd.nextDouble() * 100 + 1);
        }
    }

    public static void mostrarArray(ArrayList<Double> A) {
        for (Double n : A) {
            System.out.printf("%7.2f", n);
        }
    }

    public static void burbuja(ArrayList<Double> A) {
        Double aux;
        for (int i = 0; i < A.size() - 1; i++) {
            for (int j = 0; j < A.size() - i - 1; j++) {
                if (A.get(j + 1) > A.get(j)) {
                    aux = A.get(j + 1);
                    A.set(j + 1, A.get(j));
                    A.set(j, aux);
                }
            }
        }
    }
}
