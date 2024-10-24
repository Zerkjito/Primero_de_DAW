/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;
import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, contador;
        System.out.print("Por favor, introduzca un número: ");
        n = sc.nextInt();
        for(contador = 1; contador <= 200; contador++) {
            if (contador % 2 == 0) {
                System.out.println(contador);
            }
        }
        
    }
    
}
