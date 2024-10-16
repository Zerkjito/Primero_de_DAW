/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X;
        System.out.println("Por favor, introduzca un numero entero");
        X = sc.nextInt();
        
        if (X % 2 == 0 && X % 3 == 0) {
            System.out.println(X + " es multiplo de 2 y de 3");
            
        } else {
            if (X % 2 == 0) {
                System.out.println(X + " es multiplo de 2");
                
            } else {
                if (X % 3 == 0) {
                    System.out.println(X + " es multiplo de 3");
                    
                } else {
                    System.out.println("Ninguno es multiplo de 2 ni de 3");
                }
            }
        }
    }
    
}
