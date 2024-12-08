/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avanzados36;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Avanzados36 {

    public static void main(String[] args) {
        int numero, exp, digito;
        double binario;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduce un numero entero >= 0: ");
            numero = sc.nextInt();
            if (numero < 0) {
                System.out.println("Debe ser > 0");
            }
        } while (numero < 0);

        exp = 0;
        binario = 0;
        while (numero > 0) {
            digito = numero % 2;
            binario = binario + digito * Math.pow(10, exp);
            exp++;
            numero = numero / 2;
        }

        System.out.printf("Binario: %.0f %n", binario);
    }

}
