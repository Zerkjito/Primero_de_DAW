/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avanzados03;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Avanzados03 {

    public static void main(String[] args) {
        int i, suma = 0, n1, n2;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduce primer número: ");
            n1 = sc.nextInt();
            if (n1 <= 0) {
                System.out.println("Debe ser positivo");
            }
        } while (n1 <= 0);
        do {
            System.out.print("Introduce segundo número: ");
            n2 = sc.nextInt();
            if (n2 <= 0) {
                System.out.println("Debe ser positivo");
            }
        } while (n2 <= 0);

        for (i = 1; i < n1; i++) {  // for para sumar todos los divisores de n1 excepto él mismo
            if (n1 % i == 0) {
                suma = suma + i;
            }
        }
        if (suma == n2) { // si la suma de los divisores de n1 es igual a n2
            suma = 0;
            for (i = 1; i < n2; i++) { // for para sumar todos los divisores de n2 excepto él mismo
                if (n2 % i == 0) {
                    suma = suma + i;
                }
            }
            if (suma == n1) { // si la suma de los divisores de n2 es igual a n1
                System.out.println("Son Amigos");
            } else {
                System.out.println("No son amigos");
            }
        } else {
            System.out.println("No son amigos");
        }
    }

}
