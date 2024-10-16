/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package secuenciales14;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Secuenciales14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, p, area;

        System.out.print("Introduzca longitud del primer lado del triángulo: ");
        a = sc.nextDouble();

        System.out.print("Introduzca longitud del segundo lado del triángulo: ");
        b = sc.nextDouble();

        System.out.print("Introduzca longitud del tercer lado del triángulo: ");
        c = sc.nextDouble();

        p = (a + b + c) / 2;
        area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Area -> " + area);
    }

}
