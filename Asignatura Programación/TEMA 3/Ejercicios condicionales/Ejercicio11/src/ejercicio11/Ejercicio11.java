/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Por favor, introduzca un numero entero");
        n = sc.nextInt();
        
        if (n > 0) {
            if (n % 10 > 5) {
                System.out.println("La ultima cifra es mayor que 5");
            } else if (n % 10 < 5) {
                System.out.println("La ultima cifra es menor que 5");
            } else {
                System.out.println("La ultima cifra es igual a 5");
            }
        } else {
            System.out.println("El numero que ha introducido es negativo");
        }
    }
    
}
