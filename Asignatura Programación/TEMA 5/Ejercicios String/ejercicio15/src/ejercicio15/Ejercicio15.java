/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class Ejercicio15 {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena = "";
        int numero, guiones;
        boolean valido;
        do {
            System.out.print("Introduce una cadena separada por comas y espacios: ");
            cadena = sc.nextLine();
            String[] cadenaLimpia = cadena.split("[, ]");
            valido = true;

            for (int i = 0; i < cadenaLimpia.length; i++) {
                String s = cadenaLimpia[i].trim();
                if (s.isEmpty() || !s.matches("[0-9]+")) {
                    valido = false;
                    break;
                }
                numero = Integer.parseInt(s);
                if (numero <= 0) {
                    valido = false;
                    break;
                }
            }
            if (!valido) {
                System.out.println("Se encontraron valores no validos o negativos");
            }
            guiones = cadenaLimpia.length - 1;
        } while (!valido);
        
        cadena = cadena.replaceAll("[, ]", "-");
        StringBuilder sb = new StringBuilder(cadena);
        
        if (guiones < 4) {
            sb.insert(0, "*");
            sb.append("*");
        }
        
        System.out.println(sb.toString());
    }

}
