/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repetitiva23;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Repetitiva23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, pares = 0, impares = 0;

        do {
            System.out.print("Introduce un número entero (0 para finalizar): ");
            n = sc.nextInt();
            if (n != 0) {
                if (n % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
        } while (n != 0);

        if (pares != 0 && impares != 0) {
            if (pares > impares) {
                System.out.println("Se han introducido más pares que impares");
            } else if (pares < impares) {
                System.out.println("Se han introducido más impares que pares");
            } else {
                System.out.println("Se han introducido el mismo número de pares que de impares");
            }
        } else if (pares != 0) {
            System.out.println("Solo se han introducido números pares");
        } else if (impares != 0) {
            System.out.println("Solo se han introducido números impares");
        } else {
            System.out.println("El primer número introducido ha sido el cero");
        }
    }

}
