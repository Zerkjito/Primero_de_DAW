/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Erick
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int num, ultimaCifra = 0;

        do {
            num = rnd.nextInt(100, 999999 + 1);
            ultimaCifra = 0;
            ultimaCifra = num % 10;
            int aux = num;
            while (aux >= 10) {
                aux /= 10;
            }
            System.out.println("El numero generado ha sido: " + num);

            if (aux == ultimaCifra) {
                System.out.println("La primera y la última cifra son iguales");
            } else {
                System.out.println("La primera y la ultima cifra no son iguales");
            }
        } while (ultimaCifra != 0);
    }

}
