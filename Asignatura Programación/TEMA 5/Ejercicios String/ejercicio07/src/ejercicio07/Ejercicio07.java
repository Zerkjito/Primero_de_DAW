/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07;

import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio07 {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String texto;
        do {
            System.out.print("Introduce texto: ");
            texto = sc.nextLine();
            if (texto.isBlank()) {
                System.out.println("Error. El texto no puede estar vacio.");
            }
        } while (texto.isBlank());
        String textoSinEspacios = eliminarEspacios(texto);
        System.out.println("Palabra sin espacios intermedios: " + textoSinEspacios);
    }
    
    /*public static String eliminarEspacios(String texto) { 
         return texto.trim().replaceAll("\\s+", " ");
    }
    Se resuelve mediante una expresion regular, pero hay menos control
    */
    
    /* public static String eliminarEspacios(String texto) {
        texto = texto.trim();
        String[] partes = texto.split("\\s+");
        String resultado = String.join(" ", partes);
    }
    Otra forma de hacerlo, con menos control tambien
    */
    
    public static String eliminarEspacios(String texto) { // forma mas personalizable de todas
        StringBuilder sb = new StringBuilder();
        boolean espacioPrevio = false;
        texto = texto.trim();
        
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            if (caracter != ' ') {
                sb.append(caracter);
                espacioPrevio = false;
            } else if (!espacioPrevio) {
                sb.append(' ');
                espacioPrevio = true;
            }
        }
        return sb.toString();
    }

}
