/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo, intereses;
        
        System.out.print("Introduce el saldo de la cuenta: ");
        saldo = sc.nextDouble();
        
        if (saldo < 1000) {
            System.out.println("Intereses: no se abonan actualmente");
        } else if (saldo >= 1000 && saldo < 5000) {
            intereses = saldo * 0.01;
            System.out.printf("Intereses: %.2f", intereses);
        } else if (saldo >= 5000 && saldo < 10000) {
            intereses = saldo * 0.02;
            System.out.printf("Intereses: %.2f\n", intereses);
        } else if (saldo >= 10000 && saldo < 20000) {
            intereses = saldo * 0.03;
            System.out.printf("Intereses: %.2f", intereses);
        } else if (saldo >= 20000) {
            intereses = saldo * 0.05;
            System.out.printf("Intereses: %.2f", intereses);
        }
        
    }
    
}
