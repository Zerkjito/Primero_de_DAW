/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repetitiva27;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Repetitiva27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, n;
        double resultado = 1;
        
        System.out.print("Introduce un numero entero: ");
        x = sc.nextInt();
        
        do {
            System.out.print("Introduce un numero entero positivo: ");
            n = sc.nextInt();
        } while (n <= 0);

        for (int i = 1; i <= n; i++) {
            resultado = resultado * x;
        }
        System.out.printf("Resultado: %.0f%n", resultado);
    }

}
