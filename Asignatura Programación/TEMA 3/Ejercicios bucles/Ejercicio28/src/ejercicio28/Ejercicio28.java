/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio28;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, cifras = 0;
        System.out.print("Introduce un numero entero: ");
        n = sc.nextInt();
        while (n != 0) {
            n = n / 10;
            cifras++;
        } 
        System.out.println("Numero de cifras: " + cifras);
    }
    
}
