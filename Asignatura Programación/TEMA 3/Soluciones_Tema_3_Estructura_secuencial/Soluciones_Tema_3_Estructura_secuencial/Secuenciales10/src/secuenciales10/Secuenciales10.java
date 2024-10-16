/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package secuenciales10;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Secuenciales10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horas, minutos;

        System.out.print("Introduzca horas: ");
        horas = sc.nextInt();
        System.out.print("Introduzca minutos: ");
        minutos = sc.nextInt();
      
        //pasamos todo a minutos
        minutos = minutos + horas * 60;  //o también -> minutos += horas * 60;

        System.out.println("Coste total del trabajo -> " + minutos * 0.85 + "€");
    }

}
