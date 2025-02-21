package ordenacion_4_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ordenacion_4_ArrayList {

    public static void main(String[] args) {
        ArrayList<String> cadenas = new ArrayList<>();
        llenarArray(cadenas);
        System.out.println("Array original: ");
        System.out.println(cadenas);
            
        burbuja(cadenas);
        //También podemos ordenar utilizando
        //Collections.sort(cadenas);   
        System.out.println("Array ordenado: ");
        System.out.println(cadenas);
    }

    public static void llenarArray(ArrayList<String> A) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.print("Cadena " + i + ": ");
            A.add(sc.nextLine());
        }
    }

    //Método de la burbuja para ordenar un ArrayList de tipo String
    public static void burbuja(ArrayList<String> A) {
        String aux;
        for (int i = 0; i < A.size() - 1; i++) {
            for (int j = 0; j < A.size() - i - 1; j++) {
                if (A.get(j + 1).compareToIgnoreCase(A.get(j)) < 0) {
                    aux = A.get(j + 1);
                    A.set(j + 1, A.get(j));
                    A.set(j, aux);
                }
            }
        }
    }

}
