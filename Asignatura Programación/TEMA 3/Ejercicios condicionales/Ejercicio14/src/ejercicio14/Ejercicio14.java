/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a, b;
        System.out.println("Por favor, introduzca un caracter");
        a =  sc.next().charAt(0);
        System.out.println("Por favor, introduzca otro caracter");
        b = sc.next().charAt(0);
        
        if (Character.isLowerCase(a) && Character.isLowerCase(b)) {
            System.out.println("ambos son minuscula");
        } else if (Character.isLowerCase(a)) {
            System.out.println(a + " es minuscula");
        } else if (Character.isLowerCase(b)) {
            System.out.println(b + " es minuscula");
        } else {
            System.out.println("Ninguno de los dos caracteres esta en minuscula");
        }
        
        
    }
    
}
