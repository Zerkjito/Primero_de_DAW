/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A, B, resultado;
        System.out.println("Por favor, introduzca el primer numero");
        A = sc.nextDouble();
        System.out.println("Por favor, introduzca el segundo numero");
        B = sc.nextDouble();
        resultado = A / B;
        if (B == 0) {
            System.out.println("Error. El divisor no puede ser cero");
            
        } else {
            System.out.println("El resultado de " + A + " dividido entre " + B + " es " + resultado);
        }
        
    }
    
}
