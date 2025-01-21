/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repasometodos;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author zerkje
 */
public class RepasoMetodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean salir = false;
        int n;
        do {
            n = leerNumero();
            if (n == 0) {
                salir = true;
            } else {
                int numAleat = obtenerNumAleatorio();

                while (parImpar(numAleat) == false) {
                    numAleat = obtenerNumAleatorio();
                }
                int mayor = esMayor(n, numAleat);
                int menor = Math.min(n, numAleat);
                mostrarNumeros(menor, mayor);
            }

        } while (!salir);
        System.out.println("FIN PROGRAMA");
    }

    public static int leerNumero() {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Introduce un numero >0 (0 para finalizar): ");
        while (!sc.hasNextInt() || (n = sc.nextInt()) < 0) {
            System.out.println("Error. Valor no valido");
            sc.nextLine();
            System.out.print("Introduce un numero >0 (0 para finalizar): ");
        }
        return n;
    }

    public static int obtenerNumAleatorio() {
        Random rnd = new Random();
        int numAleat = rnd.nextInt(91) + 10;
        return numAleat;
    }

    public static boolean parImpar(int n1) {
        boolean esPar = false;
        boolean esImpar = false;
        int temp = n1;
        while (temp != 0) {
            n1 = temp % 10;
            if (n1 % 2 == 0) {
                esPar = true;
            } else {
                esImpar = true;
            }
            temp /= 10;
        }
        return esPar && esImpar;
    }

    public static int esMayor(int menor, int mayor) {
        if (mayor > menor) {
            return mayor;
        }
        return menor;
    }

    public static void mostrarNumeros(int menor, int mayor) {
        if (mayor == menor) {
            System.out.println(mayor + " y " + menor + " son  el mismo numero");
        } else {
            System.out.println("Mostrando numeros desde el " + menor + " hasta el " + mayor);
            for (int i = menor; i <= mayor; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

}
