/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repetitiva15;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Repetitiva15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        
        do {
            System.out.print("Introduce un número positivo: ");
            numero = sc.nextInt();
            if(numero <= 0){
                System.out.println("ERROR -  El número debe ser positivo");
            }
        } while (numero <= 0);
        
        System.out.println("Raíz cuadrada de " + numero + ": " + Math.sqrt(numero));
    }

}
