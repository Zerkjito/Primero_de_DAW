/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int[] array = new int[10];
        
        int i = 0;
        while (i < array.length) {
            int num = rnd.nextInt(10, 50 + 1);
            boolean repetido = false;

            for (int j = 0; j < array.length; j++) {
                if (array[j] == num) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                array[i] = num;
                i++;
            }
        }

        for (int j = 0; j < array.length; j++) {
            System.out.printf("Posicion %2d: %4d%n", j, array[j]);
        }
    }

}
