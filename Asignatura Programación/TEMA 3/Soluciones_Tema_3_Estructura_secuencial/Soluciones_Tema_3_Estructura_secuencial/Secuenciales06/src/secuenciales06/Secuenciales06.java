/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package secuenciales06;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Secuenciales06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radio, longitud, area;

        System.out.print("Introduce radio de la circunferencia: ");
        radio = sc.nextDouble(); //se lee el valor del radio por teclado

        longitud = 2 * Math.PI * radio;  //cálculo de la longitud de la circunferencia
        area = Math.PI * Math.pow(radio, 2);  //cálculo del área de la circunferencia

        System.out.println("Longitud de la circunferencia -> " + longitud);
        System.out.println("Area de la circunferencia -> " + area);
    }

}
