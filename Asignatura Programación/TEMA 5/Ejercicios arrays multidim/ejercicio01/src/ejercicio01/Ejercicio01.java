/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;

import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio01 {
    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] multi = crearMulti();
        mostrarMulti(multi);
        
    }
    
    public static int[][] crearMulti() {
        int [][] multi = new int[4][5];
        for (int i = 0; i < multi.length; i++) {
            for (int j = 0; j < multi[i].length; j++) {
                System.out.print("Fila " + i + ". Introduce el valor de la columna " + j + ": ");
                while (!sc.hasNextInt()) {
                    System.out.println("Error. Entrada invalida.");
                    sc.nextLine();
                    System.out.print("Fila " + i + ". Introduce el valor de la columna " + j + ": ");
                }
                multi[i][j] = sc.nextInt();
            }
        }
        System.out.println();
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
