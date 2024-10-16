/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package secuenciales22;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Secuenciales22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, año, suerte, suma, cifra1, cifra2, cifra3, cifra4;

        System.out.println("Introduzca fecha de nacimiento");
        System.out.print("día: ");
        dia = sc.nextInt();
        System.out.print("mes: ");
        mes = sc.nextInt();
        System.out.print("año: ");
        año = sc.nextInt();

        suma = dia + mes + año;

        cifra1 = suma / 1000;        //obtiene la primera cifra
        cifra2 = suma / 100 % 10;    //obtiene la segunda cifra
        cifra3 = suma / 10 % 10;     //obtiene la tercera cifra
        cifra4 = suma % 10;          //obtiene la última cifra 

        suerte = cifra1 + cifra2 + cifra3 + cifra4;

        System.out.println("Su número de la suerte es: " + suerte);
    }

}
