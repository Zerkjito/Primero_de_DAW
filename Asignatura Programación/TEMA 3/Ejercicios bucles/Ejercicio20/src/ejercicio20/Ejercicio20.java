/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio20;
import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n, n2=0;
        int contador = 1;

        System.out.print("Por favor, introduzca un numero: ");
        n = sc.nextDouble();
        while (n != 0) {
            System.out.print("Por favor, introduzca un numero: ");
            n = sc.nextDouble();
            n2 = n + n2;
            if (n >= 1) {
                contador++;
            }
            
        }
        System.out.println("Numeros positivos leidos: " + contador);
        System.out.println("Total suma: " + n2);

    }
    
}
