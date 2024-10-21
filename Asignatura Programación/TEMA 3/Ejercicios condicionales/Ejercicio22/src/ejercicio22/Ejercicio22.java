/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio22;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena1, cadena2;
        System.out.println("Por favor, introduzca una cadena de caracteres:");
        cadena1 = sc.nextLine().toUpperCase();
        System.out.println("Por favor, introduzca otra cadena de caracteres:");
        cadena2 = sc.nextLine().toUpperCase();
        
        if (cadena1.compareToIgnoreCase(cadena2) < 0) {
            System.out.println("Cadenas ordenadas alfabéticamente:");
            System.out.println(cadena1);
            System.out.println(cadena2);
        } else {
            System.out.println(cadena2);
            System.out.println(cadena1);
        }
    }
    
}
