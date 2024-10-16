/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a,b;
        System.out.println("Por favor, introduzca un caracter");
        a = sc.next().charAt(0);
        System.out.println("Por favor, introduzca otro caracter");
        b = sc.next().charAt(0);
        
        if (a == b) {
            System.out.println("Ambos caracteres son iguales");
        } else {
            System.out.println(a + " y " + b + " no son iguales");
        }
    }
    
}
