/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author zerkje
 */
public class Ejercicio01 {
    static Random rnd = new Random();

    /**
     1. Método que recibe un ArrayList de enteros y devuelve una matriz irregular de enteros con valores aleatorios entre 1
y 200. Cada elemento del ArrayList contiene la longitud de cada fila de la matriz.
Escribe un método que reciba la matriz obtenida en el método anterior y la muestre por pantalla
     */
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(6);
        al.add(1);
        al.add(5);
        al.add(7);
        al.add(3);
        System.out.println("Matriz irregular generada:");
        int[][] m = matrizIrregular(al);
        mostrarMatriz(m);
    }
    
    public static int[][] matrizIrregular(ArrayList<Integer> al) {
        int[][] m = new int[al.size()][];
        for (int i = 0; i < al.size(); i++) {
            m[i] = new int[al.get(i)];
        }
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = rnd.nextInt(1, 200+1);
            }
        }
        return m;
    }
    
    public static void mostrarMatriz(int[][] m) {
        System.out.println("\n");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
