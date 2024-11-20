/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avanzados12;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Avanzados12 {

    public static void main(String[] args) {
        int N, aux, inverso = 0, cifra;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduce un número > 0: ");
            N = sc.nextInt();
        } while (N <= 0);

        //le damos la vuelta al número
        aux = N;
        while (aux != 0) {
            cifra = aux % 10;
            inverso = inverso * 10 + cifra;
            aux = aux / 10;
        }

        if (N == inverso) {
            System.out.println("Es capicua");
        } else {
            System.out.println("No es capicua");
        }
    }
    
}
