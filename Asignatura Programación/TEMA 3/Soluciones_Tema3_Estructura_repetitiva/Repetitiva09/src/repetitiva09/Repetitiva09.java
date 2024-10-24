/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repetitiva09;

import java.util.Scanner;

/**
 *
 * @author Lliurex
 */
public class Repetitiva09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1, numero2, menor, mayor;
    
        System.out.print("Introduce un número entero: ");
        numero1 = sc.nextInt();
        
        System.out.print("Introduce otro número entero: ");
        numero2 = sc.nextInt();
        
        //comprobamos cuál de los dos números es el mayor y el menor
        //y los guardamos en las variables mayor y menor
        if (numero1 > numero2) {
            mayor = numero1; 
            menor = numero2;
        } else {
            mayor = numero2;
            menor = numero1;
        }
        
        System.out.println("\nNúmeros comprendidos entre " + menor + " y " + mayor + " : ");
        for (int i = menor; i <= mayor; i++) {
            System.out.println(i);
        }
    }

}
