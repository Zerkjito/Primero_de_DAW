/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avanzados06;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Avanzados06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        double factorial = 1; //factorial es la variable donde iremos guardando las multiplicaciones 
                              //y al final contendrá el factorial del número.
                              //se declara de tipo double porque el factorial de un número puede superar fácilmente el rango de un int
                              //por ejemplo el factorial de 25 es 15511210043330986000000000
                     
        Scanner sc = new Scanner(System.in);
        
        do {

            System.out.print("Introduce un numero entero >= 0: ");
            n = sc.nextInt();
            if(n < 0){
                System.out.println("Debe ser >= 0");
            }
        } while (n < 0);

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.printf("%d! = %.0f%n", n, factorial);
    }

}
