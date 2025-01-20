/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04;

import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ejercicio04 ln =  new Ejercicio04 ();
        int base = ln.leerNumeros();
        int exponente = ln.leerNumeros();
        
        int resultado = elevarNumero (base, exponente);
        System.out.println(base + " elevado a " + exponente + " es -> " + resultado);
    }
    
     public int leerNumeros() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero para elevar: ");
        while (!sc.hasNextInt()) {
            System.out.println("Esto no es un numero. Intentalo de nuevo.");
            sc.next();   
        }
        int numero = sc.nextInt();
        return numero;
    }
     
     public static int elevarNumero (int base, int exponente) {
         if (exponente == 0) {
             return 1;
         }
         return base * elevarNumero (base, exponente - 1);
     }
}
