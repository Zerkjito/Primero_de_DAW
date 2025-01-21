/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06;

import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Ejercicio06 ln = new Ejercicio06();
         int n = ln.leerNumeros();
         
         ln.Imprimir(n);
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
    
    public void Imprimir(int n) {
        if (n > 0) {
            System.out.println(n);
            Imprimir(n - 1);
        }   
    }
    
}
