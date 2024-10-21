/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio21 {

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
        if (cadena1.equals(cadena2)) {
            System.out.println(cadena1 + " y " + cadena2 + " son iguales");
        } else {
            System.out.println(cadena1 + " y " + cadena2 + " no son iguales");
        }
    }
    
}
