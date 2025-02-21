package ordenacion_1_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ordenacion_1_ArrayList {

    public static void main(String[] args) {
        Random rnd = new Random();
        //creamos el ArrayList
        ArrayList<Integer> numeros = new ArrayList<>();
        int i;

        //llenamos el ArrayList con 20 números aleatorios del 1 al 100
        for (i = 1; i <= 20; i++) {
            numeros.add(rnd.nextInt(100) + 1);
        }

        //Lo ordenamos de menor a mayor
        burbuja(numeros);

        //También podemos ordenar utilizando
        //Collections.sort(numeros);
        
        
        //mostramos el ArrayList ordenado
        System.out.print("Array creado: ");
        for (i = 0; i < numeros.size(); i++) {
            System.out.print(numeros.get(i) + " ");
        }
        System.out.println();

        //mostramos los cinco primeros elementos
        System.out.print("Cinco menores: ");
        for (i = 0; i < 5; i++) {
            System.out.print(numeros.get(i) + " ");
        }
        System.out.println();

        //mostramos los cinco últimos elementos
        System.out.print("Cinco mayores: ");
        for (i = numeros.size() - 5; i < numeros.size(); i++) {
            System.out.print(numeros.get(i) + " ");
        }
        System.out.println();
    }

    //Método de la burbuja para ordenar un ArrayList de tipo Integer
    public static void burbuja(ArrayList<Integer> A) {
        Integer aux;
        for (int i = 0; i < A.size() - 1; i++) {
            for (int j = 0; j < A.size() - i - 1; j++) {
                if (A.get(j + 1) < A.get(j)) {
                    aux = A.get(j + 1);
                    A.set(j + 1, A.get(j));
                    A.set(j, aux);
                }
            }
        }
    }
}
