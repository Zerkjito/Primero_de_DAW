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
        int n, digito;
        
        do {
            System.out.print("Introduce un numero entero > 0: ");
            n = sc.nextInt();
            if (n < 0) {
                System.out.println("Error. Debe ser mayor a 0");
            }
        } while (n < 0);
        
        int exp = 0;
        double binario = 0;
        
        while (n > 0) {
            digito = n % 2;
            binario = binario + digito * Math.pow(10, exp);
            exp++;
            n/=2;
        }
        System.out.printf("Binario: %.0f %n", binario);
        
    }
    
}
