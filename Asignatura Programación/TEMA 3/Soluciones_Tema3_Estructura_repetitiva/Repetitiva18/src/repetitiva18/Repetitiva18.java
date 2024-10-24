/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repetitiva18;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Repetitiva18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Introduce un número entero: ");
        n = sc.nextInt();
        System.out.println(" Tabla del " + n);
        System.out.println("----------------");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%2d * %2d = %3d %n", n, i, n * i);
        }
    }

}
