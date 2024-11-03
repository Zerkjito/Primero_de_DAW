/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio38;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double aumento, sueldoActual, sueldoFinal, aumentoDinero;
        
        System.out.print("Introduce el sueldo actual: ");
        sueldoActual = sc.nextDouble();
        
        if (sueldoActual <= 6000) {
            aumento = 20;
            aumentoDinero = sueldoActual * 0.2;
        } else if (sueldoActual >= 6001 && sueldoActual < 7900)  {
            aumento = 10;
            aumentoDinero = sueldoActual * 0.1;
        } else if (sueldoActual >= 7901 && sueldoActual < 10000) {
            aumento = 5;
            aumentoDinero = sueldoActual * 0.05;
        } else {
            aumento = 0;
            aumentoDinero = 0;
        }
        sueldoFinal = sueldoActual + aumentoDinero;
                
        System.out.println("Aumento: " + aumento + " %");
        System.out.println("Sueldo actual: " + sueldoActual + " euros");
        System.out.println("Nuevo sueldo: " + sueldoFinal + " euros");
    }
    
}
