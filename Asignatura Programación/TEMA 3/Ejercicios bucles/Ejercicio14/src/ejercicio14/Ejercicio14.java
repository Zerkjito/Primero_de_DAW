/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Por favor, introduzca un numero (0 para finalizar): ");
            n = sc.nextInt();
            if (n == 0) {
                System.out.println("Fin de programa");
            } else if (n % 2 != 0) {
                System.out.println("Es impar");
            } else  if (n % 2 == 0){
                System.out.println("Es par");
            }
        } while (n != 0);
    }

}
