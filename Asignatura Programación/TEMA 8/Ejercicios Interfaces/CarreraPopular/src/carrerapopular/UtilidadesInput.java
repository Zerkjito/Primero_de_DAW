/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrerapopular;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class UtilidadesInput {

    static Scanner sc = new Scanner(System.in);

    public static int leerEntero(String mensaje) {
        int num = 0;
        boolean valido = false;
        while (!valido) {
            System.out.print(mensaje);
            try {
                num = sc.nextInt();
                sc.nextLine();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada invalida, debes introducir un numero entero.");
                sc.nextLine();
            }
        }
        return num;
    }

    public static int leerEnteroEnRango(String mensaje, int min, int max, String errorMssg) {
        int num = 0;
        boolean valido = false;
        while (!valido) {
            num = leerEntero(mensaje);
            if (num >= min && num <= max) {
                valido = true;
            } else {
                System.out.println(errorMssg);
            }
        }
        return num;
    }

    public static int leerEnteroEnRangoMin(String mensaje, int min, String errorMssg) {
        int num = 0;
        boolean valido = false;
        while (!valido) {
            num = leerEntero(mensaje);
            if (num >= min) {
                valido = true;
            } else {
                System.out.println(errorMssg);
            }
        }
        return num;
    }

    public static double leerDouble(String mensaje) {
        double num = 0.;
        boolean valido = false;

        while (!valido) {
            System.out.print(mensaje);
            try {
                num = sc.nextDouble();
                sc.nextLine();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada invalida, debes introducir un numero decimal.");
                sc.nextLine();
            }
        }
        return num;
    }

    public static double leerDoubleEnRangoMin(String mensaje, int min, String errorMssg) {
        double num = 0.;
        boolean valido = false;
        while (!valido) {
            num = leerDouble(mensaje);
            if (num >= min) {
                valido = true;
            } else {
                System.out.println(errorMssg);
            }
        }
        return num;
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
