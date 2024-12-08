/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio37;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, aux, digito = 0;
        boolean binario;
        
        do {
            System.out.print("Introduce el numero binario: ");
            n = sc.nextInt();
            binario = true;
            aux = n;
              
            while (aux > 0 && binario) {
                digito = aux % 10;
                if (digito != 1 && digito != 0) {
                    binario = false;
                }
                aux/=10;
            }
            
        } while (n < 0 || !binario);
        
        int exp = 0;
        int decimal = 0;
        while (n > 0) {
            digito = n % 10;
            decimal = decimal + digito * (int) Math.pow(2, exp);
            exp++;
            n/=10;
        }
        System.out.println("Decimal: " + decimal);
    }
    
}
