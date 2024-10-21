/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19;

import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int capicua;
        
        System.out.print("Por favor, introduzca un número de 3 cifras: ");
        capicua = sc.nextInt();
        if (capicua >= 100 && capicua < 1000) {
            String numStr = String.valueOf(capicua);
            if (numStr.charAt(0) == numStr.charAt(2)) {
                System.out.println("El número " + capicua + " es capicúa");
            } else {
                System.out.println("El número " + capicua + " no es capicúa");
            }
        } else {
            System.out.println("Error. Introduzca un valor correcto.");
        }
    }
    
}
