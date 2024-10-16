/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package secuenciales13;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Secuenciales13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cateto1, cateto2, hipotenusa;

        System.out.print("Introduzca longitud del primer cateto: ");
        cateto1 = sc.nextDouble();

        System.out.print("Introduzca longitud del segundo cateto: ");
        cateto2 = sc.nextDouble();
        hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        System.out.println("Hipotenusa -> " + hipotenusa);
    }

}
