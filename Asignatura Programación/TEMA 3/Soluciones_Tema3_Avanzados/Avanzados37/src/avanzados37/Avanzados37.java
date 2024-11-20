/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avanzados37;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Avanzados37 {

    public static void main(String[] args) {
        int numero, exp, digito, decimal, aux;
        boolean binario;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduce un numero binario: ");
            numero = sc.nextInt();

            //comprobamos que sea binario (que solo tenga ceros y unos)
            binario = true;
            aux = numero;
            while (aux != 0 && binario) {
                digito = aux % 10;
                if (digito != 0 && digito != 1) {
                    binario = false;
                }
                aux = aux / 10;
            }

        } while (numero < 0 || !binario); //si es negativo o no es binario

        exp = 0;
        decimal = 0;
        while (numero != 0) {
            digito = numero % 10;
            decimal = decimal + digito * (int) Math.pow(2, exp);
            exp++;
            numero = numero / 10;
        }
        System.out.println("Decimal: " + decimal);
    }
    
}
