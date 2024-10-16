/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package secuenciales09;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Secuenciales09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double velocidad;

        System.out.print("Introduzca velocidad en Km/h: ");
        velocidad = sc.nextDouble();

        System.out.println(velocidad + " Km/h -> " + velocidad * 1000 / 3600 + " m/s");
    }

}
