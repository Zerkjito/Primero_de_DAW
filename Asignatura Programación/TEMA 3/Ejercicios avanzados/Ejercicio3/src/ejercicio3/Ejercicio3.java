/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        int sumaN1 = 0, sumaN2 = 0;
        System.out.print("Introduce el primer numero entero: ");
        n1 = sc.nextInt();
        System.out.print("Introduce el segundo numero entero: ");
        n2 = sc.nextInt();
        
        for (int i = 1; i < n1; i++) {
            if (n1 % i == 0) {
                sumaN1 += i;
            }
        }
        
        for (int j = 1; j < n2; j++) {
            if (n2 % j == 0) {
                sumaN2 += j;
            }
        }
        if (sumaN1 == n2 && sumaN2 == n1) {
            System.out.println(n1 + " y " + n2 + " son amigos");
        } else {
            System.out.println(n1 + " y " + n2 + " no son amigos");
        }
    }
    
}
