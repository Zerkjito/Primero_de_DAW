/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repetitiva11;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Repetitiva11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.print("Introduce un número entero: ");
        N = sc.nextInt();
        System.out.println("Múltiplos de " + N + " entre 1 y 200:");
        for (int i = 1; i <= 200; i++) {
            if (i % N == 0) {
                System.out.println(i);
            }
        }
    }
    
}
