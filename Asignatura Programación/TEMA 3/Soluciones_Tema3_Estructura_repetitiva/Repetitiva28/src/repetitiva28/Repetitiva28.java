/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repetitiva28;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Repetitiva28 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, cifras = 0; //cifras contendrá el número de cifras del número

        System.out.print("Introduce un número entero: ");
        n = sc.nextInt();

        while (n != 0) {    //mientras a n le queden cifras
            n = n / 10;     //le quitamos a n la última cifra 
            cifras++;       //sumamos 1 al contador de cifras
        }
        System.out.println("Número de cifras: " + cifras);
    }

}
