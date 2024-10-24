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
        int n;
        do {
            System.out.print("Por favor, introduzca un numero positivo: ");
            n = sc.nextInt();
            if (n > 0) {
                System.out.println("La raiz cuadrada de " + n + " es " + Math.sqrt(n));
            }
        } while (n <= 0);
    }

}
