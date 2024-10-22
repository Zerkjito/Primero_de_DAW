/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;
import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.print("Por favor, introduzca un número entero: ");
        n1 = sc.nextInt();
        System.out.print("Por favor, introduzca otro número entero: ");
        n2 = sc.nextInt();
        while (n1 >= n2) {
            System.out.println("");
            System.out.println(n2++);
        }
        while (n2 >= n1) {
            System.out.println(n1++);
        }
    }
    
}
