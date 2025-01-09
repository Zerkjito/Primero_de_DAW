/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication49;

import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class JavaApplication49 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Introduce un numero entero positivo: ");
            n = sc.nextInt();
        } while (n <= 0);
        if (primeraIgualQueUltima(n)) {
            System.out.println("La primera y la ultima cifra son iguales");
        } else {
            System.out.println("La primera y la ultima cifra NO son iguales");
        }

    }

    public static boolean primeraIgualQueUltima(int n) {
        int ultimaCifra;
        int primeraCifra;

        if (n < 10) {
            return true;
        }
        ultimaCifra = n % 10;
        while (n > 10) {
            n /= 10;
        }
        primeraCifra = n;
        return primeraCifra == ultimaCifra;

    }

}
