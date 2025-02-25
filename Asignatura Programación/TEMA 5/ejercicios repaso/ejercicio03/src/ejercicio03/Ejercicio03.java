/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;

/**
 *
 * @author zerkje
 */
public class Ejercicio03 {

    /**
     3. Un palíndromo es una frase que se lee igual de derecha a izquierda que de izquierda a derecha sin tener en cuenta
espacios en blanco, signos de puntuación ni acentos. Por ejemplo:
Dábale arroz a la zorra el Abad
Lavan esa base naval
Isaac no ronca así
Escribe un método que reciba una cadena de caracteres (String) y compruebe si esa cadena es un palíndromo.
El método devolverá true si se trata de un palíndromo o false si no lo es. Para simplificar el ejercicio supondremos que
las palabras están separadas por espacios en blanco y que el texto no contiene signos de puntuación ni vocales
acentuadas.
     */
    public static void main(String[] args) {
        String frase = "Lavan esa base naval";
        boolean palindromo = esPalindromo(frase);
        if (palindromo) {
            System.out.println("Es palindromo");
        } else {
            System.out.println("No es palindromo");
        }
    }
    public static boolean esPalindromo(String frase) {
        frase = frase.replace(" ", "").toLowerCase();
        return new StringBuilder(frase).reverse().toString().equals(frase);
    }
}
