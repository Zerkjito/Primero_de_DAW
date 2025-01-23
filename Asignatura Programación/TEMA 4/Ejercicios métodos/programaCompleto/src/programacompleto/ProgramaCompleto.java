/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programacompleto;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Erick
 */
public class ProgramaCompleto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        boolean salir = false;
        do {
            numero = leerNumeros();
            if (numero == 0) {
                salir = true;
            } else {
                int numAleat = obtenerAleatorio();

                while (ParImpar(numAleat) == false) {
                    numAleat = obtenerAleatorio();
                }
                int mayor = MayorEntreDos(numero, numAleat);
                int menor = Math.min(numero, numAleat);
                Mostrar(menor, mayor);
            }

        } while (!salir);
        System.out.println("FINNNNNN");

    }

    public static int leerNumeros() {
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero >0 (0 para finalizar):  ");
        while (!sc.hasNextInt() || (numero = sc.nextInt()) < 0) {
            System.out.println("Numero invalido. Vuelve a intenarlo");
            sc.nextLine();
            System.out.println("Introduce un numero >0 (0 para finalizar): ");
        }
        return numero;
    }

    public static int obtenerAleatorio() {
        Random rnd = new Random();
        int numAleat = rnd.nextInt(91) + 10;
        return numAleat;
    }

    public static boolean ParImpar(int n) {
        boolean esPar = false;
        boolean esImpar = false;
        int temp = n;

        while (temp != 0) {
            int cifra = temp % 10;
            if (cifra % 2 == 0) {
                esPar = true;
            } else {
                esImpar = true;
            }

            temp /= 10;
        }
        return esPar && esImpar;
    }

    public static int MayorEntreDos(int n1, int n2) {
        if (n1 > n2) {
            return n1;
        }
        return n2;
    }

    public static void Mostrar(int menor, int mayor) {
        if (menor == mayor) {
            System.out.println("Ambos numeros son iguales");
        } else {
            System.out.println("Los numeros desde el " + menor + " hasta el " + mayor);
            for (int i = menor; i <= mayor; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

}
