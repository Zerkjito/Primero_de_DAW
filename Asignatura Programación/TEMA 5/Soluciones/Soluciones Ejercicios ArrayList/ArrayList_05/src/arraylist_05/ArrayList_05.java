/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist_05;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class ArrayList_05 {

    public static void main(String[] args) {
        ArrayList<String> cadenas = new ArrayList<>(); //se crea un ArrayList de String
        leerArray(cadenas);
        String cadena = cadenaMayorLongitud(cadenas);
        if (cadena != null) {
            System.out.println("Cadena de mayor longitud : " + cadena);
        } else {
            System.out.println("No se han introducido cadenas de caracteres");
        }
    }

    //método que lee por teclado cadenas de caracteres y las añade al ArrayList que recibe como parámetro
    public static void leerArray(ArrayList<String> cadenas) {
        Scanner sc = new Scanner(System.in);
        String s;
        boolean masCadenas;
        do {
            masCadenas = true;
            System.out.print("Introduce una cadena de caracteres (Fin para acabar): ");
            s = sc.nextLine();
            if (s.equalsIgnoreCase("FIN")) {
                masCadenas = false;
            } else {
                cadenas.add(s);
            }
        } while (masCadenas);
    }

    //método que calcula y devuelve la cadena de mayor longitud contenida en el ArrayList que recibe como parámetro
    public static String cadenaMayorLongitud(ArrayList<String> cadenas) {
        String mayor = null;
        if (!cadenas.isEmpty()) {
            mayor = cadenas.get(0);//tomamos el primero elemento del ArrayList como el mayor
            for (int i = 1; i < cadenas.size(); i++) {//para el resto de elementos
                if (cadenas.get(i).length() > mayor.length()) {
                    mayor = cadenas.get(i);
                }
            }
        }
        return mayor; //devolverá null si el ArrayList está vacío
    }
}
