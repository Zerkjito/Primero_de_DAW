/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio02 {
    static Scanner sc = new Scanner(System.in);
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] arrMulti = arrayMulti();
        mostrarMulti(arrMulti);
        
    }
    
    public static int[][] arrayMulti() {
        Random rnd = new Random();
        int filas, columnas;
        do {
            System.out.print("Introduce numero filas: ");
            while (!sc.hasNextInt()) {
                System.out.println("Error. Entrada invalida");
                sc.nextLine();
                System.out.print("Introduce numero filas: ");
            }
            filas = sc.nextInt();
            
            System.out.print("Introduce numero columnas: ");
            while (!sc.hasNextInt()) {
                System.out.println("Error. Entrada invalida");
                sc.nextLine();
                System.out.print("Introduce numero columnas: ");
            }
            columnas = sc.nextInt();
        } while (filas <= 0 || columnas <= 0);
        
        int[][] multi = new int[filas][columnas];
        for (int i = 0; i < multi.length; i++) {
            for (int j = 0; j < multi[i].length; j++) {
                multi[i][j] = rnd.nextInt(0, 9+1);
            }
        }
        return multi;
    }
    
        public static void mostrarMulti(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
