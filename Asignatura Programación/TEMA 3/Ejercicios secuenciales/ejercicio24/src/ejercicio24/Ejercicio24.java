/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroEntero;
        System.out.print("Por favor, introduzca un numero entero: ");
        numeroEntero = sc.nextInt();
        System.out.println(numeroEntero + (numeroEntero % 2 == 0 ? " es par " : " no es par "));
        
    }
    
}
