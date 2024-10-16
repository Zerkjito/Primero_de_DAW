/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X;
        System.out.println("Por favor, introduzca un numero entero");
        X = sc.nextInt();
        
        if (X % 3 == 0 && X % 5 == 0) {
            System.out.println(X + " es multiplo de 3 y de 5");
            
        } else {
            System.out.println(X + " no es multiplo de 3 ni de 5");
        }
    }
    
}
