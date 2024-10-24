/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repetitiva20dowhile;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Repetitiva20DoWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, contador = 0, suma = 0;
        boolean negativo = false;
        do {
            System.out.print("Introduce un número entero (0 para finalizar): ");
            n = sc.nextInt();
            if (n != 0) {
                if (n > 0) {
                    contador++; //esta variable contendrá cuántos números positivos se han leído.
                    suma += n; //esta variable contendrá la suma de los números positivos
                } else {
                    negativo = true; //si el número es negativo asigno a la variable boolean el valor true
                }
            }
        } while (n != 0);
        System.out.println("Números positivos introducidos: " + contador);
        if (contador > 0) {
            System.out.println("Suma de los números positivos: " + suma);
        }
        if (negativo) { //si la variable boolean es true
            System.out.println("Se han introducido números negativos");
        } else {
            System.out.println("No se han introducido números negativos");
        }
    }

}
