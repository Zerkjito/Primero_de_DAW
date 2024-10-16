/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double velocidadKm, velocidadMs;
        System.out.print("Introduzca la velocidad en Km/h: ");
        velocidadKm = sc.nextDouble();
        velocidadMs = velocidadKm / 3.6;
        System.out.print(velocidadKm + " Km/h " + " -> " +velocidadMs +" m/s");
        
       
    }
    
}
