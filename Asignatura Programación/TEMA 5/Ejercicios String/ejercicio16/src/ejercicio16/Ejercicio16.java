/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

/**
 *
 * @author zerkje
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String texto = "Ab c,de-f-g h";
        String textoFormateado = formatearTexto(texto);
        System.out.println(textoFormateado);
        
    }
    
    public static String formatearTexto(String texto) {
        return texto.replaceAll("[^a-zA-Z]", " ").toLowerCase(); // tambien podria usar ("[-,]", " ");
    } 

    
}
