package ordenacion_3_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ordenacion_3_ArrayList {

    public static void main(String[] args) {
        ArrayList<Character> caracteres = new ArrayList<>();
        
        llenarArray(caracteres);
        
        System.out.println("Array original: ");
        System.out.println(caracteres);
    
        burbuja(caracteres);
        //También podemos ordenar utilizando
        //Collections.sort(caracteres);

        System.out.println("Array ordenado: ");
        System.out.println(caracteres);
    }

    public static void llenarArray(ArrayList<Character> A) {
        Random rnd = new Random();
        int i;
        for (i = 0; i < 50; i++) {
            //obtener una minúscula y añadirla al array
            A.add((char) (rnd.nextInt('a', 'z' + 1)));
        }
    }

    //Método de la burbuja para ordenar un ArrayList de tipo Character
    public static void burbuja(ArrayList<Character> A) {
        Character aux;
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
