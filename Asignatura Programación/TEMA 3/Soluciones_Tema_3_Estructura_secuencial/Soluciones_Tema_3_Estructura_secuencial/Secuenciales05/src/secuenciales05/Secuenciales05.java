/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package secuenciales05;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Secuenciales05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double C, F;

        System.out.print("Introduce grados Centígrados: ");
        C = sc.nextDouble();

        F = 32 + 9 * C / 5;
        System.out.println(C + " ºC -> " + F + " ºF  ");
    }

}
