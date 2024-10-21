/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio20;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char letra;
        System.out.print("Por favor, intrdoduzca un carácter: ");
        letra = sc.nextLine().charAt(0);
        
        if (letra >= 'a' && letra <= 'z') {
            System.out.println("El carácter " + letra + " está en minúscula");
        } else if (letra >= 'A' && letra <= 'Z') {
            System.out.println("El carácter " + letra + " está en mayúscula");
        } else if (Character.isDigit(letra)) {
            System.out.println("El carácter " + letra + " es un dígito");
        } else {
            System.out.println("El carácter " + letra + " es otro carácter");
        }
        
    }
    
}
