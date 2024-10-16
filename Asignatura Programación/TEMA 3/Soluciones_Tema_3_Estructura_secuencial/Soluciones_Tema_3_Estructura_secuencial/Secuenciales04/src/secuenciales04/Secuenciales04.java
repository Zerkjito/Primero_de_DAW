/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package secuenciales04;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Secuenciales04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero1, numero2;

        System.out.print("Introduce un número de tipo double: ");
        numero1 = sc.nextDouble(); //lectura por teclado de un número de tipo double

        System.out.print("Introduce otro número de tipo double: ");
        numero2 = sc.nextDouble(); //lectura por teclado de un número de tipo double

        System.out.println("Ha introducido los números " + numero1 + " y " + numero2);
        System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2));
        System.out.println(numero1 + " - " + numero2 + " = " + (numero1 - numero2));
        System.out.println(numero1 + " * " + numero2 + " = " + numero1 * numero2);

    }

}
