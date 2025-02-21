/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04;

import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio04 {
    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String texto;
        int cantPalabras;
        System.out.print("Introduce texto: ");
        texto = sc.nextLine();
        cantPalabras = cantidadPalabras(texto);
        if (cantPalabras == 0) {
            System.out.println("No se han introducido palabras");
        } else {
            System.out.println("Se han introducido " + cantPalabras + " palabras");
        }
    }
    
    public static int cantidadPalabras(String texto) {
        if (texto.isBlank()) {
            return 0;
        }
        texto = texto.trim();
        int palabras = 0;
        boolean enPalabra = false;
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            if (!Character.isWhitespace(caracter)) { // ignora tanto tabulaciones como espacios en blanco
                if (!enPalabra) {
                    palabras++;
                    enPalabra = true;
                }
            } else {
                enPalabra = false;
            }
        }
        return palabras;
    }
    
}
