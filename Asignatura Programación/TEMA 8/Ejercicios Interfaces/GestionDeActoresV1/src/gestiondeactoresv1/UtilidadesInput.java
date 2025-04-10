/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiondeactoresv1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class UtilidadesInput {

    static Scanner sc = new Scanner(System.in);

    public static int leerEntero(String mensaje) {
        int numero = 0;
        boolean valido = false;

        while (!valido) {
            System.out.print(mensaje);
            try {
                numero = sc.nextInt();
                sc.nextLine();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada invalida, debes introducir un numero entero.");
                sc.nextLine();
            }
        }
        return numero;
    }

    public static int leerEnteroEnRango(String mensaje, int min, int max, String errorMssg) {
        int numero = 0;
        boolean valido = false;

        while (!valido) {
            numero = leerEntero(mensaje);

            if (numero >= min && numero <= max) {
                valido = true;
            } else {
                System.out.println(errorMssg + min + " y " + max);
            }
        }
        return numero;
    }

    public static int leerEnteroEnRangoMin(String mensaje, int min, String errorMssg) {
        int numero = 0;
        boolean valido = false;

        while (!valido) {
            numero = leerEntero(mensaje);

            if (numero >= min) {
                valido = true;
            } else {
                System.out.println(errorMssg);
            }
        }
        return numero;
    }

    public static String leerString(String mensaje) {
        String texto = "";
        boolean valido = false;

        while (!valido) {
            System.out.print(mensaje);
            texto = sc.nextLine().trim();
            
            if (!texto.isEmpty()) {
                valido = true;
            } else {
                System.out.println("Error: No puedes dejar el campo vacio.");
            }
        }
        return texto;
    }
}
