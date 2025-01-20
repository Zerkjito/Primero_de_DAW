/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02;

import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ejercicio02 ln =  new Ejercicio02 ();
        int n1 = ln.leerNumeros();
        int n2 = ln.leerNumeros();
        
        int resultado = calcularProducto (n1, n2);
        System.out.println("El resultado de " + n1 + " x " + n2 + " -> " + resultado);
        
    }

    public int leerNumeros() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        while (!sc.hasNextInt()) {
            System.out.println("Esto no es un numero. Intentalo de nuevo.");
            sc.next();   
        }
        int numero = sc.nextInt();
        return numero;
    }
    
    public static int calcularProducto(int n1, int n2) {
        if (n2 == 0) {
            return 0;
        }
        if (n2 > 0) {
            return n1 + calcularProducto (n1, n2 - 1);
        }
        if (n2 < 0) {
            return -calcularProducto (n1, -n2);
        }
        return 0;
        
    }

}
