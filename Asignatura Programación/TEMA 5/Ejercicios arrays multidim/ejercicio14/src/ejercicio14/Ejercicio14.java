/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio14 {
    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] multi = generarMatr();
        int[][] modif = modificarArray(multi);
        System.out.println("\nArray bidimensional original:");
        mostrarMatr(multi);
        System.out.println("\nArray bidimensional con valor mayor y su posicion:");
        mostrarMatr(modif);
        System.out.println();
        
        
    }
    
    public static int[][] generarMatr() {
        Random rnd = new Random();
        int[][] matr = new int[5][5];
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                matr[i][j] = rnd.nextInt(1, 50+1);
            }
        }
        return matr;
    }
    
    public static int[][] modificarArray(int[][] m) {
        int[][] mayorPos = new int[m.length][2];
        for (int i = 0; i < m.length; i++) {
            int mayor = m[i][0];
            int posicion = 0;
            
            for (int j = 1; j < m[i].length; j++) {
                if (m[i][j] > mayor) {
                    mayor = m[i][j];
                    posicion = j;
                }
            }
            mayorPos[i][0] = mayor;
            mayorPos[i][1] = posicion;
        }
        return mayorPos;
    }
    
    public static void mostrarMatr(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
}
