/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n;
        System.out.print("Introduce un numero entero: ");
        n = sc.nextInt();
        
        int invertido = 0;
        while (n != 0) {
            int digito = n % 10;
            invertido = invertido * 10 + digito;
            n/= 10;
        }
        System.out.println("Numero invertido: " + invertido);

    }
    
}