/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A, B, C, aux;
        System.out.print("Introduzca el valor A: ");
        A = sc.nextDouble();
        System.out.print("Introduzca el valor B: ");
        B = sc.nextDouble();
        System.out.print("Introduzca el valor C: ");
        C = sc.nextDouble();
        aux  = B;
        B = A;
        A = C;
        C = aux;
        System.out.println("Valores finales intercambiados --> " + " A= " + A + " B = " + B + " C = " + C);


        
        

        
        
        
        
    }
    
}
