/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package string_04;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class String_04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto;
        System.out.println("Introduce texto: ");
        texto = sc.nextLine();
        System.out.println("El texto tiene " + contarPalabras(texto) + " palabras");
    }

    public static int contarPalabras(String s) {
        int contador = 1, pos;
        s = s.trim(); //eliminar los posibles espacios en blanco al principio y al final del texto
        if (s.isEmpty()) {
            contador = 0;
        } else {
            pos = s.indexOf(" ");
            while (pos != -1) {
                contador++;
                pos = s.indexOf(" ", pos + 1);
            }
        }
        return contador;
    }

}
