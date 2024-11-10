/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio36;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l1, l2, l3, a, b, c;
        
        System.out.print("Introduce el lado 1: ");
        l1  = sc.nextDouble();
        System.out.print("Introduce el lado 2: ");
        l2  = sc.nextDouble();
        System.out.print("Introduce el lado 3: ");
        l3  = sc.nextDouble();
        
        if (l1 > l2 && l1 > l3) {
            a = l1;
            b = l2;
            c = l3;
        } else if (l2 > l1 && l2 > l3) {
            a = l2;
            b = l1;
            c = l3;
        }  else {
            a = l3;
            b = l1;
            c = l2;
        }
        
        if (a >= b + c) {
            System.out.println("No es un triangulo");
        } else if (a * a == b * b + c * c) {
            System.out.println("Es un triangulo rectangulo");
        } else if (a * a > b * b + c * c) {
            System.out.println("Es un triangulo obtusangulo");
        } else if (a * a < b * b + c * c) {
            System.out.println("Es un rectangulo acutagulo");
        }
    }
    
}
