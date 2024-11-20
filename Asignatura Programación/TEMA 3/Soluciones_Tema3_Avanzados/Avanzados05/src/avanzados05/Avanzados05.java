/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avanzados05;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Avanzados05 {

    public static void main(String[] args) {
        int N, i;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.print("Introduce un numero > 0: ");
            N = sc.nextInt();
            if (N <= 0) {
                System.out.println("Debe ser > 0");
            }
        } while (N <= 0);
        
        System.out.println("Números primos desde 1 hasta " + N);

        for (int j = 2; j <= N; j++) {  // j es el número que se comprueba si es primo
            i = 2;      // i son los divisores. Se empieza por el 2
            while (j % i != 0) { 
                i++;
            }
            if (i == j) { // si se ha dividido por el propio número entonces es primo
                System.out.println(j);
            }
        }
    }

}
