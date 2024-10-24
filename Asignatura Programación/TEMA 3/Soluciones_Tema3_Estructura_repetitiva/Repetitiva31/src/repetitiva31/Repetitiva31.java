/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repetitiva31;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Repetitiva31 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, D, cifra, contadorD = 0, contadorCifras = 0, aux;

        do {
            System.out.print("Introduce número entero de dos cifras o más: ");
            N = sc.nextInt();
            if (N < 10) {
                System.out.println("Valor no válido");
            }
        } while (N < 10);

        do {
            System.out.print("Introduce dígito (0 - 9): ");
            D = sc.nextInt();
            if (D < 0 || D > 9) {
                System.out.println("Valor no válido");
            }
        } while (D < 0 || D > 9);

        //comprobar las veces que aparece el dígito D en el número N
        aux = N;
        while (aux != 0) {
            contadorCifras++; //sumamos 1 al contador de cifras del número
            cifra = aux % 10; //obtenemos la última cifra del número
            if (cifra == D) { //si la cifras igual a D
                contadorD++;   //sumamos 1 al contador que contiene las veces que aparece D dentro de N
            }
            aux = aux / 10; //quitamos al número la última cifra
        }

        if (contadorD > 0) {
            System.out.println(D + " aparece en " + N + " " + contadorD + (contadorD == 1 ? " vez" : " veces"));
            if (N / (int) Math.pow(10, contadorCifras - 1) == D) { //comprobamos si la primera cifra del número es igual a D
                System.out.println("La primera cifra de N es igual al dígito");
            } else {
                System.out.println("La primera cifra de N no es igual al dígito");
            }
            if (N / (int) Math.pow(10, contadorCifras - 2) % 10 == D) { //comprobamos si la segunda cifra del número es igual a D
                System.out.println("La segunda cifra de N es igual al dígito");
            } else {
                System.out.println("La segunda cifra de N no es igual al dígito");
            }
        } else {
            System.out.println(N + " no contiene el dígito " + D);
        }
    }
}
