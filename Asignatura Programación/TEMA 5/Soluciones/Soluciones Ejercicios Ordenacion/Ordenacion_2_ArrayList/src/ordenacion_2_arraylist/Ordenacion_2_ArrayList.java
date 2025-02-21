package ordenacion_2_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ordenacion_2_ArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        llenarArray(numeros);
        System.out.print("Array original: ");
        mostrarArray(numeros);
        System.out.println();
        
        Collections.sort(numeros, Collections.reverseOrder());
        //También podemos ordenar utilizando un método de ordenación
        //burbuja(numeros);
        
        System.out.print("Array ordenado: ");
        mostrarArray(numeros);
        System.out.println();
    }

    public static void llenarArray(ArrayList<Integer> A) {
        Random rnd = new Random();
        for (int i = 1; i <= 20; i++) {
            A.add(rnd.nextInt(100) + 1);
        }
    }

    public static void mostrarArray(ArrayList<Integer> A) {
        for (Integer n : A) {
            System.out.printf("%4d", n);
        }
    }

    //Si no utilizamos Collections.sort
    public static void burbuja(ArrayList<Integer> A) {
        Integer aux;
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
