/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avanzados07;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Avanzados07 {

    public static void main(String[] args) {
        int N;
        double factorial;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.print("Introduce un número > 0: ");
            N = sc.nextInt();
            if(N <= 0){
                 System.out.println("Debe ser > 0");
            }
        } while (N <= 0);
        
        for (int i = 1; i <= N; i++) {
            factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial = factorial * j;
            }
            System.out.printf("%2d! = %.0f %n", i, factorial);
        }
    }

}
