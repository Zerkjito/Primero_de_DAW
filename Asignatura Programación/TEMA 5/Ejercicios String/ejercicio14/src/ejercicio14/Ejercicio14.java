/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

/**
 *
 * @author zerkje
 */
public class Ejercicio14 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nifs = "43434321-A 65473820-T 33238765-D 32994102-X 74771234-F";
        String nifsFormateados = nifsSeparados(nifs);
        System.out.println(nifsFormateados);
    }
    
    public static String nifsSeparados(String nifs) {
        return nifs.replaceAll("-", "");
    }
}
