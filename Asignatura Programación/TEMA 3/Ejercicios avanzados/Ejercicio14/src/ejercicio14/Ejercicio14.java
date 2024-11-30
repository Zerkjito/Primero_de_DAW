/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int numAnterior = 0, contador = 0;
        while (true) {
            System.out.print("Introduce un numero: ");
            n = sc.nextInt();
            if (n <= numAnterior) {
                System.out.println("El numero que rompe la secuencia es: " + n);
                break;
            }
            numAnterior = n;
            contador++;
        }
        System.out.println("Cantidad de numeros ascendentes introducidos: " + contador);
    }
    
}
