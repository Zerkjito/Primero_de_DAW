/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;
import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char letra;
        System.out.print("Por favor, introduzca un carácter: ");
        letra = sc.nextLine().toUpperCase().charAt(0);
        
        if (letra != 'A' && letra != 'B'&& letra != 'C'&& letra != 'D'&& letra != 'E'
        && letra != 'F'&& letra != 'G' && letra != 'H' && letra != 'I'
                && letra != '0' && letra != '1' && letra != '2'
                    && letra != '3' && letra != '4'
                    && letra != '5' && letra != '6' && letra != '7'
                    && letra != '8') {
            System.out.println("El carácter indicado se encuentra fuera del rango 0-9.");
        } else {
            System.out.println("El carácter introducido se encuentra dentro del rango 0-9.");
        }
    }
    
}
