/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio08;

import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio08 {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String texto;
        do {
            System.out.print("Introduce texto: ");
            texto = sc.nextLine();
        } while (texto.isBlank());
        String textoSinUltimaPalabra = quitarUltimaPalabra(texto);
        if (textoSinUltimaPalabra.isEmpty()) {
            System.out.println("El texto no contiene espacios");
        } else {
            System.out.println("Texto sin ultima palabra: " + textoSinUltimaPalabra);
        }

    }

    public static String quitarUltimaPalabra(String texto) {
        texto = texto.trim();
        int ultimoEspacio = texto.lastIndexOf(' ');
        if (ultimoEspacio == -1) {
            return "";
        }
        String resultado = texto.substring(0, ultimoEspacio);
        return resultado;
    }

}
