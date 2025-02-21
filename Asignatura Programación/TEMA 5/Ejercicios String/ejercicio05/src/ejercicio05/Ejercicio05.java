/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author zerkje
 */
public class Ejercicio05 {
    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ocurrencias;
        String texto, patron;
        System.out.print("Introduce texto: ");
        texto = sc.nextLine();
        System.out.print("Introduce el patron a buscar: ");
        patron = sc.nextLine();
        ocurrencias = contarOcurrencias(texto, patron);
        String veces = ocurrencias == 1 ? " vez" : " veces";
        System.out.println("El patron '" + patron + "' aparece " + ocurrencias + veces + " en el texto");
    }
    
    public static int contarOcurrencias(String texto, String patron) {
        int contador = 0;
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(texto);
        
        while (matcher.find()) {
            contador++;
        }
        return contador;
    }
    
}
