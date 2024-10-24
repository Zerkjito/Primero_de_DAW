/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repetitiva08;

import java.util.Scanner;

/**
 *
 * @author Lliurex
 */
public class Repetitiva08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.print("Introduce un número entero: ");
        n = sc.nextInt();
        
        System.out.println("Numeros del " + n + " al 1 utilizando while: ");
        int i = n;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }
        
        System.out.println("Numeros del " + n + " al 1 utilizando do ..while: ");
        i = n;
        do {
            System.out.println(i);
            i--;
        } while (i >= 1);
        
        System.out.println("Numeros del " + n + " al 1 utilizando for: ");
        for (i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }

}
