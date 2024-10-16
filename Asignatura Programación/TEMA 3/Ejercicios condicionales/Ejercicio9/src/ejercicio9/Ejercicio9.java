/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A, B, mayor, menor;
        System.out.println("Por favor, introduzca el primer numero");
        A = sc.nextDouble();
        System.out.println("Por favor, introduzca el segundo numero");
        B = sc.nextDouble();
        
        if (A > B) {
            mayor = A;
            menor = B;
            
        } else {
            menor = A;
            mayor = B;
            
        }
        
        if (menor == 0) {
            System.out.println("Error. No se puede dividir por cero");
            
        } else {
            System.out.println(mayor + " / " + menor + " = " + mayor / menor);
        }
    }
    
}
