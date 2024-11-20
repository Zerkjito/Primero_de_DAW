/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avanzados38;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Avanzados38 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, miles, centenas, decenas, unidades, i;
        do {
            System.out.print("Introduce un número entre 1 y 3999: ");
            numero = sc.nextInt();
            if(numero < 1 || numero > 3999){
                System.out.println("Debe ser entre 1 y 3999");
            }
        } while (numero < 1 || numero > 3999);

        //obtenemos cada cifra del número
        miles = numero / 1000;
        centenas = numero / 100 % 10;
        decenas = numero / 10 % 10;
        unidades = numero % 10;

        System.out.print("En números romanos: ");

        //millar
        for (i = 1; i <= miles; i++) {
            System.out.print("M");
        }

        //centenas
        if (centenas == 9) {
            System.out.print("CM");
        } else if (centenas >= 5) {
            System.out.print("D");
            for (i = 6; i <= centenas; i++) {
                System.out.print("C");
            }
        } else if (centenas == 4) {
            System.out.print("CD");
        } else {
            for (i = 1; i <= centenas; i++) {
                System.out.print("C");
            }
        }

        //decenas
        if (decenas == 9) {
            System.out.print("XC");
        } else if (decenas >= 5) {
            System.out.print("L");
            for (i = 6; i <= decenas; i++) {
                System.out.print("X");
            }
        } else if (decenas == 4) {
            System.out.print("XL");
        } else {
            for (i = 1; i <= decenas; i++) {
                System.out.print("X");
            }
        }

        //unidades
        if (unidades == 9) {
            System.out.print("IX");
        } else if (unidades >= 5) {
            System.out.print("V");
            for (i = 6; i <= unidades; i++) {
                System.out.print("I");
            }
        } else if (unidades == 4) {
            System.out.print("IV");
        } else {
            for (i = 1; i <= unidades; i++) {
                System.out.print("I");
            }
        }

        System.out.println();
    }
    
}
