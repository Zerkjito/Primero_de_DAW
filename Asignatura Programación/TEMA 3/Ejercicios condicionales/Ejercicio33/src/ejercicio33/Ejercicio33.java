/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio33;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;
        
        System.out.print("Introduce el numero 1: ");
        n1 = sc.nextInt();
        System.out.print("Introduce el numero 2: ");
        n2 = sc.nextInt();
        System.out.print("Introduce el numero 3: ");
        n3 = sc.nextInt();
        
        if (n1 > n2) {
            if (n1 > n3)  {
                System.out.println("El mayor es " + n1);
            } else {
                System.out.println("El mayor es " + n3);
            }
        } else if (n2 > n3) {
            System.out.println("El mayor es " + n2);
        } else {
            System.out.println("El a mayor es " + n3);
        }
        
    }
    
}
