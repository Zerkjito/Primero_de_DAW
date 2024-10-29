/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio29;
import java.util.Scanner;
/**
 *
 * @author zerkje
 */
public class Ejercicio29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sumaCifras = 0;
        System.out.print("Introduce un numero entero: ");
        n = sc.nextInt();
        while (n != 0) {
            sumaCifras = sumaCifras + (n % 10);
            n = n / 10;
        }
        System.out.println("SUMA DE LAS CIFRAS: " + sumaCifras);
    } 
    
}
