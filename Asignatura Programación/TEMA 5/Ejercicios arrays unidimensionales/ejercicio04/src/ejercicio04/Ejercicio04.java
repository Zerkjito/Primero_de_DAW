/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int pares = 0;
        int impares = 0;
        int [] num = new int[50];
        for (int i = 0; i < num.length; i++) {
            num[i] = rnd.nextInt(1, 1000 + 1);
            if (num[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("CONTENIDO DEL ARRAY:");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println("\nHay " + pares + " numeros pares");
        System.out.println("Hay " + impares + " numeros impares");
        
    } 
    
}
