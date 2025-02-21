/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;

import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto;
        char caracter;
        int contador = 0;
        System.out.print("Introduce texto: ");
        texto = sc.nextLine();
        System.out.print("Introduce el caracter a leer: ");
        caracter = sc.next().charAt(0);
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == caracter) {
                contador++;
            }
        }
        String veces = contador == 1 ? " vez" : " veces";
        System.out.println("El caracter '" + caracter + "' aparece " + contador + veces + " en el texto" );
    }
    
}
