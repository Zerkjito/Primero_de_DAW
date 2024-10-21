/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18;
import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int año;
        
        System.out.print("Por favor, introduzca un año: ");
        año = sc.nextInt();
        if (año % 4 == 0  && año % 100 != 0 || año % 400 == 0) {
            System.out.println("El año " + año + " es bisisesto.");
        } else {
            System.out.println("El año " + año + " no es bisisesto.");
        }
        
    }
    
}
