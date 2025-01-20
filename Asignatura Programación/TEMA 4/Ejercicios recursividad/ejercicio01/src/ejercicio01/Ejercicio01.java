/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;

import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        do {
        System.out.print("Introduce el primero numero: ");
        a = sc.nextInt();
        System.out.print("Introduce el segundo numero: ");
        b = sc.nextInt();  
        } while (a < 0 || b < 0);
       
        int resultado = sumar (a, b);
        System.out.println("El resultado de " + a + " + " + b + " es " + resultado);
    }
    
    public static int sumar(int a, int b) {
        if (b == 0) {
            return a;
        }
        return sumar (a + 1, b -1);
    }
    
}
