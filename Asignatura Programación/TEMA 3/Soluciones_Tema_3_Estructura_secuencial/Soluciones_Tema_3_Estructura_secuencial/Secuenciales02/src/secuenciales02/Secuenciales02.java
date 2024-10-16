/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package secuenciales02;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Secuenciales02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;

        System.out.print("Introduce un nombre: ");
        cadena = sc.nextLine(); //Lee un String

        System.out.println("Buenos días " + cadena);
    }

}
