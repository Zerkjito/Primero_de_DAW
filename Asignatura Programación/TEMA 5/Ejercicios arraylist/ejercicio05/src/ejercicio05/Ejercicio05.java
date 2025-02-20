/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class Ejercicio05 {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> lista = crearListaCadenas();
        System.out.println("Lista introducida:");
        mostrarLista(lista);
        String cadenaMayor = devolverCadenaMayor(lista);

        System.out.println("Cadena de mayor longitud: " + cadenaMayor);

    }

    public static String devolverCadenaMayor(ArrayList<String> l) {
        if (l.isEmpty()) {
            return null;
        }
        
        boolean todasIguales = true;
        int longitudReferencia = l.get(0).length();
        for (String cadena : l) {
            if (cadena.length() != longitudReferencia) {
                todasIguales = false;
                break;
            }
        }
        if (todasIguales) {
            return "Todos los elementos coinciden en longitud";
        }

        String cadenaMayor = l.get(0);
        for (String cadena : l) {
            if (cadena.length() > cadenaMayor.length()) {
                cadenaMayor = cadena;
            }
        }
        return cadenaMayor;
    }

    public static ArrayList<String> crearListaCadenas() {
        ArrayList<String> lista = new ArrayList<>();
        String cadena = "";
        for (int i = 1; i <= 3; i++) {
            System.out.print("Introduce una cadena de caracteres: ");
            cadena = sc.nextLine();
            lista.add(cadena);
        }
        return lista;
    }

    public static void mostrarLista(ArrayList<String> l) {
        System.out.println(l);
    }

}
