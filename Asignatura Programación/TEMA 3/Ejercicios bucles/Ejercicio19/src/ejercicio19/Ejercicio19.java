/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19;
import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, contador = 0;
        System.out.print("Introduce un numero entero: ");
        n = sc.nextInt();
        while (n != 0) {
            System.out.print("Introduce otro numero: ");
            n = sc.nextInt();
            contador++;
       
        }
        System.out.println("Numeros introducidos: " + contador);
        
    }
    
}
