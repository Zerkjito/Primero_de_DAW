/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double numero1, numero2;
        System.out.println("Introduce un numero double");
        numero1 = sc.nextDouble();
        System.out.println("Introduce otro numero double");
        numero2 = sc.nextDouble();
        System.out.println("Has introduce los numeros " +numero1 + " y " +numero2);
        System.out.println(numero1 + " + " +numero2 + " = " + (numero1 + numero2));
        System.out.println(numero1 + " - " +numero2 + " = " + (numero1 - numero2));
        System.out.println(numero1 + " * " +numero2 + " = " + (numero1 * numero2));


                
        
        
        
        
        
    }
    
}
