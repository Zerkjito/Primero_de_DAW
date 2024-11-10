/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio34;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;

        System.out.print("Introduzca primer número: ");
        n1 = sc.nextInt();
        System.out.print("Introduzca segundo número: ");
        n2 = sc.nextInt();
        System.out.print("Introduzca tercer número: ");
        n3 = sc.nextInt();
        
        System.out.print("Numeros en orden ascendente: ");
        if (n1 > n2) {
            if (n2 > n3) {
                System.out.println(n3 + " " + n2 + " " + n1);
            } else if (n1 > n3) {
                System.out.println(n2 + " " + n3 + " " + n1);
            } else {
                System.out.println(n2 + " " + n1 + " " + n3);
            } 
        } else {
            if (n2 > n3) {
                if (n1 > n3) {
                    System.out.println(n3 + " " + n1 + " " + n2);
                } else {
                    System.out.println(n1 + " " + n3 + " " + n2);
                }
            } else {
                System.out.println(n1 + " " + n2 + " " + n3);
            }
        }
    }
    
}
