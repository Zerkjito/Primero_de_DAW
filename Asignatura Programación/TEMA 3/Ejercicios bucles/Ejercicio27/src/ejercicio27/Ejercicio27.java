/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio27;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X, Y;
        double resultado = 1;
        System.out.print("Introduce un numero entero X: ");
        X = sc.nextInt();
        do {
        System.out.print("Introduce un numero entero positivo Y: ");
        Y = sc.nextInt();
        if (Y <= 0 ) {
            System.out.println("Error. El numero Y debe ser positivo.");
        }
        } while(Y <= 0);
        
        for (int i = 1; i <= Y; i++) {
            resultado *= X;
        }
        System.out.println(resultado);
    }
    
}
