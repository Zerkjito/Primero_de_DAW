/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, p;
        while (true) {
            System.out.print("Introduce un numero entero positivo: ");
            n = sc.nextInt();
            System.out.print("Introduce la posicion (menor o igual que N cifras): ");
            p = sc.nextInt();

            int resultado = posicionCifra(n, p);
            if (resultado != -1) {
                break;
            }
            System.out.println("Error. Los valores deben ser positivos / la posicion no puede ser mayor que N cifras");
        }
        System.out.println("La cifra que ocupa la posicion " + p + " es -> " + posicionCifra(n, p));
    }

    public static int contadorCifras(int n) {
        int cifras = 0;
        while (n > 0) {
            n /= 10;
            cifras++;
        }
        return cifras;
    }

    public static int posicionCifra(int n, int p) {
        if (n <= 0 || p <= 0 || p > contadorCifras(n)) {
            return -1;

        }
        n /= (int) Math.pow(10, p - 1);
        return n % 10;
    }

}
