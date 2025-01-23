/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mostrarcuadrado;

import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class MostrarCuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = leerNumeros();
        int cuadrado = devolverCuadrado(n);
        mostrar(n, cuadrado);
    }
    
    public static int leerNumeros() {
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero distinto de 0: ");
        while (!sc.hasNextInt() || (numero = sc.nextInt()) == 0) {
            System.out.println("Numero invalido. Vuelve a intenarlo");
            sc.nextLine();
            System.out.println("Introduce un numero distinto de 0: ");
        }
        return numero;
    }
    
    public static int devolverCuadrado(int N) {
        int suma = 0;
        if (N < 0) {
            N = N * -1;
        }
        for (int i = 1; i <= N; i++) {
            if (N % i != 0) {
                suma+=(2 * i) - 1;
            }
        }
        return suma;
    }
    
    public static void mostrar(int N, int cuadrado) {
        System.out.println("El cuadrado de " + N + " es " + cuadrado);
    }
}
