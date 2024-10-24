/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repetitiva13;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Repetitiva13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        
        do {
            System.out.print("Introduce un número (0 para finalizar): ");
            numero = sc.nextInt();
            
            if (numero != 0) {
                if (numero > 0) {
                    System.out.println("Positivo");
                } else {
                    System.out.println("Negativo");
                }
            }
            
        } while (numero != 0);
        System.out.println("Fin programa");
    }
}
