/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendamascotas;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class UtilidadesInput {

    static Scanner sc = new Scanner(System.in);

    public static int leerEntero(String msj) {
        int n = 0;
        boolean valido = false;
        while (!valido) {
            System.out.print(msj);
            try {
                n = sc.nextInt();
                sc.nextLine();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada invalida, debes introducir un numero entero.");
                sc.nextLine();
            }
        }
        return n;
    }

    public static double leerDouble(String msj) {
        double n = 0;
        boolean valido = false;
        while (!valido) {
            System.out.print(msj);
            try {
                n = sc.nextDouble();
                sc.nextLine();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada invalida, debes introducir un numero entero.");
                sc.nextLine();
            }
        }
        return n;
    }

    public static int leerEnteroEnRango(String msj, String errMssg, int min, int max) {
        int n = 0;
        boolean valido = false;
        while (!valido) {
            n = leerEntero(msj);
            if (n >= min && n <= max) {
                valido = true;
            } else {
                System.out.println(errMssg);
                sc.nextLine();
            }
        }
        return n;
    }

    public static int leerEnteroEnRangoMin(String msj, String errMssg, int min) {
        int n = 0;
        boolean valido = false;
        while (!valido) {
            n = leerEntero(msj);
            if (n >= min) {
                valido = true;
            } else {
                System.out.println(errMssg);
            }
        }
        return n;
    }

    public static double leerDoubleEnRangoMin(String msj, String errMssg, double min) {
        double n = 0;
        boolean valido = false;
        while (!valido) {
            n = leerDouble(msj);
            if (n >= min) {
                valido = true;
            } else {
                System.out.println(errMssg);
            }
        }
        return n;
    }

    public static double leerDoubleEnRango(String msj, String errMssg, double min, double max) {
        double n = 0;
        boolean valido = false;
        while (!valido) {
            n = leerDouble(msj);
            if (n >= min && n <= max) {
                valido = true;
            } else {
                System.out.println(errMssg);
            }
        }
        return n;
    }

    public static String leerString(String msj) {
        String texto = "";
        boolean valido = false;
        while (!valido) {
            System.out.print(msj);
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
