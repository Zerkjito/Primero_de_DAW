/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraysmulti_04;

import java.util.Random;

/**
 *
 * @author enrique
 */
public class ArraysMulti_04 {

    public static void main(String[] args) {
        Random rnd = new Random();
        
        //se crea el array de 6 filas y 6 columnas
        int[][] A = new int[6][6];
        
        int suma = 0;

        //Llenamos el array con números aleatorios entre 10 y 20
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = rnd.nextInt(10, 21);
            }
        }

        //Recorremos el array creado para mostrarlo por pantalla
        //además realizamos la suma de los elementos que se encuentran en la diagonal principal
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.printf("%3d", A[i][j]);
                if (i == j) { //elemento en la diagonal del array
                    suma = suma + A[i][j];
                }
            }
            System.out.println();
        }
        
        System.out.println("Suma de la diaginal principal: " + suma);
    }
    
}
