/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicapandemia;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class UtilidadesInput {

    static Scanner sc = new Scanner(System.in);

    public static int leerEntero(String mssg) {
        int n = 0;
        while (true) {
            System.out.print(mssg);
            try {
                n = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada invalida. Introduzca un numero entero.");
            } finally {
                sc.nextLine();
            }
        }
        return n;
    }

    public static int leerEnteroEnRangoMin(String mssg, String errMssg, int min) {
        int n = 0;
        while (true) {
            n = leerEntero(mssg);
            if (n >= min) {
                break;
            } else {
                System.out.println(errMssg);
            }
        }
        return n;
    }

    public static int leerEnteroEnRango(String mssg, String errMssg, int min, int max) {
        int n = 0;
        while (true) {
            n = leerEntero(mssg);
            if (n >= min && n <= max) {
                break;
            } else {
                System.out.println(errMssg);
            }
        }
        return n;
    }

    public static double leerDouble(String mssg) {
        double n = 0;
        while (true) {
            System.out.print(mssg);
            try {
                n = sc.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada invalida. Debes introducir un numero decimal.");
            } finally {
                sc.nextLine();
            }
        }
        return n;
    }

    public static double leerDoubleEnRangoMin(String mssg, String errMssg, double min) {
        double n = 0;
        while (true) {
            n = leerDouble(mssg);
            if (n >= min) {
                break;
            } else {
                System.out.println(errMssg);
            }
        }
        return n;
    }

    public static double leerDoubleEnRango(String mssg, String errMssg, double min, double max) {
        double n = 0;
        while (true) {
            n = leerDouble(mssg);
            if (n >= min && n <= max) {
                break;
            } else {
                System.out.println(errMssg);
            }
        }
        return n;
    }

    public static String leerString(String mssg) {
        String txt = "";
        while (true) {
            System.out.print(mssg);
            txt = sc.nextLine().trim();
            if (!txt.isEmpty()) {
                break;
            } else {
                System.out.println("Error: No puedes dejar este campo vacío.");
            }
        }
        return txt;
    }

}
