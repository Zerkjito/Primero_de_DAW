/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        char c;
        System.out.println("Por favor, introduzca una carácter");
        c = sc.next().charAt(0);
        
        if (Character.isUpperCase(c)) {
            System.out.println("El carácter introducido esta en mayúscula");
        } else {
            System.out.println("El carácter introducido no esta en mayúscula");
        }
    }
    
}
