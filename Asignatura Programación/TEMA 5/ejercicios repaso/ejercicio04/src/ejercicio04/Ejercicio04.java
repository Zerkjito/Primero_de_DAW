/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author zerkje
 */
public class Ejercicio04 {

    /**
     * 4. Escribe un método que recibe un texto (String) con palabras separadas por espacios en blanco, comas y puntos y devuelve un String con todas las palabras del texto separadas por comas y ordenadas alfabéticamente en orden descendente (de la z a la a). Además si alguna palabra tiene menos de 4 caracteres el String resultante se devolverá entre paréntesis. Por ejemplo: si el método recibe el texto: "naranja, uva.manzana.pera, lechuga tomate" Devolverá el String entre paréntesis: "(uva,tomate,pera,naranja,manzana,lechuga)" Si el método recibe el texto: " naranja, cebolla.manzana.pera, lechuga tomate" Devolverá el String sin paréntesis: "tomate,pera,naranja,manzana,lechuga,cebolla"
     */
    public static void main(String[] args) {
        String texto = "naranja, alioli.manzana.pera, lechuga tomate";
        String ordenadoTexto = ordenarTexto(texto);
        System.out.println();
        System.out.println(ordenadoTexto);
    }

    public static String ordenarTexto(String texto) {
        String[] palabras = texto.split("[, .]+");
        for (String parte : palabras) {
            System.out.print(parte + " ");
        }

        Arrays.sort(palabras, Collections.reverseOrder());
        String resultado = String.join(",", palabras);
        for (String palabra : palabras) {
            if (palabra.length() < 4) {
                return "(" + resultado + ")";
            }
        }
        return resultado;
    }

}
