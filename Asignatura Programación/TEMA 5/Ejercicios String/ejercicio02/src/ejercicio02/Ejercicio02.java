/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02;

import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio02 {
    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String texto, textoModificado;
        System.out.print("Introduce texto: ");
        texto = sc.nextLine();
        textoModificado = eliminarUltimaPalabra(texto);
        System.out.println("Texto original: " + texto);
        System.out.println("Texto modificado: " + textoModificado);
    }
    
    public static String eliminarUltimaPalabra(String texto) {
        int ultimoEspacio = texto.lastIndexOf(" ");
        if (ultimoEspacio == -1) {
            return "";
        }
        return texto.substring(0, ultimoEspacio);
    }
}
