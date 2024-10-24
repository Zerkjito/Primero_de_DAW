/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repetitiva07;

import java.util.Scanner;

/**
 *
 * @author Lliurex
 */
public class Repetitiva07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.print("Introduce un número entero: ");
        n = sc.nextInt();
        
        System.out.println("Numeros del 1 al " + n + " utilizando while: ");
        int i = 1;
        while (i <= n) {
            System.out.println(i);
            i++;
        }
        
        System.out.println("\n\nNumeros del 1 al " + n + " utilizando do ..while: ");
        i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= n);
        
        System.out.println("\n\nNumeros del 1 al " + n + " utilizando for: ");
        for (i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

}
