/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author zerkje
 */
public class Ejercicio05 {
    static int[] arr = {6,0, -1, 7, 14,9, -1, 20, 32, 44};

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matrizAlterado = alterarArray(arr);
        for (int i = 0; i < matrizAlterado.length; i++) {
            for (int j = 0; j < matrizAlterado[i].length; j++) {
                System.out.print(matrizAlterado[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static int[][] alterarArray(int[] a) {
        int[][] matrizIrr = new int[2][];
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();
        for (int num : a) {
            if (num % 2 == 0 || num == 0) {
                pares.add(num);
            } else {
                impares.add(num);
            }
        }
        matrizIrr[0] = new int[pares.size()];
        matrizIrr[1] = new int[impares.size()];
        
        for (int i = 0; i < matrizIrr.length; i++) {
            for (int j = 0; j < matrizIrr[i].length; j++) {
                if (i == 0) {
                    matrizIrr[i][j] = pares.get(j);
                } else {
                    matrizIrr[i][j] = impares.get(j);
                }
            }
        }
        Arrays.sort(matrizIrr[0]);
        Arrays.sort(matrizIrr[1]);
        for (int i = 0; i < matrizIrr[1].length / 2; i++) {
            int temp = matrizIrr[1][i];
            matrizIrr[1][i] = matrizIrr[1][matrizIrr[1].length - 1 - i];
            matrizIrr[1][matrizIrr[1].length - 1 - i] = temp;
            
        }
        return matrizIrr;
    }
}
