/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist_08;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author enrique
 */
public class ArrayList_08 {

    //Para probar el método vamos a utilizar:
    //un array estático A de 10 elementos con valores aleatorios entre 1 y 100
    //un ArrayList B con números aleatorios entre 1 y 100. 
    //la cantidad de números que vamos a guardar en el ArrayList B también lo vamos
    //a obtener de forma aleatoria.
    public static void main(String[] args) {
        int[] A = new int[10];
        ArrayList<Integer> B = new ArrayList<>();
        arrayAleatorio(A);
        arrayListAleatorio(B);
        System.out.println("Array A: ");
        mostrarArray(A);
        System.out.println("ArrayList B: ");
        mostrarArrayList(B);

        metodo(A, B);//este método es el que pide el ejercicio

        System.out.println("ArrayList B modificado: ");
        mostrarArrayList(B);

    }

    //método para llenar de números aleatorios el array A
    public static void arrayAleatorio(int[] A) {
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            A[i] = rnd.nextInt(1,101);
        }

    }

    //método para llenar de números aleatorios el ArrayList B
    //la cantidad de números aleatorios también lo obtenemos de forma aleatoria
    public static void arrayListAleatorio(ArrayList<Integer> B) {
        Random rnd = new Random();
        int N = rnd.nextInt(1, 11);//cantidad total de números aleatorios
        for (int i = 1; i <= N; i++) {//Añadimos al ArrayList N números aleatorios entre 1 y 100
            B.add(rnd.nextInt(1,101));
        }

    }

    public static void mostrarArray(int[] A) {
        System.out.print("{");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]);
            if (i < A.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    public static void mostrarArrayList(ArrayList<Integer> B) {
        System.out.println(B);
    }

    //
    //--> Método que pide el ejercicio
    //
    public static void metodo(int[] A, ArrayList<Integer> B) {
        //Obtenemos el mayor de A
        int mayor = A[0];
        for (int i = 1; i < A.length; i++) {
            if (A[i] > mayor) {
                mayor = A[i];
            }
        }

        if (B.contains(mayor)) {//si B contiene el mayor de A
            B.remove((Integer) mayor); //se elimina. Escribimos (Integer) para indicar que elimine el valor, no la posición.
        } else if (B.size() < 5) { //si no lo contiene se añade al ArrayList donde corresponda
            B.add(mayor);
        } else {
            B.add(0, mayor);
        }
    }

}
