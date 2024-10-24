/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18;
import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, contador;
        System.out.print("Por favor, introduzca un número entero: ");
        n = sc.nextInt();
        System.out.println("Tabla del " + n);
        System.out.println("----------------");
        for (contador = 1; contador <= 10; contador++) {
            System.out.println(n + " * " + contador + " = " + n * contador);
        }
        
    }
    
}
