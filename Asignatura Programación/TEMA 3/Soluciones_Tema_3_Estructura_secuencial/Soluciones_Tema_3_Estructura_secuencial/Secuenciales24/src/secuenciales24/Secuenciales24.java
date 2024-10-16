/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package secuenciales24;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Secuenciales24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;

        System.out.print("Introduzca valor de N: ");
        N = sc.nextInt();
        
        System.out.println(N + (N % 2 == 0 ? " es par " : " es impar "));
    }

}
