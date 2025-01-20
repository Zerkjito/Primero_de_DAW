/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05;

import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ejercicio05 ln = new Ejercicio05();
        int n = ln.leerNumeros();
        
        ln.Imprimir(1, n);
        
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

    public void Imprimir(int contador, int n) {
        if (contador <= n) {
            System.out.println(contador);
            Imprimir(contador + 1, n);
        }
        
    }

}
