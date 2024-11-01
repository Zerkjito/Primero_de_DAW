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
        double n1, n2;
        char respuesta;

        System.out.print("Introduce el primer numero: ");
        n1 = sc.nextDouble();
        System.out.print("Introduce el segundo numero: ");
        n2 = sc.nextDouble();
        sc.nextLine();

        do {
            System.out.print("Introduzca la operacion (+, -, *, /): ");
            respuesta = sc.nextLine().charAt(0);

            if (respuesta == '+') {
                double total = n1 + n2;
                System.out.println(n1 + " + " + n2 + " = " + total);
            } else if (respuesta == '-') {
                double total = n1 - n2;
                System.out.println(n1 + " - " + n2 + " = " + total);
            } else if (respuesta == '*') {
                System.out.println(n1 + " * " + n2 + " = " + n1 * n2);
            } else if (respuesta == '/') {
                System.out.println(n1 + " / " + n2 + " = " + n1 / n2);
            } else {
                System.out.println("Operacion invalida");
            }

        } while (respuesta != '+' && respuesta != '-' && respuesta != '*' && respuesta != '/');

    }

}
